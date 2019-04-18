package configurafacil.presentation;

import configurafacil.test.Stock;
import configurafacil.business.Administrador;
import configurafacil.business.ConfiguraFacil;
import configurafacil.business.Modelo;
import java.io.IOException;

/**
 *
 * @author Todos
 */
public class PrincipalGUI extends javax.swing.JFrame {

    
    private final Administrador admin;
    private static Stock stock;
    private Modelo modelo;
    private ConfiguraFacil facade;

    
    
    public PrincipalGUI() {
        this.admin = new Administrador();
        this.modelo = new Modelo();
        this.facade = new ConfiguraFacil();
        try {
            
            this.stock = stock.carregaEstado("database.bd");
         } catch (IOException | ClassNotFoundException ex) {
            this.stock = new Stock();
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfiguracao = new javax.swing.JButton();
        labelUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelZonaAdministrador = new javax.swing.JLabel();
        JSeparator = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConfiguraFácil");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(400, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnConfiguracao.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnConfiguracao.setForeground(new java.awt.Color(43, 39, 51));
        btnConfiguracao.setText("Solicitar Configuração");
        btnConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracaoActionPerformed(evt);
            }
        });

        labelUser.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        labelUser.setForeground(new java.awt.Color(43, 39, 51));
        labelUser.setText("Username");

        txtUser.setToolTipText("Insira o seu username");

        labelPass.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        labelPass.setForeground(new java.awt.Color(43, 39, 51));
        labelPass.setText("Password");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 91, 122));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/Logótipo.png"))); // NOI18N

        labelZonaAdministrador.setBackground(new java.awt.Color(13, 69, 97));
        labelZonaAdministrador.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelZonaAdministrador.setForeground(new java.awt.Color(0, 44, 148));
        labelZonaAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelZonaAdministrador.setText(" Zona Administrador da Fábrica");

        btnLogin.setBackground(new java.awt.Color(43, 39, 51));
        btnLogin.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPass.setToolTipText("Insira a sua password");

        btnLimpar.setBackground(new java.awt.Color(43, 39, 51));
        btnLimpar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelZonaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUser)
                            .addComponent(labelPass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnConfiguracao)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(JSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnConfiguracao)
                .addGap(23, 23, 23)
                .addComponent(JSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelZonaAdministrador)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPass)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogin)))
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracaoActionPerformed
        ConfigurarModeloGUI nova = new ConfigurarModeloGUI(this,this.facade);
        nova.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnConfiguracaoActionPerformed
    
    @SuppressWarnings("deprecation")
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        if (txtUser.getText().equals(admin.getUserName()) && admin.getPass().equals(txtPass.getText())) {
            AdminGUI nova = new AdminGUI(this, stock);
            nova.setVisible(true);
            this.setVisible(false);
            limparAdminTxt();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "As credenciais encontram-se erradas. Por favor tente de novo.", "Credenciais Erradas", 0);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparAdminTxt();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        try {
            stock.guardaEstado("database.bd");
            } catch (IOException ex) {}  
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        try {
            stock.guardaEstado("database.bd");
            } catch (IOException ex) {}  
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void limparAdminTxt() {
        txtUser.setText("");
        txtPass.setText("");
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator JSeparator;
    private javax.swing.JButton btnConfiguracao;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel labelZonaAdministrador;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
