
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Main_Screen extends javax.swing.JFrame {

    DefaultTableModel model;
    Personnel_Operations islemler = new Personnel_Operations();
    
    Matcher matcher;

    public Main_Screen() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/M.jpg"))); // JFrame set icon.
        model = (DefaultTableModel) tbl_staff.getModel();
        viewStaff();  // to view information.

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup_menu = new javax.swing.JPopupMenu();
        popup_menu_item_color_chooser = new javax.swing.JMenuItem();
        splitPane = new javax.swing.JSplitPane();
        pnl_main_screen = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        lbl_surname = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_departmant = new javax.swing.JLabel();
        lbl_salary = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_departmant = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        btn_add_staff = new javax.swing.JButton();
        txt_information_bar = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_search_bar = new javax.swing.JTextField();
        btn_staff_delete = new javax.swing.JButton();
        btn_staff_update = new javax.swing.JButton();
        btn_clean = new javax.swing.JButton();
        lbl_id1 = new javax.swing.JLabel();
        lbl_id2 = new javax.swing.JLabel();
        cmbox_checkout = new javax.swing.JComboBox<>();
        cmbox_checkin = new javax.swing.JComboBox<>();
        lbl_image_name = new javax.swing.JLabel();
        lbl_image_surname = new javax.swing.JLabel();
        lbl_image_password = new javax.swing.JLabel();
        lbl_image_departman = new javax.swing.JLabel();
        lbl_image_email = new javax.swing.JLabel();
        lbl_image_salary = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        tbl_staff = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        mitem_exit = new javax.swing.JMenuItem();
        mitem_close_program = new javax.swing.JMenuItem();
        seperator = new javax.swing.JPopupMenu.Separator();
        mitem_extra = new javax.swing.JMenuItem();

        popup_menu_item_color_chooser.setText("Change Background Color ");
        popup_menu_item_color_chooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_menu_item_color_chooserActionPerformed(evt);
            }
        });
        popup_menu.add(popup_menu_item_color_chooser);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main");
        setMaximumSize(new java.awt.Dimension(847, 650));
        setMinimumSize(new java.awt.Dimension(847, 650));
        setPreferredSize(new java.awt.Dimension(847, 650));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        splitPane.setDividerLocation(420);
        splitPane.setDividerSize(2);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        splitPane.setEnabled(false);
        splitPane.setMinimumSize(new java.awt.Dimension(100, 58));

        pnl_main_screen.setBackground(new java.awt.Color(204, 255, 204));
        pnl_main_screen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnl_main_screenMouseReleased(evt);
            }
        });

        lbl_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(0, 0, 255));
        lbl_id.setText("ID :");

        lbl_surname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_surname.setForeground(new java.awt.Color(0, 0, 255));
        lbl_surname.setText("Surname :");

        lbl_password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(0, 0, 255));
        lbl_password.setText("Password :");

        lbl_departmant.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_departmant.setForeground(new java.awt.Color(0, 0, 255));
        lbl_departmant.setText("Departmant :");

        lbl_salary.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_salary.setForeground(new java.awt.Color(0, 0, 255));
        lbl_salary.setText("Salary :");

        txt_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nameKeyReleased(evt);
            }
        });

        txt_departmant.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_departmant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_departmantKeyReleased(evt);
            }
        });

        txt_salary.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_salaryKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_salaryKeyTyped(evt);
            }
        });

        txt_surname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_surname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_surnameKeyReleased(evt);
            }
        });

        lbl_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(0, 0, 255));
        lbl_name.setText("Name :");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(153, 0, 0));

        lbl_email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(0, 0, 255));
        lbl_email.setText("E-Mail :");

        txt_email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_emailKeyReleased(evt);
            }
        });

        btn_add_staff.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_add_staff.setForeground(new java.awt.Color(255, 102, 102));
        btn_add_staff.setText("ADD STAFF");
        btn_add_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_staffActionPerformed(evt);
            }
        });

        txt_information_bar.setEditable(false);
        txt_information_bar.setForeground(new java.awt.Color(255, 0, 0));
        txt_information_bar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Information Bar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 102))); // NOI18N

        txt_password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });

        txt_search_bar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_search_bar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Search Bar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 255, 51))); // NOI18N
        txt_search_bar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_barKeyReleased(evt);
            }
        });

        btn_staff_delete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_staff_delete.setForeground(new java.awt.Color(255, 102, 102));
        btn_staff_delete.setText("DELETE STAFF");
        btn_staff_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staff_deleteActionPerformed(evt);
            }
        });

        btn_staff_update.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_staff_update.setForeground(new java.awt.Color(255, 102, 102));
        btn_staff_update.setText("UPDATE STAFF");
        btn_staff_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staff_updateActionPerformed(evt);
            }
        });

        btn_clean.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_clean.setForeground(new java.awt.Color(255, 102, 102));
        btn_clean.setText("CLEAN");
        btn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanActionPerformed(evt);
            }
        });

        lbl_id1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_id1.setForeground(new java.awt.Color(0, 0, 255));
        lbl_id1.setText("CHECH-OUT TIME :");

        lbl_id2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_id2.setForeground(new java.awt.Color(0, 0, 255));
        lbl_id2.setText("CHECH-IN TIME :");

        cmbox_checkout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbox_checkout.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "24:00" }));

        cmbox_checkin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cmbox_checkin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "24:00" }));

        lbl_image_name.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_image_name.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_image_name.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_image_surname.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_image_surname.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_image_surname.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_image_password.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_image_password.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_image_password.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_image_departman.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_image_departman.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_image_departman.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_image_email.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_image_email.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_image_email.setPreferredSize(new java.awt.Dimension(25, 25));

        lbl_image_salary.setMaximumSize(new java.awt.Dimension(25, 25));
        lbl_image_salary.setMinimumSize(new java.awt.Dimension(25, 25));
        lbl_image_salary.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout pnl_main_screenLayout = new javax.swing.GroupLayout(pnl_main_screen);
        pnl_main_screen.setLayout(pnl_main_screenLayout);
        pnl_main_screenLayout.setHorizontalGroup(
            pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_main_screenLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(txt_information_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(pnl_main_screenLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name)
                    .addComponent(lbl_id)
                    .addComponent(lbl_surname)
                    .addComponent(lbl_email)
                    .addComponent(lbl_password)
                    .addComponent(lbl_departmant)
                    .addComponent(lbl_salary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_main_screenLayout.createSequentialGroup()
                        .addComponent(txt_search_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_main_screenLayout.createSequentialGroup()
                        .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_main_screenLayout.createSequentialGroup()
                                .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_surname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_departmant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_image_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_image_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_image_password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_image_departman, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_image_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_main_screenLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_staff_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_add_staff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_main_screenLayout.createSequentialGroup()
                                                .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(pnl_main_screenLayout.createSequentialGroup()
                                                        .addComponent(lbl_id2)
                                                        .addGap(86, 86, 86))
                                                    .addGroup(pnl_main_screenLayout.createSequentialGroup()
                                                        .addComponent(cmbox_checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(111, 111, 111)))
                                                .addComponent(btn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_main_screenLayout.createSequentialGroup()
                                        .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnl_main_screenLayout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addComponent(lbl_id1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_main_screenLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbox_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(112, 112, 112)))
                                        .addComponent(btn_staff_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnl_main_screenLayout.createSequentialGroup()
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(pnl_main_screenLayout.createSequentialGroup()
                        .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_image_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnl_main_screenLayout.setVerticalGroup(
            pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_main_screenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_information_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_main_screenLayout.createSequentialGroup()
                        .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_main_screenLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_id))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_name)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_image_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4))
                            .addGroup(pnl_main_screenLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btn_clean)))
                        .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_main_screenLayout.createSequentialGroup()
                                .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_surname)
                                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_image_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_email)
                                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_image_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_main_screenLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn_add_staff)))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_password)
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_staff_delete))
                            .addComponent(lbl_image_password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_departmant)
                            .addComponent(txt_departmant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_image_departman, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_main_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_image_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_salary)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(pnl_main_screenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_id2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbox_checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(lbl_id1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbox_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_staff_update)
                        .addGap(37, 37, 37)))
                .addComponent(txt_search_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );

        splitPane.setTopComponent(pnl_main_screen);

        tbl_staff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "SURNAME", "EMAIL", "PASSWORD", "DEPARTMANT", "SALARY", "CHECKIN", "CHECKOUT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_staff.getTableHeader().setReorderingAllowed(false);
        tbl_staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_staffMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(tbl_staff);
        if (tbl_staff.getColumnModel().getColumnCount() > 0) {
            tbl_staff.getColumnModel().getColumn(0).setResizable(false);
            tbl_staff.getColumnModel().getColumn(1).setResizable(false);
            tbl_staff.getColumnModel().getColumn(2).setResizable(false);
            tbl_staff.getColumnModel().getColumn(3).setResizable(false);
            tbl_staff.getColumnModel().getColumn(4).setResizable(false);
            tbl_staff.getColumnModel().getColumn(5).setResizable(false);
            tbl_staff.getColumnModel().getColumn(6).setResizable(false);
        }

        splitPane.setRightComponent(scrollPane);

        getContentPane().add(splitPane);

        menu.setText("Menu");

        mitem_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitem_exit.setText("Exit");
        mitem_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_exitActionPerformed(evt);
            }
        });
        menu.add(mitem_exit);

        mitem_close_program.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitem_close_program.setText("Close Program");
        mitem_close_program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_close_programActionPerformed(evt);
            }
        });
        menu.add(mitem_close_program);
        menu.add(seperator);

        mitem_extra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mitem_extra.setText("Extra Entry Page");
        mitem_extra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitem_extraActionPerformed(evt);
            }
        });
        menu.add(mitem_extra);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_staffActionPerformed
        // replace all method to that there are no gap.
        // trim method to eliminate leading and trailing spaces .
        txt_information_bar.setText("");
        String ad = txt_name.getText().trim();
        String soyad = txt_surname.getText().trim().replaceAll(" ", "");
        String email = txt_email.getText().trim().replaceAll(" ", "");
        String password = new String(txt_password.getPassword()).trim().replaceAll(" ", "");
        String departman = txt_departmant.getText().trim().replaceAll(" ", "");
        String salary = txt_salary.getText();
        String checkin = String.valueOf(cmbox_checkin.getSelectedItem());
        String checkout = String.valueOf(cmbox_checkout.getSelectedItem());

        Matcher matcher1 = Pattern.compile("^[\\s*[a-zA-Z,ç,Ç,ğ,Ğ,ı,İ,ö,Ö,ş,Ş,ü,Ü,\\s]+\\s*]{3,}$").matcher(txt_name.getText().trim().replaceAll(" ", ""));
        Matcher matcher2 = Pattern.compile("^[\\s*[a-zA-Z,ç,Ç,ğ,Ğ,ı,İ,ö,Ö,ş,Ş,ü,Ü,\\s]+\\s*]{3,}$").matcher(txt_surname.getText().trim().replaceAll(" ", ""));
        Matcher matcher3 = Pattern.compile("^\\s*[a-zA-Z,ç,Ç,ğ,Ğ,ı,İ,ö,Ö,ş,Ş,ü,Ü,\\s]+\\s*$").matcher(txt_departmant.getText().trim().replaceAll(" ", ""));
        Matcher matcher4 = Pattern.compile("^[a-zA-Z][\\w\\d]{2,}@(gmail|hotmail|outlook)(.com)$").matcher(txt_email.getText().trim().replaceAll(" ", ""));
        Matcher matcher5 = Pattern.compile("^[a-z\\d]{3,}[\\d]{3,}$").matcher(new String(txt_password.getPassword()).trim().replaceAll(" ", ""));

        String rules = "Name Must Contain at Least 3 Letters only!\nSurname Must Contain at Least 3 Letters only!\n"
                + "Department Must Contain Only Letters!\nEmail Must Be Like ali1@(gmail,hotmail/outlook.com)!\n"
                + "Password Must Contain At Least 3 Letters and Numbers1\nThe Salary Must Be at Least 3 Digits!";

        if (!(matcher1.find()) || !(matcher2.find()) || !(matcher3.find()) || !(matcher4.find()) || !(matcher5.find()) || (txt_salary.getText().trim().length()) < 3) {
            JOptionPane.showMessageDialog(rootPane, rules, "Adding Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (islemler.repeatEmail(email)) {
            System.out.println("eklendi");
            islemler.staffAdd(ad, soyad, email, password, departman, salary, checkin, checkout);
            viewStaff(); // to view personnel after adding.
            txt_information_bar.setText("New Staff Successfully Added.");

        } else {
            JOptionPane.showMessageDialog(rootPane, "There is Already a User With an Email Like This");
        }

    }//GEN-LAST:event_btn_add_staffActionPerformed


    private void txt_search_barKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_barKeyReleased
        // to dynamically search from the staff list.
        String ara = txt_search_bar.getText();
        dinamikAra(ara);
    }//GEN-LAST:event_txt_search_barKeyReleased

    private void btn_staff_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staff_deleteActionPerformed
        // to delete selected personnel
        int selectedRow = tbl_staff.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                txt_information_bar.setText("Staff Table Currently Empty.");
            } else {
                txt_information_bar.setText("Please Select An Staff To Delete.");
            }
        } else {

            int id = (int) model.getValueAt(selectedRow, 0);
            islemler.staffDelete(id);
            viewStaff(); // to view persoonnel after deleting.
            txt_information_bar.setText("Staff Successfully Deleted.");

        }
    }//GEN-LAST:event_btn_staff_deleteActionPerformed

    private void btn_staff_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staff_updateActionPerformed
        // to update selected personnel.
        String name = txt_name.getText();
        String surname = txt_surname.getText();
        String email = txt_email.getText();
        String password = new String(txt_password.getPassword());
        String departmant = txt_departmant.getText();
        String salary = txt_salary.getText();
        String checkin = String.valueOf(cmbox_checkin.getSelectedItem());
        String checkout = String.valueOf(cmbox_checkout.getSelectedItem());

        int selectedRow = tbl_staff.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                txt_information_bar.setText("Staff Table Currently Empty.");
            } else {
                txt_information_bar.setText("Please Select An Staff To Update. ");
            }
        } else {
            int id = (int) model.getValueAt(selectedRow, 0);
            islemler.staffUpdate(id, name, surname, email, password, departmant, salary, checkin, checkout);
            viewStaff(); // to view personnel after updating
            txt_information_bar.setText("Staff Successfully Updated.");

        }

    }//GEN-LAST:event_btn_staff_updateActionPerformed

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
        // clean all input spaces.
        txt_id.setText("");
        txt_name.setText("");
        txt_surname.setText("");
        txt_email.setText("");
        txt_password.setText("");
        txt_departmant.setText("");
        txt_salary.setText("");
        txt_search_bar.setText("");
        txt_information_bar.setText("");
        cmbox_checkin.setSelectedIndex(0);
        cmbox_checkout.setSelectedIndex(0);
        lbl_image_departman.setIcon(null);
        lbl_image_email.setIcon(null);
        lbl_image_name.setIcon(null);
        lbl_image_password.setIcon(null);
        lbl_image_salary.setIcon(null);
        lbl_image_surname.setIcon(null);


    }//GEN-LAST:event_btn_cleanActionPerformed

    private void pnl_main_screenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_main_screenMouseReleased
        if (SwingUtilities.isRightMouseButton(evt)) {
            showPopup(evt);

        }
    }//GEN-LAST:event_pnl_main_screenMouseReleased

    private void popup_menu_item_color_chooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_menu_item_color_chooserActionPerformed
        // to change panel's background color.
        Color color = JColorChooser.showDialog(rootPane, "Pick a Color.", Color.RED);
        pnl_main_screen.setBackground(color);

    }//GEN-LAST:event_popup_menu_item_color_chooserActionPerformed

    private void mitem_close_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_close_programActionPerformed
        // to close program.
        System.exit(0);
    }//GEN-LAST:event_mitem_close_programActionPerformed

    private void mitem_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_exitActionPerformed
        // to exit this jframe.
        Login_Screen ls = new Login_Screen();
        btn_clean.doClick();
        this.setVisible(false);
        ls.setVisible(true);

    }//GEN-LAST:event_mitem_exitActionPerformed

    private void txt_salaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salaryKeyTyped
        // Just input numbers.
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep(); // Beeps when pressing anything other than a number.
            evt.consume();
        }

    }//GEN-LAST:event_txt_salaryKeyTyped

    private void mitem_extraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitem_extraActionPerformed
       
        // to open the extra personnel information pag.
        Admin_Screen ys = new Admin_Screen();
        this.setVisible(false);
        ys.setVisible(true);
    }//GEN-LAST:event_mitem_extraActionPerformed

    private void tbl_staffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_staffMouseClicked
        // to show the information of the personnel selected from the table in the spaces.
        int selectedRow = tbl_staff.getSelectedRow();
        txt_id.setText(model.getValueAt(selectedRow, 0).toString());
        txt_name.setText(model.getValueAt(selectedRow, 1).toString());
        txt_surname.setText(model.getValueAt(selectedRow, 2).toString());
        txt_email.setText(model.getValueAt(selectedRow, 3).toString());
        txt_password.setText(model.getValueAt(selectedRow, 4).toString());
        txt_departmant.setText(model.getValueAt(selectedRow, 5).toString());
        txt_salary.setText(model.getValueAt(selectedRow, 6).toString());

        cmbox_checkin.setSelectedItem(model.getValueAt(selectedRow, 7));
        cmbox_checkout.setSelectedItem(model.getValueAt(selectedRow, 8));
        Icon a = new ImageIcon(getClass().getResource("/images/tik.jpg"));
        lbl_image_name.setIcon(a);
        lbl_image_surname.setIcon(a);
        lbl_image_password.setIcon(a);
        lbl_image_email.setIcon(a);
        lbl_image_salary.setIcon(a);
        lbl_image_departman.setIcon(a);

    }//GEN-LAST:event_tbl_staffMouseClicked

    private void txt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyReleased

        matcher = Pattern.compile("^[\\s*[a-zA-Z,ç,Ç,ğ,Ğ,ı,İ,ö,Ö,ş,Ş,ü,Ü,\\s]+\\s*]{3,}$").matcher(txt_name.getText().trim().replaceAll(" ", ""));
        // to only letter with regex.
        if (matcher.find()) {
            lbl_image_name.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/tik.jpg"));
            lbl_image_name.setIcon(a);
        } else {
            lbl_image_name.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/carpi.png"));
            lbl_image_name.setIcon(a);
        }

    }//GEN-LAST:event_txt_nameKeyReleased

    private void txt_surnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_surnameKeyReleased
        matcher = Pattern.compile("^[\\s*[a-zA-Z,ç,Ç,ğ,Ğ,ı,İ,ö,Ö,ş,Ş,ü,Ü,\\s]+\\s*]{3,}$").matcher(txt_surname.getText().trim().replaceAll(" ", ""));
        // to only letter with regex.
        if (matcher.find()) {
            lbl_image_surname.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/tik.jpg"));
            lbl_image_surname.setIcon(a);
        } else {
            lbl_image_surname.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/carpi.png"));
            lbl_image_surname.setIcon(a);
        }
    }//GEN-LAST:event_txt_surnameKeyReleased

    private void txt_departmantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_departmantKeyReleased
        matcher = Pattern.compile("^\\s*[a-zA-Z,ç,Ç,ğ,Ğ,ı,İ,ö,Ö,ş,Ş,ü,Ü,\\s]+\\s*$").matcher(txt_departmant.getText().trim().replaceAll(" ", ""));
        // to only letter with regex.
        if (matcher.find()) {
            lbl_image_departman.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/tik.jpg"));
            lbl_image_departman.setIcon(a);
        } else {
            lbl_image_departman.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/carpi.png"));
            lbl_image_departman.setIcon(a);
        }
    }//GEN-LAST:event_txt_departmantKeyReleased

    private void txt_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyReleased
        matcher = Pattern.compile("^[a-zA-Z][\\w\\d]{2,}@(gmail|hotmail|outlook)(.com)$").matcher(txt_email.getText().trim().replaceAll(" ", ""));
        // regex to provide the desired mail format.
        if (matcher.find()) {
            lbl_image_email.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/tik.jpg"));
            lbl_image_email.setIcon(a);
        } else {
            lbl_image_email.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/carpi.png"));
            lbl_image_email.setIcon(a);
        }
    }//GEN-LAST:event_txt_emailKeyReleased

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased
        matcher = Pattern.compile("^[a-z\\d]{3,}[\\d]{3,}$").matcher(new String(txt_password.getPassword()).trim().replaceAll(" ", ""));
        // regex to provide the desired password format.
        if (matcher.find()) {
            lbl_image_password.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/tik.jpg"));
            lbl_image_password.setIcon(a);
        } else {
            lbl_image_password.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/carpi.png"));
            lbl_image_password.setIcon(a);
        }
    }//GEN-LAST:event_txt_passwordKeyReleased

    private void txt_salaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salaryKeyReleased
        // so that the salary is not less than 2 digits.
        if (txt_salary.getText().length() > 2) {
            lbl_image_salary.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/tik.jpg"));
            lbl_image_salary.setIcon(a);
        } else {
            lbl_image_salary.setIcon(null);
            Icon a = new ImageIcon(getClass().getResource("/images/carpi.png"));
            lbl_image_salary.setIcon(a);

        }
    }//GEN-LAST:event_txt_salaryKeyReleased

    private void showPopup(MouseEvent evt) {
        // to show popup menu.
        if (evt.isPopupTrigger()) {
            popup_menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    public void dinamikAra(String ara) {
        // To search the table with the desired keyword.
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);

        tbl_staff.setRowSorter(trs);

        trs.setRowFilter(RowFilter.regexFilter(ara));

    }

    public void viewStaff() {
        // for transferring personnel withdrawn from the database to the table 
        model.setRowCount(0);

        ArrayList<Personnel> personeller = new ArrayList<>();

        personeller = islemler.pullPersonnel();

        if (personeller != null) {

            for (Personnel p : personeller) {

                Object[] eklenecek = {p.getId(), p.getAd(), p.getSoyad(), p.getEmail(), p.getPassword(), p.getDepartman(), p.getMaas(), p.getCheckin(), p.getCheckout()};

                model.addRow(eklenecek);

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
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Screen().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_staff;
    private javax.swing.JButton btn_clean;
    private javax.swing.JButton btn_staff_delete;
    private javax.swing.JButton btn_staff_update;
    private javax.swing.JComboBox<String> cmbox_checkin;
    private javax.swing.JComboBox<String> cmbox_checkout;
    private javax.swing.JLabel lbl_departmant;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_id1;
    private javax.swing.JLabel lbl_id2;
    private javax.swing.JLabel lbl_image_departman;
    private javax.swing.JLabel lbl_image_email;
    private javax.swing.JLabel lbl_image_name;
    private javax.swing.JLabel lbl_image_password;
    private javax.swing.JLabel lbl_image_salary;
    private javax.swing.JLabel lbl_image_surname;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_salary;
    private javax.swing.JLabel lbl_surname;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mitem_close_program;
    private javax.swing.JMenuItem mitem_exit;
    private javax.swing.JMenuItem mitem_extra;
    private javax.swing.JPanel pnl_main_screen;
    private javax.swing.JPopupMenu popup_menu;
    private javax.swing.JMenuItem popup_menu_item_color_chooser;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPopupMenu.Separator seperator;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTable tbl_staff;
    private javax.swing.JTextField txt_departmant;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_information_bar;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search_bar;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables

}
