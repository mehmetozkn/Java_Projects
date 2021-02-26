
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author mehmet
 */
public class OyunEkrani extends javax.swing.JFrame implements ActionListener {

    Timer timer = new Timer(1000, this);
    Random random = new Random();
    private static ArrayList<Oyuncu> oyuncular = new ArrayList<>();

    public ArrayList<Oyuncu> getOyuncular() {
        return oyuncular;
    }

    public void setOyuncular(ArrayList<Oyuncu> oyuncular) {
        this.oyuncular = oyuncular;
    }

    public OyunEkrani() {
        initComponents();
        jPanel_oyun_alani.setVisible(false);
        jPanel_sonuc_tablosu.setVisible(false);

    }
    private int gecenSure = 0;
    private int oyuncuSayisi = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOyuncuBilgileri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_oyuncu_adi = new javax.swing.JTextField();
        start_butonu = new javax.swing.JButton();
        jPanel_sonuc_tablosu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_dogru_sayisi = new javax.swing.JTextField();
        jTextField_yanlis_sayisi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_gecen_sure = new javax.swing.JTextField();
        oyuncuAdi = new javax.swing.JLabel();
        tumSkorlarButonu = new javax.swing.JButton();
        jPanel_oyun_alani = new javax.swing.JPanel();
        stopButonu = new javax.swing.JButton();
        yeniOyunButonu = new javax.swing.JButton();
        ilkSayi1 = new javax.swing.JTextField();
        ikinciSayi1 = new javax.swing.JTextField();
        esittirresmi = new javax.swing.JButton();
        islemResmi = new javax.swing.JButton();
        nextButonu = new javax.swing.JButton();
        sonuc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oyun Ekranı");
        setResizable(false);

        panelOyuncuBilgileri.setBackground(new java.awt.Color(255, 255, 102));
        panelOyuncuBilgileri.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Oyuncu Adı : ");

        jTextField_oyuncu_adi.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_oyuncu_adi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField_oyuncu_adi.setForeground(new java.awt.Color(0, 0, 0));

        start_butonu.setBackground(new java.awt.Color(204, 204, 204));
        start_butonu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        start_butonu.setForeground(new java.awt.Color(0, 0, 255));
        start_butonu.setText("START");
        start_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOyuncuBilgileriLayout = new javax.swing.GroupLayout(panelOyuncuBilgileri);
        panelOyuncuBilgileri.setLayout(panelOyuncuBilgileriLayout);
        panelOyuncuBilgileriLayout.setHorizontalGroup(
            panelOyuncuBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOyuncuBilgileriLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_oyuncu_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(start_butonu, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        panelOyuncuBilgileriLayout.setVerticalGroup(
            panelOyuncuBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOyuncuBilgileriLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelOyuncuBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_oyuncu_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start_butonu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_sonuc_tablosu.setBackground(new java.awt.Color(153, 255, 153));
        jPanel_sonuc_tablosu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sonuç Tablosu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Dogru Sayısı :");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Yanlış Sayısı :");

        jTextField_dogru_sayisi.setEditable(false);
        jTextField_dogru_sayisi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_dogru_sayisi.setForeground(new java.awt.Color(255, 0, 0));
        jTextField_dogru_sayisi.setText("0");

        jTextField_yanlis_sayisi.setEditable(false);
        jTextField_yanlis_sayisi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_yanlis_sayisi.setForeground(new java.awt.Color(255, 0, 0));
        jTextField_yanlis_sayisi.setText("0");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Geçen Süre :");

        jTextField_gecen_sure.setEditable(false);
        jTextField_gecen_sure.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_gecen_sure.setText("0");

        oyuncuAdi.setBackground(new java.awt.Color(255, 255, 255));
        oyuncuAdi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        oyuncuAdi.setForeground(new java.awt.Color(0, 0, 0));
        oyuncuAdi.setEnabled(false);

        tumSkorlarButonu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tumSkorlarButonu.setForeground(new java.awt.Color(255, 51, 51));
        tumSkorlarButonu.setText("TÜM SKORLAR");
        tumSkorlarButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tumSkorlarButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_sonuc_tablosuLayout = new javax.swing.GroupLayout(jPanel_sonuc_tablosu);
        jPanel_sonuc_tablosu.setLayout(jPanel_sonuc_tablosuLayout);
        jPanel_sonuc_tablosuLayout.setHorizontalGroup(
            jPanel_sonuc_tablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_sonuc_tablosuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_sonuc_tablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_sonuc_tablosuLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_yanlis_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField_gecen_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_sonuc_tablosuLayout.createSequentialGroup()
                        .addGroup(jPanel_sonuc_tablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_sonuc_tablosuLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_dogru_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(oyuncuAdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel_sonuc_tablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_sonuc_tablosuLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel_sonuc_tablosuLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(tumSkorlarButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel_sonuc_tablosuLayout.setVerticalGroup(
            jPanel_sonuc_tablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_sonuc_tablosuLayout.createSequentialGroup()
                .addGroup(jPanel_sonuc_tablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_sonuc_tablosuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oyuncuAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_sonuc_tablosuLayout.createSequentialGroup()
                        .addComponent(tumSkorlarButonu)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_sonuc_tablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_sonuc_tablosuLayout.createSequentialGroup()
                        .addGroup(jPanel_sonuc_tablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_dogru_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_sonuc_tablosuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_yanlis_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_gecen_sure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_sonuc_tablosuLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50))))
        );

        jPanel_oyun_alani.setBackground(new java.awt.Color(0, 204, 204));
        jPanel_oyun_alani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyun Alanı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N

        stopButonu.setBackground(new java.awt.Color(204, 204, 204));
        stopButonu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        stopButonu.setForeground(new java.awt.Color(0, 0, 255));
        stopButonu.setText("STOP");
        stopButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButonuActionPerformed(evt);
            }
        });

        yeniOyunButonu.setBackground(new java.awt.Color(204, 204, 204));
        yeniOyunButonu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        yeniOyunButonu.setForeground(new java.awt.Color(0, 0, 255));
        yeniOyunButonu.setText("NEW GAME");
        yeniOyunButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniOyunButonuActionPerformed(evt);
            }
        });

        ilkSayi1.setEditable(false);
        ilkSayi1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ilkSayi1.setForeground(new java.awt.Color(255, 51, 51));

        ikinciSayi1.setEditable(false);
        ikinciSayi1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ikinciSayi1.setForeground(new java.awt.Color(255, 0, 51));

        esittirresmi.setBackground(new java.awt.Color(255, 255, 255));
        esittirresmi.setEnabled(false);

        islemResmi.setBackground(new java.awt.Color(255, 255, 255));
        islemResmi.setEnabled(false);

        nextButonu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nextButonu.setForeground(new java.awt.Color(255, 0, 0));
        nextButonu.setText("NEXT");
        nextButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButonuActionPerformed(evt);
            }
        });

        sonuc.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        sonuc.setForeground(new java.awt.Color(255, 0, 0));
        sonuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sonucKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel_oyun_alaniLayout = new javax.swing.GroupLayout(jPanel_oyun_alani);
        jPanel_oyun_alani.setLayout(jPanel_oyun_alaniLayout);
        jPanel_oyun_alaniLayout.setHorizontalGroup(
            jPanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_oyun_alaniLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(islemResmi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ikinciSayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(esittirresmi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(nextButonu, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stopButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniOyunButonu))
                .addGap(25, 25, 25))
            .addGroup(jPanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_oyun_alaniLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(ilkSayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(736, Short.MAX_VALUE)))
        );
        jPanel_oyun_alaniLayout.setVerticalGroup(
            jPanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_oyun_alaniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stopButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yeniOyunButonu, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel_oyun_alaniLayout.createSequentialGroup()
                .addGroup(jPanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_oyun_alaniLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addGroup(jPanel_oyun_alaniLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(esittirresmi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_oyun_alaniLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(islemResmi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel_oyun_alaniLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ikinciSayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_oyun_alaniLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(ilkSayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_oyun_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOyuncuBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_sonuc_tablosu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_sonuc_tablosu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOyuncuBilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_oyun_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_butonuActionPerformed
        if (jTextField_oyuncu_adi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Adınızı Giriniz !");
        } else {
            oyuncuSayisi++;
            jPanel_oyun_alani.setVisible(true);
            jPanel_sonuc_tablosu.setVisible(true);
            panelOyuncuBilgileri.setEnabled(false);
            jTextField_oyuncu_adi.setEnabled(false);
            oyuncuAdi.setText(jTextField_oyuncu_adi.getText());
            esittirresmi.setIcon(esittir);
            jTextField_dogru_sayisi.setText(0 + "");
            jTextField_yanlis_sayisi.setText(0 + "");
            jTextField_gecen_sure.setText(0 + "");
            gecenSure = 0;
            timer.start();
            islem();
            sayilar();
            start_butonu.setEnabled(false);
            stopButonu.setEnabled(true);

        }


    }//GEN-LAST:event_start_butonuActionPerformed
    Icon esittir = new ImageIcon(getClass().getResource("/resimler/ESITTIRRR.jpg"));
    Icon toplama = new ImageIcon(getClass().getResource("/resimler/TOPLAMA.png"));
    Icon carpma = new ImageIcon(getClass().getResource("/resimler/CARPMA.png"));
    Icon bolme = new ImageIcon(getClass().getResource("/resimler/BOLME.png"));
    Icon cikarma = new ImageIcon(getClass().getResource("/resimler/CIKARMA.png"));
    int islemSayisi;

    public void islem() {

        islemSayisi = random.nextInt(3) + 1;

        if (islemSayisi == 1) {
            islemResmi.setIcon(toplama);
        } else if (islemSayisi == 2) {
            islemResmi.setIcon(cikarma);
        } else if (islemSayisi == 3) {
            islemResmi.setIcon(carpma);
        } else if (islemSayisi == 4) {
            islemResmi.setIcon(bolme);
        }

    }

    private void stopButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButonuActionPerformed
        timer.stop();
        ilkSayi1.setText("");
        ikinciSayi1.setText("");
        islemResmi.removeAll();
        esittirresmi.removeAll();
        stopButonu.setEnabled(false);
        oyuncular.add(new Oyuncu(jTextField_oyuncu_adi.getText(), dogruSayisi, yanlısSayisi, (gecenSure / 1000)));


    }//GEN-LAST:event_stopButonuActionPerformed

    private void yeniOyunButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniOyunButonuActionPerformed
        dogruSayisi = 0;
        yanlısSayisi = 0;
        jPanel_oyun_alani.setVisible(false);
        panelOyuncuBilgileri.setEnabled(true);
        jTextField_oyuncu_adi.setEnabled(true);
        jTextField_oyuncu_adi.setText("");
        jTextField_dogru_sayisi.setText(0 + "");
        jTextField_yanlis_sayisi.setText(0 + "");
        jTextField_gecen_sure.setText(0 + "");
        esittirresmi.removeAll();
        islemResmi.removeAll();
        start_butonu.setEnabled(true);
        timer.stop();

    }//GEN-LAST:event_yeniOyunButonuActionPerformed
    int dogruSayisi = 0;
    int yanlısSayisi = 0;
    int ilkSayi;
    int ikinciSayi;

    public void sayilar() {
        ilkSayi = random.nextInt(9) + 1;
        ikinciSayi = random.nextInt(9) + 1;
        ilkSayi1.setText(ilkSayi + "");
        ikinciSayi1.setText(ikinciSayi + "");
    }
    private void nextButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButonuActionPerformed

        int girilenSonuc = Integer.valueOf(sonuc.getText());
        if (islemSayisi == 1) {

            if ((ilkSayi + ikinciSayi) == girilenSonuc) {
                dogruSayisi++;
                jTextField_dogru_sayisi.setText(dogruSayisi + "");
            } else {
                yanlısSayisi++;
                jTextField_yanlis_sayisi.setText(yanlısSayisi + "");
            }
        }

        if (islemSayisi == 2) {
            if ((ilkSayi - ikinciSayi) == girilenSonuc) {
                dogruSayisi++;
                jTextField_dogru_sayisi.setText(dogruSayisi + "");
            } else {
                yanlısSayisi++;
                jTextField_yanlis_sayisi.setText(yanlısSayisi + "");
            }
        }

        if (islemSayisi == 3) {
            if ((ilkSayi * ikinciSayi) == girilenSonuc) {
                dogruSayisi++;
                jTextField_dogru_sayisi.setText(dogruSayisi + "");
            } else {
                yanlısSayisi++;
                jTextField_yanlis_sayisi.setText(yanlısSayisi + "");
            }
        }

        if (islemSayisi == 4) {
            if ((ilkSayi / ikinciSayi) == girilenSonuc) {
                dogruSayisi++;
                jTextField_dogru_sayisi.setText(dogruSayisi + "");
            } else {
                yanlısSayisi++;
                jTextField_yanlis_sayisi.setText(yanlısSayisi + "");
            }
        }
        islem();
        sayilar();
        sonuc.setText("");
    }//GEN-LAST:event_nextButonuActionPerformed

    private void tumSkorlarButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tumSkorlarButonuActionPerformed
        SkorEkrani skorekrani = new SkorEkrani();
        skorekrani.setVisible(true);
    }//GEN-LAST:event_tumSkorlarButonuActionPerformed

    private void sonucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sonucKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_sonucKeyTyped

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
            java.util.logging.Logger.getLogger(OyunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OyunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OyunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OyunEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OyunEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton esittirresmi;
    private javax.swing.JTextField ikinciSayi1;
    private javax.swing.JTextField ilkSayi1;
    private javax.swing.JButton islemResmi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel_oyun_alani;
    private javax.swing.JPanel jPanel_sonuc_tablosu;
    private javax.swing.JTextField jTextField_dogru_sayisi;
    private javax.swing.JTextField jTextField_gecen_sure;
    private javax.swing.JTextField jTextField_oyuncu_adi;
    private javax.swing.JTextField jTextField_yanlis_sayisi;
    private javax.swing.JButton nextButonu;
    private javax.swing.JLabel oyuncuAdi;
    private javax.swing.JPanel panelOyuncuBilgileri;
    private javax.swing.JTextField sonuc;
    private javax.swing.JButton start_butonu;
    private javax.swing.JButton stopButonu;
    private javax.swing.JButton tumSkorlarButonu;
    private javax.swing.JButton yeniOyunButonu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        gecenSure += 1000;
        jTextField_gecen_sure.setText(gecenSure / 1000 + " Saniye");
    }
}
