/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversifinalproject_prince_oop;

import AppPackage.AnimationClass;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Dumasi Ekel
 */
public class Tentang extends javax.swing.JFrame {

    /**
     * Creates new form Tentang
     */
    AnimationClass AC = new AnimationClass();
    public Tentang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nama = new javax.swing.JLabel();
        jurusan_fkltas = new javax.swing.JLabel();
        tipe_program = new javax.swing.JLabel();
        nimReg = new javax.swing.JLabel();
        purpose = new javax.swing.JLabel();
        purpose2 = new javax.swing.JLabel();
        matkul = new javax.swing.JLabel();
        tentang = new javax.swing.JLabel();
        tombol_balik = new javax.swing.JLabel();
        gif_circle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jPanel1.setLayout(null);

        nama.setBackground(new java.awt.Color(153, 255, 153));
        nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(102, 102, 102));
        nama.setText("NAME : PRINCE GEORGE IMANUEL");
        jPanel1.add(nama);
        nama.setBounds(190, 100, 225, 17);

        jurusan_fkltas.setBackground(new java.awt.Color(153, 255, 153));
        jurusan_fkltas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jurusan_fkltas.setForeground(new java.awt.Color(102, 102, 102));
        jurusan_fkltas.setText("FIELD OF STUDY/ FACULTY : SISTEM INFORMASI, ILMU KOMPUTER");
        jPanel1.add(jurusan_fkltas);
        jurusan_fkltas.setBounds(110, 220, 442, 17);

        tipe_program.setBackground(new java.awt.Color(153, 255, 153));
        tipe_program.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipe_program.setForeground(new java.awt.Color(102, 102, 102));
        tipe_program.setText("PROGRAM NAME: KONVERSI SATUAN");
        jPanel1.add(tipe_program);
        tipe_program.setBounds(180, 260, 244, 17);

        nimReg.setBackground(new java.awt.Color(153, 255, 153));
        nimReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nimReg.setForeground(new java.awt.Color(102, 102, 102));
        nimReg.setText("NIM/ NO. REG: 105011510011, S21510045");
        jPanel1.add(nimReg);
        nimReg.setBounds(160, 140, 278, 20);

        purpose.setBackground(new java.awt.Color(153, 255, 153));
        purpose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        purpose.setForeground(new java.awt.Color(102, 102, 102));
        purpose.setText("TUJUAN PEMBUATAN PROGRAM : DALAM RANGKA UNTUK ");
        jPanel1.add(purpose);
        purpose.setBounds(120, 300, 385, 17);

        purpose2.setBackground(new java.awt.Color(153, 255, 153));
        purpose2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        purpose2.setForeground(new java.awt.Color(102, 102, 102));
        purpose2.setText(" MEMENUHI NILAI FINAL PROJECT");
        jPanel1.add(purpose2);
        purpose2.setBounds(190, 340, 220, 17);

        matkul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        matkul.setForeground(new java.awt.Color(102, 102, 102));
        matkul.setText("SUBJECT : OBJECT ORIENTED PROGRAMMING - A");
        jPanel1.add(matkul);
        matkul.setBounds(130, 180, 328, 20);

        tentang.setFont(new java.awt.Font("Tempus Sans ITC", 0, 28)); // NOI18N
        tentang.setForeground(new java.awt.Color(102, 102, 102));
        tentang.setText("    ABOUT");
        jPanel1.add(tentang);
        tentang.setBounds(230, 30, 160, 44);

        tombol_balik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG/arrow_left_smartscan_0.png"))); // NOI18N
        tombol_balik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol_balikMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol_balikMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol_balikMousePressed(evt);
            }
        });
        jPanel1.add(tombol_balik);
        tombol_balik.setBounds(20, 20, 40, 60);

        gif_circle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_GIF/11_8---Little-Loader.gif"))); // NOI18N
        gif_circle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gif_circleMouseEntered(evt);
            }
        });
        jPanel1.add(gif_circle);
        gif_circle.setBounds(-100, 0, 720, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 390);

        setSize(new java.awt.Dimension(600, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tombol_balikMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_balikMousePressed
        OTHERS objTampilNewJFrame = new OTHERS();
        objTampilNewJFrame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_tombol_balikMousePressed

    private void tombol_balikMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_balikMouseExited
       ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG/arrow_left_smartscan_0.png"));
        tombol_balik.setIcon(II); 
    }//GEN-LAST:event_tombol_balikMouseExited

    private void tombol_balikMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_balikMouseEntered
       ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG/arrow_left_smartscan_1.png"));
        tombol_balik.setIcon(II); 
    }//GEN-LAST:event_tombol_balikMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.0; i <= 1.0; i = i + 0.1){ 
            String val = i + "F";
            float f = Float.valueOf(val);  
            this.setOpacity(f);       
            try 
            {
                Thread.sleep(100); 
            }
            catch(Exception e)
            {
            
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void gif_circleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gif_circleMouseEntered
        /*
        int countt = 0;
        try {
                switch(countt){
                    case 0:
                        ImageIcon r = new ImageIcon(getClass().getResource("/TentangGambar/atoms2_1.jpg"));
                        jLabel12.setIcon(r);
                        Thread.sleep(3000);
                        countt = 1;
                    break;
                    case 1:
                        ImageIcon r1 = new ImageIcon(getClass().getResource("/TentangGambar/atoms3.jpg"));
                        jLabel12.setIcon(r1);
                        Thread.sleep(3000);
                        countt = 2;                        
                    break;
                    case 2:
                        ImageIcon r2 = new ImageIcon(getClass().getResource("/TentangGambar/atoms4.jpg"));
                        jLabel12.setIcon(r2);
                        Thread.sleep(3000);
                        countt = 3;
                    break;
                    case 3:
                        ImageIcon r3 = new ImageIcon(getClass().getResource("/TentangGambar/atoms5.jpg"));
                        jLabel12.setIcon(r3);
                        Thread.sleep(3000);
                        countt = 0;                        
                    break;
                }
        } catch (InterruptedException ex) {
            Logger.getLogger(Tentang.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }//GEN-LAST:event_gif_circleMouseEntered
   
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
            java.util.logging.Logger.getLogger(Tentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tentang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gif_circle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jurusan_fkltas;
    private javax.swing.JLabel matkul;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nimReg;
    private javax.swing.JLabel purpose;
    private javax.swing.JLabel purpose2;
    private javax.swing.JLabel tentang;
    private javax.swing.JLabel tipe_program;
    private javax.swing.JLabel tombol_balik;
    // End of variables declaration//GEN-END:variables
}
