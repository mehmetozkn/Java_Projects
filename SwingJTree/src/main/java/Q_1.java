
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Q_1 extends javax.swing.JFrame {

    DefaultTreeModel tree_listModel;

    public Q_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tree_list = new javax.swing.JTree();
        btn_create_reculsively = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(574, 446));
        getContentPane().setLayout(null);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        tree_list.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(tree_list);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 90, 420, 403);

        btn_create_reculsively.setText("Create Reculsively");
        btn_create_reculsively.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_reculsivelyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create_reculsively);
        btn_create_reculsively.setBounds(90, 20, 140, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_create_reculsivelyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_reculsivelyActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showDialog(this.rootPane, "Select");
        createTree(fc.getSelectedFile().getAbsolutePath());

    }//GEN-LAST:event_btn_create_reculsivelyActionPerformed

    public void createTree(String rootPath) {
        File rootFile = new File(rootPath);
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(rootFile.getName());
        tree_listModel = new DefaultTreeModel(rootNode);
        tree_list.setModel(tree_listModel);
        reculsiveWalk(rootPath, rootNode);
    }

    public void reculsiveWalk(String path, DefaultMutableTreeNode node) {
        File file = new File(path);
        DefaultMutableTreeNode nnode = new DefaultMutableTreeNode(file.getName());
        node.add(nnode);
        File[] list = file.listFiles();
        if (list == null) {
            return;
        }

        for (File item : list) {
//            if (item.isDirectory()) {
//                DefaultMutableTreeNode nnode = new DefaultMutableTreeNode(item.getName());
//                node.add(nnode);
//                reculsiveWalk(item.getAbsolutePath(), nnode);
//            } else if (item.isFile()) {
//                DefaultMutableTreeNode nnode = new DefaultMutableTreeNode(item.getName());
//                node.add(nnode);
//            }
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
            java.util.logging.Logger.getLogger(Q_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Q_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Q_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Q_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Q_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create_reculsively;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree tree_list;
    // End of variables declaration//GEN-END:variables
}
