package configurafacil.presentation;

import configurafacil.business.ExcecaoGeral;
import configurafacil.business.ConfiguraFacil;
import java.awt.Frame;
/**
 *
 * @author Todos
 */
public class ConfigurarBaseGUI extends javax.swing.JFrame {

    private Frame frAnterior;
    private ConfiguraFacil facade;
    
    
    
    public ConfigurarBaseGUI(Frame fr, ConfiguraFacil facade) {
        initComponents();
        this.facade=facade;
        frAnterior=fr;
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
        imgLogotipo = new javax.swing.JLabel();
        labelTitulo1 = new javax.swing.JLabel();
        labelTitulo2 = new javax.swing.JLabel();
        labelTituloFinal = new javax.swing.JLabel();
        imgNota = new javax.swing.JLabel();
        labelTitulo3 = new javax.swing.JLabel();
        btnConfOtima = new javax.swing.JButton();
        imgBola1 = new javax.swing.JLabel();
        imgBola2 = new javax.swing.JLabel();
        boxMotorizacao = new javax.swing.JComboBox<>();
        boxPintura = new javax.swing.JComboBox<>();
        jSeparator = new javax.swing.JSeparator();
        labelTexto2 = new javax.swing.JLabel();
        labelTexto1 = new javax.swing.JLabel();
        labelTexto3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPacotes = new javax.swing.JButton();
        labelTexto4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração Base");
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

        imgLogotipo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        imgLogotipo.setForeground(new java.awt.Color(28, 91, 122));
        imgLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/Logótipo.png"))); // NOI18N

        labelTitulo1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelTitulo1.setForeground(new java.awt.Color(0, 44, 148));
        labelTitulo1.setText("Escolha a sua motorização");

        labelTitulo2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelTitulo2.setForeground(new java.awt.Color(0, 44, 148));
        labelTitulo2.setText("Escolha a sua pintura");

        labelTituloFinal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labelTituloFinal.setText("Configuração do Interior: Seguinte");

        imgNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/ConfigOtima.png"))); // NOI18N

        labelTitulo3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        labelTitulo3.setForeground(new java.awt.Color(82, 178, 108));
        labelTitulo3.setText("Configuramos o resto por SI!");

        btnConfOtima.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnConfOtima.setText("Configuração Ótima");
        btnConfOtima.setEnabled(false);
        btnConfOtima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfOtimaActionPerformed(evt);
            }
        });

        imgBola1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/One.png"))); // NOI18N

        imgBola2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/Two.png"))); // NOI18N

        boxMotorizacao.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        boxMotorizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha aqui", "Motor Diesel - 1.200,00€", "Motor a Gasolina - 1.500,00€", "Motor Híbrido - 2.000,00€", "Motor Elétrico - 3.000,00€" }));
        boxMotorizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMotorizacaoActionPerformed(evt);
            }
        });

        boxPintura.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        boxPintura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pintura Preta - 0,00 €", "Pintura Branca - 0,00 €", "Pintura Azul - 535,00€", "Pintura Vermelha - 535,00 €" }));
        boxPintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPinturaActionPerformed(evt);
            }
        });

        labelTexto2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        labelTexto2.setText("de acordo com o seu orçamento.");

        labelTexto1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        labelTexto1.setText("Uma configuração completamente delineada");

        labelTexto3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelTexto3.setText("Pretende configurar manualmente? ");

        btnPacotes.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnPacotes.setText("Pacotes");
        btnPacotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacotesActionPerformed(evt);
            }
        });

        labelTexto4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        labelTexto4.setText("Pretende configurar apenas com o pacote? ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgLogotipo)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgBola1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTitulo1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(boxMotorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgBola2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(boxPintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imgNota)
                        .addGap(148, 148, 148))
                    .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeguinte))
                    .addComponent(labelTituloFinal))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTexto2)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTexto1))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnConfOtima)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPacotes)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTexto4)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTexto3)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(imgLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgBola1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelTitulo1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxMotorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgBola2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelTitulo2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxPintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo3)
                .addGap(18, 18, 18)
                .addComponent(labelTexto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTexto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imgNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfOtima)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTexto4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPacotes)
                .addGap(18, 18, 18)
                .addComponent(labelTexto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTituloFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSeguinte))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxPinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPinturaActionPerformed
        // TODO add your handling code here:
        String escolha = (String) boxPintura.getSelectedItem();
        facade.escolhePintura(escolha);
        
    }//GEN-LAST:event_boxPinturaActionPerformed

    private void btnSeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguinteActionPerformed
        // TODO add your handling code here:
        String escolha = (String) boxMotorizacao.getSelectedItem();
        if(escolha.contains("Escolha")) javax.swing.JOptionPane.showMessageDialog(this, "Escolha uma motorização para a sua configuração.", "Motorização Inválida", 0);
        else{
            ConfigurarInteriorGUI nova = new ConfigurarInteriorGUI(this, facade);
            nova.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSeguinteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        frAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfOtimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfOtimaActionPerformed
        // TODO add your handling code here:
      /*  ConfiguracaoOtimaGUI nova = new ConfiguracaoOtimaGUI(this,bd);
        nova.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_btnConfOtimaActionPerformed

    private void boxMotorizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMotorizacaoActionPerformed
        String escolha = (String) boxMotorizacao.getSelectedItem();
        try {
            facade.escolheMotorizacao(escolha);
        } catch (ExcecaoGeral e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Motorização Inválida", 0);
            boxMotorizacao.setSelectedIndex(e.getIndex());
        }
        
        
    }//GEN-LAST:event_boxMotorizacaoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        frAnterior.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnPacotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacotesActionPerformed
        // TODO add your handling code here:
        String escolha = (String) boxMotorizacao.getSelectedItem();
        if(escolha.contains("Escolha")) javax.swing.JOptionPane.showMessageDialog(this, "Escolha uma motorização para a sua configuração.", "Motorização Inválida", 0);
        else {
            ConfiguracaoPacksGUI nova = new ConfiguracaoPacksGUI(this, facade);
            nova.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnPacotesActionPerformed

   private void predefinicoes() {
       boxPintura.setSelectedIndex(0);
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxMotorizacao;
    private javax.swing.JComboBox<String> boxPintura;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfOtima;
    private javax.swing.JButton btnPacotes;
    private javax.swing.JButton btnSeguinte;
    private javax.swing.JLabel imgBola1;
    private javax.swing.JLabel imgBola2;
    private javax.swing.JLabel imgLogotipo;
    private javax.swing.JLabel imgNota;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTexto1;
    private javax.swing.JLabel labelTexto2;
    private javax.swing.JLabel labelTexto3;
    private javax.swing.JLabel labelTexto4;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JLabel labelTitulo3;
    private javax.swing.JLabel labelTituloFinal;
    // End of variables declaration//GEN-END:variables
}
