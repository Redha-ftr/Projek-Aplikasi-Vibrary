
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
public class PetugasController {
    form_petugas view;
    PetugasDao dao;
    Petugas petugas;
    Koneksi k;
    Connection con;

    public PetugasController(form_petugas view) {
        this.view = view;
        dao = new PetugasDao();
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
        view.getNohp_txt().setText("");
        view.getNik_txt().setText("");
        view.getIdpetugas_txt().setText("");
        view.getPass().setText("");
    }

    public void insert() {
        Petugas petugas = new Petugas();
        petugas.setId(view.getIdpetugas_txt().getText());
        petugas.setNama(view.getNama_txt().getText());
        petugas.setAlamat(view.getAlamat_txt().getText());
        if (view.getRb_pr().isSelected()) {
            petugas.setJk("Perempuan");
        } else if (view.getRb_lk().isSelected()) {
            petugas.setJk("Laki-laki");
        }
        petugas.setNotelp(Integer.parseInt(view.getNohp_txt().getText()));
        petugas.setNik(Integer.parseInt(view.getNik_txt().getText()));
        petugas.setPassword(view.getPass().getText());

        try {
            try {
                dao.create(petugas);
                javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan");
            } catch (Exception ex2) {
                dao.update(petugas);
                javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                //javax.swing.JOptionPane.showMessageDialog(null, "Error" + ex2.getMessage());
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update() {
        petugas = new Petugas();
        petugas.setId(view.getIdpetugas_txt().getText());
        petugas.setNama(view.getNama_txt().getText());
        petugas.setAlamat(view.getAlamat_txt().getText());
        if (petugas.getJk().equals("Perempuan")) {
            view.getRb_pr().setSelected(true);
        } else if (petugas.getJk().equals("Laki-laki")) {
            view.getRb_lk().setSelected(true);
        }
        petugas.setPassword(view.getPass().getText());
        petugas.setNotelp(Integer.parseInt(view.getNohp_txt().getText()));
        petugas.setNik(Integer.parseInt(view.getNik_txt().getText()));

        try {
            dao.update(petugas);
            javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil diubah");
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete() {
        String id = view.getTabelPetugas().getValueAt(view.getTabelPetugas().getSelectedRow(), 0).toString();
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
            DefaultTableModel model = (DefaultTableModel) view.getTabelPetugas().getModel();
            model.setRowCount(0);
            ResultSet rs = k.getQuery(con, "SELECT * FROM petugas");
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
        PetugasDao dao = new PetugasDao();

        String id = view.getTabelPetugas().getValueAt(view.getTabelPetugas().getSelectedRow(), 0).toString();

        try {
            Petugas petugas = dao.getPetugas(id);
            view.getIdpetugas_txt().setText(petugas.getId());
            view.getNama_txt().setText(petugas.getNama());
            view.getAlamat_txt().setText(petugas.getAlamat());
            if (petugas.getJk().equals("Perempuan")) {
                view.getRb_pr().setSelected(true);
            } else if (petugas.getJk().equals("Laki-laki")) {
                view.getRb_lk().setSelected(true);
            }
            view.getPass().setText(petugas.getPassword());
            view.getNohp_txt().setText(petugas.getNotelp() + "");
            view.getNik_txt().setText(petugas.getNik() + "");
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
