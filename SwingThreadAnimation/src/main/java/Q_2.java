


public class Q_2 extends javax.swing.JFrame {

    
    public Q_2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_run_area = new javax.swing.JPanel();
        btn_run = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(797, 463));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnl_run_area.setBackground(new java.awt.Color(204, 255, 204));
        pnl_run_area.setMaximumSize(new java.awt.Dimension(797, 463));
        pnl_run_area.setMinimumSize(new java.awt.Dimension(797, 463));
        pnl_run_area.setLayout(null);

        btn_run.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_run.setText("RUN");
        btn_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_runActionPerformed(evt);
            }
        });
        pnl_run_area.add(btn_run);
        btn_run.setBounds(300, 30, 100, 27);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 10));
        pnl_run_area.add(jSpinner1);
        jSpinner1.setBounds(120, 40, 60, 26);

        getContentPane().add(pnl_run_area);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_runActionPerformed
        Runner runner1 = new Runner();
        runner1.setSize(50,50);
        runner1.setLocation(100,100);
        
        pnl_run_area.add(runner1);
        this.repaint();
        
        runner1.start((int)jSpinner1.getValue());
        
        
    }//GEN-LAST:event_btn_runActionPerformed

    
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
            java.util.logging.Logger.getLogger(Q_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_run;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel pnl_run_area;
    // End of variables declaration//GEN-END:variables
}
