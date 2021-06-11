 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main extends javax.swing.JFrame {

    Matcher matcher;

   
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        lbl_address.setVisible(false);
        lbl_email.setVisible(false);
        lbl_namesurname.setVisible(false);
        lbl_password.setVisible(false);
        lbl_repassword.setVisible(false);
        lbl_telephone.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel15 = new javax.swing.JLabel();
        tab_pane = new javax.swing.JTabbedPane();
        tab_pnl_sign_in = new javax.swing.JPanel();
        pnl_sign_in = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_signin_email = new javax.swing.JTextField();
        txt_signin_password = new javax.swing.JPasswordField();
        btn_sign_up = new javax.swing.JButton();
        btn_sign_in = new javax.swing.JButton();
        tab_pnl_sign_up = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btn_signup_register = new javax.swing.JButton();
        txt_telephone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_name_surname = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_repassword = new javax.swing.JPasswordField();
        txt_password = new javax.swing.JPasswordField();
        btn_cancel = new javax.swing.JButton();
        lbl_telephone = new javax.swing.JLabel();
        lbl_namesurname = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_repassword = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        tab_pnl_sign_in.setLayout(new javax.swing.BoxLayout(tab_pnl_sign_in, javax.swing.BoxLayout.LINE_AXIS));

        pnl_sign_in.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("E-Mail :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password :");

        txt_signin_email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txt_signin_password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btn_sign_up.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_sign_up.setForeground(new java.awt.Color(255, 255, 0));
        btn_sign_up.setText("Sign Up");
        btn_sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sign_upActionPerformed(evt);
            }
        });

        btn_sign_in.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_sign_in.setForeground(new java.awt.Color(0, 0, 153));
        btn_sign_in.setText("Sign In");

        javax.swing.GroupLayout pnl_sign_inLayout = new javax.swing.GroupLayout(pnl_sign_in);
        pnl_sign_in.setLayout(pnl_sign_inLayout);
        pnl_sign_inLayout.setHorizontalGroup(
            pnl_sign_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sign_inLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(pnl_sign_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_sign_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sign_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_sign_inLayout.createSequentialGroup()
                        .addGroup(pnl_sign_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)
                        .addGroup(pnl_sign_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_signin_password, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_signin_email, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        pnl_sign_inLayout.setVerticalGroup(
            pnl_sign_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sign_inLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(pnl_sign_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_signin_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(pnl_sign_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_signin_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btn_sign_in)
                .addGap(27, 27, 27)
                .addComponent(btn_sign_up)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        tab_pnl_sign_in.add(pnl_sign_in);

        tab_pane.addTab("Sign In", tab_pnl_sign_in);

        tab_pnl_sign_up.setLayout(new javax.swing.BoxLayout(tab_pnl_sign_up, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name Surname:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telephone :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Password :");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("RePassword :");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Gender :");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Address :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton1.setText("Man");
        jRadioButton1.setOpaque(false);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(153, 0, 153));
        jRadioButton2.setText("Woman");
        jRadioButton2.setOpaque(false);

        btn_signup_register.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_signup_register.setForeground(new java.awt.Color(0, 0, 153));
        btn_signup_register.setText("Sign Up");
        btn_signup_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signup_registerActionPerformed(evt);
            }
        });

        btn_cancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 0, 0));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        lbl_telephone.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_telephone.setForeground(new java.awt.Color(255, 0, 0));
        lbl_telephone.setText("jLabel10");

        lbl_namesurname.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_namesurname.setForeground(new java.awt.Color(255, 0, 0));
        lbl_namesurname.setText("jLabel10");

        lbl_password.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 0, 0));
        lbl_password.setText("jLabel10");

        lbl_email.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 0, 0));
        lbl_email.setText("jLabel10");

        lbl_repassword.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_repassword.setForeground(new java.awt.Color(255, 0, 0));
        lbl_repassword.setText("jLabel10");

        lbl_address.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(255, 0, 0));
        lbl_address.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(btn_signup_register, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_repassword)
                            .addComponent(txt_address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_telephone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_name_surname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_telephone)
                    .addComponent(lbl_namesurname)
                    .addComponent(lbl_password)
                    .addComponent(lbl_email)
                    .addComponent(lbl_repassword)
                    .addComponent(lbl_address))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_name_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_namesurname))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telephone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_password))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_repassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_repassword))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_address))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_signup_register)
                    .addComponent(btn_cancel))
                .addGap(49, 49, 49))
        );

        tab_pnl_sign_up.add(jPanel1);

        tab_pane.addTab("Sign Up", tab_pnl_sign_up);

        getContentPane().add(tab_pane);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sign_upActionPerformed
        tab_pane.setSelectedIndex(1);
    }//GEN-LAST:event_btn_sign_upActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        tab_pane.setSelectedIndex(0);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_signup_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signup_registerActionPerformed

        
        if (txt_name_surname.getText().isEmpty()) { // name surname boşsa.
            lbl_namesurname.setText("Name Surname Must Not Be Empty!");
            lbl_namesurname.setVisible(true);
            return;

        } else {
            // en az 3 isim harfi ve en az 3 soyad harfi arada bir ve birden fazla boşluk.
            matcher = Pattern.compile("^\\w{3,}\\s+\\w{3,}$").matcher(txt_name_surname.getText());
            if (!matcher.find()) { // regexe uymassa.
                lbl_namesurname.setText("Name Surname Must Not Be Least 6 Character Like => \"mehmet\" ");
                lbl_namesurname.setVisible(true);
                return;

            } else { // regexe uygunsa.
                lbl_namesurname.setVisible(false);
            }
        }
        

//  ----------------------------------------------------------------------------------------------------------------

        if (txt_telephone.getText().isEmpty()) { // telefon boşsa.
            lbl_telephone.setText("Telephone Must Not Be Empty!");
            lbl_telephone.setVisible(true);
            return;

        } else {
            // +90-5554443322
            matcher = Pattern.compile("^\\+[1-9][0-9]?\\-\\d{10}$").matcher(txt_telephone.getText());
            if (!matcher.find()) { // regexe uymassa.
                lbl_telephone.setText("Telephone Must Be Like +90-5554443322 ");
                lbl_telephone.setVisible(true);
                return;

            } else { // regexe uygunsa.
                lbl_telephone.setVisible(false);
            }
        }
        
//  ----------------------------------------------------------------------------------------------------------------

        if (txt_email.getText().isEmpty()) { // email boşsa.
            lbl_email.setText("Email Must Not Be Empty!");
            lbl_email.setVisible(true);
            return;

        } else {
            // mehmet31@gmail.com
            matcher = Pattern.compile("^[a-zA-Z][\\w\\d]{2,}@(gmail|hotmail)(.com)$").matcher(txt_email.getText());
            if (!matcher.find()) { // regexe uymassa.
                lbl_email.setText("Email Must Be Like => mehmet31@gmail.com ");
                lbl_email.setVisible(true);
                return;

            } else { // regexe uygunsa.
                lbl_email.setVisible(false);
            }
        }
        
//  ----------------------------------------------------------------------------------------------------------------

          if (txt_password.getText().isEmpty()) { // password boşsa.
            lbl_password.setText("Password Must Not Be Empty!");
            lbl_password.setVisible(true);
            return;

        } else {
            
            matcher = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{5,}$").matcher(txt_password.getText());
            if (!matcher.find()) { // regexe uymassa.
                lbl_password.setText("Password Must Be Like dhfA3");
                lbl_password.setVisible(true);
                return;

            } else { // regexe uygunsa.
                lbl_password.setVisible(false);
            }
        }

//  ----------------------------------------------------------------------------------------------------------------
          

    if (txt_repassword.getText().isEmpty()) { // password boşsa.
            lbl_repassword.setText("Password Must Not Be Empty!");
            lbl_repassword.setVisible(true);
            return;

        } else {
            
           
            if (txt_password.getText().compareTo(txt_repassword.getText()) != 0) { // regexe uymassa.
                lbl_repassword.setText("Password Must Match With Password");
                lbl_repassword.setVisible(true);
                return;

            } else { // regexe uygunsa.
                lbl_repassword.setVisible(false);
            }
        }
    
    
    //  ----------------------------------------------------------------------------------------------------------------
    
    
    
    

    }//GEN-LAST:event_btn_signup_registerActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_sign_in;
    private javax.swing.JButton btn_sign_up;
    private javax.swing.JButton btn_signup_register;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_namesurname;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_repassword;
    private javax.swing.JLabel lbl_telephone;
    private javax.swing.JPanel pnl_sign_in;
    private javax.swing.JTabbedPane tab_pane;
    private javax.swing.JPanel tab_pnl_sign_in;
    private javax.swing.JPanel tab_pnl_sign_up;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name_surname;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_repassword;
    private javax.swing.JTextField txt_signin_email;
    private javax.swing.JPasswordField txt_signin_password;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration//GEN-END:variables
}
