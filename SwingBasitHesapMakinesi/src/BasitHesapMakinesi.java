
import java.awt.Color;

public class BasitHesapMakinesi extends javax.swing.JFrame {

    private int say = 0;

    public BasitHesapMakinesi() {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arti = new javax.swing.JButton();
        eksi = new javax.swing.JButton();
        carpi = new javax.swing.JButton();
        bolme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BirinciSayi = new javax.swing.JTextField();
        IkinciSayi = new javax.swing.JTextField();
        Sonuc = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        temizleButonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basit Hesap Makinesi");
        setBackground(new java.awt.Color(102, 0, 102));
        setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        setForeground(java.awt.Color.blue);
        setLocation(new java.awt.Point(683, 334));
        setMinimumSize(new java.awt.Dimension(50, 50));
        setPreferredSize(new java.awt.Dimension(400, 350));
        setType(java.awt.Window.Type.POPUP);

        arti.setBackground(new java.awt.Color(0, 255, 204));
        arti.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        arti.setText("+");
        arti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artiActionPerformed(evt);
            }
        });

        eksi.setBackground(new java.awt.Color(51, 255, 204));
        eksi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eksi.setText("-");
        eksi.setMaximumSize(new java.awt.Dimension(41, 40));
        eksi.setMinimumSize(new java.awt.Dimension(41, 40));
        eksi.setPreferredSize(new java.awt.Dimension(41, 40));
        eksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eksiActionPerformed(evt);
            }
        });

        carpi.setBackground(new java.awt.Color(0, 255, 204));
        carpi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        carpi.setText("x");
        carpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpiActionPerformed(evt);
            }
        });

        bolme.setBackground(new java.awt.Color(0, 255, 204));
        bolme.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bolme.setText("/");
        bolme.setMaximumSize(new java.awt.Dimension(41, 40));
        bolme.setMinimumSize(new java.awt.Dimension(41, 40));
        bolme.setPreferredSize(new java.awt.Dimension(41, 40));
        bolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolmeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Birinci Sayi : ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Ikinci Sayi : ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Sonuc : ");

        BirinciSayi.setBackground(new java.awt.Color(255, 255, 255));
        BirinciSayi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BirinciSayi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BirinciSayiKeyTyped(evt);
            }
        });

        IkinciSayi.setBackground(new java.awt.Color(255, 255, 255));
        IkinciSayi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        IkinciSayi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IkinciSayiKeyTyped(evt);
            }
        });

        Sonuc.setEditable(false);
        Sonuc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Sonuc.setForeground(new java.awt.Color(204, 0, 0));
        Sonuc.setMinimumSize(new java.awt.Dimension(14, 27));

        temizleButonu.setBackground(new java.awt.Color(51, 255, 204));
        temizleButonu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        temizleButonu.setText("Temizle");
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
                .addGap(101, 101, 101)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sonuc, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(IkinciSayi)
                            .addComponent(BirinciSayi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(arti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carpi, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bolme, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(eksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(temizleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BirinciSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IkinciSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arti)
                    .addComponent(eksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carpi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(temizleButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void artiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artiActionPerformed
        int birinciSayi = Integer.valueOf(this.BirinciSayi.getText());
        int ikinciSayi = Integer.valueOf(this.IkinciSayi.getText());
        Sonuc.setText(String.valueOf(birinciSayi + ikinciSayi));
    }//GEN-LAST:event_artiActionPerformed

    private void eksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eksiActionPerformed
        int birinciSayi = Integer.valueOf(BirinciSayi.getText());
        int ikinciSayi = Integer.valueOf(IkinciSayi.getText());
        Sonuc.setText(String.valueOf(birinciSayi - ikinciSayi));
    }//GEN-LAST:event_eksiActionPerformed

    private void carpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpiActionPerformed
        int birinciSayi = Integer.valueOf(BirinciSayi.getText());
        int ikinciSayi = Integer.valueOf(IkinciSayi.getText());
        Sonuc.setText(String.valueOf(birinciSayi * ikinciSayi));
    }//GEN-LAST:event_carpiActionPerformed

    private void bolmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolmeActionPerformed
        int birinciSayi = Integer.valueOf(BirinciSayi.getText());
        int ikinciSayi = Integer.valueOf(IkinciSayi.getText());
        Sonuc.setText(String.valueOf(birinciSayi / ikinciSayi));
    }//GEN-LAST:event_bolmeActionPerformed

    private void BirinciSayiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BirinciSayiKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_BirinciSayiKeyTyped

    private void IkinciSayiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IkinciSayiKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_IkinciSayiKeyTyped

    private void temizleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleButonuActionPerformed
        BirinciSayi.setText("");
        IkinciSayi.setText("");
        Sonuc.setText("");
    }//GEN-LAST:event_temizleButonuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasitHesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BirinciSayi;
    private javax.swing.JTextField IkinciSayi;
    private javax.swing.JTextField Sonuc;
    private javax.swing.JButton arti;
    private javax.swing.JButton bolme;
    private javax.swing.JButton carpi;
    private javax.swing.JButton eksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JButton temizleButonu;
    // End of variables declaration//GEN-END:variables
}
