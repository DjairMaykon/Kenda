/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.TelasNovo;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Djair Maykon
 */
public class TNovoProducao extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form TNovoPedido
     */
    public TNovoProducao() {
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
        jLCodigoProducao = new javax.swing.JLabel();
        jTFCodigoProducao = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLCodigoPedido = new javax.swing.JLabel();
        jTFCodigoPedido = new javax.swing.JTextField();
        jBProcurarPedido = new javax.swing.JButton();
        jLSituacao = new javax.swing.JLabel();
        jCBSituacao = new javax.swing.JComboBox<>();
        jLData = new javax.swing.JLabel();
        jDCDataDaProducao = new com.toedter.calendar.JDateChooser();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLCodigodaTinta = new javax.swing.JLabel();
        jTFCustoProducao = new javax.swing.JTextField();
        jLCustoProducao = new javax.swing.JLabel();
        jLQtdProducao1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricaoPedido = new javax.swing.JTextArea();
        jBAdicionarTinta = new javax.swing.JButton();
        jBRemoverTinta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTTintasProduzidas = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(57, 93, 117));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLCodigoProducao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoProducao.setLabelFor(jTFCodigoProducao);
        jLCodigoProducao.setText("Código da Produção:");

        jTFCodigoProducao.setEditable(false);
        jTFCodigoProducao.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLCodigoPedido.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoPedido.setLabelFor(jTFCodigoPedido);
        jLCodigoPedido.setText("Código do Pedido:");

        jTFCodigoPedido.setEditable(false);
        jTFCodigoPedido.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jBProcurarPedido.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jBProcurarPedido.setText("...");
        jBProcurarPedido.setBorder(null);

        jLSituacao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLSituacao.setText("Situação:");

        jCBSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em andamento", "Finalizada" }));

        jLData.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLData.setLabelFor(jTFCodigoProducao);
        jLData.setText("Data:");

        jDCDataDaProducao.setEnabled(false);

        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/37.png"))); // NOI18N
        jBSalvar.setText("Salvar");

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete_01.png"))); // NOI18N
        jBCancelar.setText("Cancelar");

        jLCodigodaTinta.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigodaTinta.setLabelFor(jTFCodigoPedido);
        jLCodigodaTinta.setText("Código da Tinta:");

        jTFCustoProducao.setEditable(false);
        jTFCustoProducao.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCustoProducao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCustoProducao.setLabelFor(jTFCodigoProducao);
        jLCustoProducao.setText("Custo:");

        jLQtdProducao1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLQtdProducao1.setLabelFor(jTFCodigoProducao);
        jLQtdProducao1.setText("Descrição:");

        jTADescricaoPedido.setEditable(false);
        jTADescricaoPedido.setColumns(20);
        jTADescricaoPedido.setRows(5);
        jScrollPane1.setViewportView(jTADescricaoPedido);

        jBAdicionarTinta.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jBAdicionarTinta.setText("Adicionar");
        jBAdicionarTinta.setBorder(null);
        jBAdicionarTinta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBRemoverTinta.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jBRemoverTinta.setText("Remover");
        jBRemoverTinta.setBorder(null);
        jBRemoverTinta.setEnabled(false);
        jBRemoverTinta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTTintasProduzidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Custo", "Quantidade"
            }
        ));
        jScrollPane2.setViewportView(jTTintasProduzidas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLSituacao)
                                    .addComponent(jLCodigodaTinta)
                                    .addComponent(jLCodigoPedido)
                                    .addComponent(jLQtdProducao1)
                                    .addComponent(jLData)
                                    .addComponent(jLCustoProducao)
                                    .addComponent(jLCodigoProducao))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFCustoProducao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDCDataDaProducao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCBSituacao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTFCodigoPedido)
                                        .addGap(6, 6, 6)
                                        .addComponent(jBProcurarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTFCodigoProducao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBAdicionarTinta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                        .addComponent(jBRemoverTinta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator1))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jBSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCodigoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoProducao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCDataDaProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCustoProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCustoProducao))
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBProcurarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoPedido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLQtdProducao1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAdicionarTinta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigodaTinta)
                            .addComponent(jBRemoverTinta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSituacao))))
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
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjBCancelar() {
        return jBCancelar;
    }

    public JButton getjBProcurarPedido() {
        return jBProcurarPedido;
    }

    public JButton getjBSalvar() {
        return jBSalvar;
    }

    public JComboBox<String> getjCBSituacao() {
        return jCBSituacao;
    }

    public JDateChooser getjDCDataDaProducao() {
        return jDCDataDaProducao;
    }

    public JTextField getjTFCodigoPedido() {
        return jTFCodigoPedido;
    }

    public JTextField getjTFCodigoProducao() {
        return jTFCodigoProducao;
    }

    public JTextField getjTFCustoProducao() {
        return jTFCustoProducao;
    }

    public JButton getjBAdicionarTinta() {
        return jBAdicionarTinta;
    }

    public JButton getjBRemoverTinta() {
        return jBRemoverTinta;
    }

    public JTextArea getjTADescricaoPedido() {
        return jTADescricaoPedido;
    }

    public JTable getjTTintasProduzidas() {
        return jTTintasProduzidas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionarTinta;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBProcurarPedido;
    private javax.swing.JButton jBRemoverTinta;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCBSituacao;
    private com.toedter.calendar.JDateChooser jDCDataDaProducao;
    private javax.swing.JLabel jLCodigoPedido;
    private javax.swing.JLabel jLCodigoProducao;
    private javax.swing.JLabel jLCodigodaTinta;
    private javax.swing.JLabel jLCustoProducao;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLQtdProducao1;
    private javax.swing.JLabel jLSituacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTADescricaoPedido;
    private javax.swing.JTextField jTFCodigoPedido;
    private javax.swing.JTextField jTFCodigoProducao;
    private javax.swing.JTextField jTFCustoProducao;
    private javax.swing.JTable jTTintasProduzidas;
    // End of variables declaration//GEN-END:variables
}
