package configurafacil.presentation;

import configurafacil.test.Stock;
import java.awt.Frame;

/**
 *
 * @author Todos
 */
public class ConsultarStockGUI extends javax.swing.JFrame {

    private Frame frAnterior;
    private Stock stock;
    
    
    
    public ConsultarStockGUI(Frame fr,Stock stock) {
        frAnterior = fr;
        this.stock = stock;
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

        tabBase = new javax.swing.JTabbedPane();
        panelBase = new javax.swing.JPanel();
        labelComponenteB = new javax.swing.JLabel();
        comboBase = new javax.swing.JComboBox<>();
        labelQuantidadeB = new javax.swing.JLabel();
        txtQuanBase = new javax.swing.JTextField();
        panelInterior = new javax.swing.JPanel();
        labelComponenteI = new javax.swing.JLabel();
        labelQuantidadeI = new javax.swing.JLabel();
        txtQuanInt = new javax.swing.JTextField();
        comboInterior = new javax.swing.JComboBox<>();
        panelExterior = new javax.swing.JPanel();
        labelComponenteE = new javax.swing.JLabel();
        labelQuantidadeE = new javax.swing.JLabel();
        txtQuanExt = new javax.swing.JTextField();
        comboExterior = new javax.swing.JComboBox<>();
        imgLogotipo = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Stock");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tabBase.setBackground(new java.awt.Color(43, 39, 51));
        tabBase.setBorder(null);
        tabBase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabBase.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        labelComponenteB.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        labelComponenteB.setText("Componente");

        comboBase.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comboBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha aqui", "Pintura Azul", "Pintura Preta", "Pintura Branca", "Pintura Vermelha", "Motor Diesel", "Motor Gasolina", "Motor Híbrido", "Motor Elétrico" }));
        comboBase.setToolTipText("Escolha o componente desejado");
        comboBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBaseActionPerformed(evt);
            }
        });

        labelQuantidadeB.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        labelQuantidadeB.setText("Quantidade");

        txtQuanBase.setEditable(false);
        txtQuanBase.setToolTipText("Insira a quantidade desejada para este componente.");

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelQuantidadeB)
                    .addComponent(labelComponenteB))
                .addGap(18, 18, 18)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addComponent(txtQuanBase, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addComponent(comboBase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComponenteB)
                    .addComponent(comboBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidadeB)
                    .addComponent(txtQuanBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tabBase.addTab("Base", panelBase);

        labelComponenteI.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelComponenteI.setText("Componente");

        labelQuantidadeI.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelQuantidadeI.setText("Quantidade");

        txtQuanInt.setEditable(false);
        txtQuanInt.setToolTipText("Insira a quantidade desejada para este componente.");

        comboInterior.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        comboInterior.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha aqui", "Estofo Pele Preto", "Estofo Tecido Preto", "Estofo Sport Cinzento", "Estofo Pele Camel", "Luzes Normais Brancas", "Luzes Vermelhas", "Luzes Azuis", "Luzes Personalizáveis", "Frisos em Prata", "Frisos Preto Brilhante", "Frisos Pérola Cromado", "Frisos Liga de Carbono", " " }));
        comboInterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboInteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInteriorLayout = new javax.swing.GroupLayout(panelInterior);
        panelInterior.setLayout(panelInteriorLayout);
        panelInteriorLayout.setHorizontalGroup(
            panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInteriorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelComponenteI)
                    .addComponent(labelQuantidadeI))
                .addGap(18, 18, 18)
                .addGroup(panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInteriorLayout.createSequentialGroup()
                        .addComponent(txtQuanInt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addComponent(comboInterior, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelInteriorLayout.setVerticalGroup(
            panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInteriorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComponenteI)
                    .addComponent(comboInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidadeI)
                    .addComponent(txtQuanInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabBase.addTab("Interior", panelInterior);

        labelComponenteE.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelComponenteE.setText("Componente");

        labelQuantidadeE.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelQuantidadeE.setText("Quantidade");

        txtQuanExt.setEditable(false);
        txtQuanExt.setToolTipText("Insira a quantidade desejada para este componente.");

        comboExterior.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        comboExterior.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha aqui", "Teto de Abrir Automático", "Teto Panorâmico", "Teto Normal", "Teto de Abrir em Tecido", "Jantes Liga-Leve Ferric", "Jantes Normais", "Jantes Bicolores em Preto", "Jantes em Preto", "Pneu Michelin", "Pneu Continental", "Vidro Escurecido", "Vidro Normal", "Pára-Choque Linha Sport", "Pára-Choque Linha Confort", "Pára-Choque Básico" }));
        comboExterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboExteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelExteriorLayout = new javax.swing.GroupLayout(panelExterior);
        panelExterior.setLayout(panelExteriorLayout);
        panelExteriorLayout.setHorizontalGroup(
            panelExteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExteriorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelExteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelComponenteE)
                    .addComponent(labelQuantidadeE))
                .addGap(18, 18, 18)
                .addGroup(panelExteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelExteriorLayout.createSequentialGroup()
                        .addComponent(txtQuanExt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addComponent(comboExterior, 0, 1, Short.MAX_VALUE)))
        );
        panelExteriorLayout.setVerticalGroup(
            panelExteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExteriorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelExteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComponenteE)
                    .addComponent(comboExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelExteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidadeE)
                    .addComponent(txtQuanExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        tabBase.addTab("Exterior", panelExterior);

        imgLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/Logótipo (Admin).png"))); // NOI18N

        labelTitulo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 44, 148));
        labelTitulo.setText("Consulte aqui o stock ");

        btnVoltar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgLogotipo)
                    .addComponent(tabBase, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(167, 167, 167))))
            .addComponent(jSeparator)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(imgLogotipo)
                .addGap(28, 28, 28)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(tabBase, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        frAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void comboBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBaseActionPerformed
        String componente = (String) comboBase.getSelectedItem();
        int quantidade = stock.buscaInfoCompBase(componente);
        txtQuanBase.setText(Integer.toString(quantidade));
    }//GEN-LAST:event_comboBaseActionPerformed

    private void comboExteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboExteriorActionPerformed
        String componente = (String) comboExterior.getSelectedItem();
        int quantidade = stock.buscaInfoCompExt(componente);
        txtQuanExt.setText(Integer.toString(quantidade));
    }//GEN-LAST:event_comboExteriorActionPerformed

    private void comboInteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboInteriorActionPerformed
        String componente = (String) comboInterior.getSelectedItem();
        int quantidade = stock.buscaInfoCompInt(componente);
        txtQuanInt.setText(Integer.toString(quantidade));
    }//GEN-LAST:event_comboInteriorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        frAnterior.setVisible(true);
    }//GEN-LAST:event_formWindowClosing


    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboBase;
    private javax.swing.JComboBox<String> comboExterior;
    private javax.swing.JComboBox<String> comboInterior;
    private javax.swing.JLabel imgLogotipo;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel labelComponenteB;
    private javax.swing.JLabel labelComponenteE;
    private javax.swing.JLabel labelComponenteI;
    private javax.swing.JLabel labelQuantidadeB;
    private javax.swing.JLabel labelQuantidadeE;
    private javax.swing.JLabel labelQuantidadeI;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelExterior;
    private javax.swing.JPanel panelInterior;
    private javax.swing.JTabbedPane tabBase;
    private javax.swing.JTextField txtQuanBase;
    private javax.swing.JTextField txtQuanExt;
    private javax.swing.JTextField txtQuanInt;
    // End of variables declaration//GEN-END:variables
}
