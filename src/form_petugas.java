
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
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
public class form_petugas extends javax.swing.JFrame {

    /**
     * Creates new form form_petugas
     */
    PetugasController controller;
    
    public form_petugas() {
        initComponents();
        controller = new PetugasController(this);
        controller.isiTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jk = new javax.swing.ButtonGroup();
        nama_txt = new javax.swing.JTextField();
        rb_lk = new javax.swing.JRadioButton();
        rb_pr = new javax.swing.JRadioButton();
        nik_txt = new javax.swing.JTextField();
        alamat_txt = new javax.swing.JTextField();
        nohp_txt = new javax.swing.JTextField();
        idpetugas_txt = new javax.swing.JTextField();
        tombolberanda = new javax.swing.JLabel();
        tombolproses = new javax.swing.JLabel();
        tombolhapus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPetugas = new javax.swing.JTable();
        pass = new javax.swing.JPasswordField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nama_txt.setBorder(null);
        nama_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_txtActionPerformed(evt);
            }
        });
        getContentPane().add(nama_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 159, 285, 30));

        rb_lk.setBackground(new java.awt.Color(198, 215, 220));
        jk.add(rb_lk);
        rb_lk.setBorder(null);
        rb_lk.setMargin(new java.awt.Insets(2, 2, 3, 2));
        rb_lk.setMaximumSize(new java.awt.Dimension(25, 25));
        rb_lk.setPreferredSize(new java.awt.Dimension(25, 25));
        rb_lk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_lkActionPerformed(evt);
            }
        });
        getContentPane().add(rb_lk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 224, 20, -1));

        rb_pr.setBackground(new java.awt.Color(198, 214, 220));
        jk.add(rb_pr);
        rb_pr.setBorder(null);
        rb_pr.setMargin(new java.awt.Insets(2, 2, 3, 2));
        rb_pr.setMaximumSize(new java.awt.Dimension(25, 25));
        rb_pr.setPreferredSize(new java.awt.Dimension(25, 25));
        rb_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_prActionPerformed(evt);
            }
        });
        getContentPane().add(rb_pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 224, 20, -1));

        nik_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nik_txt.setBorder(null);
        getContentPane().add(nik_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 275, 285, 30));

        alamat_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        alamat_txt.setBorder(null);
        getContentPane().add(alamat_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 333, 285, 30));

        nohp_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nohp_txt.setBorder(null);
        nohp_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nohp_txtActionPerformed(evt);
            }
        });
        getContentPane().add(nohp_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 393, 285, 30));

        idpetugas_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idpetugas_txt.setBorder(null);
        getContentPane().add(idpetugas_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 452, 285, 30));

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
        getContentPane().add(tombolberanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 657, -1, -1));

        tombolproses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tombol proses.png"))); // NOI18N
        tombolproses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolprosesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombolprosesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombolprosesMouseExited(evt);
            }
        });
        getContentPane().add(tombolproses, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 574, -1, -1));

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
        getContentPane().add(tombolhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 657, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tabelPetugas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tabelPetugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Petugas", "Nama", "Jenis Kelamin", "Alamat", "NIK", "No Telp", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelPetugas.setRowHeight(30);
        tabelPetugas.setRowMargin(2);
        tabelPetugas.setSelectionBackground(new java.awt.Color(229, 171, 171));
        tabelPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPetugasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPetugas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 730, 570));

        pass.setBorder(null);
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 515, 285, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/From Register.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getAlamat_txt() {
        return alamat_txt;
    }

    public JTextField getIdpetugas_txt() {
        return idpetugas_txt;
    }

    public ButtonGroup getJk() {
        return jk;
    }

    public JTextField getNama_txt() {
        return nama_txt;
    }

    public JTextField getNik_txt() {
        return nik_txt;
    }

    public JTextField getNohp_txt() {
        return nohp_txt;
    }

    public JPasswordField getPass() {
        return pass;
    }


    public JRadioButton getRb_lk() {
        return rb_lk;
    }

    public JRadioButton getRb_pr() {
        return rb_pr;
    }

    public JTable getTabelPetugas() {
        return tabelPetugas;
    }

    private void nama_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_txtActionPerformed

    private void rb_lkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_lkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_lkActionPerformed

    private void rb_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_prActionPerformed

    private void nohp_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nohp_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nohp_txtActionPerformed

    private void tombolberandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolberandaMouseEntered
        // TODO add your handling code here:
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol beranda 2.png"));
        tombolberanda.setIcon(pg);
    }//GEN-LAST:event_tombolberandaMouseEntered

    private void tombolberandaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolberandaMouseExited
        // TODO add your handling code here:
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol beranda.png"));
        tombolberanda.setIcon(pg);
    }//GEN-LAST:event_tombolberandaMouseExited

    private void tombolprosesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolprosesMouseClicked
        controller.insert();
        controller.clear();
        controller.isiTable();
    }//GEN-LAST:event_tombolprosesMouseClicked

    private void tombolprosesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolprosesMouseEntered
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol proses 2.png"));
        tombolproses.setIcon(pg);
    }//GEN-LAST:event_tombolprosesMouseEntered

    private void tombolprosesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolprosesMouseExited
        ImageIcon pg = new ImageIcon(getClass().getResource("gambar/tombol proses.png"));
        tombolproses.setIcon(pg);
    }//GEN-LAST:event_tombolprosesMouseExited

    private void tombolhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolhapusMouseClicked
        controller.delete();
        controller.isiTable();
        controller.clear();
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

    private void tabelPetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPetugasMouseClicked
        // TODO add your handling code here:
        controller.tabelklik();
    }//GEN-LAST:event_tabelPetugasMouseClicked

    private void tombolberandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolberandaMouseClicked
        // TODO add your handling code here:
        new form_home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolberandaMouseClicked

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
            java.util.logging.Logger.getLogger(form_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_petugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat_txt;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField idpetugas_txt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jk;
    private javax.swing.JTextField nama_txt;
    private javax.swing.JTextField nik_txt;
    private javax.swing.JTextField nohp_txt;
    private javax.swing.JPasswordField pass;
    private javax.swing.JRadioButton rb_lk;
    private javax.swing.JRadioButton rb_pr;
    private javax.swing.JTable tabelPetugas;
    private javax.swing.JLabel tombolberanda;
    private javax.swing.JLabel tombolhapus;
    private javax.swing.JLabel tombolproses;
    // End of variables declaration//GEN-END:variables
}
