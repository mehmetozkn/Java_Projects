
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Personel_Screen extends javax.swing.JFrame {

    FileWriter writer = null;
    Personnel_Operations psi = new Personnel_Operations();

    public Personel_Screen() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/P.jpg"))); // JFrame set icon.

    }

    public JTextField getTxt_id() {
        return txt_id;
    }

    public void setTxt_id(JTextField txt_id) {
        this.txt_id = txt_id;
    }

    public JTextField getTxt_name() {
        return txt_name;
    }

    public void setTxt_name(JTextField txt_name) {
        this.txt_name = txt_name;
    }

    public JTextField getTxt_surname() {
        return txt_surname;
    }

    public void setTxt_surname(JTextField txt_surname) {
        this.txt_surname = txt_surname;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_name = new javax.swing.JLabel();
        lbl_surname = new javax.swing.JLabel();
        txt_surname = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        btn_izin_talep_et = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        spn_baslangic_gun = new javax.swing.JSpinner();
        spn_baslangic_ay = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spn_bitis_gun = new javax.swing.JSpinner();
        spn_bitis_ay = new javax.swing.JSpinner();
        rdbtn_exit = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personnel");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        lbl_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(0, 0, 0));
        lbl_name.setText("NAME :");

        lbl_surname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_surname.setForeground(new java.awt.Color(0, 0, 0));
        lbl_surname.setText("SURNAME :");

        txt_surname.setEditable(false);
        txt_surname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_surname.setForeground(new java.awt.Color(204, 0, 0));

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(204, 0, 0));

        btn_izin_talep_et.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_izin_talep_et.setForeground(new java.awt.Color(0, 0, 0));
        btn_izin_talep_et.setText("REQUEST PERMISSION ");
        btn_izin_talep_et.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_izin_talep_etActionPerformed(evt);
            }
        });

        lbl_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(0, 0, 0));
        lbl_id.setText("ID :");

        txt_name.setEditable(false);
        txt_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_name.setForeground(new java.awt.Color(204, 0, 0));

        spn_baslangic_gun.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        spn_baslangic_ay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Day");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Month");

        spn_bitis_gun.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        spn_bitis_ay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        rdbtn_exit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rdbtn_exit.setForeground(new java.awt.Color(255, 0, 0));
        rdbtn_exit.setText("Exit");
        rdbtn_exit.setOpaque(false);
        rdbtn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtn_exitActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Day");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Month");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("--");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name)
                    .addComponent(lbl_id)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(lbl_surname)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(rdbtn_exit))
                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 44, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(202, 202, 202)
                        .addComponent(jLabel4)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_izin_talep_et, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spn_baslangic_gun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spn_baslangic_ay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel6)
                                .addGap(46, 46, 46)
                                .addComponent(spn_bitis_gun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(spn_bitis_ay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbtn_exit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_surname)
                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spn_baslangic_gun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_baslangic_ay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_bitis_ay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_bitis_gun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addComponent(btn_izin_talep_et, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel1);
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_izin_talep_etActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_izin_talep_etActionPerformed
        // to create a request for permission between the specified dates.
        int baslangic_gun = (int) spn_baslangic_gun.getValue();
        int baslangic_ay = (int) spn_baslangic_ay.getValue();

        int bitis_gun = (int) spn_bitis_gun.getValue();
        int bitis_ay = (int) spn_bitis_ay.getValue();

        String tarih = baslangic_gun + "/" + baslangic_ay + " - " + bitis_gun + "/" + bitis_ay;

        String yazi = "";

        if (bitis_ay == baslangic_ay) {
            if (baslangic_gun >= bitis_gun) {
                JOptionPane.showMessageDialog(rootPane, "Please Select a Valid Range.", "Wrong Calendar", JOptionPane.ERROR_MESSAGE);
                return;
            }

        }
        if (baslangic_ay > bitis_ay) {
            JOptionPane.showMessageDialog(rootPane, "Please Select a Valid Range.", "Wrong Calendar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {

            writer = new FileWriter(new File("izin_talep.txt"), true);
            // Personnel with 4 Id requested leave between 1/1 - 5/1. 
            yazi = "Personnel with " + txt_id.getText() + " Id request leave between " + tarih;

            writer.write(yazi + "\n");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Personel_Screen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_izin_talep_etActionPerformed

    private void rdbtn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtn_exitActionPerformed
        // to open login screen and close this screen.
        Login_Screen ls = new Login_Screen();
        rdbtn_exit.setSelected(false);
        this.setVisible(false);
        ls.setVisible(true);

    }//GEN-LAST:event_rdbtn_exitActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // to in order not to close the program when you want to close this frame 
        Login_Screen ls = new Login_Screen();
        ls.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Personel_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personel_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personel_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personel_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personel_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_izin_talep_et;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_surname;
    private javax.swing.JRadioButton rdbtn_exit;
    private javax.swing.JSpinner spn_baslangic_ay;
    private javax.swing.JSpinner spn_baslangic_gun;
    private javax.swing.JSpinner spn_bitis_ay;
    private javax.swing.JSpinner spn_bitis_gun;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}
