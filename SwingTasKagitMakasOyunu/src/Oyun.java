
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author mehmet
 */
public class Oyun extends javax.swing.JFrame {

    public Oyun() {
        initComponents();
        setResizable(false);
        oyunAlani.setVisible(false);
        skorAlani.setVisible(false);

    }
    int bilgisayarSecimi;
    int oyuncuSecimi;
    int oyuncuSkoru = 0;
    int bilgisayarSkoru = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        oyuncuBilgileriAlani = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        oyuncuAdıAlani = new javax.swing.JTextField();
        startButonu = new javax.swing.JButton();
        oyunAlani = new javax.swing.JPanel();
        pckagit = new javax.swing.JRadioButton();
        oyuncuKagit = new javax.swing.JRadioButton();
        oyuncuMakas = new javax.swing.JRadioButton();
        playButonu = new javax.swing.JButton();
        bilgisayarSecimiButonu = new javax.swing.JButton();
        oyuncuSecimiButonu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        oyuncuTas = new javax.swing.JRadioButton();
        pcmakas = new javax.swing.JRadioButton();
        pctas = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        sonucAlani = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        skorAlani = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        yeniOyunButonu = new javax.swing.JButton();
        oyuncuSkorAlani = new javax.swing.JTextField();
        bilgisayarSkorAlani = new javax.swing.JTextField();
        oyuncuAdi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        oyuncuBilgileriAlani.setBackground(new java.awt.Color(204, 204, 255));
        oyuncuBilgileriAlani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        oyuncuBilgileriAlani.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Oyuncu Adı :");

        oyuncuAdıAlani.setBackground(new java.awt.Color(255, 255, 255));

        startButonu.setBackground(new java.awt.Color(0, 255, 51));
        startButonu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        startButonu.setForeground(new java.awt.Color(255, 0, 0));
        startButonu.setText("START");
        startButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout oyuncuBilgileriAlaniLayout = new javax.swing.GroupLayout(oyuncuBilgileriAlani);
        oyuncuBilgileriAlani.setLayout(oyuncuBilgileriAlaniLayout);
        oyuncuBilgileriAlaniLayout.setHorizontalGroup(
            oyuncuBilgileriAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oyuncuBilgileriAlaniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oyuncuAdıAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        oyuncuBilgileriAlaniLayout.setVerticalGroup(
            oyuncuBilgileriAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oyuncuBilgileriAlaniLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(oyuncuBilgileriAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oyuncuAdıAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(oyuncuBilgileriAlaniLayout.createSequentialGroup()
                .addComponent(startButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        oyunAlani.setBackground(new java.awt.Color(153, 255, 153));
        oyunAlani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyun Alanı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 153))); // NOI18N

        buttonGroup2.add(pckagit);
        pckagit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pckagit.setText("KAĞIT");

        buttonGroup1.add(oyuncuKagit);
        oyuncuKagit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        oyuncuKagit.setText("KAĞIT");
        oyuncuKagit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oyuncuKagitActionPerformed(evt);
            }
        });

        buttonGroup1.add(oyuncuMakas);
        oyuncuMakas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        oyuncuMakas.setText("MAKAS");
        oyuncuMakas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oyuncuMakasActionPerformed(evt);
            }
        });

        playButonu.setBackground(new java.awt.Color(102, 102, 255));
        playButonu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        playButonu.setForeground(new java.awt.Color(255, 0, 0));
        playButonu.setText("PLAY");
        playButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButonuActionPerformed(evt);
            }
        });

        bilgisayarSecimiButonu.setBackground(new java.awt.Color(153, 153, 153));
        bilgisayarSecimiButonu.setEnabled(false);

        oyuncuSecimiButonu.setBackground(new java.awt.Color(153, 153, 153));
        oyuncuSecimiButonu.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("OYUNCU SECİMİ");

        buttonGroup1.add(oyuncuTas);
        oyuncuTas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        oyuncuTas.setText("TAŞ");
        oyuncuTas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oyuncuTasActionPerformed(evt);
            }
        });

        buttonGroup2.add(pcmakas);
        pcmakas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pcmakas.setText("MAKAS");

        buttonGroup2.add(pctas);
        pctas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pctas.setText("TAŞ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("BİLGİSAYAR SECİMİ");

        sonucAlani.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("SONUÇ");

        javax.swing.GroupLayout oyunAlaniLayout = new javax.swing.GroupLayout(oyunAlani);
        oyunAlani.setLayout(oyunAlaniLayout);
        oyunAlaniLayout.setHorizontalGroup(
            oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oyunAlaniLayout.createSequentialGroup()
                .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oyunAlaniLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(oyunAlaniLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(oyuncuMakas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, oyunAlaniLayout.createSequentialGroup()
                                .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oyuncuSecimiButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oyuncuKagit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oyuncuTas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(oyunAlaniLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(sonucAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(oyunAlaniLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(playButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(oyunAlaniLayout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pctas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(pckagit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcmakas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bilgisayarSecimiButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        oyunAlaniLayout.setVerticalGroup(
            oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oyunAlaniLayout.createSequentialGroup()
                .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oyunAlaniLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(oyunAlaniLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(pcmakas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(oyunAlaniLayout.createSequentialGroup()
                                .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(oyuncuTas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pctas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(oyuncuKagit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pckagit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sonucAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oyuncuMakas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(oyunAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(oyunAlaniLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(oyuncuSecimiButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(oyunAlaniLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bilgisayarSecimiButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oyunAlaniLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );

        skorAlani.setBackground(new java.awt.Color(255, 255, 51));
        skorAlani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skor Alanı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 204, 0))); // NOI18N
        skorAlani.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Bilgisayar ");
        jLabel5.setEnabled(false);

        yeniOyunButonu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        yeniOyunButonu.setForeground(new java.awt.Color(0, 0, 153));
        yeniOyunButonu.setText("YENİ OYUN");
        yeniOyunButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniOyunButonuActionPerformed(evt);
            }
        });

        oyuncuSkorAlani.setEditable(false);
        oyuncuSkorAlani.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        oyuncuSkorAlani.setForeground(new java.awt.Color(204, 0, 0));
        oyuncuSkorAlani.setText("0");

        bilgisayarSkorAlani.setEditable(false);
        bilgisayarSkorAlani.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bilgisayarSkorAlani.setForeground(new java.awt.Color(255, 51, 51));
        bilgisayarSkorAlani.setText("0");

        oyuncuAdi.setEditable(false);
        oyuncuAdi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        oyuncuAdi.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout skorAlaniLayout = new javax.swing.GroupLayout(skorAlani);
        skorAlani.setLayout(skorAlaniLayout);
        skorAlaniLayout.setHorizontalGroup(
            skorAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skorAlaniLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(oyuncuSkorAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(skorAlaniLayout.createSequentialGroup()
                .addGroup(skorAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skorAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(yeniOyunButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(skorAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(skorAlaniLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(oyuncuAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(skorAlaniLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(bilgisayarSkorAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(skorAlaniLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        skorAlaniLayout.setVerticalGroup(
            skorAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skorAlaniLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(oyuncuAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oyuncuSkorAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bilgisayarSkorAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(yeniOyunButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oyunAlani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oyuncuBilgileriAlani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(skorAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oyuncuBilgileriAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oyunAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(skorAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButonuActionPerformed
        if (oyuncuAdıAlani.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "ADINIZI GİRİNİZ !");
        } else {
            oyunAlani.setVisible(true);
            skorAlani.setVisible(true);
            oyuncuAdıAlani.setEnabled(false);
            oyuncuBilgileriAlani.setEnabled(false);
            oyuncuAdi.setText(oyuncuAdıAlani.getText());

        }
    }//GEN-LAST:event_startButonuActionPerformed

    private void playButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButonuActionPerformed
        Random random = new Random();
        if ((oyuncuTas.isSelected() == false) && (oyuncuMakas.isSelected() == false) && (oyuncuKagit.isSelected() == false)) {
            JOptionPane.showMessageDialog(this, "Oyuncu Seçimini Yapmadı !");
        } else {
            bilgisayarSecimi = random.nextInt(3);
            if (bilgisayarSecimi == 0) {
                bilgisayarSecimiButonu.setIcon(tas);
                pctas.doClick();
            } else if (bilgisayarSecimi == 1) {
                bilgisayarSecimiButonu.setIcon(kagit);
                pckagit.doClick();
            } else if (bilgisayarSecimi == 2) {
                bilgisayarSecimiButonu.setIcon(makas);
                pcmakas.doClick();
            }
            kontrol();
        }


    }//GEN-LAST:event_playButonuActionPerformed
    public void kontrol() {
        if ((bilgisayarSecimi == 0 && oyuncuSecimi == 0) || (bilgisayarSecimi == 1 && oyuncuSecimi == 1) || (bilgisayarSecimi == 2 && oyuncuSecimi == 2)) {
            sonucAlani.setText("Berabere");

        } else if ((bilgisayarSecimi == 0 && oyuncuSecimi == 2) || (bilgisayarSecimi == 1 && oyuncuSecimi == 0) || (bilgisayarSecimi == 2 && oyuncuSecimi == 1)) {
            sonucAlani.setText("Bilgisayar Kazandı");
            bilgisayarSkoru++;
            bilgisayarSkorAlani.setText(bilgisayarSkoru + "");
        } else if ((bilgisayarSecimi == 0 && oyuncuSecimi == 1) || (bilgisayarSecimi == 1 && oyuncuSecimi == 2) || (bilgisayarSecimi == 2 && oyuncuSecimi == 0)) {
            sonucAlani.setText("Oyuncu Kazandı");
            oyuncuSkoru++;
            oyuncuSkorAlani.setText(oyuncuSkoru + "");
        }
    }
    Icon tas = new ImageIcon(getClass().getResource("/images/TAS.png"));
    Icon kagit = new ImageIcon(getClass().getResource("/images/KAGİT.png"));
    Icon makas = new ImageIcon(getClass().getResource("/images/MAKAS.png"));
    Icon bos = new ImageIcon(getClass().getResource("/images/BOS.png"));

    private void oyuncuTasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oyuncuTasActionPerformed
        oyuncuSecimiButonu.setIcon(tas);
        oyuncuSecimi = 0;

    }//GEN-LAST:event_oyuncuTasActionPerformed

    private void oyuncuKagitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oyuncuKagitActionPerformed
        oyuncuSecimiButonu.setIcon(kagit);
        oyuncuSecimi = 1;
    }//GEN-LAST:event_oyuncuKagitActionPerformed

    private void oyuncuMakasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oyuncuMakasActionPerformed
        oyuncuSecimiButonu.setIcon(makas);
        oyuncuSecimi = 2;
    }//GEN-LAST:event_oyuncuMakasActionPerformed

    private void yeniOyunButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniOyunButonuActionPerformed
        buttonGroup1.clearSelection();
        oyuncuAdıAlani.setText("");
        oyuncuAdi.setText("");
        oyuncuSecimiButonu.setIcon(bos);
        oyuncuSkoru = 0;
        bilgisayarSkoru = 0;
        bilgisayarSkorAlani.setText("");
        oyuncuSkorAlani.setText("");
        sonucAlani.setText("");
        bilgisayarSecimiButonu.setIcon(bos);
        buttonGroup2.clearSelection();
        oyuncuAdıAlani.setEnabled(true);
        oyunAlani.setVisible(false);
        skorAlani.setVisible(false);


    }//GEN-LAST:event_yeniOyunButonuActionPerformed

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
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oyun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bilgisayarSecimiButonu;
    private javax.swing.JTextField bilgisayarSkorAlani;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel oyunAlani;
    private javax.swing.JTextField oyuncuAdi;
    private javax.swing.JTextField oyuncuAdıAlani;
    private javax.swing.JPanel oyuncuBilgileriAlani;
    private javax.swing.JRadioButton oyuncuKagit;
    private javax.swing.JRadioButton oyuncuMakas;
    private javax.swing.JButton oyuncuSecimiButonu;
    private javax.swing.JTextField oyuncuSkorAlani;
    private javax.swing.JRadioButton oyuncuTas;
    private javax.swing.JRadioButton pckagit;
    private javax.swing.JRadioButton pcmakas;
    private javax.swing.JRadioButton pctas;
    private javax.swing.JButton playButonu;
    private javax.swing.JPanel skorAlani;
    private javax.swing.JTextField sonucAlani;
    private javax.swing.JButton startButonu;
    private javax.swing.JButton yeniOyunButonu;
    // End of variables declaration//GEN-END:variables
}
