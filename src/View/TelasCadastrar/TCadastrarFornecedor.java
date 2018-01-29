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
public class TCadastrarFornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form TCadastrarFornecedor
     */
    public TCadastrarFornecedor() {
        initComponents();
    }

    public JButton getjBCadastrarFornecedor() {
        return jBCadastrarFornecedor;
    }

    public void setjBCadastrarFornecedor(JButton jBCadastrarFornecedor) {
        this.jBCadastrarFornecedor = jBCadastrarFornecedor;
    }

    public JButton getjBCancelarFornecedor() {
        return jBCancelarFornecedor;
    }

    public void setjBCancelarFornecedor(JButton jBCancelarFornecedor) {
        this.jBCancelarFornecedor = jBCancelarFornecedor;
    }

    public JButton getjBuscarEndereco() {
        return jBuscarEndereco;
    }

    public void setjBuscarEndereco(JButton jBuscarEndereco) {
        this.jBuscarEndereco = jBuscarEndereco;
    }

    public JTextField getjTFCPNJ() {
        return jTFCPNJ;
    }

    public void setjTFCPNJ(JTextField jTFCPNJ) {
        this.jTFCPNJ = jTFCPNJ;
    }

    public JTextField getjTFCodigoEndereco() {
        return jTFCodigoEndereco;
    }

    public void setjTFCodigoEndereco(JTextField jTFCodigoEndereco) {
        this.jTFCodigoEndereco = jTFCodigoEndereco;
    }

    public JTextField getjTFCodigoFornecedor() {
        return jTFCodigoFornecedor;
    }

    public void setjTFCodigoFornecedor(JTextField jTFCodigoFornecedor) {
        this.jTFCodigoFornecedor = jTFCodigoFornecedor;
    }

    public JTextField getjTFEmail() {
        return jTFEmail;
    }

    public void setjTFEmail(JTextField jTFEmail) {
        this.jTFEmail = jTFEmail;
    }

    public JTextField getjTFNome() {
        return jTFNome;
    }

    public void setjTFNome(JTextField jTFNome) {
        this.jTFNome = jTFNome;
    }

    public JTextField getjTFSite() {
        return jTFSite;
    }

    public void setjTFSite(JTextField jTFSite) {
        this.jTFSite = jTFSite;
    }

    public JTextField getjTFTelefone() {
        return jTFTelefone;
    }

    public void setjTFTelefone(JTextField jTFTelefone) {
        this.jTFTelefone = jTFTelefone;
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
        jTFCodigoFornecedor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLCodigoOS = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jLDescricao = new javax.swing.JLabel();
        jBCadastrarFornecedor = new javax.swing.JButton();
        jBCancelarFornecedor = new javax.swing.JButton();
        jLCodigoM = new javax.swing.JLabel();
        jTFCPNJ = new javax.swing.JTextField();
        jLCodigoCliente1 = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();
        jTFCodigoEndereco = new javax.swing.JTextField();
        jLCodigoCliente2 = new javax.swing.JLabel();
        jBuscarEndereco = new javax.swing.JButton();
        jTFSite = new javax.swing.JTextField();
        jLCodigoCliente3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(57, 93, 117));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLCodigoPedido.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoPedido.setText("Código do Fornecedor:");

        jTFCodigoFornecedor.setEditable(false);
        jTFCodigoFornecedor.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTFCodigoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoFornecedorActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLCodigoOS.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoOS.setText("Nome:");

        jTFNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jTFEmail.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLDescricao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLDescricao.setText("Email:");

        jBCadastrarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/37.png"))); // NOI18N
        jBCadastrarFornecedor.setText("Cadastrar");

        jBCancelarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete_01.png"))); // NOI18N
        jBCancelarFornecedor.setText("Cancelar");

        jLCodigoM.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoM.setText("CNPJ:");

        jTFCPNJ.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCodigoCliente1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoCliente1.setText("Telefone:");

        jTFTelefone.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jTFCodigoEndereco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCodigoCliente2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoCliente2.setText("Codigo de Endereço:");

        jBuscarEndereco.setText("Buscar");

        jTFSite.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCodigoCliente3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoCliente3.setText("Site:");

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
                            .addComponent(jTFCodigoFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFNome)
                            .addComponent(jTFEmail)
                            .addComponent(jTFCPNJ)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFCodigoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBuscarEndereco))
                            .addComponent(jTFSite)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCodigoCliente3)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCancelarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastrarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jBCadastrarFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCancelarFornecedor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCodigoPedido)
                                    .addComponent(jTFCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLCodigoOS))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLDescricao)
                                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCPNJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jTFSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoCliente3))))
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void jTFCodigoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigoFornecedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarFornecedor;
    private javax.swing.JButton jBCancelarFornecedor;
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
    private javax.swing.JTextField jTFCPNJ;
    private javax.swing.JTextField jTFCodigoEndereco;
    private javax.swing.JTextField jTFCodigoFornecedor;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFSite;
    private javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables
}
