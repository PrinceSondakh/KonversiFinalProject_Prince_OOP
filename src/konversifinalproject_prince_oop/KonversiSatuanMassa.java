/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversifinalproject_prince_oop;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dumasi Ekel
 */
public class KonversiSatuanMassa extends KonversiSatuanMassaAbstract {

    /**
     * Creates new form KonversiSatuanMassa
     */
    public KonversiSatuanMassa() {
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
        judul = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        output = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        convert = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        tombol_balik = new javax.swing.JLabel();

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

        judul.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 153, 51));
        judul.setText("KONVERSI SATUAN MASSA");
        jPanel1.add(judul);
        judul.setBounds(160, 30, 320, 50);

        input.setBackground(new java.awt.Color(254, 254, 214));
        input.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(input);
        input.setBounds(90, 110, 340, 40);

        output.setEditable(false);
        output.setBackground(new java.awt.Color(242, 242, 196));
        output.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        output.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });
        jPanel1.add(output);
        output.setBounds(90, 170, 340, 40);

        jComboBox2.setBackground(new java.awt.Color(254, 254, 214));
        jComboBox2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 153, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", "HG", "DAG", "G", "DG", "CG", "MG" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(450, 170, 80, 40);

        jComboBox1.setBackground(new java.awt.Color(254, 254, 214));
        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 153, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", "HG", "DAG", "G", "DG", "CG", "MG" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(450, 110, 80, 40);

        convert.setBackground(new java.awt.Color(254, 254, 214));
        convert.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        convert.setText("CONVERT");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });
        jPanel1.add(convert);
        convert.setBounds(320, 240, 140, 40);

        reset.setBackground(new java.awt.Color(254, 254, 214));
        reset.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 16)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(160, 240, 140, 40);

        tombol_balik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG/Kiribalik.png"))); // NOI18N
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
        tombol_balik.setBounds(20, 20, 70, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 300);

        setSize(new java.awt.Dimension(610, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
        prosesKonversiSatuanMassaAbstract();
    }//GEN-LAST:event_convertActionPerformed
    @Override
    public void prosesKonversiSatuanMassaAbstract(){

        String statement;
        try{
            statement = input.getText();
            int k = Integer.parseInt(statement);
            /*#1
            ===========================================================================================================
            KEMBALI KE DIRI MASING MASING
            ==============================================================================================================
            */
            if(jComboBox1.getSelectedItem().equals("KG") && jComboBox2.getSelectedItem().equals("KG")){
                String hasil = String.format("%d", k);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("HG") && jComboBox2.getSelectedItem().equals("HG")){
                String hasil = String.format("%d", k);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("DAG") && jComboBox2.getSelectedItem().equals("DAG")){
                String hasil = String.format("%d", k);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("G") && jComboBox2.getSelectedItem().equals("G")){
                String hasil = String.format("%d", k);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("DG") && jComboBox2.getSelectedItem().equals("DG")){
                String hasil = String.format("%d", k);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("CG") && jComboBox2.getSelectedItem().equals("CG")){
                String hasil = String.format("%d", k);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("MG") && jComboBox2.getSelectedItem().equals("MG")){
                String hasil = String.format("%d", k);
                output.setText(hasil);
            }        
            /*#2
            ===========================================================================================================
            KG ==> SEMUA 
            ==============================================================================================================
            */
            else if(jComboBox1.getSelectedItem().equals("KG") && jComboBox2.getSelectedItem().equals("HG")){
                long hasil2 = k * 10l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("KG") && jComboBox2.getSelectedItem().equals("DAG")){
                long hasil2 = k * 100l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("KG") && jComboBox2.getSelectedItem().equals("G")){
                long hasil2 = k * 1000l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("KG") && jComboBox2.getSelectedItem().equals("DG")){
                long hasil2 = k * 10000l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("KG") && jComboBox2.getSelectedItem().equals("CG")){
                long hasil2 = k * 100000l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("KG") && jComboBox2.getSelectedItem().equals("MG")){
                long hasil2 = k * 1000000l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            /*#3
            ============================================================================================================
            HG ==> SEMUA   
            ============================================================================================================        
            */
            else if(jComboBox1.getSelectedItem().equals("HG") && jComboBox2.getSelectedItem().equals("KG")){
                double hasil1 = k / 10f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("HG") && jComboBox2.getSelectedItem().equals("DAG")){
                long hasil2 = k * 10l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("HG") && jComboBox2.getSelectedItem().equals("G")){
                long hasil2 = k * 100l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("HG") && jComboBox2.getSelectedItem().equals("DG")){
                long hasil2 = k * 1000l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("HG") && jComboBox2.getSelectedItem().equals("CG")){
                long hasil2 = k * 10000l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("HG") && jComboBox2.getSelectedItem().equals("MG")){
                long hasil2 = k * 100000l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            /*#4
            ============================================================================================================
            DAG ==> SEMUA   
            ============================================================================================================        
            */
            else if(jComboBox1.getSelectedItem().equals("DAG") && jComboBox2.getSelectedItem().equals("KG")){
                double hasil1 = k / 100f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("DAG") && jComboBox2.getSelectedItem().equals("HG")){
                double hasil1 = k / 10f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("DAG") && jComboBox2.getSelectedItem().equals("G")){
                long hasil2 = k * 10l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("DAG") && jComboBox2.getSelectedItem().equals("DG")){
                long hasil2 = k * 100l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("DAG") && jComboBox2.getSelectedItem().equals("CG")){
                long hasil2 = k * 1000l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("DAG") && jComboBox2.getSelectedItem().equals("MG")){
                long hasil2 = k * 10000l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            /*#4
            ============================================================================================================
            G ==> SEMUA   
            ============================================================================================================        
            */
            else if(jComboBox1.getSelectedItem().equals("G") && jComboBox2.getSelectedItem().equals("KG")){
                double hasil1 = k / 1000f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("G") && jComboBox2.getSelectedItem().equals("HG")){
                double hasil1 = k / 100f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("G") && jComboBox2.getSelectedItem().equals("DAG")){
                double hasil1 = k / 10f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("G") && jComboBox2.getSelectedItem().equals("DG")){
                long hasil2 = k * 10l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("G") && jComboBox2.getSelectedItem().equals("CG")){
                long hasil2 = k * 100l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("G") && jComboBox2.getSelectedItem().equals("MG")){
                long hasil2 = k * 1000l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }        

            /*#5
            ============================================================================================================
            DG ==> SEMUA   
            ============================================================================================================        
            */
            else if(jComboBox1.getSelectedItem().equals("DG") && jComboBox2.getSelectedItem().equals("KG")){
                double hasil1 = k / 10000f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("DG") && jComboBox2.getSelectedItem().equals("HG")){
                double hasil1 = k / 1000f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("DG") && jComboBox2.getSelectedItem().equals("DAG")){
                double hasil1 = k / 100f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("DG") && jComboBox2.getSelectedItem().equals("G")){
                double hasil1 = k / 10f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("DG") && jComboBox2.getSelectedItem().equals("CG")){
                long hasil2 = k * 10l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("DG") && jComboBox2.getSelectedItem().equals("MG")){
                long hasil2 = k * 100l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }        

            /*#6
            ============================================================================================================
            CG ==> SEMUA   
            ============================================================================================================        
            */

            else if(jComboBox1.getSelectedItem().equals("CG") && jComboBox2.getSelectedItem().equals("KG")){
                double hasil1 = k / 100000f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("CG") && jComboBox2.getSelectedItem().equals("HG")){
                double hasil1 = k / 10000f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("CG") && jComboBox2.getSelectedItem().equals("DAG")){
                double hasil1 = k / 1000f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("CG") && jComboBox2.getSelectedItem().equals("G")){
                double hasil1 = k / 100f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("CG") && jComboBox2.getSelectedItem().equals("DG")){
                double hasil1 = k / 10f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("CG") && jComboBox2.getSelectedItem().equals("MG")){
                long hasil2 = k * 10l;
                String hasil = String.format("%d", hasil2);
                output.setText(hasil);
            }        
            /*#7
            ============================================================================================================
            MG ==> SEMUA   
            ============================================================================================================        
            */
            else if(jComboBox1.getSelectedItem().equals("MG") && jComboBox2.getSelectedItem().equals("KG")){
                double hasil1 = k / 1000000f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("MG") && jComboBox2.getSelectedItem().equals("HG")){
                double hasil1 = k / 100000f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("MG") && jComboBox2.getSelectedItem().equals("DAG")){
                double hasil1 = k / 10000f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("MG") && jComboBox2.getSelectedItem().equals("G")){
                double hasil1 = k / 1000f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else if(jComboBox1.getSelectedItem().equals("MG") && jComboBox2.getSelectedItem().equals("DG")){
                double hasil1 = k / 100f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }        
            else if(jComboBox1.getSelectedItem().equals("MG") && jComboBox2.getSelectedItem().equals("CG")){
                double hasil1 = k / 10f;
                String hasil = String.format("%f", hasil1);
                output.setText(hasil);
            }
            else{
                JOptionPane.showMessageDialog(null, "Terjadi Permasalahan."); 
                input.setText(null);
                output.setText(null);
                jComboBox1.setSelectedItem("KG");
                jComboBox2.setSelectedItem("KG");
            }
        }catch(NumberFormatException a){
                JOptionPane.showMessageDialog(null, "Terjadi Permasalahan.\nDilarang menggunakan karakter untuk memasukkan nilai,\ntidak memasukkan apapun,\natau memasukan jumlah diluar batas.");            
                input.setText(null);
                output.setText(null);
                jComboBox1.setSelectedItem("KG");
                jComboBox2.setSelectedItem("KG");
        }
/*

=================================================(PEMISAH)==========================================================        
     
*/    
    
    }
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        input.setText(null);
        output.setText(null);
        jComboBox1.setSelectedItem("KG");
        jComboBox2.setSelectedItem("KG");
    }//GEN-LAST:event_resetActionPerformed

    private void tombol_balikMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_balikMousePressed
        Mnu_Utama objTampilNewJFrame = new Mnu_Utama();
        objTampilNewJFrame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_tombol_balikMousePressed

    private void tombol_balikMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_balikMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG/Kiribalik.png"));
        tombol_balik.setIcon(II);
    }//GEN-LAST:event_tombol_balikMouseExited

    private void tombol_balikMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_balikMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG/Kiribalik2.png"));
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
            java.util.logging.Logger.getLogger(KonversiSatuanMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSatuanMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSatuanMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSatuanMassa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSatuanMassa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convert;
    private javax.swing.JTextField input;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judul;
    private javax.swing.JTextField output;
    private javax.swing.JButton reset;
    private javax.swing.JLabel tombol_balik;
    // End of variables declaration//GEN-END:variables
}
