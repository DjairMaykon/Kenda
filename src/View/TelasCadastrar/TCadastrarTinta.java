/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.TelasCadastrar;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Djair Maykon
 */
public class TCadastrarTinta extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form TNovoPedido
     */
    public TCadastrarTinta() {
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

        jPanel1 = new javax.swing.JPanel();
        jLCodigoPedido = new javax.swing.JLabel();
        jTFCodigoTinta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLCodigoOS = new javax.swing.JLabel();
        jTFFuncionalidade = new javax.swing.JTextField();
        jTFCor = new javax.swing.JTextField();
        jLDescricao = new javax.swing.JLabel();
        jBCadastrarTinta = new javax.swing.JButton();
        jBCancelarTinta = new javax.swing.JButton();
        jLCodigoM = new javax.swing.JLabel();
        jBAdicionarMateriaPrima = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMateriasPrimasUtilizadas = new javax.swing.JTable();
        jTFCusto = new javax.swing.JTextField();
        jLDescricao1 = new javax.swing.JLabel();
        jBRemoverMateriaPrima = new javax.swing.JButton();
        jCBMateriasPrimas = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(57, 93, 117));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLCodigoPedido.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoPedido.setLabelFor(jTFCodigoTinta);
        jLCodigoPedido.setText("Código da Tinta:");

        jTFCodigoTinta.setEditable(false);
        jTFCodigoTinta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLCodigoOS.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoOS.setLabelFor(jTFFuncionalidade);
        jLCodigoOS.setText("Funcionalidade:");

        jTFFuncionalidade.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTFFuncionalidade.setNextFocusableComponent(jTFCor);

        jTFCor.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTFCor.setNextFocusableComponent(jBAdicionarMateriaPrima);

        jLDescricao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLDescricao.setText("Cor:");

        jBCadastrarTinta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/37.png"))); // NOI18N
        jBCadastrarTinta.setText("Cadastrar");
        jBCadastrarTinta.setNextFocusableComponent(jBCancelarTinta);

        jBCancelarTinta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete_01.png"))); // NOI18N
        jBCancelarTinta.setText("Cancelar");
        jBCancelarTinta.setNextFocusableComponent(jTFFuncionalidade);

        jLCodigoM.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoM.setLabelFor(jTFCor);
        jLCodigoM.setText("Materias Primas:");

        jBAdicionarMateriaPrima.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jBAdicionarMateriaPrima.setText("Adicionar");
        jBAdicionarMateriaPrima.setBorder(null);
        jBAdicionarMateriaPrima.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAdicionarMateriaPrima.setNextFocusableComponent(jBCadastrarTinta);

        jTMateriasPrimasUtilizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTMateriasPrimasUtilizadas);

        jTFCusto.setEditable(false);
        jTFCusto.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLDescricao1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLDescricao1.setText("Custo:");

        jBRemoverMateriaPrima.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jBRemoverMateriaPrima.setText("Remover");
        jBRemoverMateriaPrima.setBorder(null);
        jBRemoverMateriaPrima.setEnabled(false);
        jBRemoverMateriaPrima.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCodigoM)
                            .addComponent(jLDescricao)
                            .addComponent(jLCodigoOS)
                            .addComponent(jLCodigoPedido)
                            .addComponent(jBAdicionarMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDescricao1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFCusto)
                            .addComponent(jTFCodigoTinta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(jTFFuncionalidade)
                            .addComponent(jTFCor)
                            .addComponent(jBRemoverMateriaPrima, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBMateriasPrimas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCancelarTinta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastrarTinta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBCadastrarTinta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCancelarTinta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCodigoPedido)
                                    .addComponent(jTFCodigoTinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFFuncionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLCodigoOS))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLDescricao)
                                    .addComponent(jTFCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCodigoM)
                            .addComponent(jCBMateriasPrimas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAdicionarMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBRemoverMateriaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDescricao1)
                            .addComponent(jTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjBAdicionarMateriaPrima() {
        return jBAdicionarMateriaPrima;
    }

    public JButton getjBCadastrarTinta() {
        return jBCadastrarTinta;
    }

    public JButton getjBCancelarTinta() {
        return jBCancelarTinta;
    }

    public JButton getjBRemoverMateriaPrima() {
        return jBRemoverMateriaPrima;
    }

    public JComboBox<String> getjCBMateriasPrimas() {
        return jCBMateriasPrimas;
    }

    public JLabel getjLCodigoM() {
        return jLCodigoM;
    }

    public JLabel getjLCodigoOS() {
        return jLCodigoOS;
    }

    public JLabel getjLCodigoPedido() {
        return jLCodigoPedido;
    }

    public JLabel getjLDescricao() {
        return jLDescricao;
    }

    public JLabel getjLDescricao1() {
        return jLDescricao1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public JTextField getjTFCodigoTinta() {
        return jTFCodigoTinta;
    }

    public JTextField getjTFCor() {
        return jTFCor;
    }

    public JTextField getjTFCusto() {
        return jTFCusto;
    }

    public JTextField getjTFFuncionalidade() {
        return jTFFuncionalidade;
    }

    public JTable getjTMateriasPrimasUtilizadas() {
        return jTMateriasPrimasUtilizadas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionarMateriaPrima;
    private javax.swing.JButton jBCadastrarTinta;
    private javax.swing.JButton jBCancelarTinta;
    private javax.swing.JButton jBRemoverMateriaPrima;
    private javax.swing.JComboBox<String> jCBMateriasPrimas;
    private javax.swing.JLabel jLCodigoM;
    private javax.swing.JLabel jLCodigoOS;
    private javax.swing.JLabel jLCodigoPedido;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLDescricao1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFCodigoTinta;
    private javax.swing.JTextField jTFCor;
    private javax.swing.JTextField jTFCusto;
    private javax.swing.JTextField jTFFuncionalidade;
    private javax.swing.JTable jTMateriasPrimasUtilizadas;
    // End of variables declaration//GEN-END:variables
}
