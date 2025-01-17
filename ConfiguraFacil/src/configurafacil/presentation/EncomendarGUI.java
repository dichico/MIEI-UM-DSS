package configurafacil.presentation;

import configurafacil.test.Stock;
import java.awt.Frame;

/**
 *
 * @author Todos
 */
public class EncomendarGUI extends javax.swing.JFrame {

    private Frame frAnterior;
    private Stock stock;
    
    
    
    public EncomendarGUI(Frame fr, Stock stock) {
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
        btnComprarB = new javax.swing.JButton();
        panelInterior = new javax.swing.JPanel();
        labelComponenteI = new javax.swing.JLabel();
        labelQuantidadeI = new javax.swing.JLabel();
        txtQuanInt = new javax.swing.JTextField();
        comboInterior = new javax.swing.JComboBox<>();
        btnComprarI = new javax.swing.JButton();
        panelExterior = new javax.swing.JPanel();
        labelComponenteE = new javax.swing.JLabel();
        labelQuantidadeE = new javax.swing.JLabel();
        txtQuanExt = new javax.swing.JTextField();
        comboExterior = new javax.swing.JComboBox<>();
        btnComprarE = new javax.swing.JButton();
        imgLogotipo = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        btnVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerir Stock");
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

        labelQuantidadeB.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        labelQuantidadeB.setText("Quantidade");

        txtQuanBase.setToolTipText("Insira a quantidade desejada para este componente.");

        btnComprarB.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnComprarB.setText("Comprar");
        btnComprarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarBActionPerformed(evt);
            }
        });

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
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtQuanBase, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBase, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComprarB)
                .addGap(123, 123, 123))
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
                .addGap(18, 18, 18)
                .addComponent(btnComprarB)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tabBase.addTab("Base", panelBase);

        labelComponenteI.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelComponenteI.setText("Componente");

        labelQuantidadeI.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelQuantidadeI.setText("Quantidade");

        txtQuanInt.setToolTipText("Insira a quantidade desejada para este componente.");

        comboInterior.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        comboInterior.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha aqui", "Estofo Pele Preto", "Estofo Tecido Preto", "Estofo Sport Cinzento", "Estofo Pele Camel", "Luzes Normais Brancas", "Luzes Vermelhas", "Luzes Azuis", "Luzes Personalizáveis", "Frisos em Prata", "Frisos Preto Brilhante", "Frisos Pérola Cromado", "Frisos Liga de Carbono", " " }));

        btnComprarI.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnComprarI.setText("Comprar");
        btnComprarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarIActionPerformed(evt);
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
                .addGroup(panelInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboInterior, 0, 151, Short.MAX_VALUE)
                    .addComponent(txtQuanInt))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInteriorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComprarI)
                .addGap(123, 123, 123))
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
                .addGap(18, 18, 18)
                .addComponent(btnComprarI)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tabBase.addTab("Interior", panelInterior);

        labelComponenteE.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelComponenteE.setText("Componente");

        labelQuantidadeE.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelQuantidadeE.setText("Quantidade");

        txtQuanExt.setToolTipText("Insira a quantidade desejada para este componente.");

        comboExterior.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        comboExterior.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha aqui", "Teto de Abrir Automático", "Teto Panorâmico", "Teto Normal", "Teto de Abrir em Tecido", "Jantes Liga-Leve Ferric", "Jantes Normais", "Jantes Bicolores em Preto", "Jantes em Preto", "Pneu Michelin", "Pneu Continental", "Vidro Escurecido", "Vidro Normal", "Pára-Choque Linha Sport", "Pára-Choque Linha Confort", "Pára-Choque Básico" }));

        btnComprarE.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnComprarE.setText("Comprar");
        btnComprarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarEActionPerformed(evt);
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
                .addGroup(panelExteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtQuanExt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboExterior, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExteriorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComprarE)
                .addGap(122, 122, 122))
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
                .addGap(18, 18, 18)
                .addComponent(btnComprarE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tabBase.addTab("Exterior", panelExterior);

        imgLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/configurafacil/presentation/Imagens/Logótipo (Admin).png"))); // NOI18N

        labelTitulo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 44, 148));
        labelTitulo.setText("Encomende os seus Componentes");

        btnVoltar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Pintura", "Motor", "Estofos", "Luzes", "Frisos", "Teto", "Jantes", "Pneus", "Vidros", "Pára-Choques"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Despachar Automóvel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(imgLogotipo)))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabBase, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnVoltar)))
                .addGap(193, 193, 193))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(imgLogotipo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(labelTitulo)
                .addGap(34, 34, 34)
                .addComponent(tabBase, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        frAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnComprarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarBActionPerformed
        String compBase = (String) comboBase.getSelectedItem();
        String quanBase = txtQuanBase.getText();
        if (compBase.equals("Escolha aqui") && quanBase.equals(""))
            javax.swing.JOptionPane.showMessageDialog(this, "Escolha o componente e quantidade que deseja encomendar.", "Informações em falta", 0);
        else {
            int quantidade = Integer.parseInt(quanBase);
            stock.encomendaBase(quantidade, compBase);
            javax.swing.JOptionPane.showMessageDialog(this, "Este componente foi encomendado", "Componente Encomendado", 1);
        }     
    }//GEN-LAST:event_btnComprarBActionPerformed

    private void btnComprarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarEActionPerformed
        String compE = (String) comboExterior.getSelectedItem();
        String quanE = txtQuanExt.getText();
        if (compE.equals("Escolha aqui") && quanE.equals(""))
            javax.swing.JOptionPane.showMessageDialog(this, "Escolha o componente e quantidade que deseja encomendar.", "Informações em falta", 0);
        else {
            int quantidade = Integer.parseInt(quanE);
            stock.encomendaExterior(quantidade, compE);
            javax.swing.JOptionPane.showMessageDialog(this, "Este componente foi encomendado", "Componente Encomendado", 1);
        }
    }//GEN-LAST:event_btnComprarEActionPerformed

    private void btnComprarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarIActionPerformed
        String compI = (String) comboInterior.getSelectedItem();
        String quanI = txtQuanInt.getText();
        if (compI.equals("Escolha aqui") && quanI.equals(""))
            javax.swing.JOptionPane.showMessageDialog(this, "Escolha o componente e quantidade que deseja encomendar.", "Informações em falta", 0);
        else {
            int quantidade = Integer.parseInt(quanI);
            stock.encomendaInterior(quantidade, compI);
            javax.swing.JOptionPane.showMessageDialog(this, "Este componente foi encomendado", "Componente Encomendado", 1);
        }
    }//GEN-LAST:event_btnComprarIActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        frAnterior.setVisible(true);
    }//GEN-LAST:event_formWindowClosing


    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarB;
    private javax.swing.JButton btnComprarE;
    private javax.swing.JButton btnComprarI;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboBase;
    private javax.swing.JComboBox<String> comboExterior;
    private javax.swing.JComboBox<String> comboInterior;
    private javax.swing.JLabel imgLogotipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTable jTable2;
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
