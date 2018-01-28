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
 * @author Djair Maykon
 */
public class TCadastrarCliente extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form TNovoPedido
     */
    public TCadastrarCliente() {
        initComponents();
        
    }

    public JButton getjBuscarEndereco() {
        return jBuscarEndereco;
    }

    public JTextField getjTFCEP() {
        return jTFCEP;
    }

    public JTextField getjTFNome() {
        return jTFNome;
    }

    public JButton getjBCadastrarCliente() {
        return jBCadastrarCliente;
    }

    public JButton getjBCancelarCliente() {
        return jBCancelarCliente;
    }

    public JButton getjBuscar() {
        return jBuscarEndereco;
    }

    public JTextField getjTFCPNJ() {
        return jTFCPNJ;
    }

    public JTextField getjTFCodigoCliente() {
        return jTFCodigoCliente;
    }

    public JTextField getjTFEmail() {
        return jTFEmail;
    }

    public JTextField getjTFEndereco() {
        return jTFCEP;
    }

    public JTextField getjTFTelefone() {
        return jTFTelefone;
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
        jTFCodigoCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLCodigoOS = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jLDescricao = new javax.swing.JLabel();
        jBCadastrarCliente = new javax.swing.JButton();
        jBCancelarCliente = new javax.swing.JButton();
        jLCodigoM = new javax.swing.JLabel();
        jTFCPNJ = new javax.swing.JTextField();
        jLCodigoCliente1 = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();
        jTFCEP = new javax.swing.JTextField();
        jLCodigoCliente2 = new javax.swing.JLabel();
        jBuscarEndereco = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(57, 93, 117));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLCodigoPedido.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoPedido.setLabelFor(jTFCodigoCliente);
        jLCodigoPedido.setText("Código do Cliente:");

        jTFCodigoCliente.setEditable(false);
        jTFCodigoCliente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLCodigoOS.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoOS.setLabelFor(jTFNome);
        jLCodigoOS.setText("Nome:");

        jTFNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jTFEmail.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLDescricao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLDescricao.setText("Email:");

        jBCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/37.png"))); // NOI18N
        jBCadastrarCliente.setText("Cadastrar");

        jBCancelarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete_01.png"))); // NOI18N
        jBCancelarCliente.setText("Cancelar");

        jLCodigoM.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoM.setLabelFor(jTFEmail);
        jLCodigoM.setText("CNPJ:");

        jTFCPNJ.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCodigoCliente1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoCliente1.setLabelFor(jTFEmail);
        jLCodigoCliente1.setText("Telefone:");

        jTFTelefone.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jTFCEP.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCodigoCliente2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoCliente2.setLabelFor(jTFEmail);
        jLCodigoCliente2.setText("Endereço:");

        jBuscarEndereco.setText("Buscar");

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
                            .addComponent(jLCodigoCliente1)
                            .addComponent(jLCodigoCliente2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFTelefone)
                            .addComponent(jTFCodigoCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFNome)
                            .addComponent(jTFEmail)
                            .addComponent(jTFCPNJ)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBuscarEndereco)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCancelarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addComponent(jBCadastrarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCancelarCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCodigoPedido)
                                    .addComponent(jTFCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
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
                            .addComponent(jTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoCliente2)
                            .addComponent(jBuscarEndereco))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarCliente;
    private javax.swing.JButton jBCancelarCliente;
    private javax.swing.JButton jBuscarEndereco;
    private javax.swing.JLabel jLCodigoCliente1;
    private javax.swing.JLabel jLCodigoCliente2;
    private javax.swing.JLabel jLCodigoM;
    private javax.swing.JLabel jLCodigoOS;
    private javax.swing.JLabel jLCodigoPedido;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFCEP;
    private javax.swing.JTextField jTFCPNJ;
    private javax.swing.JTextField jTFCodigoCliente;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables
}
