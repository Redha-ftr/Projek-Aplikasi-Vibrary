
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
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
public class form_buku extends javax.swing.JFrame {

    /**
     * Creates new form form_buku
     */
    BukuController controller;
    
    public form_buku() {
        initComponents();
        controller = new BukuController(this);
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

        kat_cb = new javax.swing.JComboBox();
        judul_txt = new javax.swing.JTextField();
        pengarang_txt = new javax.swing.JTextField();
        penerbit_txt = new javax.swing.JTextField();
        tahun_txt = new javax.swing.JTextField();
        isbn_txt = new javax.swing.JTextField();
        idbuku_txt = new javax.swing.JTextField();
        tombolberanda = new javax.swing.JLabel();
        tombolhapus = new javax.swing.JLabel();
        tombolcari = new javax.swing.JLabel();
        cari_txt = new javax.swing.JTextField();
        tombolproses = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBuku = new javax.swing.JTable();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kat_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Novel", "Komik", "Ensiklopedi", "Sejarah", "Pelajaran", "Agama", "Self Improvement", "Jurnal Ilmiah" }));
        kat_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kat_cbActionPerformed(evt);
            }
        });
        getContentPane().add(kat_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 524, 280, 25));

        judul_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        judul_txt.setBorder(null);
        judul_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judul_txtActionPerformed(evt);
            }
        });
        getContentPane().add(judul_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 292, 261, 25));

        pengarang_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        pengarang_txt.setBorder(null);
        pengarang_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengarang_txtActionPerformed(evt);
            }
        });
        getContentPane().add(pengarang_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 335, 261, 25));

        penerbit_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        penerbit_txt.setBorder(null);
        penerbit_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penerbit_txtActionPerformed(evt);
            }
        });
        getContentPane().add(penerbit_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 261, 25));

        tahun_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tahun_txt.setBorder(null);
        tahun_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahun_txtActionPerformed(evt);
            }
        });
        getContentPane().add(tahun_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 425, 261, 25));

        isbn_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        isbn_txt.setBorder(null);
        isbn_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        isbn_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbn_txtActionPerformed(evt);
            }
        });
        getContentPane().add(isbn_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 474, 261, 25));

        idbuku_txt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        idbuku_txt.setBorder(null);
        idbuku_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbuku_txtActionPerformed(evt);
            }
        });
        getContentPane().add(idbuku_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 249, 261, 25));

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
        getContentPane().add(tombolberanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 652, -1, -1));

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
        getContentPane().add(tombolhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(922, 652, -1, -1));

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
        getContentPane().add(tombolcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 74, -1, -1));

        cari_txt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cari_txt.setBorder(null);
        cari_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_txtActionPerformed(evt);
            }
        });
        getContentPane().add(cari_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 30));

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
        getContentPane().add(tombolproses, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 560, -1, -1));

        tabelBuku.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tabelBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Buku", "Judul Buku", "Pengarang", "Penerbit", "Tahun Terbit", "ISBN", "Kategori"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelBuku.setRowHeight(30);
        tabelBuku.setRowMargin(2);
        tabelBuku.setSelectionBackground(new java.awt.Color(229, 171, 171));
        tabelBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBuku);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 780, 480));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Form Buku.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getIdbuku_txt() {
        return idbuku_txt;
    }

    public JComboBox getKat_cb() {
        return kat_cb;
    }

    public JTextField getIsbn_txt() {
        return isbn_txt;
    }

    public JTextField getJudul_txt() {
        return judul_txt;
    }

    public JTextField getPenerbit_txt() {
        return penerbit_txt;
    }

    public JTextField getPengarang_txt() {
        return pengarang_txt;
    }

    public JTextField getTahun_txt() {
        return tahun_txt;
    }

    public JTextField getCari_txt() {
        return cari_txt;
    }

    public JTable getTabelBuku() {
        return tabelBuku;
    }

    private void judul_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judul_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judul_txtActionPerformed

    private void pengarang_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengarang_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pengarang_txtActionPerformed

    private void penerbit_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penerbit_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penerbit_txtActionPerformed

    private void tahun_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahun_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tahun_txtActionPerformed

    private void isbn_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbn_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbn_txtActionPerformed

    private void idbuku_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbuku_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbuku_txtActionPerformed

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

    private void tombolberandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolberandaMouseClicked
        // TODO add your handling code here:
        new form_home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolberandaMouseClicked

    private void kat_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kat_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kat_cbActionPerformed

    private void tombolhapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolhapusMouseClicked
        controller.delete();
        controller.isiTable();
        controller.clear();
    }//GEN-LAST:event_tombolhapusMouseClicked

    private void tombolcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolcariMouseClicked
        // TODO add your handling code here:
        controller.search();
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

    private void tabelBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuMouseClicked
        controller.tabelklik();
    }//GEN-LAST:event_tabelBukuMouseClicked

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
            java.util.logging.Logger.getLogger(form_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JTextField cari_txt;
    private javax.swing.JTextField idbuku_txt;
    private javax.swing.JTextField isbn_txt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judul_txt;
    private javax.swing.JComboBox kat_cb;
    private javax.swing.JTextField penerbit_txt;
    private javax.swing.JTextField pengarang_txt;
    private javax.swing.JTable tabelBuku;
    private javax.swing.JTextField tahun_txt;
    private javax.swing.JLabel tombolberanda;
    private javax.swing.JLabel tombolcari;
    private javax.swing.JLabel tombolhapus;
    private javax.swing.JLabel tombolproses;
    // End of variables declaration//GEN-END:variables
}
