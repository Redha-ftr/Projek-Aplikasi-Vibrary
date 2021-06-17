
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class BukuController {
    form_buku view;
    BukuDao dao;
    Buku buku;
    Connection con;
    Koneksi k;

    public BukuController(form_buku view) {
        this.view = view;
        dao = new BukuDao();
        k = new Koneksi();
        try {
            con = k.getConnection();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }

    public void clear() {
        view.getIdbuku_txt().setText("");
        view.getJudul_txt().setText("");
        view.getPengarang_txt().setText("");
        view.getPenerbit_txt().setText("");
        view.getTahun_txt().setText("");
        view.getIsbn_txt().setText("");
        view.getKat_cb().setSelectedItem("Pilih");
    }
    
    public void insert() {
        Buku buku = new Buku();
        buku.setId(view.getIdbuku_txt().getText());
        buku.setJudul(view.getJudul_txt().getText());
        buku.setPengarang(view.getPengarang_txt().getText());
        buku.setPenerbit(view.getPenerbit_txt().getText());
        buku.setTahun(Integer.parseInt(view.getTahun_txt().getText()));
        buku.setIsbn(Integer.parseInt(view.getIsbn_txt().getText()));
        buku.setKat(view.getKat_cb().getSelectedItem().toString());

        try {
            try {
                dao.create(buku);
                javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan");
            } catch (Exception ex2) {
                dao.update(buku);
                javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                //javax.swing.JOptionPane.showMessageDialog(null, "Error" + ex2.getMessage());
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {
        buku = new Buku();
        buku.setId(view.getIdbuku_txt().getText());
        buku.setJudul(view.getJudul_txt().getText());
        buku.setPengarang(view.getPengarang_txt().getText());
        buku.setPenerbit(view.getPenerbit_txt().getText());
        buku.setTahun(Integer.parseInt(view.getTahun_txt().getText()));
        buku.setIsbn(Integer.parseInt(view.getIsbn_txt().getText()));
        buku.setKat(view.getKat_cb().getSelectedItem().toString());

        try {
            dao.update(buku);
            javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*public void edit() throws SQLException {
     String id = tabel.getTabelBuku().getValueAt(tabel.getTabelBuku().getSelectedRow(), 0).toString();
     buku = dao.getBuku(id);
        
     view.getIdbuku_txt().setText(buku.getId());
     view.getJudul_txt().setText(buku.getJudul());
     view.getPengarang_txt().setText(buku.getPengarang());
     view.getPenerbit_txt().setText(buku.getPenerbit());
     view.getTahun_txt().setText(buku.getTahun() + "");
     view.getIsbn_txt().setText(buku.getIsbn() + "");
     view.getKat_cb().setSelectedItem(buku.getKat());
     new form_buku().setVisible(true);
     }*/
    
    public void search() {
        String id = view.getCari_txt().getText();
        try {
            buku = dao.getBuku(id);
            if (buku != null) {
                view.getIdbuku_txt().setText(buku.getId());
                view.getJudul_txt().setText(buku.getJudul());
                view.getPengarang_txt().setText(buku.getPengarang());
                view.getPenerbit_txt().setText(buku.getPenerbit());
                view.getTahun_txt().setText(buku.getTahun() + "");
                view.getIsbn_txt().setText(buku.getIsbn() + "");
                view.getKat_cb().setSelectedItem(buku.getKat());
            } else {
                JOptionPane.showMessageDialog(null, "Data Kosong");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void delete() {
        String id = view.getTabelBuku().getValueAt(view.getTabelBuku().getSelectedRow(), 0).toString();
        try {
            dao.delete(id);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void isiTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) view.getTabelBuku().getModel();
            model.setRowCount(0);
            ResultSet rs = k.getQuery(con, "SELECT * FROM buku");
            while (rs.next()) {
                Object data[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tabelklik() {
        BukuDao dao = new BukuDao();
        String id = view.getTabelBuku().getValueAt(view.getTabelBuku().getSelectedRow(), 0).toString();

        try {
            Buku buku = dao.getBuku(id);
            view.getIdbuku_txt().setText(buku.getId());
            view.getJudul_txt().setText(buku.getJudul());
            view.getPengarang_txt().setText(buku.getPengarang());
            view.getPenerbit_txt().setText(buku.getPenerbit());
            view.getTahun_txt().setText(buku.getTahun() + "");
            view.getIsbn_txt().setText(buku.getIsbn() + "");
            view.getKat_cb().setSelectedItem(buku.getKat());
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
