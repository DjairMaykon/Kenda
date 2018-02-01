/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Listar.Vizualizar;

import View.TelasNovo.*;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Djair Maykon
 */
public class TVizualizarExpedicao extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form TNovoPedido
     */
    public TVizualizarExpedicao() {
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
        jLCodigoExpedicao = new javax.swing.JLabel();
        jTFCodigoExpedicao = new javax.swing.JTextField();
        jLCodigoExpedicao1 = new javax.swing.JLabel();
        jLCodigoExpedicao2 = new javax.swing.JLabel();
        jTFCusto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jBEditarExpedicao = new javax.swing.JButton();
        jBRemoverExpedicao = new javax.swing.JButton();
        jDCDataDeSaida = new com.toedter.calendar.JDateChooser();
        jLCodigoOS = new javax.swing.JLabel();
        jLCodigoOS1 = new javax.swing.JLabel();
        jLCodigoOS2 = new javax.swing.JLabel();
        jDCDataDeEntrega = new com.toedter.calendar.JDateChooser();
        jCBSituacao = new javax.swing.JComboBox<>();
        jLSituacao = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescricao = new javax.swing.JTextArea();
        jTFCodigoPedido = new javax.swing.JTextField();
        jBProcurarPedido = new javax.swing.JButton();
        jTFCodigoTransportadora = new javax.swing.JTextField();
        jBProcurarTransportadora = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(57, 93, 117));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLCodigoExpedicao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoExpedicao.setText("Codigo da Expedição:");

        jTFCodigoExpedicao.setEditable(false);
        jTFCodigoExpedicao.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCodigoExpedicao1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoExpedicao1.setText("Custo:");

        jLCodigoExpedicao2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoExpedicao2.setText("Data de saída:");

        jTFCusto.setEditable(false);
        jTFCusto.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jBEditarExpedicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/config.png"))); // NOI18N
        jBEditarExpedicao.setText("Editar");

        jBRemoverExpedicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete_01.png"))); // NOI18N
        jBRemoverExpedicao.setText("Remover");

        jDCDataDeSaida.setEnabled(false);

        jLCodigoOS.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoOS.setText("Código do Pedido:");

        jLCodigoOS1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoOS1.setText("Código da Transportadora:");

        jLCodigoOS2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoOS2.setText("Data de entrega:");

        jDCDataDeEntrega.setEnabled(false);

        jCBSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em andamento", "Finalizada" }));
        jCBSituacao.setEnabled(false);

        jLSituacao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLSituacao.setText("Situação:");

        jLDescricao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLDescricao.setText("Descrição:");

        jScrollPane1.setMaximumSize(new java.awt.Dimension(164, 94));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(164, 94));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(164, 94));

        jTADescricao.setEditable(false);
        jTADescricao.setColumns(20);
        jTADescricao.setRows(5);
        jScrollPane1.setViewportView(jTADescricao);

        jTFCodigoPedido.setEditable(false);
        jTFCodigoPedido.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jBProcurarPedido.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jBProcurarPedido.setText("...");
        jBProcurarPedido.setBorder(null);
        jBProcurarPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTFCodigoTransportadora.setEditable(false);
        jTFCodigoTransportadora.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jBProcurarTransportadora.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jBProcurarTransportadora.setText("...");
        jBProcurarTransportadora.setBorder(null);
        jBProcurarTransportadora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCodigoExpedicao)
                            .addComponent(jLCodigoExpedicao1)
                            .addComponent(jLCodigoOS)
                            .addComponent(jLCodigoOS1)
                            .addComponent(jLDescricao)
                            .addComponent(jLSituacao)
                            .addComponent(jLCodigoExpedicao2)
                            .addComponent(jLCodigoOS2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCBSituacao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDCDataDeEntrega, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTFCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jBProcurarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTFCodigoTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jBProcurarTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDCDataDeSaida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(jTFCodigoExpedicao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFCusto)))))
                    .addComponent(jSeparator1))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBEditarExpedicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBRemoverExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBEditarExpedicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRemoverExpedicao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCodigoExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoExpedicao))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCDataDeSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoExpedicao2))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoExpedicao1))
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBProcurarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFCodigoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLCodigoOS)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCodigoTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBProcurarTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoOS1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCDataDeEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoOS2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    public JButton getjBEditarExpedicao() {
        return jBEditarExpedicao;
    }

    public JButton getjBProcurarPedido() {
        return jBProcurarPedido;
    }

    public JButton getjBProcurarTransportadora() {
        return jBProcurarTransportadora;
    }

    public JButton getjBRemoverExpedicao() {
        return jBRemoverExpedicao;
    }

    public JComboBox<String> getjCBSituacao() {
        return jCBSituacao;
    }

    public JDateChooser getjDCDataDeEntrega() {
        return jDCDataDeEntrega;
    }

    public JDateChooser getjDCDataDeSaida() {
        return jDCDataDeSaida;
    }

    public JLabel getjLCodigoExpedicao() {
        return jLCodigoExpedicao;
    }

    public JLabel getjLCodigoExpedicao1() {
        return jLCodigoExpedicao1;
    }

    public JLabel getjLCodigoExpedicao2() {
        return jLCodigoExpedicao2;
    }

    public JLabel getjLCodigoOS() {
        return jLCodigoOS;
    }

    public JLabel getjLCodigoOS1() {
        return jLCodigoOS1;
    }

    public JLabel getjLCodigoOS2() {
        return jLCodigoOS2;
    }

    public JLabel getjLDescricao() {
        return jLDescricao;
    }

    public JLabel getjLSituacao() {
        return jLSituacao;
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

    public JTextArea getjTADescricao() {
        return jTADescricao;
    }

    public JTextField getjTFCodigoExpedicao() {
        return jTFCodigoExpedicao;
    }

    public JTextField getjTFCodigoPedido() {
        return jTFCodigoPedido;
    }

    public JTextField getjTFCodigoTransportadora() {
        return jTFCodigoTransportadora;
    }

    public JTextField getjTFCusto() {
        return jTFCusto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditarExpedicao;
    private javax.swing.JButton jBProcurarPedido;
    private javax.swing.JButton jBProcurarTransportadora;
    private javax.swing.JButton jBRemoverExpedicao;
    private javax.swing.JComboBox<String> jCBSituacao;
    private com.toedter.calendar.JDateChooser jDCDataDeEntrega;
    private com.toedter.calendar.JDateChooser jDCDataDeSaida;
    private javax.swing.JLabel jLCodigoExpedicao;
    private javax.swing.JLabel jLCodigoExpedicao1;
    private javax.swing.JLabel jLCodigoExpedicao2;
    private javax.swing.JLabel jLCodigoOS;
    private javax.swing.JLabel jLCodigoOS1;
    private javax.swing.JLabel jLCodigoOS2;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLSituacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTADescricao;
    private javax.swing.JTextField jTFCodigoExpedicao;
    private javax.swing.JTextField jTFCodigoPedido;
    private javax.swing.JTextField jTFCodigoTransportadora;
    private javax.swing.JTextField jTFCusto;
    // End of variables declaration//GEN-END:variables
}