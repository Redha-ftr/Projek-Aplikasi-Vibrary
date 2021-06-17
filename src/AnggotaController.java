
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EED
 */
public class AnggotaController {

    form_anggota view;
    AnggotaDao dao;
    Anggota anggota;
    Koneksi k;
    Connection con;

    public AnggotaController(form_anggota view) {
        this.view = view;
        dao = new AnggotaDao();
        k = new Koneksi();
        try {
            con = k.getConnection();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }

    public void clear() {
        view.getNama_txt().setText("");
        view.getAlamat_txt().setText("");
        view.getJk().clearSelection();
        view.getTtl_txt().setText("");
        view.getNohp_txt().setText("");
        view.getNik_txt().setText("");
        view.getIdanggota_txt().setText("");
    }

    public void insert() {
        Anggota anggota = new Anggota();
        anggota.setId(view.getIdanggota_txt().getText());
        anggota.setNama(view.getNama_txt().getText());
        anggota.setAlamat(view.getAlamat_txt().getText());
        if (view.getRb_pr().isSelected()) {
            anggota.setJk("Perempuan");
        } else if (view.getRb_lk().isSelected()) {
            anggota.setJk("Laki-laki");
        }
        anggota.setTglLahir(view.getTtl_txt().getText());
        anggota.setNotelp(Integer.parseInt(view.getNohp_txt().getText()));
        anggota.setNik(Integer.parseInt(view.getNik_txt().getText()));

        try {
            try {
                dao.create(anggota);
                javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan");
            } catch (Exception ex2) {
                dao.update(anggota);
                javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                //javax.swing.JOptionPane.showMessageDialog(null, "Error" + ex2.getMessage());
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {
        anggota = new Anggota();
        anggota.setId(view.getIdanggota_txt().getText());
        anggota.setNama(view.getNama_txt().getText());
        anggota.setAlamat(view.getAlamat_txt().getText());
        if (anggota.getJk().equals("Perempuan")) {
            view.getRb_pr().setSelected(true);
        } else if (anggota.getJk().equals("Laki-laki")) {
            view.getRb_lk().setSelected(true);
        }
        anggota.setTglLahir(view.getTtl_txt().getText());
        anggota.setNotelp(Integer.parseInt(view.getNohp_txt().getText()));
        anggota.setNik(Integer.parseInt(view.getNik_txt().getText()));

        try {
            dao.update(anggota);
            javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void search() {
        String id = view.getCari_txt().getText();
        try {
            anggota = dao.getAnggota(id);
            if (anggota != null) {
                view.getIdanggota_txt().setText(anggota.getId());
                view.getNama_txt().setText(anggota.getNama());
                view.getAlamat_txt().setText(anggota.getAlamat());
                if (anggota.getJk().equals("Perempuan")) {
                    view.getRb_pr().setSelected(true);
                } else if (anggota.getJk().equals("Laki-laki")) {
                    view.getRb_lk().setSelected(true);
                }
                view.getTtl_txt().setText(anggota.getTglLahir());
                view.getNohp_txt().setText(anggota.getNotelp() + "");
                view.getNik_txt().setText(anggota.getNik() + "");
            } else {
                JOptionPane.showMessageDialog(null, "Data Kosong");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void delete() {
        String id = view.getTabelAnggota().getValueAt(view.getTabelAnggota().getSelectedRow(), 0).toString();
        try {
            dao.delete(id);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        this.clear();
    }

    public void isiTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) view.getTabelAnggota().getModel();
            model.setRowCount(0);
            ResultSet rs = k.getQuery(con, "SELECT * FROM anggota");
            while (rs.next()) {
                Object data[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)
                };
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tabelklik() {
        AnggotaDao anggotadao = new AnggotaDao();

        String id = view.getTabelAnggota().getValueAt(view.getTabelAnggota().getSelectedRow(), 0).toString();

        try {
            Anggota anggota = dao.getAnggota(id);
            view.getIdanggota_txt().setText(anggota.getId());
            view.getNama_txt().setText(anggota.getNama());
            view.getAlamat_txt().setText(anggota.getAlamat());
            if (anggota.getJk().equals("Perempuan")) {
                view.getRb_pr().setSelected(true);
            } else if (anggota.getJk().equals("Laki-laki")) {
                view.getRb_lk().setSelected(true);
            }
            view.getTtl_txt().setText(anggota.getTglLahir());
            view.getNohp_txt().setText(anggota.getNotelp() + "");
            view.getNik_txt().setText(anggota.getNik() + "");
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
