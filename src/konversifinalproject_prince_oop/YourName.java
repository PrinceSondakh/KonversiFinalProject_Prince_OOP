/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversifinalproject_prince_oop;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author Prince George Imanuel Sondakh
 */
public class YourName extends javax.swing.JFrame {

    /**
     * Creates new form YourName
     */
    public YourName() {
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
        nama_Label = new javax.swing.JLabel();
        kolom_Nama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        jPanel1.setLayout(null);

        nama_Label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        nama_Label.setForeground(new java.awt.Color(255, 153, 51));
        nama_Label.setText("Masukan nama anda");
        jPanel1.add(nama_Label);
        nama_Label.setBounds(80, 20, 180, 50);

        kolom_Nama.setBackground(new java.awt.Color(254, 254, 214));
        kolom_Nama.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        kolom_Nama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kolom_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom_NamaActionPerformed(evt);
            }
        });
        kolom_Nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kolom_NamaKeyPressed(evt);
            }
        });
        jPanel1.add(kolom_Nama);
        kolom_Nama.setBounds(40, 80, 250, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(332, 155));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    static String user;

    private void kolom_NamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kolom_NamaKeyPressed
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            user = kolom_Nama.getText();
            new Mnu_Utama().setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_kolom_NamaKeyPressed

    private void kolom_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolom_NamaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0.0; i <= 1.0; i = i + 0.1){ // menambahkan 0.1 seterusnya sampai JFrame benar2 terpenuhi 
            String val = i + "F";
            float f = Float.valueOf(val);  
            this.setOpacity(f);       
            try //Tanya knp pakai try catch di bagian ini
            {
                Thread.sleep(100); 
            }
            catch(Exception e)
            {
            
            }
        }
    }//GEN-LAST:event_formWindowOpened
//textInput.setHorizontalAlignment(JTextField.CENTER); 
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
            java.util.logging.Logger.getLogger(YourName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YourName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YourName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YourName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YourName().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kolom_Nama;
    private javax.swing.JLabel nama_Label;
    // End of variables declaration//GEN-END:variables
}
