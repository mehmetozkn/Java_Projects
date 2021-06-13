
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Main_Screen extends javax.swing.JFrame {

    DefaultListModel model = new DefaultListModel();
    FileWriter writer = null;
    ArrayList<Urun> urun_list;
    Login_Screen ls = new Login_Screen();

    Urun u1 = new Urun("Defacto   ", "Gomlek  ", "Ust Giyim", 50, 10);
    Urun u2 = new Urun("Pullbear  ", "Sapka   ", "Ust Giyim", 20, 30);
    Urun u3 = new Urun("Koton     ", "Kazak   ", "Ust Giyim", 80, 12);
    Urun u4 = new Urun("Pullbear  ", "Hirka   ", "Ust Giyim", 50, 10);
    Urun u5 = new Urun("H&M       ", "Penye   ", "Ust Giyim", 40, 16);

    Urun u6 = new Urun("LC Waikiki", "Etek    ", "Alt Giyim", 30, 15);
    Urun u7 = new Urun("H&M       ", "Pantolon", "Alt Giyim", 90, 15);
    Urun u8 = new Urun("Defacto   ", "Esofman ", "Alt Giyim", 30, 18);
    Urun u9 = new Urun("Koton     ", "Terlik  ", "Alt Giyim", 20, 10);
    Urun u10 = new Urun("Koton     ", "Sort    ", "Alt Giyim", 40, 15);

    public Main_Screen() {
        initComponents();
        setLocationRelativeTo(null);
        urun_list = new ArrayList<>();
        list_urun.setModel(model);
        urun_list.add(u1);
        urun_list.add(u2);
        urun_list.add(u3);
        urun_list.add(u4);
        urun_list.add(u5);
        urun_list.add(u6);
        urun_list.add(u7);
        urun_list.add(u8);
        urun_list.add(u9);
        urun_list.add(u10);
        txt_enaz_fiyat.setText("0");
        txt_encok_fiyat.setText("9999");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_urun = new javax.swing.JList<>();
        btn_satin_al = new javax.swing.JButton();
        txt_bilgi = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_listele = new javax.swing.JButton();
        rb_alt_giyim = new javax.swing.JRadioButton();
        rb_ust_giyim = new javax.swing.JRadioButton();
        txt_encok_fiyat = new javax.swing.JTextField();
        txt_enaz_fiyat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_hesap_degis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jSplitPane1.setDividerLocation(530);
        jSplitPane1.setDividerSize(3);
        jSplitPane1.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        list_urun.setBackground(new java.awt.Color(255, 255, 255));
        list_urun.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        list_urun.setForeground(new java.awt.Color(0, 0, 0));
        list_urun.setToolTipText("");
        list_urun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        list_urun.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(list_urun);

        btn_satin_al.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_satin_al.setForeground(new java.awt.Color(0, 204, 0));
        btn_satin_al.setText("BUY");
        btn_satin_al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_satin_alActionPerformed(evt);
            }
        });

        txt_bilgi.setEditable(false);
        txt_bilgi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_bilgi.setForeground(new java.awt.Color(255, 0, 0));
        txt_bilgi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(btn_satin_al, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txt_bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(txt_bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_satin_al, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        btn_listele.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_listele.setForeground(new java.awt.Color(102, 102, 255));
        btn_listele.setText(" LIST ");
        btn_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listeleActionPerformed(evt);
            }
        });

        rb_alt_giyim.setText("Lower");

        rb_ust_giyim.setText("Top");

        txt_encok_fiyat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_encok_fiyat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_encok_fiyatKeyTyped(evt);
            }
        });

        txt_enaz_fiyat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_enaz_fiyat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_enaz_fiyatKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Category ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Price Range");

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Least");

        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Most");

        btn_hesap_degis.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_hesap_degis.setText("CHANGE ACCOUNT");
        btn_hesap_degis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hesap_degisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(52, 52, 52))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rb_ust_giyim, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rb_alt_giyim))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_enaz_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_encok_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_listele, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btn_hesap_degis, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_hesap_degis)
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_alt_giyim)
                    .addComponent(rb_ust_giyim))
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_enaz_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_encok_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btn_listele, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listeleActionPerformed
        txt_bilgi.setText("");

        if (txt_enaz_fiyat.getText().isEmpty() || txt_encok_fiyat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Bir Fiyat Aralıgı Girmeniz Gerekmektedir.");
        } else {
            model.removeAllElements();
            int en_az = Integer.valueOf(txt_enaz_fiyat.getText()); // en az fiyatı alıyo
            int en_cok = Integer.valueOf(txt_encok_fiyat.getText()); // en çok fiyatı alıyo
            if ((rb_alt_giyim.isSelected()) && (rb_ust_giyim.isSelected())) { // kategoriyi alıyo 
                for (Urun urun : urun_list) {
                    if (urun.getUrun_fiyati() >= en_az && urun.getUrun_fiyati() <= en_cok) {
                        model.addElement(urun.getMagaza_adi() + "   " + urun.getUrun_adi() + "   " + urun.getAlt_üst() + "   " + urun.getUrun_fiyati() + " TL   " + urun.getStok_adeti() + " Adet");
                        txt_bilgi.setText("Alt Ve Üst Giyim Ürünleri Listelendi.");
                    }

                }
            } else if ((rb_alt_giyim.isSelected()) && !(rb_ust_giyim.isSelected())) {// kategoriyi alıyo 
                for (int i = 5; i < 10; i++) {
                    if (urun_list.get(i).getUrun_fiyati() >= en_az && urun_list.get(i).getUrun_fiyati() <= en_cok) {
                        model.addElement(urun_list.get(i).getMagaza_adi() + "   " + urun_list.get(i).getUrun_adi() + "   " + urun_list.get(i).getAlt_üst() + "   " + urun_list.get(i).getUrun_fiyati() + " TL   " + urun_list.get(i).getStok_adeti() + " Adet");
                        txt_bilgi.setText("Alt Giyim Ürünleri Listelendi.");
                    }

                }
            } else if ((rb_ust_giyim.isSelected()) && (!rb_alt_giyim.isSelected())) { // kategoriyi alıyo 
                for (int i = 0; i < 5; i++) {
                    if (urun_list.get(i).getUrun_fiyati() >= en_az && urun_list.get(i).getUrun_fiyati() <= en_cok) {
                        model.addElement(urun_list.get(i).getMagaza_adi() + "   " + urun_list.get(i).getUrun_adi() + "   " + urun_list.get(i).getAlt_üst() + "   " + urun_list.get(i).getUrun_fiyati() + " TL   " + urun_list.get(i).getStok_adeti() + " Adet");
                        txt_bilgi.setText("Üst Giyim Ürünleri Listelendi.");
                    }

                }
            }

        }

    }//GEN-LAST:event_btn_listeleActionPerformed


    private void txt_enaz_fiyatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_enaz_fiyatKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep(); // beep sesi çıkartır
            evt.consume();
        }

    }//GEN-LAST:event_txt_enaz_fiyatKeyTyped

    private void txt_encok_fiyatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_encok_fiyatKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();// beep sesi çıkartır
            evt.consume();
        }
    }//GEN-LAST:event_txt_encok_fiyatKeyTyped

    private void btn_satin_alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_satin_alActionPerformed
        txt_bilgi.setText("");
        int selected_index = list_urun.getSelectedIndex();
        if (selected_index == -1) {
            if (model.getSize() == 0) {
                txt_bilgi.setText("Liste Şuanda Boş!");
            } else {
                txt_bilgi.setText("Lütfen Bir Ürün Seçin!");
            }
        } else {

            String secilen = (String) model.getElementAt(selected_index);
            String urunAdi = secilen.substring(13, 21);
            String fis = "";

            for (int i = 0; i < urun_list.size(); i++) {
                if (urun_list.get(i).getUrun_adi().contains(urunAdi)) {

                    if (urun_list.get(i).getStok_adeti() > 0) {
                        urun_list.get(i).setStok_adeti(urun_list.get(i).getStok_adeti() - 1);
                        fis = "+ " + ls.getUserName() + " Adli Kullanici " + urunAdi.trim() + " Aldi. Fiyat : " + urun_list.get(i).getUrun_fiyati() + " Kalan Adet : " + urun_list.get(i).getStok_adeti();
                        txt_bilgi.setText("Ürün Başarıyla Satın Alındı");
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Yeterli Stok Adeti Yok.");
                        return;
                    }

                }
            }

            try {
                writer = new FileWriter(new File("fis_defteri.txt"), true);
                writer.write(fis + "\n");
                writer.close();

            } catch (IOException ex) {
                Logger.getLogger(Main_Screen.class.getName()).log(Level.SEVERE, null, ex);
            }

            btn_listele.doClick();
        }
    }//GEN-LAST:event_btn_satin_alActionPerformed

    private void btn_hesap_degisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hesap_degisActionPerformed
        this.setVisible(false); // bu ekranı kapatır
        ls.setVisible(true); //  Login ekrannını açar
    }//GEN-LAST:event_btn_hesap_degisActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hesap_degis;
    private javax.swing.JButton btn_listele;
    private javax.swing.JButton btn_satin_al;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JList<String> list_urun;
    private javax.swing.JRadioButton rb_alt_giyim;
    private javax.swing.JRadioButton rb_ust_giyim;
    private javax.swing.JTextField txt_bilgi;
    private javax.swing.JTextField txt_enaz_fiyat;
    private javax.swing.JTextField txt_encok_fiyat;
    // End of variables declaration//GEN-END:variables

}
