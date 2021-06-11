
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex extends javax.swing.JFrame {

    Matcher matcher;

    Regex() {
        initComponents();
        setLocationRelativeTo(null);
        lbl_1.setVisible(false);
        lbl_2.setVisible(false);
        lbl_3.setVisible(false);
        lbl_4.setVisible(false);
        lbl_5.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_3 = new javax.swing.JTextField();
        txt_2 = new javax.swing.JTextField();
        txt_4 = new javax.swing.JTextField();
        lbl_1 = new javax.swing.JLabel();
        txt_5 = new javax.swing.JTextField();
        lbl_2 = new javax.swing.JLabel();
        lbl_3 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_5 = new javax.swing.JLabel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnl_main.setBackground(new java.awt.Color(204, 204, 255));
        pnl_main.setMaximumSize(new java.awt.Dimension(638, 501));
        pnl_main.setMinimumSize(new java.awt.Dimension(638, 501));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Start with 'The' end with 'end' :");

        txt_1.setBackground(new java.awt.Color(255, 255, 255));
        txt_1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_1.setForeground(new java.awt.Color(0, 0, 204));
        txt_1.setMaximumSize(new java.awt.Dimension(280, 24));
        txt_1.setMinimumSize(new java.awt.Dimension(280, 24));
        txt_1.setPreferredSize(new java.awt.Dimension(280, 24));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("1abc, 1ab,  ab :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("abc,  abcbc, abcbcbc :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ab, ac, a1, a :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("a string that has not a-g letters start :");

        txt_3.setBackground(new java.awt.Color(255, 255, 255));
        txt_3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_3.setForeground(new java.awt.Color(0, 0, 204));
        txt_3.setMaximumSize(new java.awt.Dimension(280, 24));
        txt_3.setMinimumSize(new java.awt.Dimension(280, 24));
        txt_3.setPreferredSize(new java.awt.Dimension(280, 24));

        txt_2.setBackground(new java.awt.Color(255, 255, 255));
        txt_2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_2.setForeground(new java.awt.Color(0, 0, 204));
        txt_2.setMaximumSize(new java.awt.Dimension(280, 24));
        txt_2.setMinimumSize(new java.awt.Dimension(280, 24));
        txt_2.setPreferredSize(new java.awt.Dimension(280, 24));

        txt_4.setBackground(new java.awt.Color(255, 255, 255));
        txt_4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_4.setForeground(new java.awt.Color(0, 0, 204));
        txt_4.setMaximumSize(new java.awt.Dimension(280, 24));
        txt_4.setMinimumSize(new java.awt.Dimension(280, 24));
        txt_4.setPreferredSize(new java.awt.Dimension(280, 24));

        lbl_1.setForeground(new java.awt.Color(204, 0, 0));
        lbl_1.setText("Info");

        txt_5.setBackground(new java.awt.Color(255, 255, 255));
        txt_5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_5.setForeground(new java.awt.Color(0, 0, 204));
        txt_5.setMaximumSize(new java.awt.Dimension(280, 24));
        txt_5.setMinimumSize(new java.awt.Dimension(280, 24));
        txt_5.setPreferredSize(new java.awt.Dimension(280, 24));

        lbl_2.setForeground(new java.awt.Color(204, 0, 0));
        lbl_2.setText("Info");

        lbl_3.setForeground(new java.awt.Color(204, 0, 0));
        lbl_3.setText("Info");

        lbl_4.setForeground(new java.awt.Color(204, 0, 0));
        lbl_4.setText("Info");

        lbl_5.setForeground(new java.awt.Color(204, 0, 0));
        lbl_5.setText("Info");

        btn_1.setText("Run");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setText("Run");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_4.setText("Run");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_3.setText("Run");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_5.setText("Run");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_3)
                    .addComponent(txt_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_1)
                    .addComponent(txt_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_2)
                    .addComponent(txt_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btn_1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_1)
                .addGap(65, 65, 65)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_2)
                .addGap(62, 62, 62)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_4)
                .addGap(46, 46, 46)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_5)
                .addGap(27, 27, 27))
        );

        getContentPane().add(pnl_main);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        if (txt_1.getText().isEmpty()) { // txt boşsa
            lbl_1.setText("Text Field 1 Must Not Be Empty.");
            lbl_1.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^(The)[\\w\\d]{0,}(end)$").matcher(txt_1.getText());
            if (!matcher.find()) { // regexe uymassa
                lbl_1.setText("It Must be => 'Start with 'The' end with 'end' :");
                lbl_1.setVisible(true);
                return;
            } else { // regexe uygunsa
                lbl_1.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        if (txt_4.getText().isEmpty()) { // txt boşsa
            lbl_4.setText("Text Field 4 Must Not Be Empty.");
            lbl_4.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^(a)[\\w\\d\\s]{1,}$").matcher(txt_4.getText());
            if (!matcher.find()) { // regexe uymassa
                lbl_4.setText("It Must Be Like => ab, ac, a1, a :");
                lbl_4.setVisible(true);
                return;
            } else { // regexe uygunsa
                lbl_4.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        if (txt_5.getText().isEmpty()) { // txt boşsa
            lbl_5.setText("Text Field 4 Must Not Be Empty.");
            lbl_5.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^[^a-g]").matcher(txt_5.getText());
            if (!matcher.find()) { // regexe uymassa
                lbl_5.setText("It Must Be 'a string that has not a-g letters start' :");
                lbl_5.setVisible(true);
                return;
            } else { // regexe uygunsa
                lbl_5.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        if (txt_2.getText().isEmpty()) { // txt boşsa
            lbl_2.setText("Text Field 2 Must Not Be Empty.");
            lbl_2.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^(abc)[\\w]{0,}$").matcher(txt_2.getText());
            if (!matcher.find()) { // regexe uymassa
                lbl_2.setText("It Must start with 'abc'");
                lbl_2.setVisible(true);
                return;
            } else { // regexe uygunsa
                lbl_2.setVisible(false);
            }
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
       if (txt_3.getText().isEmpty()) { // txt boşsa
            lbl_3.setText("Text Field 3 Must Not Be Empty.");
            lbl_3.setVisible(true);
            return;
        } else {
            matcher = Pattern.compile("^(1ab)[\\d]{1}$").matcher(txt_3.getText());
            if (!matcher.find()) { // regexe uymassa
                lbl_3.setText("It Must Be Like => 1abc,1ab,ab :");
                lbl_3.setVisible(true);
                return;
            } else { // regexe uygunsa
                lbl_4.setVisible(false);
            }
        }
        
    }//GEN-LAST:event_btn_3ActionPerformed

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
            java.util.logging.Logger.getLogger(Regex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_5;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    private javax.swing.JTextField txt_5;
    // End of variables declaration//GEN-END:variables
}
