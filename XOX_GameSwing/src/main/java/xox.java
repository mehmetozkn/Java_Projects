
import javax.swing.JOptionPane;

public class xox extends javax.swing.JFrame {

    String[] cell = new String[9];
    String[] scoresData = new String[10];
    int i = 0;
    String name = "";
    int player_score = 0;
    int pc_score = 0;

    public xox() {
        initComponents();
        pnl_game.setVisible(false);
        pnl_status.setVisible(false);
        pnl_scores.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_playerinfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        pnl_game = new javax.swing.JPanel();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        pnl_status = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_player = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_pc = new javax.swing.JLabel();
        btn_replay = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        pnl_scores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist_scores = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_playerinfo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Player Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        pnl_playerinfo.setForeground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name :");

        txt_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btn_start.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_start.setText("START");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_playerinfoLayout = new javax.swing.GroupLayout(pnl_playerinfo);
        pnl_playerinfo.setLayout(pnl_playerinfoLayout);
        pnl_playerinfoLayout.setHorizontalGroup(
            pnl_playerinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_playerinfoLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_start, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnl_playerinfoLayout.setVerticalGroup(
            pnl_playerinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_playerinfoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnl_playerinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_start))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnl_game.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Game", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn_3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn_9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn_8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn_7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn_6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn_5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        btn_4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_gameLayout = new javax.swing.GroupLayout(pnl_game);
        pnl_game.setLayout(pnl_gameLayout);
        pnl_gameLayout.setHorizontalGroup(
            pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gameLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        pnl_gameLayout.setVerticalGroup(
            pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnl_gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_status.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 18), new java.awt.Color(0, 204, 0))); // NOI18N

        jLabel2.setText("Player :");

        lbl_player.setText("0");

        jLabel4.setText("Pc :");

        lbl_pc.setText("0");

        btn_replay.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_replay.setForeground(new java.awt.Color(255, 255, 0));
        btn_replay.setText("REPLAY");
        btn_replay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_replayActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 51, 51));
        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_statusLayout = new javax.swing.GroupLayout(pnl_status);
        pnl_status.setLayout(pnl_statusLayout);
        pnl_statusLayout.setHorizontalGroup(
            pnl_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_statusLayout.createSequentialGroup()
                .addGroup(pnl_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_statusLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnl_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_replay, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_statusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_pc)
                            .addComponent(lbl_player, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_statusLayout.setVerticalGroup(
            pnl_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_statusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_player))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_pc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_replay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_scores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Scores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 18), new java.awt.Color(255, 0, 255))); // NOI18N

        jlist_scores.setBackground(new java.awt.Color(255, 255, 255));
        jlist_scores.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jlist_scores);

        javax.swing.GroupLayout pnl_scoresLayout = new javax.swing.GroupLayout(pnl_scores);
        pnl_scores.setLayout(pnl_scoresLayout);
        pnl_scoresLayout.setHorizontalGroup(
            pnl_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_scoresLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl_scoresLayout.setVerticalGroup(
            pnl_scoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_scoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_game, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_playerinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_scores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl_scores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_playerinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_game, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int count = 0;
    boolean game_status = false;
    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        name = txt_name.getText();
        if (!name.isEmpty()) {
            pnl_game.setVisible(true);
            pnl_playerinfo.setEnabled(false);
            txt_name.setEnabled(false);
            btn_start.setEnabled(false);
            pnl_scores.setVisible(false);
            player_score = 0;
            pc_score = 0;
            count = 0;

            for (int j = 0; j < 9; j++) {
                cell[j] = "";
                game_status = true;
            }

        } else {

        }
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn_1.setEnabled(false);
        cell[0] = "x";
        count++;
        control();
        pc_play();

    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn_2.setEnabled(false);
        cell[1] = "x";
        count++;
        control();
        pc_play();
        
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn_3.setEnabled(false);
        cell[2] = "x";
        count++;
        control();
        pc_play();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn_4.setEnabled(false);
        cell[3] = "x";
        count++;
        control();
        pc_play();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn_5.setEnabled(false);
        cell[4] = "x";
        count++;
        control();
        pc_play();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn_6.setEnabled(false);
        cell[5] = "x";
        count++;
        control();
        pc_play();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn_7.setEnabled(false);
        cell[6] = "x";
        count++;
        control();
        pc_play();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn_8.setEnabled(false);
        cell[7] = "x";
        count++;
        control();
        pc_play();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
        btn_9.setEnabled(false);
        cell[8] = "x";
        count++;
        control();
        pc_play();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_replayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_replayActionPerformed
        pnl_game.setVisible(true);
        reset_buttons();
        reset_value();
    }//GEN-LAST:event_btn_replayActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
       reset_buttons();
        reset_value();
        scoresData[i] = name + " " + player_score;
        i++;
        name = "";
        pnl_scores.setVisible(true);
        pnl_status.setVisible(false);
        pnl_game.setVisible(false);
        pnl_playerinfo.setVisible(true);
        txt_name.setEnabled(true);
        btn_start.setEnabled(true);
        jlist_scores.setListData(scoresData);
        btn_reset.setVisible(false);
    }//GEN-LAST:event_btn_resetActionPerformed
    public void reset_buttons(){
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
        btn_1.setEnabled(true);
        btn_2.setEnabled(true);
        btn_3.setEnabled(true);
        btn_4.setEnabled(true);
        btn_5.setEnabled(true);
        btn_6.setEnabled(true);
        btn_7.setEnabled(true);
        btn_8.setEnabled(true);
        btn_9.setEnabled(true);
        
        
        
    }
    public void reset_value(){
        for (int j = 0; j < 9; j++) {
            cell[j] = "";
            count = 0;
            
        }
        game_status = true;
        
    }
    public void control() {
        xox f = new xox();
        if (count < 9) {
            if (cell[0] == "x" && cell[3] == "x" && cell[9] == "x"
                    || cell[1] == "x" && cell[4] == "x" && cell[7] == "x"
                    || cell[2] == "x" && cell[5] == "x" && cell[8] == "x"
                    || cell[0] == "x" && cell[1] == "x" && cell[2] == "x"
                    || cell[3] == "x" && cell[4] == "x" && cell[5] == "x"
                    || cell[6] == "x" && cell[7] == "x" && cell[8] == "x") {
                JOptionPane.showMessageDialog(f, "Player Win");
                player_score++;
                game_status = false;
                lbl_player.setText(String.valueOf(player_score));

            }
        } else if (cell[0] == "o" && cell[3] == "o" && cell[9] == "o"
                || cell[1] == "o" && cell[4] == "o" && cell[7] == "o"
                || cell[2] == "o" && cell[5] == "o" && cell[8] == "o"
                || cell[0] == "o" && cell[1] == "o" && cell[2] == "o"
                || cell[3] == "o" && cell[4] == "o" && cell[5] == "o"
                || cell[6] == "o" && cell[7] == "o" && cell[8] == "o") {
            JOptionPane.showMessageDialog(f, "Pc Win");
            pc_score++;
            game_status = false;
            lbl_player.setText(String.valueOf(pc_score));

        } else if (count == 9) { // No Winner
            JOptionPane.showMessageDialog(f, "NO Winner");

            game_status = false;

        }

        if (!game_status) {
            pnl_status.setVisible(true);
            pnl_game.setVisible(false);
            btn_reset.setVisible(true);
        }

    }

    public void pc_play() {
        if (game_status) {
            int h = -1;
            boolean status = false;
            do {
                h = (int) (Math.random() * 9);
                if (cell[h] == "x") {
                    status = false;

                } else if (cell[h] == "o") {

                    status = false;
                } else {
                    status = true;
                }
            } while (!status);
            cell[h] = "o";
            count++;
            if (h == 0) {
                btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn_1.setEnabled(false);
            } else if (h == 1) {
                btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn_2.setEnabled(false);
            } else if (h == 2) {
                btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn_3.setEnabled(false);
            } else if (h == 3) {
                btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn_4.setEnabled(false);
            } else if (h == 4) {
                btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn_5.setEnabled(false);
            } else if (h == 5) {
                btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn_6.setEnabled(false);
            } else if (h == 6) {
                btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn_7.setEnabled(false);
            } else if (h == 7) {
                btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn_8.setEnabled(false);
            } else if (h == 8) {
                btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                btn_9.setEnabled(false);
            }
            control();

        }

    }

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
            java.util.logging.Logger.getLogger(xox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_replay;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlist_scores;
    private javax.swing.JLabel lbl_pc;
    private javax.swing.JLabel lbl_player;
    private javax.swing.JPanel pnl_game;
    private javax.swing.JPanel pnl_playerinfo;
    private javax.swing.JPanel pnl_scores;
    private javax.swing.JPanel pnl_status;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
