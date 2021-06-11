
import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admin_Screen extends javax.swing.JFrame {

    Personnel_Operations islemler = new Personnel_Operations();
    DefaultListModel dosyaModel = new DefaultListModel();
    DefaultListModel model = new DefaultListModel();
    DefaultTableModel modelTable;
    FileWriter writer = null;

    public Admin_Screen() {
        initComponents();
        setLocationRelativeTo(null);
        islemler.pullPersonnel();// pulls personnel information from database.
        islemler.pullData();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/A.jpg"))); // JFrame set icon.
        list_permissions.setModel(model);
        modelTable = (DefaultTableModel) tbl_extra.getModel();
        viewExtraInformation();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        split_pane = new javax.swing.JSplitPane();
        pnl_main = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_permissions = new javax.swing.JList<>();
        btn_open_file = new javax.swing.JButton();
        chcbox_izin_ver = new javax.swing.JCheckBox();
        chcbox_izin_verme = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btn_change_color = new javax.swing.JButton();
        btn_late = new javax.swing.JButton();
        btn_ok_permission = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_id_late = new javax.swing.JTextField();
        scroll_pane = new javax.swing.JScrollPane();
        tbl_extra = new javax.swing.JTable();
        menu_bar = new javax.swing.JMenuBar();
        menu_change_bar = new javax.swing.JMenu();
        mitem_rdbtn_open = new javax.swing.JRadioButtonMenuItem();
        mitem_exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        split_pane.setDividerLocation(280);
        split_pane.setDividerSize(5);
        split_pane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        pnl_main.setBackground(new java.awt.Color(255, 255, 255));

        list_permissions.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        list_permissions.setForeground(new java.awt.Color(0, 0, 204));
        jScrollPane1.setViewportView(list_permissions);

        btn_open_file.setText("OPEN FILE");
        btn_open_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_open_fileActionPerformed(evt);
            }
        });

        buttonGroup1.add(chcbox_izin_ver);
        chcbox_izin_ver.setText("To Let");

        buttonGroup1.add(chcbox_izin_verme);
        chcbox_izin_verme.setText("Not To Allow");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Permission");

        btn_change_color.setText("CHANGE COLOR");
        btn_change_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_change_colorActionPerformed(evt);
            }
        });

        btn_late.setText("LATE");
        btn_late.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lateActionPerformed(evt);
            }
        });

        btn_ok_permission.setText("OK");
        btn_ok_permission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ok_permissionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("ID :");

        txt_id_late.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_id_lateKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_open_file, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(btn_change_color, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mainLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mainLayout.createSequentialGroup()
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chcbox_izin_verme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chcbox_izin_ver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_mainLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btn_ok_permission, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_mainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_mainLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btn_late, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnl_mainLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_id_late, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_open_file)
                    .addComponent(btn_change_color))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(chcbox_izin_ver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chcbox_izin_verme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ok_permission)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_id_late, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_late)
                        .addGap(28, 28, 28))))
        );

        split_pane.setTopComponent(pnl_main);

        tbl_extra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "LATEDAY", "PERMISSIONDAY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_extra.getTableHeader().setReorderingAllowed(false);
        scroll_pane.setViewportView(tbl_extra);
        if (tbl_extra.getColumnModel().getColumnCount() > 0) {
            tbl_extra.getColumnModel().getColumn(0).setResizable(false);
            tbl_extra.getColumnModel().getColumn(1).setResizable(false);
            tbl_extra.getColumnModel().getColumn(2).setResizable(false);
        }

        split_pane.setRightComponent(scroll_pane);

        getContentPane().add(split_pane);

        menu_change_bar.setText("Menu");

        mitem_rdbtn_open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitem_rdbtn_open.setSelected(true);
        mitem_rdbtn_open.setText("Open Permission History");
        mitem_rdbtn_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_rdbtn_openActionPerformed(evt);
            }
        });
        menu_change_bar.add(mitem_rdbtn_open);

        mitem_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitem_exit.setText("Exit");
        mitem_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_exitActionPerformed(evt);
            }
        });
        menu_change_bar.add(mitem_exit);

        menu_bar.add(menu_change_bar);

        setJMenuBar(menu_bar);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void viewExtraInformation() {
        // Transfer the data from the extra table to the table 

        modelTable.setRowCount(0);

        ArrayList<Personnel> personeller = new ArrayList<>();

        personeller = islemler.pullExtra(); // pulls data from arrayliste database 

        if (personeller != null) { // checks that the list is empty 

            for (Personnel p : personeller) {

                Object[] eklenecek = {p.getId(), p.getLateday(), p.getPer()};

                modelTable.addRow(eklenecek); // adds the information to be added to the table in the row of the model.

            }
        }

    }


    private void btn_open_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_open_fileActionPerformed
        // Open the file in which the personnel requesting permission are written 

        model.clear(); // Clears the model i.e. jlist.
        JFileChooser fc = new JFileChooser();
        int i = fc.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String icerik = "";

            try ( Scanner sc = new Scanner(new BufferedReader(new FileReader(file)))) {
                while (sc.hasNextLine()) { // navigates through the lines of the file.
                    icerik = sc.nextLine() + "\n";
                    model.addElement(icerik);

                }

            } catch (FileNotFoundException ex) {

            }

        }
    }//GEN-LAST:event_btn_open_fileActionPerformed

    private void btn_change_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_change_colorActionPerformed
        // Change the color of the text.
        Color color = JColorChooser.showDialog(this, "Pick a Color.", Color.RED);
        list_permissions.setForeground(color);
    }//GEN-LAST:event_btn_change_colorActionPerformed

    private void btn_lateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lateActionPerformed
        // Register staff who are late for work in the database 
        if (txt_id_late.getText().isEmpty()) { // check to avoid error 
            return;
        }
        boolean varMi = false;
        int id = Integer.valueOf(txt_id_late.getText().trim());
        
        for (Personnel personel : islemler.getPersoneller()) {
            if (personel.getId() == id) {
                personel.setLateday(personel.getLateday() + 1); // increases the number of days when staff arrives late by 1.
                
                islemler.addExtraInformation(id, personel.getLateday(), personel.getPer());
                viewExtraInformation(); // to show the added information again 
                varMi = true;
                return;
            }
        }
        if (!varMi) {
            JOptionPane.showMessageDialog(rootPane, "No User With Such an Id", "Not Found Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_lateActionPerformed

    private void txt_id_lateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_id_lateKeyTyped
        // Just input numbers.
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep(); // Beeps when pressing anything other than a number.
            evt.consume();
        }

    }//GEN-LAST:event_txt_id_lateKeyTyped

    private void btn_ok_permissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ok_permissionActionPerformed
        // Record permitted personnel to the database.

        String selectedLine = list_permissions.getSelectedValue();
        if (selectedLine == null) { // Check to avoid error.
            return;
        }

        if (model.get(0).toString().charAt(0) == 'T') {
            return;
        }

        String[] satir = selectedLine.split("-"); // is divided into two by line - 
        String[] baslangicTarihiAyir = satir[0].split(" "); // separates the first element into spaces.
        String baslangicTarihi = baslangicTarihiAyir[baslangicTarihiAyir.length - 1]; // takes start date.
        String[] baslangic = baslangicTarihi.split("/");// reserves start date 
        int baslangicGun = Integer.valueOf(baslangic[0]); // start day.
        int baslangicAy = Integer.valueOf(baslangic[1]); // start month.
        String[] bitis = satir[1].trim().split("/"); //  reserves finish date 
        int bitisGun = Integer.valueOf(bitis[0]); // finish day.
        int bitisAy = Integer.valueOf(bitis[1]); // finish month.

        int day = (bitisAy - baslangicAy) * 30 + bitisGun - baslangicGun; // day difference between two dates.

        String[] idBelirle = selectedLine.split(" "); // pulls the personel's id.
        int id = Integer.valueOf(idBelirle[2]);

        try {
            File file = new File("izin_kayit.txt");
            writer = new FileWriter((file), true);
        } catch (IOException ex) {
            Logger.getLogger(Admin_Screen.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Personnel personel : islemler.getPersoneller()) {
            if (personel.getId() == id) {
                if (chcbox_izin_ver.isSelected()) {
                    personel.setPer(personel.getPer() + day); // increases the number of days off of the staff as much as the day off. 
                    islemler.addExtraInformation(id, personel.getLateday(), personel.getPer());
                    viewExtraInformation();
                    try {
                        String yazi = "The leave of the Persoonel with " + id + " Id was accepted between " + baslangicTarihi + " and " + satir[1].trim() + ".";
                        writer.write(yazi + "\n");
                        writer.flush();
                        //  writer.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Admin_Screen.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (chcbox_izin_verme.isSelected()) {
                    try {

                        String yazi = "The leave of the personnel with " + id + " Id between " + baslangicTarihi + " and " + satir[1].trim() + " was not accepted.";
                        writer.write(yazi + "\n");
                        writer.flush();
                        // writer.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Admin_Screen.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        }

    }//GEN-LAST:event_btn_ok_permissionActionPerformed

    private void mitem_rdbtn_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_rdbtn_openActionPerformed
        //Transfers the information in the permission log file to the list.
        if (mitem_rdbtn_open.isSelected()) {
            String icerik = "";
            try ( Scanner sc = new Scanner(new BufferedReader(new FileReader("izin_kayit.txt")))) {
                while (sc.hasNextLine()) {
                    icerik = sc.nextLine() + "\n";
                    model.addElement(icerik);

                }

            } catch (FileNotFoundException ex) {

            }
        } else {
            model.clear(); // cleans the model.

        }
    }//GEN-LAST:event_mitem_rdbtn_openActionPerformed

    private void mitem_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_exitActionPerformed
        // Exits from the admin page and redirects to the login page.
        this.setVisible(false);
        Login_Screen ls = new Login_Screen();
        ls.setVisible(true);
    }//GEN-LAST:event_mitem_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_change_color;
    private javax.swing.JButton btn_late;
    private javax.swing.JButton btn_ok_permission;
    private javax.swing.JButton btn_open_file;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chcbox_izin_ver;
    private javax.swing.JCheckBox chcbox_izin_verme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list_permissions;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JMenu menu_change_bar;
    private javax.swing.JMenuItem mitem_exit;
    private javax.swing.JRadioButtonMenuItem mitem_rdbtn_open;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JScrollPane scroll_pane;
    private javax.swing.JSplitPane split_pane;
    private javax.swing.JTable tbl_extra;
    private javax.swing.JTextField txt_id_late;
    // End of variables declaration//GEN-END:variables
}
