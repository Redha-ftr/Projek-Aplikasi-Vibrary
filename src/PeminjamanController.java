
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EED
 */
public class PeminjamanController {

    form_peminjaman view;
    Peminjaman pinjam;
    PeminjamanDao dao;
    Anggota anggota;
    Buku buku;
    Connection con;
    Koneksi k;
    String tglSekarang;
    form_login login;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public PeminjamanController(form_peminjaman view) {
        this.view = view;
        dao = new PeminjamanDao();
        anggota = new Anggota();
        buku = new Buku();
        k = new Koneksi();
        try {
            con = k.getConnection();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
        tglSekarang = format.format(new Date());
        login = new form_login();
    }

    public void insert() {
        Peminjaman pinjam = new Peminjaman();
        pinjam.setIdPinjam(view.getIdpinjam_txt().getText());
        pinjam.setIdPetugas(view.getIdpetugas_txt().getText());
        pinjam.setIdAnggota(view.getIdanggota_txt().getText());
        pinjam.setIdBuku(view.getIdbuku_txt().getText());
        pinjam.setTglPinjam(view.getTglpinjam_txt().getText());
        pinjam.setTglKembali(view.getTglkembali_txt().getText());
        pinjam.setTgldikembalikan(view.getTgldikembalikan_txt().getText());
        pinjam.setStatus(view.getStatus().getSelectedItem().toString());
        pinjam.setTerlambat(Integer.parseInt(view.getTerlambat_txt().getText()));
        pinjam.setDenda(Double.parseDouble(view.getDenda_txt().getText()));

        try {
            try {
                dao.create(pinjam);
                javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan");
            } catch (Exception ex2) {
                dao.update(pinjam);
                javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                //javax.swing.JOptionPane.showMessageDialog(null, "Error" + ex2.getMessage());
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*public void update(){
     pinjam = new PeminjamanModel();
     pinjam.setKodeanggota(view.getTxtkodeanggota().getText());
     pinjam.setKodebuku(view.getTxtkodebuku().getText());
     pinjam.setTglpinjam(view.getTxttglpinjam().getText());
     pinjam.setTglkembali(view.getTxttglkembali().getText());
        
     try{
     peminjamanDao.update(pinjam);
     javax.swing.JOptionPane.showMessageDialog(null, "Update Ok");
     } catch (Exception ex){
     Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
     }
     }*/
    public void delete() throws SQLException {
        String id = view.getTabelPeminjaman().getValueAt(view.getTabelPeminjaman().getSelectedRow(), 0).toString();
        try {
            dao.delete(id);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        this.clear();
    }

    public void search() {
        String id = view.getCari_txt().getText();

        try {
            pinjam = dao.getPeminjaman(id);
            String idanggota = pinjam.getIdAnggota();
            String idbuku = pinjam.getIdBuku();
            if (buku != null) {
                BukuDao bukuDao = new BukuDao();
                Buku buku = bukuDao.getBuku(idbuku);
                AnggotaDao anggotaDao = new AnggotaDao();
                Anggota anggota = anggotaDao.getAnggota(idanggota);

                view.getIdpinjam_txt().setText(pinjam.getIdPinjam());
                view.getIdpetugas_txt().setText(pinjam.getIdPetugas());
                view.getIdanggota_txt().setText(pinjam.getIdAnggota());
                view.getNama_txt().setText(anggota.getNama());
                view.getIdbuku_txt().setText(pinjam.getIdBuku());
                view.getJudul_txt().setText(buku.getJudul());
                view.getTglpinjam_txt().setText(pinjam.getTglPinjam());
                view.getTglkembali_txt().setText(pinjam.getTglKembali());
                view.getTgldikembalikan_txt().setText(pinjam.getTgldikembalikan());
                view.getStatus().setSelectedItem(pinjam.getStatus());
                view.getTerlambat_txt().setText(pinjam.getTerlambat() + "");
                view.getDenda_txt().setText(pinjam.getDenda() + "");
            } else {
                JOptionPane.showMessageDialog(null, "Data Kosong");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data Kosong");
        }
    }

    public void clear() throws SQLException {
        String tglkembali = dao.getTambahTanggal(con, tglSekarang);

        view.getIdpinjam_txt().setText("");
        view.getIdpetugas_txt().setText(login.getLogin());
        view.getIdanggota_txt().setText("");
        view.getNama_txt().setText("");
        view.getIdbuku_txt().setText("");
        view.getJudul_txt().setText("");
        view.getTglpinjam_txt().setText(tglSekarang);
        view.getTglkembali_txt().setText(dao.getTambahTanggal(con, tglSekarang));
        view.getTgldikembalikan_txt().setText(tglSekarang);
        view.getStatus().setSelectedItem("Pinjam");
        view.getTerlambat_txt().setText("0");
        view.getDenda_txt().setText("0");
    }

    public void isiTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) view.getTabelPeminjaman().getModel();
            model.setRowCount(0);
            ResultSet rs = k.getQuery(con, "SELECT * FROM peminjaman");
            while (rs.next()) {
                Object data[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10)
                };
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void OnKeyPressIdAnggota() {
        try {
            AnggotaDao dao = new AnggotaDao();
            Anggota anggota = dao.getAnggota(view.getIdanggota_txt().getText());
            if (anggota != null) {
                view.getNama_txt().setText(anggota.getNama());
                view.getIdanggota_txt().requestFocus();
            } else {
                JOptionPane.showMessageDialog(view, "Data tidak ada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void OnKeyPressIdBuku() {
        try {
            BukuDao dao = new BukuDao();
            Buku buku = dao.getBuku(view.getIdbuku_txt().getText());
            if (buku != null) {
                view.getJudul_txt().setText(buku.getJudul());
                view.getIdbuku_txt().requestFocus();
            } else {
                JOptionPane.showMessageDialog(view, "Data tidak ada");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void onKeyPressTanggaldiKembalikan() throws SQLException {
        String idpinjam = view.getIdpinjam_txt().getText();
        try {
            pinjam = dao.getPeminjaman(idpinjam);
            if (pinjam != null) {
                String tglkembali = view.getTglkembali_txt().getText();
                String tgldikembalikan = view.getTgldikembalikan_txt().getText();
                int terlambat = dao.getKurangTanggal(con, tgldikembalikan, tglkembali);
                double denda = 0;
                if (terlambat >= 0) {
                    denda = terlambat * 500;
                } else {
                    denda = 0;
                    terlambat = 0;
                }
                view.getTgldikembalikan_txt().setText(tgldikembalikan);
                view.getStatus().setSelectedItem("Kembali");
                view.getTerlambat_txt().setText(terlambat + "");
                view.getDenda_txt().setText(denda + "");
            } else {
                view.getTgldikembalikan_txt().setText(tglSekarang);
                view.getStatus().setSelectedItem("Pinjam");
                view.getTerlambat_txt().setText("0");
                view.getDenda_txt().setText("0");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int terlambat(String tglkembali, String tgldikembalikan) throws SQLException {
        int hari = dao.getKurangTanggal(con, tgldikembalikan, tglkembali);
        if (hari <= 0) {
            return 0;
        } else {
            return hari;
        }
    }

    public double denda(int terlambat) {
        if (terlambat >= 0) {
            return terlambat * 500;
        } else {
            return 0;
        }
    }

    public void OnKeyPressTglPinjam() throws SQLException {
        String tglpinjam = view.getTglpinjam_txt().getText();
        String tglkembali = dao.getTambahTanggal(con, tglpinjam);
        view.getTglkembali_txt().setText(tglkembali);
    }

    public void getPeminjaman() {
        String idpinjam = view.getIdpinjam_txt().getText();

        try {
            pinjam = dao.getPeminjaman(idpinjam);
            if (pinjam != null) {
                view.getIdpinjam_txt().setText(pinjam.getIdPinjam());
                view.getIdpetugas_txt().setText(pinjam.getIdPetugas());
                view.getIdanggota_txt().setText(pinjam.getIdAnggota());
                //view.getNama_txt().setText(anggota.getNama());
                view.getIdbuku_txt().setText(pinjam.getIdBuku());
                //view.getJudul_txt().setText(buku.getJudul());
                view.getTglpinjam_txt().setText(pinjam.getTglPinjam());
                view.getTglkembali_txt().setText(pinjam.getTglKembali());
                view.getTgldikembalikan_txt().setText(pinjam.getTgldikembalikan());
                view.getStatus().setSelectedItem(pinjam.getStatus());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tabelklik() {
        String idpinjam = view.getTabelPeminjaman().getValueAt(view.getTabelPeminjaman().getSelectedRow(), 0).toString();
        String idanggota = view.getTabelPeminjaman().getValueAt(view.getTabelPeminjaman().getSelectedRow(), 1).toString();
        String idbuku = view.getTabelPeminjaman().getValueAt(view.getTabelPeminjaman().getSelectedRow(), 2).toString();
        try {
            BukuDao bukuDao = new BukuDao();
            Buku buku = bukuDao.getBuku(idbuku);
            AnggotaDao anggotaDao = new AnggotaDao();
            Anggota anggota = anggotaDao.getAnggota(idanggota);
            Peminjaman pinjam = dao.getPeminjaman(idpinjam);
            int telat = terlambat(pinjam.getTglKembali(), tglSekarang);

            view.getIdpinjam_txt().setText(pinjam.getIdPinjam());
            view.getIdpetugas_txt().setText(login.getLogin());
            view.getIdanggota_txt().setText(pinjam.getIdAnggota());
            view.getNama_txt().setText(anggota.getNama());
            view.getIdbuku_txt().setText(pinjam.getIdBuku());
            view.getJudul_txt().setText(buku.getJudul());
            view.getTglpinjam_txt().setText(pinjam.getTglPinjam());
            view.getTglkembali_txt().setText(pinjam.getTglKembali());
            view.getStatus().setSelectedItem(pinjam.getStatus());
            if (pinjam.getStatus().equals("Pinjam")) {
                view.getTgldikembalikan_txt().setText(tglSekarang);
                view.getTerlambat_txt().setText(telat + "");
                view.getDenda_txt().setText(denda(telat) + "");
            } else {
                view.getTgldikembalikan_txt().setText(pinjam.getTgldikembalikan());
                view.getTerlambat_txt().setText(pinjam.getTerlambat() + "");
                view.getDenda_txt().setText(pinjam.getDenda() + "");
            }

        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
