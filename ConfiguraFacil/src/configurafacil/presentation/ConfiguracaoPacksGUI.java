package configurafacil.presentation;

import configurafacil.business.ConfiguraFacil;
import java.awt.Frame;
/**
 *
 * @author Todos
 */
public class ConfiguracaoPacksGUI extends javax.swing.JFrame {
    private Frame frAnterior;
    private ConfiguraFacil facade;
    
     
    public ConfiguracaoPacksGUI(Frame fr, ConfiguraFacil facade) {
        frAnterior=fr;
        this.facade = facade;
        initComponents();
        predefinicoes();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSeguinte = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        labelTituloFinal = new javax.swing.JLabel();
        imgLogotipo = new javax.swing.JLabel();
        labelTitulo1 = new javax.swing.JLabel();
        boxPacotes = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Escolha do Pacote");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnSeguinte.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnSeguinte.setText("Seguinte");
        btnSeguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguinteActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelTituloFinal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labelTituloFinal.setText("Efetuar Pagamento: Seguinte");

        imgLogotipo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        imgLogotipo.setForeground(new java.awt.Color(28, 91, 122));
        imgLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/Logótipo.png"))); // NOI18N

        labelTitulo1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelTitulo1.setForeground(new java.awt.Color(0, 44, 148));
        labelTitulo1.setText("Escolha um Pacote");

        boxPacotes.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        boxPacotes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NENHUM", "Pacote Sport", "Pacote Comfort", "Pacote Deluxe" }));
        boxPacotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPacotesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo1)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(imgLogotipo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(boxPacotes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTituloFinal)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSeguinte, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(imgLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo1)
                .addGap(18, 18, 18)
                .addComponent(boxPacotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(labelTituloFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnSeguinte))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguinteActionPerformed
        // TODO add your handling code here:
        if (!boxPacotes.getSelectedItem().equals("NENHUM")) {
            EfetuarPagamentoGUI nova = new EfetuarPagamentoGUI(this,facade);
            nova.setVisible(true);
            this.setVisible(false);
        }
        else javax.swing.JOptionPane.showMessageDialog(this, "Escolha um pacote ou volte para trás.", "Pacote Inválido", 0);
       
    }//GEN-LAST:event_btnSeguinteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        frAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void boxPacotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPacotesActionPerformed
        String escolha = (String) boxPacotes.getSelectedItem();
        facade.escolhePacote(escolha);
    }//GEN-LAST:event_boxPacotesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        frAnterior.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void predefinicoes() {
        boxPacotes.setSelectedIndex(0);
    }
         
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPacotes;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSeguinte;
    private javax.swing.JLabel imgLogotipo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JLabel labelTituloFinal;
    // End of variables declaration//GEN-END:variables
}
