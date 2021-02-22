
import java.awt.Color;


public class Sayac extends javax.swing.JFrame {

    public Sayac() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sayac = new javax.swing.JTextField();
        artırma_butonu = new javax.swing.JButton();
        azaltma_butonu = new javax.swing.JButton();
        sıfırlama_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setResizable(false);

        sayac.setEditable(false);
        sayac.setBackground(new java.awt.Color(204, 204, 255));
        sayac.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sayac.setForeground(new java.awt.Color(204, 0, 0));
        sayac.setCaretColor(new java.awt.Color(0, 204, 153));
        sayac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sayacKeyTyped(evt);
            }
        });

        artırma_butonu.setBackground(new java.awt.Color(0, 255, 51));
        artırma_butonu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        artırma_butonu.setForeground(new java.awt.Color(0, 0, 204));
        artırma_butonu.setText("Artır");
        artırma_butonu.setPreferredSize(new java.awt.Dimension(63, 35));
        artırma_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artırma_butonuActionPerformed(evt);
            }
        });

        azaltma_butonu.setBackground(new java.awt.Color(51, 255, 51));
        azaltma_butonu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        azaltma_butonu.setForeground(new java.awt.Color(0, 0, 255));
        azaltma_butonu.setText("Azalt");
        azaltma_butonu.setMaximumSize(new java.awt.Dimension(60, 35));
        azaltma_butonu.setMinimumSize(new java.awt.Dimension(60, 35));
        azaltma_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azaltma_butonuActionPerformed(evt);
            }
        });

        sıfırlama_butonu.setBackground(new java.awt.Color(0, 0, 0));
        sıfırlama_butonu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sıfırlama_butonu.setForeground(new java.awt.Color(255, 204, 102));
        sıfırlama_butonu.setText("Sıfırla");
        sıfırlama_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sıfırlama_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(artırma_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(azaltma_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sayac, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(sıfırlama_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(sayac, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(azaltma_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(artırma_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sıfırlama_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int count = 0;
    private void artırma_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artırma_butonuActionPerformed
        count++;
        sayac.setText(count + "");
    }//GEN-LAST:event_artırma_butonuActionPerformed

    private void azaltma_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azaltma_butonuActionPerformed
        count--;
        sayac.setText(count + "");
    }//GEN-LAST:event_azaltma_butonuActionPerformed

    private void sıfırlama_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sıfırlama_butonuActionPerformed
        count = 0;
        sayac.setText(count + "");
    }//GEN-LAST:event_sıfırlama_butonuActionPerformed

    private void sayacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sayacKeyTyped
       
        
    }//GEN-LAST:event_sayacKeyTyped

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
            java.util.logging.Logger.getLogger(Sayac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sayac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sayac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sayac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sayac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton artırma_butonu;
    private javax.swing.JButton azaltma_butonu;
    private javax.swing.JTextField sayac;
    private javax.swing.JButton sıfırlama_butonu;
    // End of variables declaration//GEN-END:variables
}
