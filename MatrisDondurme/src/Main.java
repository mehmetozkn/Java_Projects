
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    int[][] matris;
    int rowSayisi;
    int columnSayisi;
    int kacKere;

    public static int[][] createMatrix(int satir, int sutun) { 
        int[][] matrix = new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }

        return matrix;
    }

    public static void y_dondur(int[][] p_dizi, int satir, int sutun, int direction) {

        int[][] dizi = new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi[i][j] = p_dizi[i][j];
            }
        }

        if (direction == 1) {
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    // Ortadaysa devam eder.
                    if (i != 0 && i != satir - 1) {
                        if (j != 0 && j != sutun - 1) {
                            continue;
                        }
                    }

                    if (i == 0 && j != sutun - 1) {
                        dizi[i][j + 1] = p_dizi[i][j];
                    } else if (i != satir - 1 && j == sutun - 1) {
                        dizi[i + 1][j] = p_dizi[i][j];
                    } else if (i == satir - 1 && j != 0) {
                        dizi[i][j - 1] = p_dizi[i][j];
                    } else {
                        dizi[i - 1][j] = p_dizi[i][j];
                    }

                }
            }
        } else {
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    //Ortadaysa devam eder.
                    if (i != 0 && i != satir - 1) {
                        if (j != 0 && j != sutun - 1) {
                            continue;
                        }
                    }

                    if (i == 0 && j != 0) {
                        dizi[i][j - 1] = p_dizi[i][j];
                    } else if (j == 0 && i != satir - 1) {
                        dizi[i + 1][j] = p_dizi[i][j];
                    } else if (i == satir - 1 && j != sutun - 1) {
                        dizi[i][j + 1] = p_dizi[i][j];
                    } else {
                        dizi[i - 1][j] = p_dizi[i][j];
                    }
                }
            }
        }

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                p_dizi[i][j] = dizi[i][j];
            }
        }

    }

    public static void dondur(int[][] p_dizi, int satir, int sutun, int kacKere) { 

        if (kacKere < 0) {
            for (int i = 0; i > kacKere; i--) {
                y_dondur(p_dizi, satir, sutun, 1);
            }
        } else {
            for (int i = 0; i > (kacKere * -1); i--) {
                y_dondur(p_dizi, satir, sutun, -1);
            }
        }
    }

    public static void yazdir(int[][] p_dizi, int satir, int sutun) { 

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(p_dizi[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("************************************");
    }

    public Main() {
        initComponents();
        getContentPane().setBackground(Color.GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField20 = new javax.swing.JTextField();
        row = new javax.swing.JLabel();
        column = new javax.swing.JLabel();
        olusturButonu = new javax.swing.JButton();
        direction = new javax.swing.JLabel();
        stepNumber = new javax.swing.JLabel();
        directionComboBox = new javax.swing.JComboBox<>();
        stepSayisi = new javax.swing.JTextField();
        rowSayisiField = new javax.swing.JTextField();
        columnSayisiField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dondurulecekAlan = new javax.swing.JTextArea();
        dondurButonu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dondurulmusAlan = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        temizleButonu = new javax.swing.JButton();

        jTextField20.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MATRİS DÖNDÜRME ");
        setBackground(new java.awt.Color(0, 153, 51));
        setResizable(false);

        row.setForeground(new java.awt.Color(0, 0, 255));
        row.setText("ROW");

        column.setForeground(new java.awt.Color(0, 0, 255));
        column.setText("COLUMN");

        olusturButonu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        olusturButonu.setForeground(new java.awt.Color(255, 51, 51));
        olusturButonu.setText("OLUŞTUR");
        olusturButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olusturButonuActionPerformed(evt);
            }
        });

        direction.setForeground(new java.awt.Color(0, 0, 255));
        direction.setText("DIRECTION");

        stepNumber.setForeground(new java.awt.Color(0, 0, 255));
        stepNumber.setText("STEP NUMBER");

        directionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saat Yönü", "Saatin Tersi Yönü" }));

        stepSayisi.setBackground(new java.awt.Color(255, 255, 255));
        stepSayisi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stepSayisiKeyTyped(evt);
            }
        });

        rowSayisiField.setBackground(new java.awt.Color(255, 255, 255));
        rowSayisiField.setAutoscrolls(false);
        rowSayisiField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rowSayisiFieldKeyTyped(evt);
            }
        });

        columnSayisiField.setBackground(new java.awt.Color(255, 255, 255));
        columnSayisiField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                columnSayisiFieldKeyTyped(evt);
            }
        });

        dondurulecekAlan.setBackground(new java.awt.Color(204, 204, 255));
        dondurulecekAlan.setColumns(20);
        dondurulecekAlan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dondurulecekAlan.setForeground(new java.awt.Color(153, 0, 0));
        dondurulecekAlan.setRows(5);
        jScrollPane1.setViewportView(dondurulecekAlan);

        dondurButonu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dondurButonu.setForeground(new java.awt.Color(255, 51, 51));
        dondurButonu.setText("DÖNDÜR");
        dondurButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dondurButonuActionPerformed(evt);
            }
        });

        dondurulmusAlan.setBackground(new java.awt.Color(204, 204, 255));
        dondurulmusAlan.setColumns(20);
        dondurulmusAlan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dondurulmusAlan.setForeground(new java.awt.Color(153, 0, 0));
        dondurulmusAlan.setRows(5);
        jScrollPane2.setViewportView(dondurulmusAlan);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("DÖNDÜRÜLECEK MATRİS");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("DÖNDÜRÜLMÜŞ MATRİS");

        temizleButonu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        temizleButonu.setForeground(new java.awt.Color(255, 51, 51));
        temizleButonu.setText("TEMİZLE");
        temizleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(row)
                                    .addGap(64, 64, 64)
                                    .addComponent(column))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(rowSayisiField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(columnSayisiField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(directionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(direction, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(stepSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stepNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(olusturButonu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dondurButonu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(temizleButonu))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(257, 257, 257)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(270, 270, 270)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(column)
                            .addComponent(direction)
                            .addComponent(stepNumber)
                            .addComponent(row))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(directionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stepSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rowSayisiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(columnSayisiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dondurButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(temizleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(olusturButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void olusturButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturButonuActionPerformed
        dondurulecekAlan.setText("");
        try {
            rowSayisi = Integer.valueOf(rowSayisiField.getText());
            columnSayisi = Integer.valueOf(columnSayisiField.getText());
            matris = createMatrix(rowSayisi, columnSayisi);
        } catch (NumberFormatException e) {

        }
        if (rowSayisi < 2 || columnSayisi < 2) {
            JOptionPane.showMessageDialog(this, "Satır Ve Sutun Sayısı 2'den Küçük Olamaz!");
        } else {
            for (int i = 0; i < rowSayisi; i++) {
                for (int j = 0; j < columnSayisi; j++) {
                    dondurulecekAlan.setText((dondurulecekAlan.getText()) + matris[i][j] + "\t");

                }
                dondurulecekAlan.setText((dondurulecekAlan.getText()) + "\n" + "\n");
            }

        }


    }//GEN-LAST:event_olusturButonuActionPerformed

    private void stepSayisiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stepSayisiKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_stepSayisiKeyTyped

    private void rowSayisiFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rowSayisiFieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_rowSayisiFieldKeyTyped

    private void columnSayisiFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_columnSayisiFieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_columnSayisiFieldKeyTyped

    private void dondurButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dondurButonuActionPerformed
        
        try {
            rowSayisi = Integer.valueOf(rowSayisiField.getText());
            columnSayisi = Integer.valueOf(columnSayisiField.getText());
            kacKere = Integer.valueOf(stepSayisi.getText());
        } catch (NumberFormatException e) {

        }
        int yon = -1;
        if (rowSayisi < 2 || columnSayisi < 2) {
            JOptionPane.showMessageDialog(this, "Satır Ve Sutun Sayısı 2'den Küçük Olamaz!");
        } else {
            if (stepSayisi.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Kac Kere Döndürüleceğini Giriniz...");
            }
            if (directionComboBox.getSelectedIndex() == 0) {
                yon = -1;
            } else if (directionComboBox.getSelectedIndex() == 1) {
                yon = 1;
            }
            dondur(matris, rowSayisi, columnSayisi, (kacKere * yon));
            for (int i = 0; i < rowSayisi; i++) {
                for (int j = 0; j < columnSayisi; j++) {
                    dondurulmusAlan.setText((dondurulmusAlan.getText()) + matris[i][j] + "\t");
                }
                dondurulmusAlan.setText((dondurulmusAlan.getText()) + "\n" + "\n");

            }
            dondurulmusAlan.setText((dondurulmusAlan.getText()) + "**********************************************************************************************************************************************");
            dondurulmusAlan.setText((dondurulmusAlan.getText()) + "\n" + "\n");
        }

    }//GEN-LAST:event_dondurButonuActionPerformed

    private void temizleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleButonuActionPerformed
        dondurulecekAlan.setText("");
        dondurulmusAlan.setText("");
        rowSayisiField.setText("");
        columnSayisiField.setText("");
        stepSayisi.setText("");
    }//GEN-LAST:event_temizleButonuActionPerformed

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
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel column;
    private javax.swing.JTextField columnSayisiField;
    private javax.swing.JLabel direction;
    private javax.swing.JComboBox<String> directionComboBox;
    private javax.swing.JButton dondurButonu;
    private javax.swing.JTextArea dondurulecekAlan;
    private javax.swing.JTextArea dondurulmusAlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JButton olusturButonu;
    private javax.swing.JLabel row;
    private javax.swing.JTextField rowSayisiField;
    private javax.swing.JLabel stepNumber;
    private javax.swing.JTextField stepSayisi;
    private javax.swing.JButton temizleButonu;
    // End of variables declaration//GEN-END:variables
}
