/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.TelasCadastrar;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Emanuele
 */
public class TCadastrarTransportadora extends javax.swing.JInternalFrame {

    /**
     * Creates new form TCadastrarFornecedor
     */
    public TCadastrarTransportadora() {
        initComponents();
    }

    public JButton getjBCadastrarTransportadora() {
        return jBCadastrarTransportadora;
    }

    public void setjBCadastrarTransportadora(JButton jBCadastrarTransportadora) {
        this.jBCadastrarTransportadora = jBCadastrarTransportadora;
    }

    public JButton getjBCancelarTransportadora() {
        return jBCancelarTransportadora;
    }

    public void setjBCancelarTransportadora(JButton jBCancelarTransportadora) {
        this.jBCancelarTransportadora = jBCancelarTransportadora;
    }

    public JButton getjBuscarEndereco() {
        return jBuscarEndereco;
    }

    public void setjBuscarEndereco(JButton jBuscarEndereco) {
        this.jBuscarEndereco = jBuscarEndereco;
    }

    public JTextField getjTFCPNJ() {
        return jTFCNPJ;
    }

    public void setjTFCPNJ(JTextField jTFCPNJ) {
        this.jTFCNPJ = jTFCPNJ;
    }

    public JTextField getjTFCodigoEndereco() {
        return jTFCodigoEndereco;
    }

    public void setjTFCodigoEndereco(JTextField jTFCodigoEndereco) {
        this.jTFCodigoEndereco = jTFCodigoEndereco;
    }

    public JTextField getjTFCodigoTransportadora() {
        return jTFCodigoTransportadora;
    }

    public void setjTFCodigoTransportadora(JTextField jTFCodigoTransportadora) {
        this.jTFCodigoTransportadora = jTFCodigoTransportadora;
    }

    public JTextField getjTFFrete() {
        return jTFFrete;
    }

    public void setjTFFrete(JTextField jTFFrete) {
        this.jTFFrete = jTFFrete;
    }

    public JTextField getjTFNome() {
        return jTFNome;
    }

    public void setjTFNome(JTextField jTFNome) {
        this.jTFNome = jTFNome;
    }

    public JTextField getjTFTelefone() {
        return jTFTelefone;
    }

    public void setjTFTelefone(JTextField jTFTelefone) {
        this.jTFTelefone = jTFTelefone;
    }

    public JTextField getjTFUnidadeFrete() {
        return jTFUnidadeFrete;
    }

    public void setjTFUnidadeFrete(JTextField jTFUnidadeFrete) {
        this.jTFUnidadeFrete = jTFUnidadeFrete;
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
        jTFCodigoTransportadora = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLCodigoOS = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFUnidadeFrete = new javax.swing.JTextField();
        jLDescricao = new javax.swing.JLabel();
        jBCadastrarTransportadora = new javax.swing.JButton();
        jBCancelarTransportadora = new javax.swing.JButton();
        jLCodigoM = new javax.swing.JLabel();
        jTFCNPJ = new javax.swing.JTextField();
        jLCodigoCliente1 = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();
        jTFCodigoEndereco = new javax.swing.JTextField();
        jLCodigoCliente2 = new javax.swing.JLabel();
        jBuscarEndereco = new javax.swing.JButton();
        jTFFrete = new javax.swing.JTextField();
        jLCodigoCliente3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(57, 93, 117));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLCodigoPedido.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoPedido.setText("Código do Transportadora:");

        jTFCodigoTransportadora.setEditable(false);
        jTFCodigoTransportadora.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLCodigoOS.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoOS.setText("Nome:");

        jTFNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jTFUnidadeFrete.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLDescricao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLDescricao.setText("Unidade de Frete:");

        jBCadastrarTransportadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/37.png"))); // NOI18N
        jBCadastrarTransportadora.setText("Cadastrar");

        jBCancelarTransportadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete_01.png"))); // NOI18N
        jBCancelarTransportadora.setText("Cancelar");

        jLCodigoM.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoM.setText("CNPJ:");

        jTFCNPJ.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCodigoCliente1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoCliente1.setText("Telefone:");

        jTFTelefone.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jTFCodigoEndereco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCodigoCliente2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoCliente2.setText("Endereço:");

        jBuscarEndereco.setText("Buscar");

        jTFFrete.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCodigoCliente3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoCliente3.setText("Frete:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCodigoM)
                            .addComponent(jLDescricao)
                            .addComponent(jLCodigoOS)
                            .addComponent(jLCodigoPedido)
                            .addComponent(jLCodigoCliente1)
                            .addComponent(jLCodigoCliente2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFTelefone)
                            .addComponent(jTFCodigoTransportadora, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFNome)
                            .addComponent(jTFUnidadeFrete)
                            .addComponent(jTFCNPJ)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFCodigoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBuscarEndereco))
                            .addComponent(jTFFrete)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLCodigoCliente3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCancelarTransportadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastrarTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBCadastrarTransportadora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCancelarTransportadora))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCodigoPedido)
                                    .addComponent(jTFCodigoTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLCodigoOS))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLDescricao)
                                    .addComponent(jTFUnidadeFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoCliente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCodigoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoCliente2)
                            .addComponent(jBuscarEndereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoCliente3))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarTransportadora;
    private javax.swing.JButton jBCancelarTransportadora;
    private javax.swing.JButton jBuscarEndereco;
    private javax.swing.JLabel jLCodigoCliente1;
    private javax.swing.JLabel jLCodigoCliente2;
    private javax.swing.JLabel jLCodigoCliente3;
    private javax.swing.JLabel jLCodigoM;
    private javax.swing.JLabel jLCodigoOS;
    private javax.swing.JLabel jLCodigoPedido;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFCNPJ;
    private javax.swing.JTextField jTFCodigoEndereco;
    private javax.swing.JTextField jTFCodigoTransportadora;
    private javax.swing.JTextField jTFFrete;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFTelefone;
    private javax.swing.JTextField jTFUnidadeFrete;
    // End of variables declaration//GEN-END:variables
}
