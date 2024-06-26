/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.proyectointegrador.view;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author familiacr
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginGUI
     */
    public LoginGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void listen(ActionListener controller) {
        this.btnLogin.addActionListener(controller);
//        this.btnSignup.addActionListener(controller);
        this.btnExit.addActionListener(controller);
    }

    public static void getMessage(String msj) {
        JOptionPane.showMessageDialog(null, msj);
    }

    public DataLoginPanel getDataLoginPanel() {
        return this.dataLoginPanel;
    }

    public void isLogin() {
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnOpenLogin.png"))); // NOI18N 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        dataLoginPanel = new ucr.ac.cr.proyectointegrador.view.DataLoginPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnExit.png"))); // NOI18N
        btnExit.setActionCommand("Exit");
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusPainted(false);
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 6, -1, 40));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLogin.png"))); // NOI18N
        btnLogin.setActionCommand("Login");
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setFocusPainted(false);
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 540, -1));

        dataLoginPanel.setOpaque(false);
        getContentPane().add(dataLoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 800, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoLogin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1360, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private ucr.ac.cr.proyectointegrador.view.DataLoginPanel dataLoginPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
