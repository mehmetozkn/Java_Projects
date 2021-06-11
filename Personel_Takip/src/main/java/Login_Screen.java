
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class Login_Screen extends javax.swing.JFrame  {

    
    Personnel_Operations islemler = new Personnel_Operations();
    
    Personel_Screen ps = new Personel_Screen();
   

    public Login_Screen() {
        initComponents();
        setLocationRelativeTo(null);
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/L.jpg"))); // JFrame set icon.

        
        Icon a = new ImageIcon(getClass().getResource("/images/yonetici.png"));
        btn_admin_pic.setIcon(a); // admin's login screen set icon.

        Icon b = new ImageIcon(getClass().getResource("/images/genel.png"));
        btn_staff_pic.setIcon(b); // personnel's login screen set icon.

        islemler.pullPersonnel();
        islemler.pullData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbed_pane = new javax.swing.JTabbedPane();
        pnl_main_admin = new javax.swing.JPanel();
        pnl_admin = new javax.swing.JPanel();
        lbl_emaily = new javax.swing.JLabel();
        lbl_passwordy = new javax.swing.JLabel();
        btn_admin_login = new javax.swing.JButton();
        txt_admin_email = new javax.swing.JTextField();
        txt_admin_password = new javax.swing.JPasswordField();
        lbl_yonetici_bilgi = new javax.swing.JLabel();
        btn_admin_pic = new javax.swing.JButton();
        pnl_main_personnel = new javax.swing.JPanel();
        pnl_staff = new javax.swing.JPanel();
        lbl_emailp = new javax.swing.JLabel();
        lbl_passwordp = new javax.swing.JLabel();
        btn_staff_login = new javax.swing.JButton();
        txt__staff_email = new javax.swing.JTextField();
        txt_staff_password = new javax.swing.JPasswordField();
        lbl_personel_bilgi = new javax.swing.JLabel();
        btn_staff_pic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        tabbed_pane.setBackground(new java.awt.Color(204, 204, 204));
        tabbed_pane.setForeground(new java.awt.Color(0, 0, 0));

        pnl_main_admin.setLayout(new java.awt.GridLayout(1, 0));

        pnl_admin.setBackground(new java.awt.Color(204, 255, 204));

        lbl_emaily.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_emaily.setForeground(new java.awt.Color(0, 0, 0));
        lbl_emaily.setText("E-Mail :");

        lbl_passwordy.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_passwordy.setForeground(new java.awt.Color(0, 0, 0));
        lbl_passwordy.setText("Password :");

        btn_admin_login.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_admin_login.setForeground(new java.awt.Color(0, 204, 204));
        btn_admin_login.setText("LOGIN");
        btn_admin_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admin_loginActionPerformed(evt);
            }
        });

        txt_admin_email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txt_admin_password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lbl_yonetici_bilgi.setBackground(new java.awt.Color(255, 255, 0));
        lbl_yonetici_bilgi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_yonetici_bilgi.setForeground(new java.awt.Color(204, 0, 0));
        lbl_yonetici_bilgi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_admin_pic.setContentAreaFilled(false);

        javax.swing.GroupLayout pnl_adminLayout = new javax.swing.GroupLayout(pnl_admin);
        pnl_admin.setLayout(pnl_adminLayout);
        pnl_adminLayout.setHorizontalGroup(
            pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_adminLayout.createSequentialGroup()
                .addGroup(pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_adminLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btn_admin_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_adminLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_emaily)
                            .addComponent(lbl_passwordy))
                        .addGap(23, 23, 23)
                        .addGroup(pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_admin_email, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_admin_password, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_admin_login, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_adminLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(lbl_yonetici_bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        pnl_adminLayout.setVerticalGroup(
            pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_adminLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_emaily)
                    .addComponent(txt_admin_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnl_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_passwordy)
                    .addComponent(txt_admin_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_admin_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(lbl_yonetici_bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_admin_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pnl_main_admin.add(pnl_admin);

        tabbed_pane.addTab("Admin Login", pnl_main_admin);

        pnl_main_personnel.setLayout(new java.awt.GridLayout(1, 0));

        pnl_staff.setBackground(new java.awt.Color(204, 255, 204));

        lbl_emailp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_emailp.setForeground(new java.awt.Color(0, 0, 0));
        lbl_emailp.setText("E-Mail :");

        lbl_passwordp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_passwordp.setForeground(new java.awt.Color(0, 0, 0));
        lbl_passwordp.setText("Password :");

        btn_staff_login.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_staff_login.setForeground(new java.awt.Color(0, 204, 204));
        btn_staff_login.setText("LOGIN");
        btn_staff_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staff_loginActionPerformed(evt);
            }
        });

        txt__staff_email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txt_staff_password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lbl_personel_bilgi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_personel_bilgi.setForeground(new java.awt.Color(255, 0, 0));
        lbl_personel_bilgi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_staff_pic.setOpaque(false);

        javax.swing.GroupLayout pnl_staffLayout = new javax.swing.GroupLayout(pnl_staff);
        pnl_staff.setLayout(pnl_staffLayout);
        pnl_staffLayout.setHorizontalGroup(
            pnl_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_staffLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btn_staff_login, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_staffLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(lbl_personel_bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(pnl_staffLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnl_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_staff_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_staffLayout.createSequentialGroup()
                        .addGroup(pnl_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_passwordp)
                            .addComponent(lbl_emailp))
                        .addGap(29, 29, 29)
                        .addGroup(pnl_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_staff_password, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt__staff_email, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_staffLayout.setVerticalGroup(
            pnl_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_staffLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnl_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_emailp)
                    .addComponent(txt__staff_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnl_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_staff_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_passwordp))
                .addGap(18, 18, 18)
                .addComponent(btn_staff_login)
                .addGap(18, 18, 18)
                .addComponent(lbl_personel_bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_staff_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pnl_main_personnel.add(pnl_staff);

        tabbed_pane.addTab("Staff Login", pnl_main_personnel);

        getContentPane().add(tabbed_pane);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_admin_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admin_loginActionPerformed
        // Admin Login.
        Main_Screen ms = new Main_Screen();
        lbl_yonetici_bilgi.setText("");
        String mail = txt_admin_email.getText();
        String parola = new String(txt_admin_password.getPassword());
        boolean girisBasarılı = islemler.adminLogin(mail, parola);

        if (girisBasarılı) {
            Timer timer = new Timer(10, new ActionListener() { // Waits 10 miliseconds.
                @Override
                public void actionPerformed(ActionEvent e) {
                    lbl_yonetici_bilgi.setText("Login Succesful...");

                }

            });
            timer.setRepeats(false);
            timer.start();
            Timer timer2 = new Timer(2000, new ActionListener() { // Waits 2 seconds.
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    ms.setVisible(true);

                }
            ;

            });
            timer2.setRepeats(false);
            timer2.start();
        } else {

            JOptionPane.showMessageDialog(rootPane, "Wrong password or email.", "Login Error", JOptionPane.ERROR_MESSAGE);

        }
       

    }//GEN-LAST:event_btn_admin_loginActionPerformed
   
    private void btn_staff_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staff_loginActionPerformed
        // Staff Login.
        lbl_personel_bilgi.setText("");
        String mail = txt__staff_email.getText();
        String parola = new String(txt_staff_password.getPassword());

        boolean girisBasarılı = islemler.staffLogin(mail, parola);

        if (girisBasarılı) {
            Timer timer = new Timer(10, new ActionListener() { // Waits 10 miliseconds.
                @Override
                public void actionPerformed(ActionEvent e) {
                    lbl_personel_bilgi.setText("Login Succesful...");

                }

            });
            timer.setRepeats(false);
            timer.start();
            Timer timer2 = new Timer(2000, new ActionListener() { // Waits 2 seconds
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    ps.getTxt_name().setText(Personnel_Operations.name);
                    ps.getTxt_surname().setText(Personnel_Operations.surname);
                    ps.getTxt_id().setText(Personnel_Operations.id + "");
                    ps.setVisible(true);

                }
            ;

            });
            timer2.setRepeats(false);
            timer2.start();
        } else {

            JOptionPane.showMessageDialog(rootPane, "Wrong password or email.", "Login Error", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btn_staff_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_admin_login;
    private javax.swing.JButton btn_admin_pic;
    private javax.swing.JButton btn_staff_login;
    private javax.swing.JButton btn_staff_pic;
    private javax.swing.JLabel lbl_emailp;
    private javax.swing.JLabel lbl_emaily;
    private javax.swing.JLabel lbl_passwordp;
    private javax.swing.JLabel lbl_passwordy;
    private javax.swing.JLabel lbl_personel_bilgi;
    private javax.swing.JLabel lbl_yonetici_bilgi;
    private javax.swing.JPanel pnl_admin;
    private javax.swing.JPanel pnl_main_admin;
    private javax.swing.JPanel pnl_main_personnel;
    private javax.swing.JPanel pnl_staff;
    private javax.swing.JTabbedPane tabbed_pane;
    private javax.swing.JTextField txt__staff_email;
    private javax.swing.JTextField txt_admin_email;
    private javax.swing.JPasswordField txt_admin_password;
    private javax.swing.JPasswordField txt_staff_password;
    // End of variables declaration//GEN-END:variables

   
}
