package configurafacil.presentation;

import configurafacil.business.ConfiguraFacil;
import java.awt.Frame;

/**
 *
 * @author Todos
 */
public class ConfigurarModeloGUI extends javax.swing.JFrame {

    
    private Frame frAnterior;
    private ConfiguraFacil facade;
    
    
    
    public ConfigurarModeloGUI(Frame fr, ConfiguraFacil facade) {
        frAnterior = fr;
        this.facade = facade;
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

        btnSeguinte = new javax.swing.JButton();
        labelTextoInferior = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        imgLogotipo = new javax.swing.JLabel();
        btnCarrinha = new javax.swing.JRadioButton();
        btnCitadino = new javax.swing.JRadioButton();
        btnJipe = new javax.swing.JRadioButton();
        btnDesportivo = new javax.swing.JRadioButton();
        jSeparator = new javax.swing.JSeparator();
        labelTitulo = new javax.swing.JLabel();
        imgCitadino = new javax.swing.JLabel();
        imgCarrinha = new javax.swing.JLabel();
        imgDesportivo = new javax.swing.JLabel();
        imgJipe = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Escolha do Modelo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnSeguinte.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnSeguinte.setText("Seguinte");
        btnSeguinte.setEnabled(false);
        btnSeguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguinteActionPerformed(evt);
            }
        });

        labelTextoInferior.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labelTextoInferior.setText("Configuração da Base: Seguinte");

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

        btnCarrinha.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnCarrinha.setText("Carrinha");
        btnCarrinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhaActionPerformed(evt);
            }
        });

        btnCitadino.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnCitadino.setText("Citadino");
        btnCitadino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitadinoActionPerformed(evt);
            }
        });

        btnJipe.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnJipe.setText("Jipe");
        btnJipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJipeActionPerformed(evt);
            }
        });

        btnDesportivo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDesportivo.setText("Desportivo");
        btnDesportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesportivoActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 44, 148));
        labelTitulo.setText("Escolha o seu modelo");

        imgCitadino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/Coupé.png"))); // NOI18N

        imgCarrinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/Desportivo.png"))); // NOI18N

        imgDesportivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/Carrinha.png"))); // NOI18N

        imgJipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/Jipe.png"))); // NOI18N

        jToggleButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jToggleButton1.setText("Limpar seleção");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("35.559,00€");

        jLabel2.setText("29.658,00€");

        jLabel3.setText("75.535,00€");

        jLabel4.setText("40.899,00€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(imgLogotipo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(labelTitulo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(imgCitadino)
                                    .addGap(18, 18, 18)
                                    .addComponent(imgCarrinha)
                                    .addGap(18, 18, 18)
                                    .addComponent(imgDesportivo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgJipe))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnCitadino)
                                        .addComponent(jLabel2))
                                    .addGap(17, 17, 17)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(jLabel3))
                                        .addComponent(btnDesportivo))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCarrinha)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(10, 10, 10)))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnJipe)
                                        .addComponent(jLabel4)))))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTextoInferior)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSeguinte)
                                .addGap(34, 34, 34)))
                        .addGap(109, 109, 109))))
            .addComponent(jSeparator)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(imgLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgCitadino)
                    .addComponent(imgCarrinha)
                    .addComponent(imgDesportivo)
                    .addComponent(imgJipe))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesportivo)
                    .addComponent(btnCitadino)
                    .addComponent(btnCarrinha)
                    .addComponent(btnJipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(labelTextoInferior)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSeguinte))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarrinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhaActionPerformed
        facade.escolhaTipo("Carrinha");
        btnCitadino.setEnabled(false);
        btnDesportivo.setEnabled(false);
        btnJipe.setEnabled(false);
        btnSeguinte.setEnabled(true);
        facade.escolhaPrecoBase(35559);
    }//GEN-LAST:event_btnCarrinhaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDesportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesportivoActionPerformed
        facade.escolhaTipo("Desportivo");
        btnCitadino.setEnabled(false);
        btnCarrinha.setEnabled(false);
        btnJipe.setEnabled(false);
        btnSeguinte.setEnabled(true);
        facade.escolhaPrecoBase(75535);
    }//GEN-LAST:event_btnDesportivoActionPerformed

    private void btnSeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguinteActionPerformed
        ConfigurarBaseGUI nova = new ConfigurarBaseGUI(this,this.facade);
        nova.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSeguinteActionPerformed

    private void btnCitadinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitadinoActionPerformed
        facade.escolhaTipo("Citadino");
        btnCarrinha.setEnabled(false);
        btnDesportivo.setEnabled(false);
        btnJipe.setEnabled(false);
        btnSeguinte.setEnabled(true);
        facade.escolhaPrecoBase(29658);
    }//GEN-LAST:event_btnCitadinoActionPerformed

    private void btnJipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJipeActionPerformed
        facade.escolhaTipo("Jipe");
        btnCitadino.setEnabled(false);
        btnDesportivo.setEnabled(false);
        btnCarrinha.setEnabled(false);
        btnSeguinte.setEnabled(true);
        facade.escolhaPrecoBase(40899);
    }//GEN-LAST:event_btnJipeActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        btnCitadino.setSelected(false);
        btnDesportivo.setSelected(false);
        btnCarrinha.setSelected(false);
        btnJipe.setSelected(false);
        btnCitadino.setEnabled(true);
        btnDesportivo.setEnabled(true);
        btnCarrinha.setEnabled(true);
        btnJipe.setEnabled(true);
        btnSeguinte.setEnabled(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        frAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnCarrinha;
    private javax.swing.JRadioButton btnCitadino;
    private javax.swing.JRadioButton btnDesportivo;
    private javax.swing.JRadioButton btnJipe;
    private javax.swing.JButton btnSeguinte;
    private javax.swing.JLabel imgCarrinha;
    private javax.swing.JLabel imgCitadino;
    private javax.swing.JLabel imgDesportivo;
    private javax.swing.JLabel imgJipe;
    private javax.swing.JLabel imgLogotipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelTextoInferior;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}