
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Q_1_2 extends javax.swing.JFrame {

    Random random = new Random();
    ArrayList<JToggleButton> tbtn_list = new ArrayList<>();
    JToggleButton firstSelected;
    JToggleButton secondSelected;
    int point;
    int foundedBox;
    DefaultTableModel model;

    public Q_1_2() {
        initComponents();
        JFormattedTextField tf = ((JSpinner.DefaultEditor) spinner.getEditor()).getTextField();
        tf.setEditable(false);
        model = new DefaultTableModel();
        tbl_scores.setModel(model);
        model.setColumnIdentifiers(new Object[]{"ID", "NAME", "POİNT"});
        GetScores();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        pnl_control = new javax.swing.JPanel();
        lbl_count = new javax.swing.JLabel();
        spinner = new javax.swing.JSpinner();
        btn_new_game = new javax.swing.JButton();
        lbl_s = new javax.swing.JLabel();
        lbl_point = new javax.swing.JLabel();
        pnl_game = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_scores = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 355));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jSplitPane1.setDividerLocation(80);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(400, 300));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(400, 300));

        pnl_control.setBackground(new java.awt.Color(102, 255, 102));

        lbl_count.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_count.setForeground(new java.awt.Color(0, 0, 0));
        lbl_count.setText("Count :");

        spinner.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        spinner.setModel(new javax.swing.SpinnerNumberModel(2, 2, 20, 2));

        btn_new_game.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_new_game.setForeground(new java.awt.Color(0, 0, 0));
        btn_new_game.setText("New Game");
        btn_new_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_gameActionPerformed(evt);
            }
        });

        lbl_s.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_s.setForeground(new java.awt.Color(0, 0, 0));
        lbl_s.setText("Score :");

        lbl_point.setBackground(new java.awt.Color(255, 255, 255));
        lbl_point.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_point.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnl_controlLayout = new javax.swing.GroupLayout(pnl_control);
        pnl_control.setLayout(pnl_controlLayout);
        pnl_controlLayout.setHorizontalGroup(
            pnl_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_controlLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_count)
                .addGap(18, 18, 18)
                .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_new_game)
                .addGap(33, 33, 33)
                .addComponent(lbl_s)
                .addGap(36, 36, 36)
                .addComponent(lbl_point)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnl_controlLayout.setVerticalGroup(
            pnl_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_controlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnl_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_count)
                    .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_new_game)
                    .addComponent(lbl_s)
                    .addComponent(lbl_point))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(pnl_control);

        pnl_game.setBackground(new java.awt.Color(0, 204, 204));
        jSplitPane1.setRightComponent(pnl_game);

        jTabbedPane1.addTab("Game", jSplitPane1);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jScrollPane1.setViewportView(tbl_scores);

        btn_delete.setBackground(new java.awt.Color(255, 51, 51));
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btn_delete)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Scores", jPanel1);

        getContentPane().add(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_new_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_gameActionPerformed
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                pnl_game.repaint();
            }

        });
        pnl_game.removeAll();
        foundedBox = 0;
        int count = (int) spinner.getValue();
        firstSelected = null;
        secondSelected = null;
        point = 0;
        lbl_point.setText(point + "");
        for (int i = 0; i < count; i++) {
            JToggleButton ntbtn1 = new JToggleButton();
            ntbtn1.setText("?");
            ntbtn1.setName("A" + i);
            tbtn_list.add(ntbtn1);
            JToggleButton ntbtn2 = new JToggleButton();
            ntbtn2.setText("?");
            ntbtn2.setName("B" + i);
            tbtn_list.add(ntbtn2);

        }
        while (tbtn_list.size() > 0) {
            int index = random.nextInt(tbtn_list.size());
            JToggleButton tbtn = tbtn_list.get(index);

            tbtn.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    JToggleButton tbtn_action = (JToggleButton) e.getSource();
                    if ((firstSelected != null && firstSelected == tbtn_action) || (secondSelected != null && secondSelected == tbtn_action)) {
                        firstSelected.setSelected(true);
                        return;
                    }
                    if (firstSelected == null) {
                        firstSelected = tbtn_action;
                        String nameFirst = firstSelected.getName();
                        int numFirst = Integer.parseInt(nameFirst.substring(1, nameFirst.length()));
                        firstSelected.setText(numFirst + "");

                    } else if (secondSelected == null) {
                        secondSelected = tbtn_action;
                        String nameSecond = secondSelected.getName();
                        int numSecond = Integer.parseInt(nameSecond.substring(1, nameSecond.length()));
                        secondSelected.setText(numSecond + "");
                        String nameFirst = firstSelected.getName();
                        int numFirst = Integer.parseInt(nameFirst.substring(1, nameFirst.length()));
                        firstSelected.setText(numFirst + "");

                        if (numFirst == numSecond) {
                            point += 10;
                            firstSelected.setEnabled(false);
                            secondSelected.setEnabled(false);
                            firstSelected = null;
                            secondSelected = null;
                            foundedBox++;
                            if (foundedBox == count) { // finish
                                pnl_game.removeAll();
                                SwingUtilities.invokeLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        pnl_game.repaint();
                                    }

                                });
                                String name = JOptionPane.showInputDialog(rootPane, "Tebrikler Kazandınız.Lütfen Isminizi Giriniz");
                                InsertPoint(name, point);
                                GetScores();
                            }
                        } else {
                            point -= 5;

                        }
                        lbl_point.setText(point + "");

                    } else {

                        firstSelected.setText("?");
                        firstSelected.setSelected(false);
                        firstSelected = null;
                        secondSelected.setText("?");
                        secondSelected.setSelected(false);
                        secondSelected = null;
                        firstSelected = tbtn_action;
                        String nameFirst = firstSelected.getName();
                        int numFirst = Integer.parseInt(nameFirst.substring(1, nameFirst.length()));
                        firstSelected.setText(numFirst + "");

                    }
                }
            });

            pnl_game.add(tbtn);
            tbtn_list.remove(tbtn);
        }

        screen_refresh();
    }//GEN-LAST:event_btn_new_gameActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int row = tbl_scores.getSelectedRow();
        int id = (int) tbl_scores.getValueAt(row, 0);
        Delete(id);
        GetScores();
    }//GEN-LAST:event_btn_deleteActionPerformed

    public boolean InsertPoint(String name, int point) {
        boolean rvalue = false;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDB", "sa", "as");
            Statement stmt = conn.createStatement();
            String query = "SELECT COUNT(*) FROM TBL_USER";
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            int id = rs.getInt(1) + 1;
            query = "INSERT INTO TBL_USER VALUES (" + id + ",'" + name + "'," + point + ") ";
            stmt.executeUpdate(query);
            conn.close();
            rvalue = true;
        } catch (SQLException ex) {
            Logger.getLogger(Q_1_2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e) {
        }
        return rvalue;

    }

    public boolean GetScores() {
        model.setRowCount(0);
        boolean rvalue = false;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDB", "sa", "as");
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM TBL_USER ORDER BY point DESC";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int point = rs.getInt("point");
                model.addRow(new Object[]{id, name, point});

            }
            rs.next();

            conn.close();
            rvalue = true;
        } catch (SQLException ex) {
            Logger.getLogger(Q_1_2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e) {
        }
        return rvalue;

    }

    public boolean Delete(int id) {
        model.setRowCount(0);
        boolean rvalue = false;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDB", "sa", "as");
            Statement stmt = conn.createStatement();
            String query = "DELETE FROM TBL_USER WHERE ID =" + id;
            stmt.executeUpdate(query);
            conn.close();
            rvalue = true;
        } catch (SQLException ex) {
            Logger.getLogger(Q_1_2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e) {
        }
        return rvalue;

    }

    public void MyThread() {

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("sleep interrupted");
        }

    }

    public void screen_refresh() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                pnl_game.revalidate();
            }

        });

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
            java.util.logging.Logger.getLogger(Q_1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q_1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q_1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q_1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q_1_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_new_game;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_count;
    private javax.swing.JLabel lbl_point;
    private javax.swing.JLabel lbl_s;
    private javax.swing.JPanel pnl_control;
    private javax.swing.JPanel pnl_game;
    private javax.swing.JSpinner spinner;
    private javax.swing.JTable tbl_scores;
    // End of variables declaration//GEN-END:variables
}
