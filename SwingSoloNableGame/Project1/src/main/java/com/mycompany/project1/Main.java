package com.mycompany.project1;

import javax.swing.JSpinner;
import javax.swing.SwingUtilities;

public class Main extends javax.swing.JFrame {
  
    LnkdLst<String> lnkdLst;
    /*
    Program Çalıştırıldığında Yapılması Gereken Adımlar
    1- Size Seçilmeli
    2- Start Butonuna Basılmalı.
    3- Which Location'dan hangi taşı hareket ettirmek isteniyorsa koordinatı seçilmeli.
    4- Show Possibles butonuna basarak seçilen taşın gidebileceği yerler görülmeli.
    5- To Where'dan gidilmek istenen yer seçilmeli.
    6- Play butonuna basılmalı.(Gidilmek istenen yer oyun kurallarına uyuyorsa gidilir)
    */
    

    public Main() {
        initComponents();
        spnr_size.setModel(new javax.swing.SpinnerNumberModel(4, 4, 20, 2));
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) spnr_size.getEditor();
        editor.getTextField().setEditable(false);
        lnkdLst = new LnkdLst("A1");
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane5 = new javax.swing.JSplitPane();
        pnl_control4 = new javax.swing.JPanel();
        lbl_size = new javax.swing.JLabel();
        spnr_size = new javax.swing.JSpinner();
        btn_start = new javax.swing.JButton();
        lbl_point4 = new javax.swing.JLabel();
        lbl_to_where = new javax.swing.JLabel();
        lbl_where_location = new javax.swing.JLabel();
        cmbbox_now_where = new javax.swing.JComboBox<>();
        cmbbox_to_where = new javax.swing.JComboBox<>();
        btn_play = new javax.swing.JButton();
        lbl_pos = new javax.swing.JLabel();
        btn_show_possibles = new javax.swing.JButton();
        pnl_game = new javax.swing.JPanel();
        lbl_info = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_game = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(680, 680));

        jSplitPane5.setDividerLocation(100);
        jSplitPane5.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane5.setEnabled(false);
        jSplitPane5.setMinimumSize(new java.awt.Dimension(400, 300));
        jSplitPane5.setPreferredSize(new java.awt.Dimension(400, 300));

        pnl_control4.setBackground(new java.awt.Color(102, 255, 102));

        lbl_size.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_size.setForeground(new java.awt.Color(0, 0, 0));
        lbl_size.setText("Size(NxN):");

        spnr_size.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        spnr_size.setModel(new javax.swing.SpinnerNumberModel(2, 2, 20, 2));

        btn_start.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_start.setForeground(new java.awt.Color(0, 0, 0));
        btn_start.setText("Start");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        lbl_point4.setBackground(new java.awt.Color(255, 255, 255));
        lbl_point4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_point4.setForeground(new java.awt.Color(0, 0, 0));

        lbl_to_where.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_to_where.setForeground(new java.awt.Color(0, 0, 0));
        lbl_to_where.setText("To Where :");

        lbl_where_location.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_where_location.setForeground(new java.awt.Color(0, 0, 0));
        lbl_where_location.setText("Which Location:");

        btn_play.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        btn_play.setForeground(new java.awt.Color(0, 0, 255));
        btn_play.setText("Play");
        btn_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playActionPerformed(evt);
            }
        });

        lbl_pos.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lbl_pos.setForeground(new java.awt.Color(204, 0, 0));
        lbl_pos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_show_possibles.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btn_show_possibles.setForeground(new java.awt.Color(255, 102, 102));
        btn_show_possibles.setText("Show Possibles");
        btn_show_possibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_show_possiblesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_control4Layout = new javax.swing.GroupLayout(pnl_control4);
        pnl_control4.setLayout(pnl_control4Layout);
        pnl_control4Layout.setHorizontalGroup(
            pnl_control4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_control4Layout.createSequentialGroup()
                .addGroup(pnl_control4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_control4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbl_size)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnr_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_control4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btn_start, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(pnl_control4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_where_location)
                    .addComponent(lbl_to_where))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_control4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbbox_to_where, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbbox_now_where, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_show_possibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_point4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_play, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnl_control4Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(lbl_pos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_control4Layout.setVerticalGroup(
            pnl_control4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_control4Layout.createSequentialGroup()
                .addGroup(pnl_control4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_control4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_control4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_size)
                            .addComponent(spnr_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_where_location)
                            .addComponent(cmbbox_now_where, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_control4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_start)
                            .addComponent(lbl_to_where)
                            .addComponent(cmbbox_to_where, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_control4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbl_point4))
                    .addGroup(pnl_control4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnl_control4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_play, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_show_possibles, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(lbl_pos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane5.setTopComponent(pnl_control4);

        pnl_game.setBackground(new java.awt.Color(0, 204, 204));
        pnl_game.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_info.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lbl_info.setForeground(new java.awt.Color(0, 0, 0));
        lbl_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtarea_game.setEditable(false);
        txtarea_game.setColumns(20);
        txtarea_game.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        txtarea_game.setRows(5);
        txtarea_game.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtarea_game.setMaximumSize(new java.awt.Dimension(250, 250));
        txtarea_game.setMinimumSize(new java.awt.Dimension(250, 250));
        txtarea_game.setSize(new java.awt.Dimension(250, 250));
        jScrollPane2.setViewportView(txtarea_game);

        javax.swing.GroupLayout pnl_gameLayout = new javax.swing.GroupLayout(pnl_game);
        pnl_game.setLayout(pnl_gameLayout);
        pnl_gameLayout.setHorizontalGroup(
            pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gameLayout.createSequentialGroup()
                .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_gameLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_gameLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lbl_info, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnl_gameLayout.setVerticalGroup(
            pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gameLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_info)
                .addGap(17, 17, 17))
        );

        jSplitPane5.setRightComponent(pnl_game);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        int size = (int)spnr_size.getValue();
        txtarea_game.removeAll();
        txtarea_game.setText("");
        lbl_pos.setText("");
        cmbbox_now_where.removeAllItems();
        cmbbox_to_where.removeAllItems();
        txtarea_game.revalidate();
        txtarea_game.repaint();
        lbl_pos.removeAll();
        lbl_pos.revalidate();
        pnl_game.revalidate();
        pnl_game.repaint();
        lnkdLst.generateLnkdLst(size);
        lnkdLst.formatPrint(size, txtarea_game);
        // comboboxlara koordinatları eklemek için 2 for loop.
        for (int i = 0; i < size ; i++) {
            for (int j = 1; j < size; j++) {
                cmbbox_now_where.addItem("" + ((char) (65 + i)) + j);
                cmbbox_to_where.addItem("" + ((char) (65 + i)) + j);
            }
        }
        
       
        


    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playActionPerformed
    
         int size = (int)spnr_size.getValue();
        String bulundugunYer = (String) cmbbox_now_where.getSelectedItem();
        String gidilecekYer = (String) cmbbox_to_where.getSelectedItem();
        lnkdLst.play(bulundugunYer, gidilecekYer, lbl_pos);
        lbl_info.setText("Remaining : " + lnkdLst.rema);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                pnl_game.revalidate();
            }
        });
         txtarea_game.setText("");
        txtarea_game.revalidate();
        txtarea_game.repaint();
        lnkdLst.formatPrint(size, txtarea_game);
        


    }//GEN-LAST:event_btn_playActionPerformed

    private void btn_show_possiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_show_possiblesActionPerformed
        lbl_pos.setText("");
        int size = (int)spnr_size.getValue();
        lnkdLst.possibleHits((String) cmbbox_now_where.getSelectedItem(), size, lbl_pos);
      
        
    }//GEN-LAST:event_btn_show_possiblesActionPerformed

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
    private javax.swing.JButton btn_play;
    private javax.swing.JButton btn_show_possibles;
    private javax.swing.JButton btn_start;
    private javax.swing.JComboBox<String> cmbbox_now_where;
    private javax.swing.JComboBox<String> cmbbox_to_where;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JLabel lbl_info;
    private javax.swing.JLabel lbl_point4;
    private javax.swing.JLabel lbl_pos;
    private javax.swing.JLabel lbl_size;
    private javax.swing.JLabel lbl_to_where;
    private javax.swing.JLabel lbl_where_location;
    private javax.swing.JPanel pnl_control4;
    private javax.swing.JPanel pnl_game;
    private javax.swing.JSpinner spnr_size;
    private javax.swing.JTextArea txtarea_game;
    // End of variables declaration//GEN-END:variables

    
}
