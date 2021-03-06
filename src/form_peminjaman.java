
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EED
 */
public class form_peminjaman extends javax.swing.JFrame {

    /**
     * Creates new form from_peminjaman
     */
    PeminjamanController controller;

    public form_peminjaman() throws SQLException {
        initComponents();
        idpetugas_txt.enable();
        controller = new PeminjamanController(this);
        controller.isiTable();
        controller.clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        denda_txt = new javax.swing.JTextField();
        nama_txt = new javax.swing.JTextField();
        idpetugas_txt = new javax.swing.JTextField();
        idpinjam_txt = new javax.swing.JTextField();
        idanggota_txt = new javax.swing.JTextField();
        idbuku_txt = new javax.swing.JTextField();
        judul_txt = new javax.swing.JTextField();
        tglpinjam_txt = new javax.swing.JTextField();
        tgldikembalikan_txt = new javax.swing.JTextField();
        tglkembali_txt = new javax.swing.JTextField();
        terlambat_txt = new javax.swing.JTextField();
        tombolberanda = new javax.swing.JLabel();
        tombolproses1 = new javax.swing.JLabel();
        tombolcari = new javax.swing.JLabel();
        cari_txt = new javax.swing.JTextField();
        tombolhapus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPeminjaman = new javax.swing.JTable();
        status = new javax.swing.JComboBox();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        denda_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        denda_txt.setBorder(null);
        denda_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denda_txtActionPerformed(evt);
            }
        });
        getContentPane().add(denda_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 360, 350, 19));

        nama_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nama_txt.setBorder(null);
        nama_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_txtActionPerformed(evt);
            }
        });
        getContentPane().add(nama_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 212, 350, 19));

        idpetugas_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        idpetugas_txt.setBorder(null);
        idpetugas_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpetugas_txtActionPerformed(evt);
            }
        });
        getContentPane().add(idpetugas_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 176, 202, 19));

        idpinjam_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        idpinjam_txt.setBorder(null);
        idpinjam_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpinjam_txtActionPerformed(evt);
            }
        });
        getContentPane().add(idpinjam_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 176, 202, 19));

        idanggota_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        idanggota_txt.setBorder(null);
        idanggota_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idanggota_txtActionPerformed(evt);
            }
        });
        idanggota_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idanggota_txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idanggota_txtKeyReleased(evt);
            }
        });
        getContentPane().add(idanggota_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 211, 202, 19));

        idbuku_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        idbuku_txt.setBorder(null);
        idbuku_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbuku_txtActionPerformed(evt);
            }
        });
        idbuku_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idbuku_txtKeyPressed(evt);
            }
        });
        getContentPane().add(idbuku_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 248, 202, 19));

        judul_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        judul_txt.setBorder(null);
        judul_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judul_txtActionPerformed(evt);
            }
        });
        getContentPane().add(judul_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 248, 350, 19));

        tglpinjam_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tglpinjam_txt.setBorder(null);
        tglpinjam_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglpinjam_txtActionPerformed(evt);
            }
        });
        getContentPane().add(tglpinjam_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 284, 202, 19));

        tgldikembalikan_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tgldikembalikan_txt.setBorder(null);
        tgldikembalikan_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgldikembalikan_txtActionPerformed(evt);
            }
        });
        tgldikembalikan_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tgldikembalikan_txtKeyPressed(evt);
            }
        });
        getContentPane().add(tgldikembalikan_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 322, 202, 19));

        tglkembali_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tglkembali_txt.setBorder(null);
        tglkembali_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglkembali_txtActionPerformed(evt);
            }
        });
        tglkembali_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tglkembali_txtKeyPressed(evt);
            }
        });
        getContentPane().add(tglkembali_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 285, 350, 19));

        terlambat_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        terlambat_txt.setBorder(null);
        terlambat_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terlambat_txtActionPerformed(evt);
            }
        });
        getContentPane().add(terlambat_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 358, 202, 19));

        tombolberanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tombol beranda.png"))); // NOI18N
        tombolberanda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolberandaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombolberandaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombolberandaMouseExited(evt);
            }
        });
        getContentPane().add(tombolberanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1082, 365, -1, -1));

        tombolproses1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tombol proses.png"))); // NOI18N
        tombolproses1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolproses1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombolproses1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombolproses1MouseExited(evt);
            }
        });
        getContentPane().add(tombolproses1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1083, 253, -1, -1));

        tombolcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tombol cari.png"))); // NOI18N
        tombolcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolcariMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombolcariMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombolcariMouseExited(evt);
            }
        });
        getContentPane().add(tombolcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1084, 163, -1, -1));

        cari_txt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cari_txt.setBorder(null);
        cari_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_txtActionPerformed(evt);
            }
        });
        getContentPane().add(cari_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 121, 133, 30));

        tombolhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tombol hapus.png"))); // NOI18N
        tombolhapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolhapusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombolhapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombolhapusMouseExited(evt);
            }
        });
        getContentPane().add(tombolhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1085, 308, -1, -1));

        tabelPeminjaman.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tabelPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Pinjam", "Id Anggota", "Id Buku", "Tanggal Pinjam", "Tanggal Kembali", "Status", "Terlambat", "Denda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelPeminjaman.setRowHeight(30);
        tabelPeminjaman.setRowMargin(2);
        tabelPeminjaman.setSelectionBackground(new java.awt.Color(229, 171, 171));
        tabelPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPeminjaman);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 1260, 280));

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pinjam", "Kembali" }));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 360, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Form Peminjaman_1.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getCari_txt() {
        return cari_txt;
    }

    public JTextField getDenda_txt() {
        return denda_txt;
    }

    public JTextField getIdanggota_txt() {
        return idanggota_txt;
    }

    public JTextField getIdbuku_txt() {
        return idbuku_txt;
    }

    public JTextField getIdpinjam_txt() {
        return idpinjam_txt;
    }

    public JTextField getJudul_txt() {
        return judul_txt;
    }

    public JTextField getNama_txt() {
        return nama_txt;
    }

    public JTextField getTglkembali_txt() {
        return tglkembali_txt;
    }

    public JTextField getTerlambat_txt() {
        return terlambat_txt;
    }

    public JTextField getTgldikembalikan_txt() {
        return tgldikembalikan_txt;
    }

    public JTextField getTglpinjam_txt() {
        return tglpinjam_txt;
    }

    public JTable getTabelPeminjaman() {
        return tabelPeminjaman;
    }

    public JTextField getIdpetugas_txt() {
        return idpetugas_txt;
    }

    public JComboBox getStatus() {
        return status;
    }

    private void denda_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denda_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_denda_txtActionPerformed

    private void nama_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_txtActionPerformed

    private void idpinjam_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpinjam_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpinjam_txtActionPerformed

    private void idanggota_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idanggota_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idanggota_txtActionPerformed

    private void idbuku_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbuku_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbuku_txtActionPerformed

    private void judul_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judul_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judul_txtActionPerformed

    private void tglpinjam_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglpinjam_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglpinjam_txtActionPerformed

    private void tgldikembalikan_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgldikembalikan_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgldikembalikan_txtActionPerformed

    private void tglkembali_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglkembali_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglkembali_txtActionPerformed

    private void terlambat_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terlambat_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terlambat_txtActionPerformed

    private void tombolberandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolberandaMouseClicked
        // TODO add your handling code here:
        new form_home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolberandaMouseClicked

    private void tombolberandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolberandaMouseEntered
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol beranda 2.png"));
        tombolberanda.setIcon(pg);
    }//GEN-LAST:event_tombolberandaMouseEntered

    private void tombolberandaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolberandaMouseExited
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol beranda.png"));
        tombolberanda.setIcon(pg);
    }//GEN-LAST:event_tombolberandaMouseExited

    private void tombolproses1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolproses1MouseEntered
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol proses 2.png"));
        tombolproses1.setIcon(pg);
    }//GEN-LAST:event_tombolproses1MouseEntered

    private void tombolproses1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolproses1MouseExited
        // TODO add your handling code here:
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol proses.png"));
        tombolproses1.setIcon(pg);
    }//GEN-LAST:event_tombolproses1MouseExited

    private void tombolcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolcariMouseClicked
        // TODO add your handling code here:
        controller.search();
        cari_txt.setText("");
    }//GEN-LAST:event_tombolcariMouseClicked

    private void tombolcariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolcariMouseEntered
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol cari 2.png"));
        tombolcari.setIcon(pg);
    }//GEN-LAST:event_tombolcariMouseEntered

    private void tombolcariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolcariMouseExited
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol cari.png"));
        tombolcari.setIcon(pg);
    }//GEN-LAST:event_tombolcariMouseExited

    private void cari_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cari_txtActionPerformed

    private void tombolhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolhapusMouseClicked
        try {
            controller.delete();
            controller.isiTable();
            controller.clear();
        } catch (SQLException ex) {
            Logger.getLogger(form_peminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tombolhapusMouseClicked

    private void tombolhapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolhapusMouseEntered
        // TODO add your handling code here:
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol hapus 2.png"));
        tombolhapus.setIcon(pg);
    }//GEN-LAST:event_tombolhapusMouseEntered

    private void tombolhapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolhapusMouseExited
        // TODO add your handling code here:
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol hapus.png"));
        tombolhapus.setIcon(pg);
    }//GEN-LAST:event_tombolhapusMouseExited

    private void tabelPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPeminjamanMouseClicked
        controller.tabelklik();
    }//GEN-LAST:event_tabelPeminjamanMouseClicked

    private void idpetugas_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpetugas_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpetugas_txtActionPerformed

    private void tombolproses1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolproses1MouseClicked
        controller.insert();
        controller.isiTable();
        try {
            controller.clear();
        } catch (SQLException ex) {
            Logger.getLogger(form_peminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tombolproses1MouseClicked

    private void idanggota_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idanggota_txtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            controller.OnKeyPressIdAnggota();
        }
    }//GEN-LAST:event_idanggota_txtKeyPressed

    private void idbuku_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idbuku_txtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            controller.OnKeyPressIdBuku();
        }
    }//GEN-LAST:event_idbuku_txtKeyPressed

    private void tgldikembalikan_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tgldikembalikan_txtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                controller.onKeyPressTanggaldiKembalikan();
            } catch (SQLException ex) {
                Logger.getLogger(form_peminjaman.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tgldikembalikan_txtKeyPressed

    private void tglkembali_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tglkembali_txtKeyPressed
        try {
            controller.OnKeyPressTglPinjam();
        } catch (SQLException ex) {
            Logger.getLogger(form_peminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tglkembali_txtKeyPressed

    private void idanggota_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idanggota_txtKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            controller.OnKeyPressIdAnggota();
        }
    }//GEN-LAST:event_idanggota_txtKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new form_peminjaman().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(form_peminjaman.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JTextField cari_txt;
    private javax.swing.JTextField denda_txt;
    private javax.swing.JTextField idanggota_txt;
    private javax.swing.JTextField idbuku_txt;
    private javax.swing.JTextField idpetugas_txt;
    private javax.swing.JTextField idpinjam_txt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judul_txt;
    private javax.swing.JTextField nama_txt;
    private javax.swing.JComboBox status;
    private javax.swing.JTable tabelPeminjaman;
    private javax.swing.JTextField terlambat_txt;
    private javax.swing.JTextField tgldikembalikan_txt;
    private javax.swing.JTextField tglkembali_txt;
    private javax.swing.JTextField tglpinjam_txt;
    private javax.swing.JLabel tombolberanda;
    private javax.swing.JLabel tombolcari;
    private javax.swing.JLabel tombolhapus;
    private javax.swing.JLabel tombolproses1;
    // End of variables declaration//GEN-END:variables
}
