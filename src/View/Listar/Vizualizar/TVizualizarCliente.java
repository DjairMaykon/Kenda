/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Listar.Vizualizar;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Djair Maykon
 */
public class TVizualizarCliente extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form TNovoPedido
     */
    public TVizualizarCliente() {
        initComponents();
        
    }

    public JButton getjBEditarCliente() {
        return jBEditarCliente;
    }

    public JButton getjBRemoverCliente() {
        return jBRemoverCliente;
    }

    public JButton getjBuscarEndereco() {
        return jBuscarEndereco;
    }

    public JLabel getjLCodigoCliente1() {
        return jLCodigoCliente1;
    }

    public JLabel getjLCodigoCliente2() {
        return jLCodigoCliente2;
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

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public JTextField getjTFCNPJ() {
        return jTFCNPJ;
    }

    public JTextField getjTFCodigoCliente() {
        return jTFCodigoCliente;
    }

    public JTextField getjTFEmail() {
        return jTFEmail;
    }

    public JTextField getjTFEndereco() {
        return jTFEndereco;
    }

    public JTextField getjTFNome() {
        return jTFNome;
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
        jBEditarCliente = new javax.swing.JButton();
        jBRemoverCliente = new javax.swing.JButton();
        jLCodigoM = new javax.swing.JLabel();
        jTFCNPJ = new javax.swing.JTextField();
        try{    javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##.###.###/####-##");    jTFCNPJ = new javax.swing.JFormattedTextField(data); }    catch (Exception e){ }
        jLCodigoCliente1 = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();
        try{    javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##)-#####-#####");    jTFTelefone = new javax.swing.JFormattedTextField(data); }    catch (Exception e){ }
        jTFEndereco = new javax.swing.JTextField();
        try{    javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("#####-###");    jTFEndereco = new javax.swing.JFormattedTextField(data); }    catch (Exception e){ }
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

        jTFNome.setEditable(false);
        jTFNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jTFEmail.setEditable(false);
        jTFEmail.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLDescricao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLDescricao.setText("Email:");

        jBEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/config.png"))); // NOI18N
        jBEditarCliente.setText("Editar");

        jBRemoverCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete_01.png"))); // NOI18N
        jBRemoverCliente.setText("Remover");

        jLCodigoM.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoM.setLabelFor(jTFEmail);
        jLCodigoM.setText("CNPJ:");

        jTFCNPJ.setEditable(false);
        jTFCNPJ.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCodigoCliente1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoCliente1.setLabelFor(jTFEmail);
        jLCodigoCliente1.setText("Telefone:");

        jTFTelefone.setEditable(false);
        jTFTelefone.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jTFEndereco.setEditable(false);
        jTFEndereco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLCodigoCliente2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLCodigoCliente2.setLabelFor(jTFEmail);
        jLCodigoCliente2.setText("Endereço:");

        jBuscarEndereco.setText("Verificar");

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
                            .addComponent(jTFCNPJ)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBuscarEndereco)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBRemoverCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jBEditarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBRemoverCliente))
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
                            .addComponent(jTFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCodigoCliente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JButton jBEditarCliente;
    private javax.swing.JButton jBRemoverCliente;
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
    private javax.swing.JTextField jTFCNPJ;
    private javax.swing.JTextField jTFCodigoCliente;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEndereco;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables
}
