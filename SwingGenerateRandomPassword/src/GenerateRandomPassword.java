
import java.awt.Color;
import java.util.Random;

public class GenerateRandomPassword extends javax.swing.JFrame {

    public static Random random = new Random();

    public GenerateRandomPassword() {
        initComponents();
        getContentPane().setBackground(Color.GREEN);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        karakterlerAlani = new javax.swing.JTextField();
        sifreOlusturButonu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        olusturulanSifreAlani = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Random Şifre Oluşturma Programı");
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Şifrenizde Olmasını İstediginiz Karakterler : ");

        karakterlerAlani.setBackground(new java.awt.Color(255, 255, 255));
        karakterlerAlani.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        karakterlerAlani.setForeground(new java.awt.Color(255, 102, 51));
        karakterlerAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                karakterlerAlaniKeyTyped(evt);
            }
        });

        sifreOlusturButonu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sifreOlusturButonu.setForeground(new java.awt.Color(255, 0, 0));
        sifreOlusturButonu.setText("Şifre Oluştur");
        sifreOlusturButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreOlusturButonuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Random Oluşturulan Şifre : ");

        olusturulanSifreAlani.setEditable(false);
        olusturulanSifreAlani.setBackground(new java.awt.Color(255, 255, 255));
        olusturulanSifreAlani.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        olusturulanSifreAlani.setForeground(new java.awt.Color(0, 0, 0));
        olusturulanSifreAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                olusturulanSifreAlaniKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(sifreOlusturButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(olusturulanSifreAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(karakterlerAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karakterlerAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sifreOlusturButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(olusturulanSifreAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void karakterlerAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_karakterlerAlaniKeyTyped
        // Şifrede boşluk olmaması kontrolü.

        if (karakterlerAlani.getText().length() > 30) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c == ' ') {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_karakterlerAlaniKeyTyped

    private void olusturulanSifreAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_olusturulanSifreAlaniKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_olusturulanSifreAlaniKeyTyped

    private void sifreOlusturButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreOlusturButonuActionPerformed
        olusturulanSifreAlani.setText("");
        char[] array = new char[karakterlerAlani.getText().length()];
        for (int i = 0; i < karakterlerAlani.getText().length(); i++) {
            array[i] = karakterlerAlani.getText().charAt(i);
        }

        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(array.length);
            char temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

        for (char c : array) {
            olusturulanSifreAlani.setText(olusturulanSifreAlani.getText() + c);
        }
    }//GEN-LAST:event_sifreOlusturButonuActionPerformed

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
            java.util.logging.Logger.getLogger(GenerateRandomPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateRandomPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateRandomPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateRandomPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateRandomPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField karakterlerAlani;
    private javax.swing.JTextField olusturulanSifreAlani;
    private javax.swing.JButton sifreOlusturButonu;
    // End of variables declaration//GEN-END:variables
}
