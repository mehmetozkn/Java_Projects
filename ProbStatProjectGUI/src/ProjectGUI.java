
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjectGUI extends javax.swing.JFrame {

    ArrayList<Float> data = new ArrayList<>();
    float mean = 0;
    float median = 0;
    float variance = 0;
    double standartDeviation = 0;
    double standartError = 0;
    double e_alfa_sıfır_nokta_sıfır_bes = 0;
    String confidinceInterval = "";
    double e_alfa_sıfır_nokta_bir = 0;
    double sampleSize = 0;
    float Q1 = 0;
    float Q3 = 0;
    float interquartile = 0;
    String outlier = "";

    public ProjectGUI() {
        initComponents();
        setLocationRelativeTo(null);
        try ( Scanner sc = new Scanner(new FileReader("data.txt"))) {
            while (sc.hasNextLine()) {
                data.add(Float.valueOf(sc.nextLine()));

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProjectGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Float f : data) {
            mean += f; // all data is collected 
        }
        mean = mean / data.size(); // all data divided by the number of data 
        Collections.sort(data); // sorts data from smallest to largest 
        if (data.size() % 2 == 0) {
            median = (data.get(data.size() / 2)) + (data.get(data.size() / 2 + 1)) / 2;
        } else {
            median = data.get((data.size() + 1) / 2);
        }

        for (Float f : data) {
            variance += (f - mean) * (f - mean);
        }
        variance = variance / (data.size() - 1);
        standartDeviation = (Math.pow(variance, 0.5));
        standartError = standartDeviation / (Math.pow(data.size(), 0.5));
        e_alfa_sıfır_nokta_sıfır_bes = (1.96 * standartDeviation) / (Math.pow(data.size(), 0.5));
        confidinceInterval = mean + " - " + e_alfa_sıfır_nokta_sıfır_bes + " < " + mean + " < " + mean + " + " + e_alfa_sıfır_nokta_sıfır_bes;
        e_alfa_sıfır_nokta_bir = (1.645 * standartDeviation) / (Math.pow(data.size(), 0.5));
        sampleSize = Math.pow((1.645 * standartDeviation) / (e_alfa_sıfır_nokta_bir), 2);
        ArrayList<Float> left = new ArrayList<>();
        ArrayList<Float> rigth = new ArrayList<>();
        for (int i = 0; i < data.size() / 2 + 1; i++) {
            left.add(data.get(i));
        }
        for (int i = data.size() / 2 + 2; i < data.size(); i++) {
            rigth.add(data.get(i));
        }
        Q1 = left.get((left.size() + 1) / 2);
        Q3 = rigth.get((rigth.size() + 1) / 2);
        interquartile = Q3 - Q1;

        outlier = "[" + (Q1 - (1.5 * interquartile)) + " , " + (Q3 + (1.5 * interquartile)) + "]";

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_mean = new javax.swing.JTextField();
        btn_mean_calculate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_variance = new javax.swing.JTextField();
        txt_standart_deviation = new javax.swing.JTextField();
        txt_confidince_interval = new javax.swing.JTextField();
        txt_median = new javax.swing.JTextField();
        btn_variance_calculate = new javax.swing.JButton();
        btn_median_calculate = new javax.swing.JButton();
        btn_cfinterval_calculate = new javax.swing.JButton();
        btn_stdeviation_calculate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_standart_error = new javax.swing.JTextField();
        btn_sterror_calculate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_sample_size = new javax.swing.JTextField();
        btn_sample_size_calculate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_outlier = new javax.swing.JTextField();
        btn_outlier_calculate = new javax.swing.JButton();
        btn_all_calculate = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        mitem_histogram = new javax.swing.JMenuItem();
        mitem_boxplot = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(864, 524));
        setMinimumSize(new java.awt.Dimension(864, 524));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mean :");

        txt_mean.setBackground(new java.awt.Color(255, 255, 255));
        txt_mean.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_mean.setForeground(new java.awt.Color(0, 0, 153));
        txt_mean.setEnabled(false);

        btn_mean_calculate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_mean_calculate.setText("Calculate");
        btn_mean_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mean_calculateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Variance :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Median :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Standart Error :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Standart Deviation :");

        txt_variance.setBackground(new java.awt.Color(255, 255, 255));
        txt_variance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_variance.setForeground(new java.awt.Color(0, 0, 153));
        txt_variance.setEnabled(false);

        txt_standart_deviation.setBackground(new java.awt.Color(255, 255, 255));
        txt_standart_deviation.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_standart_deviation.setForeground(new java.awt.Color(0, 0, 153));
        txt_standart_deviation.setEnabled(false);

        txt_confidince_interval.setBackground(new java.awt.Color(255, 255, 255));
        txt_confidince_interval.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_confidince_interval.setForeground(new java.awt.Color(0, 0, 153));
        txt_confidince_interval.setEnabled(false);

        txt_median.setBackground(new java.awt.Color(255, 255, 255));
        txt_median.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_median.setForeground(new java.awt.Color(0, 0, 153));
        txt_median.setEnabled(false);

        btn_variance_calculate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_variance_calculate.setText("Calculate");
        btn_variance_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_variance_calculateActionPerformed(evt);
            }
        });

        btn_median_calculate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_median_calculate.setText("Calculate");
        btn_median_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_median_calculateActionPerformed(evt);
            }
        });

        btn_cfinterval_calculate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_cfinterval_calculate.setText("Calculate");
        btn_cfinterval_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cfinterval_calculateActionPerformed(evt);
            }
        });

        btn_stdeviation_calculate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_stdeviation_calculate.setText("Calculate");
        btn_stdeviation_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stdeviation_calculateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("%95 Confidince Interval :");

        txt_standart_error.setBackground(new java.awt.Color(255, 255, 255));
        txt_standart_error.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_standart_error.setForeground(new java.awt.Color(0, 0, 153));
        txt_standart_error.setEnabled(false);

        btn_sterror_calculate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_sterror_calculate.setText("Calculate");
        btn_sterror_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sterror_calculateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Outlier :");

        txt_sample_size.setBackground(new java.awt.Color(255, 255, 255));
        txt_sample_size.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_sample_size.setForeground(new java.awt.Color(0, 0, 153));
        txt_sample_size.setEnabled(false);

        btn_sample_size_calculate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_sample_size_calculate.setText("Calculate");
        btn_sample_size_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sample_size_calculateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sample Size :");

        txt_outlier.setBackground(new java.awt.Color(255, 255, 255));
        txt_outlier.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_outlier.setForeground(new java.awt.Color(0, 0, 153));
        txt_outlier.setEnabled(false);

        btn_outlier_calculate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_outlier_calculate.setText("Calculate");
        btn_outlier_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_outlier_calculateActionPerformed(evt);
            }
        });

        btn_all_calculate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_all_calculate.setText("ALL CALCULATE");
        btn_all_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_all_calculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(46, 46, 46)
                                .addComponent(txt_standart_deviation, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(115, 115, 115)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_median)
                                    .addComponent(txt_variance)
                                    .addComponent(txt_mean))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_stdeviation_calculate)
                            .addComponent(btn_variance_calculate)
                            .addComponent(btn_median_calculate)
                            .addComponent(btn_mean_calculate)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_outlier)
                            .addComponent(txt_standart_error)
                            .addComponent(txt_sample_size)
                            .addComponent(txt_confidince_interval))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_sterror_calculate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_cfinterval_calculate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_outlier_calculate)
                            .addComponent(btn_sample_size_calculate))))
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(btn_all_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_mean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mean_calculate))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_median, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_median_calculate))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_variance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_variance_calculate)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_standart_deviation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_stdeviation_calculate))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_standart_error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sterror_calculate))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btn_cfinterval_calculate)
                    .addComponent(txt_confidince_interval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sample_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btn_sample_size_calculate))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_outlier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_outlier_calculate)))
                .addGap(18, 18, 18)
                .addComponent(btn_all_calculate)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        menu.setText("Menu");

        mitem_histogram.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitem_histogram.setText("Histogram");
        mitem_histogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_histogramActionPerformed(evt);
            }
        });
        menu.add(mitem_histogram);

        mitem_boxplot.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitem_boxplot.setText("Boxplot");
        mitem_boxplot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_boxplotActionPerformed(evt);
            }
        });
        menu.add(mitem_boxplot);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mean_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mean_calculateActionPerformed
//        for (Float f : data) {
//            mean += f;
//        }
//        mean = mean / data.size();
        txt_mean.setText(mean + "");
    }//GEN-LAST:event_btn_mean_calculateActionPerformed

    private void btn_median_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_median_calculateActionPerformed
//        if (data.size() % 2 == 0) {
//            median = (data.get(data.size() / 2)) + (data.get(data.size() / 2 + 1)) / 2;
//        } else {
//            median = data.get((data.size() + 1) / 2);
//        }
        txt_median.setText(median + "");
    }//GEN-LAST:event_btn_median_calculateActionPerformed

    private void btn_variance_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_variance_calculateActionPerformed
//         for (Float f : data) {
//            variance += (f - mean) * (f - mean);
//        }
//        variance = variance / (data.size() - 1);
        txt_variance.setText(variance + "");
    }//GEN-LAST:event_btn_variance_calculateActionPerformed

    private void btn_stdeviation_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stdeviation_calculateActionPerformed
//        standartDeviation = (Math.pow(variance, 0.5));
//        standartError = standartDeviation / (Math.pow(data.size(), 0.5));
        txt_standart_deviation.setText(standartDeviation + "");

    }//GEN-LAST:event_btn_stdeviation_calculateActionPerformed

    private void btn_cfinterval_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cfinterval_calculateActionPerformed
        //     e_alfa_sıfır_nokta_sıfır_bes = (1.96 * standartDeviation) / (Math.pow(data.size(), 0.5));
        //      confidinceInterval = mean + " - " + e_alfa_sıfır_nokta_sıfır_bes + " < " + mean + " < " + mean + " + " + e_alfa_sıfır_nokta_sıfır_bes;

        txt_confidince_interval.setText(confidinceInterval);
    }//GEN-LAST:event_btn_cfinterval_calculateActionPerformed

    private void btn_sterror_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sterror_calculateActionPerformed
     //  standartError = standartDeviation / (Math.pow(data.size(), 0.5));
        
        txt_standart_error.setText(standartError + "");
    }//GEN-LAST:event_btn_sterror_calculateActionPerformed

    private void btn_sample_size_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sample_size_calculateActionPerformed
    //   e_alfa_sıfır_nokta_bir = (1.645 * standartDeviation) / (Math.pow(data.size(), 0.5));
   //     sampleSize = Math.pow((1.645 * standartDeviation) / (e_alfa_sıfır_nokta_bir), 2);
        
        txt_sample_size.setText((int) sampleSize + "");
    }//GEN-LAST:event_btn_sample_size_calculateActionPerformed

    private void btn_outlier_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_outlier_calculateActionPerformed
//       ArrayList<Float> left = new ArrayList<>();
//        ArrayList<Float> rigth = new ArrayList<>();
//        for (int i = 0; i < data.size() / 2 + 1; i++) {
//            left.add(data.get(i));
//        }
//        for (int i = data.size() / 2 + 2; i < data.size(); i++) {
//            rigth.add(data.get(i));
//        }
//        Q1 = left.get((left.size() + 1) / 2);
//        Q3 = rigth.get((rigth.size() + 1) / 2);
//        interquartile = Q3 - Q1;
//
//        outlier = "[" + (Q1 - (1.5 * interquartile)) + " , " + (Q3 + (1.5 * interquartile)) + "]";
        
        
        txt_outlier.setText(outlier);
    }//GEN-LAST:event_btn_outlier_calculateActionPerformed

    private void btn_all_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_all_calculateActionPerformed
       
        btn_cfinterval_calculate.doClick();
        btn_mean_calculate.doClick();
        btn_median_calculate.doClick();
        btn_outlier_calculate.doClick();
        btn_sample_size_calculate.doClick();
        btn_stdeviation_calculate.doClick();
        btn_sterror_calculate.doClick();
        btn_variance_calculate.doClick();
    }//GEN-LAST:event_btn_all_calculateActionPerformed

    private void mitem_histogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_histogramActionPerformed
        Histogram histogram = new Histogram();
       histogram.setVisible(true);
    }//GEN-LAST:event_mitem_histogramActionPerformed

    private void mitem_boxplotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_boxplotActionPerformed
        Boxplot boxplot =  new Boxplot();
        boxplot.setVisible(true);
    }//GEN-LAST:event_mitem_boxplotActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_all_calculate;
    private javax.swing.JButton btn_cfinterval_calculate;
    private javax.swing.JButton btn_mean_calculate;
    private javax.swing.JButton btn_median_calculate;
    private javax.swing.JButton btn_outlier_calculate;
    private javax.swing.JButton btn_sample_size_calculate;
    private javax.swing.JButton btn_stdeviation_calculate;
    private javax.swing.JButton btn_sterror_calculate;
    private javax.swing.JButton btn_variance_calculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem mitem_boxplot;
    private javax.swing.JMenuItem mitem_histogram;
    private javax.swing.JTextField txt_confidince_interval;
    private javax.swing.JTextField txt_mean;
    private javax.swing.JTextField txt_median;
    private javax.swing.JTextField txt_outlier;
    private javax.swing.JTextField txt_sample_size;
    private javax.swing.JTextField txt_standart_deviation;
    private javax.swing.JTextField txt_standart_error;
    private javax.swing.JTextField txt_variance;
    // End of variables declaration//GEN-END:variables
}
