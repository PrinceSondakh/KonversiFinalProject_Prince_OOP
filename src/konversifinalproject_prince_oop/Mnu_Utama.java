/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversifinalproject_prince_oop;
import AppPackage.AnimationClass;
import javax.swing.ImageIcon;
/**
 *
 * @author Prince George Imanuel awaauwuw
 */
public class Mnu_Utama extends YourName {

    /**
     * Creates new form Mnu_Utama
     * Author: Prince George Imanuel
    */
    AnimationClass AC = new AnimationClass(); // saya menggunakan class java animation
    
    
    public Mnu_Utama() {
        initComponents();
        label_NamaUser.setText(user);
        SlideShow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Utama = new javax.swing.JPanel();
        judul_UTAMA = new javax.swing.JLabel();
        label_HALO = new javax.swing.JLabel();
        label_NamaUser = new javax.swing.JLabel();
        tombol_Exit = new javax.swing.JLabel();
        tombol_waktu = new javax.swing.JLabel();
        tombol_suhu = new javax.swing.JLabel();
        tombol_panjang = new javax.swing.JLabel();
        tombol_massa = new javax.swing.JLabel();
        tombol_uang = new javax.swing.JLabel();
        tombol_volum = new javax.swing.JLabel();
        tombol_jumlah = new javax.swing.JLabel();
        tombol_luas = new javax.swing.JLabel();
        panel_IKLAN_UNKLAB_OOP = new javax.swing.JPanel();
        label_OOP = new javax.swing.JLabel();
        label_UNKLAB = new javax.swing.JLabel();
        tombol_next = new javax.swing.JLabel();
        panel_karakter = new javax.swing.JPanel();
        sensor_KEPALA = new javax.swing.JLabel();
        sensor_WAJAH = new javax.swing.JLabel();
        sensor_MARAH = new javax.swing.JLabel();
        label_karakter = new javax.swing.JLabel();
        label_Live2d_Murakumo = new javax.swing.JLabel();
        panel_IO = new javax.swing.JPanel();
        panel_tipe_pilihan = new javax.swing.JLabel();
        panel_keterangan = new javax.swing.JLabel();
        label_COPYRIGHT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel_Utama.setBackground(new java.awt.Color(255, 255, 255));
        panel_Utama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        panel_Utama.setLayout(null);

        judul_UTAMA.setFont(new java.awt.Font("Tempus Sans ITC", 0, 30)); // NOI18N
        judul_UTAMA.setForeground(new java.awt.Color(255, 153, 51));
        judul_UTAMA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul_UTAMA.setText("ADVANCED CONVERTER");
        panel_Utama.add(judul_UTAMA);
        judul_UTAMA.setBounds(50, 40, 360, 50);

        label_HALO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        label_HALO.setForeground(new java.awt.Color(102, 102, 102));
        label_HALO.setText("Halo,");
        panel_Utama.add(label_HALO);
        label_HALO.setBounds(30, 100, 40, 30);

        label_NamaUser.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        label_NamaUser.setForeground(new java.awt.Color(102, 102, 102));
        panel_Utama.add(label_NamaUser);
        label_NamaUser.setBounds(70, 100, 300, 30);

        tombol_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG/icn_close_small.png"))); // NOI18N
        tombol_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol_ExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol_ExitMousePressed(evt);
            }
        });
        panel_Utama.add(tombol_Exit);
        tombol_Exit.setBounds(440, 10, 20, 20);

        tombol_waktu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/waktu_hitam.jpg"))); // NOI18N
        tombol_waktu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol_waktuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol_waktuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol_waktuMousePressed(evt);
            }
        });
        panel_Utama.add(tombol_waktu);
        tombol_waktu.setBounds(20, 190, 110, 40);

        tombol_suhu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/suhu_hitam.jpg"))); // NOI18N
        tombol_suhu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol_suhuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol_suhuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol_suhuMousePressed(evt);
            }
        });
        panel_Utama.add(tombol_suhu);
        tombol_suhu.setBounds(20, 290, 110, 40);

        tombol_panjang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/panjang_hitam.jpg"))); // NOI18N
        tombol_panjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol_panjangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol_panjangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol_panjangMousePressed(evt);
            }
        });
        panel_Utama.add(tombol_panjang);
        tombol_panjang.setBounds(20, 440, 110, 40);

        tombol_massa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/massa_hitam.jpg"))); // NOI18N
        tombol_massa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol_massaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol_massaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol_massaMousePressed(evt);
            }
        });
        panel_Utama.add(tombol_massa);
        tombol_massa.setBounds(20, 240, 110, 40);

        tombol_uang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/uang_hitam.jpg"))); // NOI18N
        tombol_uang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol_uangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol_uangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol_uangMousePressed(evt);
            }
        });
        panel_Utama.add(tombol_uang);
        tombol_uang.setBounds(20, 390, 110, 40);

        tombol_volum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/volum_hitam.jpg"))); // NOI18N
        tombol_volum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol_volumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol_volumMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol_volumMousePressed(evt);
            }
        });
        panel_Utama.add(tombol_volum);
        tombol_volum.setBounds(20, 140, 110, 40);

        tombol_jumlah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/jumlah_hitam.jpg"))); // NOI18N
        tombol_jumlah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol_jumlahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol_jumlahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol_jumlahMousePressed(evt);
            }
        });
        panel_Utama.add(tombol_jumlah);
        tombol_jumlah.setBounds(20, 490, 110, 40);

        tombol_luas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/luas_hitam.jpg"))); // NOI18N
        tombol_luas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol_luasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol_luasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol_luasMousePressed(evt);
            }
        });
        panel_Utama.add(tombol_luas);
        tombol_luas.setBounds(20, 340, 110, 40);

        panel_IKLAN_UNKLAB_OOP.setLayout(null);

        label_OOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG/unklab3.jpg"))); // NOI18N
        panel_IKLAN_UNKLAB_OOP.add(label_OOP);
        label_OOP.setBounds(465, 0, 465, 154);

        label_UNKLAB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG/unklab1.jpg"))); // NOI18N
        label_UNKLAB.setText("jLabel18");
        panel_IKLAN_UNKLAB_OOP.add(label_UNKLAB);
        label_UNKLAB.setBounds(0, 0, 465, 154);

        panel_Utama.add(panel_IKLAN_UNKLAB_OOP);
        panel_IKLAN_UNKLAB_OOP.setBounds(0, 540, 465, 154);

        tombol_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_JPEG/arrow_right_smartscan0.png"))); // NOI18N
        tombol_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol_nextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol_nextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol_nextMousePressed(evt);
            }
        });
        panel_Utama.add(tombol_next);
        tombol_next.setBounds(440, 430, 20, 110);

        panel_karakter.setBackground(new java.awt.Color(255, 255, 255));
        panel_karakter.setLayout(null);

        sensor_KEPALA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sensor_KEPALAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sensor_KEPALAMouseExited(evt);
            }
        });
        panel_karakter.add(sensor_KEPALA);
        sensor_KEPALA.setBounds(80, 70, 100, 50);

        sensor_WAJAH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sensor_WAJAHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sensor_WAJAHMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sensor_WAJAHMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sensor_WAJAHMouseReleased(evt);
            }
        });
        panel_karakter.add(sensor_WAJAH);
        sensor_WAJAH.setBounds(90, 140, 80, 80);

        sensor_MARAH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sensor_MARAHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sensor_MARAHMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sensor_MARAHMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sensor_MARAHMouseReleased(evt);
            }
        });
        panel_karakter.add(sensor_MARAH);
        sensor_MARAH.setBounds(80, 280, 100, 50);

        label_karakter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_GIF/Biasa.gif"))); // NOI18N
        label_karakter.setPreferredSize(new java.awt.Dimension(300, 340));
        panel_karakter.add(label_karakter);
        label_karakter.setBounds(-40, 10, 340, 329);

        label_Live2d_Murakumo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_Live2d_Murakumo.setForeground(new java.awt.Color(153, 153, 153));
        label_Live2d_Murakumo.setText("Live2d - Murakumo");
        panel_karakter.add(label_Live2d_Murakumo);
        label_Live2d_Murakumo.setBounds(90, 410, 88, 13);

        panel_IO.setLayout(null);

        panel_tipe_pilihan.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        panel_tipe_pilihan.setForeground(new java.awt.Color(102, 102, 102));
        panel_tipe_pilihan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panel_IO.add(panel_tipe_pilihan);
        panel_tipe_pilihan.setBounds(20, 50, 170, 18);

        panel_keterangan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panel_keterangan.setForeground(new java.awt.Color(102, 102, 102));
        panel_keterangan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel_IO.add(panel_keterangan);
        panel_keterangan.setBounds(10, 10, 180, 50);

        panel_karakter.add(panel_IO);
        panel_IO.setBounds(30, 340, 200, 70);

        panel_Utama.add(panel_karakter);
        panel_karakter.setBounds(160, 100, 300, 425);

        label_COPYRIGHT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_COPYRIGHT.setForeground(new java.awt.Color(102, 102, 102));
        label_COPYRIGHT.setText("Copyright OOP-A 2016");
        panel_Utama.add(label_COPYRIGHT);
        label_COPYRIGHT.setBounds(230, 520, 140, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Utama, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Utama, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void tombol_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_ExitMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG/icn_close_small2.png"));
        tombol_Exit.setIcon(II);
    }//GEN-LAST:event_tombol_ExitMouseEntered

    private void tombol_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_ExitMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG/icn_close_small.png"));
        tombol_Exit.setIcon(II);
    }//GEN-LAST:event_tombol_ExitMouseExited

    private void tombol_ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_ExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_tombol_ExitMousePressed

    private void tombol_jumlahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_jumlahMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/jumlah_kuning.jpg"));
        tombol_jumlah.setIcon(II);
        msmile();
        panel_keterangan.setText("Jumlah ???");
        panel_tipe_pilihan.setText("+ Interface");
    }//GEN-LAST:event_tombol_jumlahMouseEntered

    private void tombol_jumlahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_jumlahMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/jumlah_hitam.jpg"));
        tombol_jumlah.setIcon(II);
        biasa();
        panel_keterangan.setText(null);
        panel_tipe_pilihan.setText(null);
    }//GEN-LAST:event_tombol_jumlahMouseExited

    private void tombol_luasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_luasMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/luas_Kuning.jpg"));
        tombol_luas.setIcon(II);
        mangap();
        panel_keterangan.setText("Luas ???");
        panel_tipe_pilihan.setText("+ Pewarisan");
    }//GEN-LAST:event_tombol_luasMouseEntered

    private void tombol_luasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_luasMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/luas_hitam.jpg"));
        tombol_luas.setIcon(II);
        biasa();
        panel_keterangan.setText(null);
        panel_tipe_pilihan.setText(null);
    }//GEN-LAST:event_tombol_luasMouseExited

    private void tombol_massaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_massaMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/massa_kuning.jpg"));
        tombol_massa.setIcon(II);
        mangap();
        panel_keterangan.setText("Massa ???");
        panel_tipe_pilihan.setText("+ Abstrak");
    }//GEN-LAST:event_tombol_massaMouseEntered

    private void tombol_massaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_massaMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/massa_hitam.jpg"));
        tombol_massa.setIcon(II);
        biasa();
        panel_keterangan.setText(null);
        panel_tipe_pilihan.setText(null);
    }//GEN-LAST:event_tombol_massaMouseExited

    private void tombol_panjangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_panjangMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/panjang_kuning.jpg"));
        tombol_panjang.setIcon(II);
        mangap();
        panel_keterangan.setText("Panjang ???");
        panel_tipe_pilihan.setText("+ Abstrak");
    }//GEN-LAST:event_tombol_panjangMouseEntered

    private void tombol_panjangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_panjangMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/panjang_hitam.jpg"));
        tombol_panjang.setIcon(II);
        biasa();
        panel_keterangan.setText(null);
        panel_tipe_pilihan.setText(null);
    }//GEN-LAST:event_tombol_panjangMouseExited

    private void tombol_uangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_uangMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/uang_kuning.jpg"));
        tombol_uang.setIcon(II);
        msmile();
        panel_keterangan.setText("Uang ???");
        panel_tipe_pilihan.setText("+ Abstrak");
    }//GEN-LAST:event_tombol_uangMouseEntered

    private void tombol_uangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_uangMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/uang_hitam.jpg"));
        tombol_uang.setIcon(II);
        biasa();
        panel_keterangan.setText(null);
        panel_tipe_pilihan.setText(null);        
    }//GEN-LAST:event_tombol_uangMouseExited

    private void tombol_suhuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_suhuMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/suhu_kuning.jpg"));
        tombol_suhu.setIcon(II);
        msmile();
        panel_keterangan.setText("Suhu ???");
        panel_tipe_pilihan.setText("+ Interface");
    }//GEN-LAST:event_tombol_suhuMouseEntered

    private void tombol_suhuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_suhuMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/suhu_hitam.jpg"));
        tombol_suhu.setIcon(II);
        biasa();
        panel_keterangan.setText(null);
        panel_tipe_pilihan.setText(null);        
    }//GEN-LAST:event_tombol_suhuMouseExited

    private void tombol_volumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_volumMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/volum_kuning.jpg"));
        tombol_volum.setIcon(II);
        mangap();
        panel_keterangan.setText("Volum ???");
        panel_tipe_pilihan.setText("+ Pewarisan");
    }//GEN-LAST:event_tombol_volumMouseEntered

    private void tombol_volumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_volumMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/volum_hitam.jpg"));
        tombol_volum.setIcon(II);
        biasa();
        panel_keterangan.setText(null);
        panel_tipe_pilihan.setText(null);
    }//GEN-LAST:event_tombol_volumMouseExited

    private void tombol_waktuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_waktuMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/waktu_kuning.jpg"));
        tombol_waktu.setIcon(II);
        msmile();
        panel_keterangan.setText("Waktu ???");
        panel_tipe_pilihan.setText("+ Interface");
    }//GEN-LAST:event_tombol_waktuMouseEntered

    private void tombol_waktuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_waktuMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/gambar_JPEG_Tombol/waktu_hitam.jpg"));
        tombol_waktu.setIcon(II);
        biasa();
        panel_keterangan.setText(null);
        panel_tipe_pilihan.setText(null);
    }//GEN-LAST:event_tombol_waktuMouseExited
    private void sensor_MARAHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensor_MARAHMousePressed
    }//GEN-LAST:event_sensor_MARAHMousePressed
    private void sensor_MARAHMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensor_MARAHMouseReleased
    }//GEN-LAST:event_sensor_MARAHMouseReleased
    private void sensor_WAJAHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensor_WAJAHMousePressed
    }//GEN-LAST:event_sensor_WAJAHMousePressed
    private void sensor_WAJAHMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensor_WAJAHMouseReleased
    }//GEN-LAST:event_sensor_WAJAHMouseReleased
    private void tombol_jumlahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_jumlahMousePressed
        KonversiSatuanJumlah o = new KonversiSatuanJumlah();
        o.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_tombol_jumlahMousePressed
    private void sensor_MARAHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensor_MARAHMouseEntered
        panel_keterangan.setText("!!&^*!");
        marah();
    }//GEN-LAST:event_sensor_MARAHMouseEntered

    private void sensor_MARAHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensor_MARAHMouseExited
        biasa();
    }//GEN-LAST:event_sensor_MARAHMouseExited

    private void sensor_WAJAHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensor_WAJAHMouseEntered
        panel_keterangan.setText(" !!! (>///<)");
        blush();
    }//GEN-LAST:event_sensor_WAJAHMouseEntered

    private void sensor_WAJAHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensor_WAJAHMouseExited
        biasa();
    }//GEN-LAST:event_sensor_WAJAHMouseExited

    private void sensor_KEPALAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensor_KEPALAMouseEntered
        panel_keterangan.setText("!!!!!!!!!");
        ngambek();
    }//GEN-LAST:event_sensor_KEPALAMouseEntered

    private void sensor_KEPALAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensor_KEPALAMouseExited
        biasa();
    }//GEN-LAST:event_sensor_KEPALAMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void tombol_nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_nextMouseEntered
        ImageIcon awkrd3 = new ImageIcon(getClass().getResource("/gambar_JPEG/arrow_right_smartscan2.png"));
        tombol_next.setIcon(awkrd3);
        panel_keterangan.setText("Lainnya ??");
        msmile();
    }//GEN-LAST:event_tombol_nextMouseEntered

    private void tombol_nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_nextMouseExited
        ImageIcon awkrd3 = new ImageIcon(getClass().getResource("/gambar_JPEG/arrow_right_smartscan0.png"));
        tombol_next.setIcon(awkrd3);
        biasa();
    }//GEN-LAST:event_tombol_nextMouseExited

    private void tombol_nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_nextMousePressed
        try{
            OTHERS obj = new OTHERS();
            obj.setVisible(true);
            setVisible(false);
        }catch(Exception a){}
    }//GEN-LAST:event_tombol_nextMousePressed

    private void tombol_volumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_volumMousePressed
        KonversiSatuanVolum o = new KonversiSatuanVolum();
        o.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_tombol_volumMousePressed

    private void tombol_panjangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_panjangMousePressed
        try{
            KonversiSatuanPanjang o = new KonversiSatuanPanjang();
            o.setVisible(true);
            setVisible(false);
        }catch(Exception a){}
    }//GEN-LAST:event_tombol_panjangMousePressed

    private void tombol_waktuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_waktuMousePressed
        KonversiSatuanWaktu o = new KonversiSatuanWaktu();
        o.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_tombol_waktuMousePressed

    private void tombol_massaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_massaMousePressed
        KonversiSatuanMassa o = new KonversiSatuanMassa();
        o.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_tombol_massaMousePressed

    private void tombol_luasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_luasMousePressed
        KonversiSatuanLuas o = new KonversiSatuanLuas();
        o.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_tombol_luasMousePressed

    private void tombol_suhuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_suhuMousePressed
        KonversiSuhu obj = new KonversiSuhu();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tombol_suhuMousePressed

    private void tombol_uangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_uangMousePressed
        KonversiUang obj = new KonversiUang();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tombol_uangMousePressed
    public void blush(){
        ImageIcon awkrd3 = new ImageIcon(getClass().getResource("/gambar_GIF/blush_LOOP.gif"));
        label_karakter.setIcon(awkrd3);      
    }

    public void msmile(){
        ImageIcon awkrd5 = new ImageIcon(getClass().getResource("/gambar_GIF/mangap_smile_2.gif"));
        label_karakter.setIcon(awkrd5);      
    }
    
    public void ngambek(){
        ImageIcon awkrd6 = new ImageIcon(getClass().getResource("/gambar_GIF/ngambek.gif"));
        label_karakter.setIcon(awkrd6);    
    }
    
    public void mangap(){
        ImageIcon awkrd4 = new ImageIcon(getClass().getResource("/gambar_GIF/senyum_mangap_kanan_LOOP.gif"));
        label_karakter.setIcon(awkrd4);    
    }
    
    public void nggkStuju(){
        ImageIcon awkrd88 = new ImageIcon(getClass().getResource("/gambar_GIF/nggkstuju.gif"));
        label_karakter.setIcon(awkrd88);    
    }
    
    public void marah(){
        ImageIcon awkrd1 = new ImageIcon(getClass().getResource("/gambar_GIF/blush_marah_LOOP.gif"));
        label_karakter.setIcon(awkrd1);      
    }
    public void biasa(){
        ImageIcon awkrd2 = new ImageIcon(getClass().getResource("/gambar_GIF/biasa.gif"));
        label_karakter.setIcon(awkrd2);
        panel_keterangan.setText(null);
    }
    
    int i = 0;
    public void SlideShow(){
        new Thread(){
            int count = 0;
            @Override
            public void run(){
                try{ 
                    while(true){ // melakukan pengulangan terus menerus
                        switch(count){
                            case 0:
                                /*
                                    CATATAN
                                    #WAKTU PERPINDAHAN DARI LABEL KE LABEL LAINNYA ADALAH 10 DETIK
                                */
                                Thread.sleep(1000); //setiap 1 detik (jikalah labelnya sudah penuh seutuhnya) maka akan menjalankan statement ini
                                ImageIcon r = new ImageIcon(getClass().getResource("/gambar_JPEG/unklab1.jpg"));
                                label_UNKLAB.setIcon(r);
                                AC.jLabelXLeft(0, -465, 93, 5, label_UNKLAB); 
                                /* 
                                465 adalah lebar . .. 5 adalah kecepatan gerak label (1-20 biasanya default nya)
                                menurut sumber . . .
                                lebar harus dibagi dengan kecepatan gerak .. kecepatan gerak tidak harus 1-20 . ..
                                karena tergantung pada resolusi gambar juga
                                syaratnya ketika di bagi maka tidak boleh ada sisa bagi . . . 
                                hasil baginya dalam kasus ini adalah 93.
                                jikalah ada sisa bagi (alias koma) maka label tidak akan bergerak.
                                */
                                AC.jLabelXLeft(465, 0, 93, 5, label_OOP);
                                //sehabis menunggu 3 detik maka count akan menjadi 1 dan statement akan di oper ke case 1
                                count = 1;
                                break;
                            case 1:
                                Thread.sleep(1000);
                                ImageIcon sa = new ImageIcon(getClass().getResource("/gambar_JPEG/unklab3.jpg"));
                                label_OOP.setIcon(sa);
                                AC.jLabelXRight(-465, 0, 93, 5, label_UNKLAB);
                                AC.jLabelXRight(0, 465, 93, 5, label_OOP);
                                count = 0;
                                break;
                        }
                    } 
                }
                catch(Exception e){
                
                }
            
            }
            
        }.start();    
    }    
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
            java.util.logging.Logger.getLogger(Mnu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mnu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mnu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mnu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mnu_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel judul_UTAMA;
    private javax.swing.JLabel label_COPYRIGHT;
    private javax.swing.JLabel label_HALO;
    private javax.swing.JLabel label_Live2d_Murakumo;
    private javax.swing.JLabel label_NamaUser;
    private javax.swing.JLabel label_OOP;
    private javax.swing.JLabel label_UNKLAB;
    private javax.swing.JLabel label_karakter;
    private javax.swing.JPanel panel_IKLAN_UNKLAB_OOP;
    private javax.swing.JPanel panel_IO;
    private javax.swing.JPanel panel_Utama;
    private javax.swing.JPanel panel_karakter;
    private javax.swing.JLabel panel_keterangan;
    private javax.swing.JLabel panel_tipe_pilihan;
    private javax.swing.JLabel sensor_KEPALA;
    private javax.swing.JLabel sensor_MARAH;
    private javax.swing.JLabel sensor_WAJAH;
    private javax.swing.JLabel tombol_Exit;
    private javax.swing.JLabel tombol_jumlah;
    private javax.swing.JLabel tombol_luas;
    private javax.swing.JLabel tombol_massa;
    private javax.swing.JLabel tombol_next;
    private javax.swing.JLabel tombol_panjang;
    private javax.swing.JLabel tombol_suhu;
    private javax.swing.JLabel tombol_uang;
    private javax.swing.JLabel tombol_volum;
    private javax.swing.JLabel tombol_waktu;
    // End of variables declaration//GEN-END:variables
}
