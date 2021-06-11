
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JToggleButton;

public class Basic_Paint extends javax.swing.JFrame {

    Color color;
    Shape shape = null;
    Point mouseStart;
    Point mouseEnd;
    int thickness = 1;
    boolean mouseDragged = false;
    ArrayList<Shape> list = new ArrayList<>();

    public Basic_Paint() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        tbar_tools = new javax.swing.JToolBar();
        tbtn_line = new javax.swing.JToggleButton();
        tbtn_cicle = new javax.swing.JToggleButton();
        tbtn_rectganle = new javax.swing.JToggleButton();
        txt_text = new javax.swing.JTextField();
        tbtn_text = new javax.swing.JToggleButton();
        cmbx_colors = new javax.swing.JComboBox<>();
        spnr_thickess = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        pnl_area = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                for(Shape shape : list){
                    shape.Draw(g);
                }
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(510, 352));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jSplitPane1.setDividerLocation(80);
        jSplitPane1.setDividerSize(5);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        tbar_tools.setRollover(true);

        tbtn_line.setText("Line");
        tbtn_line.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtn_line.setFocusable(false);
        tbtn_line.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtn_line.setPreferredSize(new java.awt.Dimension(100, 40));
        tbtn_line.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtn_line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_lineActionPerformed(evt);
            }
        });
        tbar_tools.add(tbtn_line);

        tbtn_cicle.setText("Circle");
        tbtn_cicle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtn_cicle.setFocusable(false);
        tbtn_cicle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtn_cicle.setPreferredSize(new java.awt.Dimension(100, 40));
        tbtn_cicle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtn_cicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_cicleActionPerformed(evt);
            }
        });
        tbar_tools.add(tbtn_cicle);

        tbtn_rectganle.setText("Rectangle");
        tbtn_rectganle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtn_rectganle.setFocusable(false);
        tbtn_rectganle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtn_rectganle.setPreferredSize(new java.awt.Dimension(100, 40));
        tbtn_rectganle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtn_rectganle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_rectganleActionPerformed(evt);
            }
        });
        tbar_tools.add(tbtn_rectganle);

        txt_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_text.setPreferredSize(new java.awt.Dimension(100, 40));
        tbar_tools.add(txt_text);

        tbtn_text.setText("Text");
        tbtn_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtn_text.setFocusable(false);
        tbtn_text.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtn_text.setPreferredSize(new java.awt.Dimension(100, 40));
        tbtn_text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtn_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_textActionPerformed(evt);
            }
        });
        tbar_tools.add(tbtn_text);

        cmbx_colors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "Red", "Green", "Blue" }));
        cmbx_colors.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmbx_colors.setPreferredSize(new java.awt.Dimension(100, 40));
        cmbx_colors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_colorsActionPerformed(evt);
            }
        });
        tbar_tools.add(cmbx_colors);

        spnr_thickess.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        spnr_thickess.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spnr_thickess.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnr_thickessStateChanged(evt);
            }
        });
        tbar_tools.add(spnr_thickess);

        jButton1.setText("Clean");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        tbar_tools.add(jButton1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbar_tools, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbar_tools, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jSplitPane1.setTopComponent(jPanel1);

        pnl_area.setBackground(new java.awt.Color(255, 255, 255));
        pnl_area.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_areaMouseDragged(evt);
            }
        });
        pnl_area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_areaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnl_areaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_areaLayout = new javax.swing.GroupLayout(pnl_area);
        pnl_area.setLayout(pnl_areaLayout);
        pnl_areaLayout.setHorizontalGroup(
            pnl_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );
        pnl_areaLayout.setVerticalGroup(
            pnl_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(pnl_area);

        getContentPane().add(jSplitPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbtn_lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_lineActionPerformed
        JToggleButton rtbtn = (JToggleButton) evt.getSource();
        SetSelectedFalseOther(rtbtn);
    }//GEN-LAST:event_tbtn_lineActionPerformed

    private void tbtn_cicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_cicleActionPerformed

        JToggleButton rtbtn = (JToggleButton) evt.getSource();
        SetSelectedFalseOther(rtbtn);
    }//GEN-LAST:event_tbtn_cicleActionPerformed

    private void tbtn_rectganleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_rectganleActionPerformed

        JToggleButton rtbtn = (JToggleButton) evt.getSource();
        SetSelectedFalseOther(rtbtn);

    }//GEN-LAST:event_tbtn_rectganleActionPerformed

    private void tbtn_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_textActionPerformed

        JToggleButton rtbtn = (JToggleButton) evt.getSource();
        SetSelectedFalseOther(rtbtn);
    }//GEN-LAST:event_tbtn_textActionPerformed

    private void cmbx_colorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_colorsActionPerformed
        switch (cmbx_colors.getSelectedIndex()) {
            case 0:
                color = Color.BLACK;
                break;
            case 1:
                color = Color.RED;
                break;
            case 2:
                color = Color.GREEN;
                break;
            case 3:
                color = Color.BLUE;
                break;
        }
    }//GEN-LAST:event_cmbx_colorsActionPerformed

    private void spnr_thickessStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnr_thickessStateChanged
        thickness = (int) spnr_thickess.getValue();
    }//GEN-LAST:event_spnr_thickessStateChanged

    private void pnl_areaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_areaMousePressed
        mouseStart = evt.getPoint();
        mouseDragged = false;
        shape = null;
    }//GEN-LAST:event_pnl_areaMousePressed

    private void pnl_areaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_areaMouseDragged
        mouseDragged = true;
        mouseEnd = evt.getPoint();
        if (shape == null) {
            if (tbtn_line.isSelected()) {
                shape = new SLine(mouseStart, mouseEnd, color, thickness);
                list.add(shape);

            } else if (tbtn_rectganle.isSelected()) {
                shape = new SRectganle(mouseStart, mouseEnd, color, thickness);
                list.add(shape);

            } else if (tbtn_cicle.isSelected()) {
                shape = new SCicle(mouseStart, mouseEnd, color, thickness);
                list.add(shape);

            } else if (tbtn_text.isSelected() && !txt_text.getText().isEmpty()) {
                shape = new SText(mouseStart, txt_text.getText(), color, thickness);
                list.add(shape);

            }
        } else {

            if (tbtn_line.isSelected()) {
                SLine rshape = (SLine) shape;
                rshape.end = mouseEnd;

            } else if (tbtn_rectganle.isSelected()) {
                SRectganle rshape = (SRectganle) shape;
                  rshape.Restore(mouseStart, mouseEnd);

            } else if (tbtn_cicle.isSelected()) {
                SCicle rshape = (SCicle) shape;
                  rshape.Restore(mouseStart, mouseEnd);

            } else if (tbtn_text.isSelected() && !txt_text.getText().isEmpty()) {
                SText rshape = (SText) shape;
                rshape.start = mouseEnd;

            }

        }

        pnl_area.repaint();
    }//GEN-LAST:event_pnl_areaMouseDragged

    private void pnl_areaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_areaMouseReleased
        mouseEnd = evt.getPoint();
    }//GEN-LAST:event_pnl_areaMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pnl_area.removeAll();
        pnl_area.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void SetSelectedFalseOther(JToggleButton rtbtn) {
        for (Component component : tbar_tools.getComponents()) {
            if (component instanceof JToggleButton) {
                JToggleButton tbtn = (JToggleButton) component;
                if (tbtn != rtbtn) {
                    tbtn.setSelected(false);
                }
            }
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
            java.util.logging.Logger.getLogger(Basic_Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Basic_Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Basic_Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Basic_Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Basic_Paint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbx_colors;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel pnl_area;
    private javax.swing.JSpinner spnr_thickess;
    private javax.swing.JToolBar tbar_tools;
    private javax.swing.JToggleButton tbtn_cicle;
    private javax.swing.JToggleButton tbtn_line;
    private javax.swing.JToggleButton tbtn_rectganle;
    private javax.swing.JToggleButton tbtn_text;
    private javax.swing.JTextField txt_text;
    // End of variables declaration//GEN-END:variables

}
