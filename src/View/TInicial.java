/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Djair Maykon
 */
public class TInicial extends javax.swing.JFrame {

    /**
     * Creates new form TInicial
     */
    public TInicial() {
        initComponents();
        inicializarIcone();
    }

    private void inicializarIcone() {
        URL caminhoImagem = this.getClass().getClassLoader().getResource(".\\imagens\\Sistema logo.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        this.setIconImage(iconeTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMenuAcessoRapido = new javax.swing.JPanel();
        jBNovoPedido = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBCadastrarCliente = new javax.swing.JButton();
        jBCatalogoDeTintas = new javax.swing.JButton();
        jBAjuda = new javax.swing.JButton();
        jBSobreOUsuario = new javax.swing.JButton();
        jBSairDoUsuario = new javax.swing.JButton();
        jDPPrincipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMBTelaInicial = new javax.swing.JMenuBar();
        jMNovo = new javax.swing.JMenu();
        jMINovoPedido = new javax.swing.JMenuItem();
        jMINovoProducao = new javax.swing.JMenuItem();
        jMINovoExpedicao = new javax.swing.JMenuItem();
        jMINovoMateriaPrima = new javax.swing.JMenuItem();
        jMINovoAvaliacaoDeTinta = new javax.swing.JMenuItem();
        jMCadastrar = new javax.swing.JMenu();
        jMICadastrarTinta = new javax.swing.JMenuItem();
        jMICadastrarCliente = new javax.swing.JMenuItem();
        jMICadastrarFuncionario = new javax.swing.JMenuItem();
        jMICadastrarTransportadora = new javax.swing.JMenuItem();
        jMICadastrarFornecedores = new javax.swing.JMenuItem();
        jMICadastrarFornecedores1 = new javax.swing.JMenuItem();
        jMListar = new javax.swing.JMenu();
        jSMListarTintas = new javax.swing.JMenu();
        jSMITintaCatalogo = new javax.swing.JMenuItem();
        jSMITintasAvaliacao = new javax.swing.JMenuItem();
        jSMListarPedidos = new javax.swing.JMenu();
        jSMIPedidosEmLaboratorio = new javax.swing.JMenuItem();
        jSMIPedidosEmProducao = new javax.swing.JMenuItem();
        jSMIPedidosEmExpedição = new javax.swing.JMenuItem();
        jSMIPedidosFinalizados = new javax.swing.JMenuItem();
        jSMListarProducao = new javax.swing.JMenu();
        jSMIProducaoEmAndamento = new javax.swing.JMenuItem();
        jSMIProducaoFinalizados = new javax.swing.JMenuItem();
        jSMListarExpedição = new javax.swing.JMenu();
        jSMIExpedicaoEmAndamento = new javax.swing.JMenuItem();
        jSMIExpedicaoFinalizados = new javax.swing.JMenuItem();
        jSMIExpedicaoTransportadoras = new javax.swing.JMenuItem();
        jSMListarEstoque = new javax.swing.JMenu();
        jSMIEstoqueMateriaPrima = new javax.swing.JMenuItem();
        jSMIEstoqueFornecedores = new javax.swing.JMenuItem();
        jMIListarClientes = new javax.swing.JMenuItem();
        jMIListarFuncionarios = new javax.swing.JMenuItem();
        jMRelatorio = new javax.swing.JMenu();
        jMIRelatorioVendas = new javax.swing.JMenuItem();
        jMIHistoricoDeAvaliacao = new javax.swing.JMenuItem();
        jMFerramentas = new javax.swing.JMenu();
        jMIBuscarEndereco = new javax.swing.JMenuItem();
        jMConfiguracoes = new javax.swing.JMenu();
        jCBMIVizualisarBarraDeAcessoRapido = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Splash System");

        jPMenuAcessoRapido.setMaximumSize(new java.awt.Dimension(492, 42));
        jPMenuAcessoRapido.setMinimumSize(new java.awt.Dimension(492, 42));
        jPMenuAcessoRapido.setPreferredSize(new java.awt.Dimension(492, 42));

        jBNovoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        jBNovoPedido.setPreferredSize(new java.awt.Dimension(40, 40));

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/29.png"))); // NOI18N
        jBBuscar.setPreferredSize(new java.awt.Dimension(40, 40));

        jBCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/13.png"))); // NOI18N
        jBCadastrarCliente.setPreferredSize(new java.awt.Dimension(40, 40));

        jBCatalogoDeTintas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/catalog.png"))); // NOI18N
        jBCatalogoDeTintas.setPreferredSize(new java.awt.Dimension(40, 40));

        jBAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Aide.png"))); // NOI18N
        jBAjuda.setPreferredSize(new java.awt.Dimension(40, 40));

        jBSobreOUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-Info.png"))); // NOI18N
        jBSobreOUsuario.setPreferredSize(new java.awt.Dimension(40, 40));

        jBSairDoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout-iloveimg-resized.png"))); // NOI18N
        jBSairDoUsuario.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPMenuAcessoRapidoLayout = new javax.swing.GroupLayout(jPMenuAcessoRapido);
        jPMenuAcessoRapido.setLayout(jPMenuAcessoRapidoLayout);
        jPMenuAcessoRapidoLayout.setHorizontalGroup(
            jPMenuAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuAcessoRapidoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jBNovoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCatalogoDeTintas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSobreOUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 449, Short.MAX_VALUE)
                .addComponent(jBSairDoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPMenuAcessoRapidoLayout.setVerticalGroup(
            jPMenuAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuAcessoRapidoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPMenuAcessoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBSobreOUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jBAjuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCatalogoDeTintas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBNovoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSairDoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        jDPPrincipal.setBackground(new java.awt.Color(57, 93, 117));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("© M.K. Corporation");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo Kenda.png"))); // NOI18N

        jDPPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDPPrincipal.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDPPrincipalLayout = new javax.swing.GroupLayout(jDPPrincipal);
        jDPPrincipal.setLayout(jDPPrincipalLayout);
        jDPPrincipalLayout.setHorizontalGroup(
            jDPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDPPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDPPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDPPrincipalLayout.setVerticalGroup(
            jDPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDPPrincipalLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 93, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMBTelaInicial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMBTelaInicial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMNovo.setText("Novo");

        jMINovoPedido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMINovoPedido.setText("Pedido");
        jMNovo.add(jMINovoPedido);

        jMINovoProducao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMINovoProducao.setText("Produção");
        jMNovo.add(jMINovoProducao);

        jMINovoExpedicao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMINovoExpedicao.setText("Expedição");
        jMNovo.add(jMINovoExpedicao);

        jMINovoMateriaPrima.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMINovoMateriaPrima.setText("Materia Prima");
        jMNovo.add(jMINovoMateriaPrima);

        jMINovoAvaliacaoDeTinta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMINovoAvaliacaoDeTinta.setText("Avaliação de Tinta");
        jMNovo.add(jMINovoAvaliacaoDeTinta);

        jMBTelaInicial.add(jMNovo);

        jMCadastrar.setText("Cadastrar");

        jMICadastrarTinta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMICadastrarTinta.setText("Tinta");
        jMCadastrar.add(jMICadastrarTinta);

        jMICadastrarCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMICadastrarCliente.setText("Cliente");
        jMCadastrar.add(jMICadastrarCliente);

        jMICadastrarFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMICadastrarFuncionario.setText("Funcionário");
        jMCadastrar.add(jMICadastrarFuncionario);

        jMICadastrarTransportadora.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMICadastrarTransportadora.setText("Transportadora");
        jMCadastrar.add(jMICadastrarTransportadora);

        jMICadastrarFornecedores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMICadastrarFornecedores.setText("Fornecedores");
        jMCadastrar.add(jMICadastrarFornecedores);

        jMICadastrarFornecedores1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMICadastrarFornecedores1.setText("Setor");
        jMCadastrar.add(jMICadastrarFornecedores1);

        jMBTelaInicial.add(jMCadastrar);

        jMListar.setText("Listar");

        jSMListarTintas.setText("Tintas");
        jSMListarTintas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jSMITintaCatalogo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMITintaCatalogo.setText("Catálogo");
        jSMListarTintas.add(jSMITintaCatalogo);

        jSMITintasAvaliacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMITintasAvaliacao.setText("Avaliações");
        jSMListarTintas.add(jSMITintasAvaliacao);

        jMListar.add(jSMListarTintas);

        jSMListarPedidos.setText("Pedidos");
        jSMListarPedidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jSMIPedidosEmLaboratorio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMIPedidosEmLaboratorio.setText("Em Laborátorio");
        jSMListarPedidos.add(jSMIPedidosEmLaboratorio);

        jSMIPedidosEmProducao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMIPedidosEmProducao.setText("Em Produção");
        jSMListarPedidos.add(jSMIPedidosEmProducao);

        jSMIPedidosEmExpedição.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMIPedidosEmExpedição.setText("Em Expedição");
        jSMListarPedidos.add(jSMIPedidosEmExpedição);

        jSMIPedidosFinalizados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMIPedidosFinalizados.setText("Finalizados");
        jSMListarPedidos.add(jSMIPedidosFinalizados);

        jMListar.add(jSMListarPedidos);

        jSMListarProducao.setText("Produção");
        jSMListarProducao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jSMIProducaoEmAndamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMIProducaoEmAndamento.setText("Em Andamento");
        jSMListarProducao.add(jSMIProducaoEmAndamento);

        jSMIProducaoFinalizados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMIProducaoFinalizados.setText("Finalizados");
        jSMListarProducao.add(jSMIProducaoFinalizados);

        jMListar.add(jSMListarProducao);

        jSMListarExpedição.setText("Expedição");
        jSMListarExpedição.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jSMIExpedicaoEmAndamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMIExpedicaoEmAndamento.setText("Em Andamento");
        jSMListarExpedição.add(jSMIExpedicaoEmAndamento);

        jSMIExpedicaoFinalizados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMIExpedicaoFinalizados.setText("Finalizadas");
        jSMListarExpedição.add(jSMIExpedicaoFinalizados);

        jSMIExpedicaoTransportadoras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMIExpedicaoTransportadoras.setText("Transportadoras");
        jSMListarExpedição.add(jSMIExpedicaoTransportadoras);

        jMListar.add(jSMListarExpedição);

        jSMListarEstoque.setText("Estoque");
        jSMListarEstoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jSMIEstoqueMateriaPrima.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMIEstoqueMateriaPrima.setText("Materia Prima");
        jSMListarEstoque.add(jSMIEstoqueMateriaPrima);

        jSMIEstoqueFornecedores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSMIEstoqueFornecedores.setText("Fornecedores");
        jSMListarEstoque.add(jSMIEstoqueFornecedores);

        jMListar.add(jSMListarEstoque);

        jMIListarClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMIListarClientes.setText("Clientes");
        jMListar.add(jMIListarClientes);

        jMIListarFuncionarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMIListarFuncionarios.setText("Funcionários");
        jMListar.add(jMIListarFuncionarios);

        jMBTelaInicial.add(jMListar);

        jMRelatorio.setText("Relátorio");

        jMIRelatorioVendas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMIRelatorioVendas.setText("Vendas");
        jMRelatorio.add(jMIRelatorioVendas);

        jMIHistoricoDeAvaliacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMIHistoricoDeAvaliacao.setText("Historico de Avalição");
        jMRelatorio.add(jMIHistoricoDeAvaliacao);

        jMBTelaInicial.add(jMRelatorio);

        jMFerramentas.setText("Ferramentas");

        jMIBuscarEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMIBuscarEndereco.setText("Buscar Endereço");
        jMFerramentas.add(jMIBuscarEndereco);

        jMBTelaInicial.add(jMFerramentas);

        jMConfiguracoes.setText("Configurações");

        jCBMIVizualisarBarraDeAcessoRapido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCBMIVizualisarBarraDeAcessoRapido.setSelected(true);
        jCBMIVizualisarBarraDeAcessoRapido.setText("Barra de Acesso Rápido");
        jMConfiguracoes.add(jCBMIVizualisarBarraDeAcessoRapido);

        jMBTelaInicial.add(jMConfiguracoes);

        setJMenuBar(jMBTelaInicial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPMenuAcessoRapido, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addComponent(jDPPrincipal))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPMenuAcessoRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDPPrincipal)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JMenuItem getjSMIPedidosEmProducao() {
        return jSMIPedidosEmProducao;
    }

    public JButton getjBAjuda() {
        return jBAjuda;
    }

    public JButton getjBBuscar() {
        return jBBuscar;
    }

    public JButton getjBCadastrarCliente() {
        return jBCadastrarCliente;
    }

    public JButton getjBCatalogoDeTintas() {
        return jBCatalogoDeTintas;
    }

    public JButton getjBNovoPedido() {
        return jBNovoPedido;
    }

    public JButton getjBSairDoUsuario() {
        return jBSairDoUsuario;
    }

    public JButton getjBSobreOUsuario() {
        return jBSobreOUsuario;
    }

    public JCheckBoxMenuItem getjCBMIVizualisarBarraDeAcessoRapido() {
        return jCBMIVizualisarBarraDeAcessoRapido;
    }

    public JMenuBar getjMBTelaInicial() {
        return jMBTelaInicial;
    }

    public JMenu getjMCadastrar() {
        return jMCadastrar;
    }

    public JMenu getjMConfiguracoes() {
        return jMConfiguracoes;
    }

    public JMenu getjMFerramentas() {
        return jMFerramentas;
    }

    public JMenuItem getjMIBuscarEndereco() {
        return jMIBuscarEndereco;
    }

    public JMenuItem getjMICadastrarCliente() {
        return jMICadastrarCliente;
    }

    public JMenuItem getjMICadastrarFornecedores() {
        return jMICadastrarFornecedores;
    }

    public JMenuItem getjMICadastrarFuncionario() {
        return jMICadastrarFuncionario;
    }

    public JMenuItem getjMICadastrarTinta() {
        return jMICadastrarTinta;
    }

    public JMenuItem getjMICadastrarTransportadora() {
        return jMICadastrarTransportadora;
    }

    public JMenuItem getjMIHistoricoDeAvaliacao() {
        return jMIHistoricoDeAvaliacao;
    }

    public JMenuItem getjMIListarClientes() {
        return jMIListarClientes;
    }

    public JMenuItem getjMIListarFuncionarios() {
        return jMIListarFuncionarios;
    }

    public JMenuItem getjMINovoAvaliacaoDeTinta() {
        return jMINovoAvaliacaoDeTinta;
    }

    public JMenuItem getjMINovoExpedicao() {
        return jMINovoExpedicao;
    }

    public JMenuItem getjMINovoMateriaPrima() {
        return jMINovoMateriaPrima;
    }

    public JMenuItem getjMINovoPedido() {
        return jMINovoPedido;
    }

    public JMenuItem getjMINovoProducao() {
        return jMINovoProducao;
    }

    public JMenuItem getjMIRelatorioVendas() {
        return jMIRelatorioVendas;
    }

    public JMenu getjMListar() {
        return jMListar;
    }

    public JMenu getjMNovo() {
        return jMNovo;
    }

    public JMenu getjMRelatorio() {
        return jMRelatorio;
    }

    public JPanel getjPMenuAcessoRapido() {
        return jPMenuAcessoRapido;
    }

    public JMenuItem getjSMIEstoqueFornecedores() {
        return jSMIEstoqueFornecedores;
    }

    public JMenuItem getjSMIEstoqueMateriaPrima() {
        return jSMIEstoqueMateriaPrima;
    }

    public JMenuItem getjSMIExpedicaoEmAndamento() {
        return jSMIExpedicaoEmAndamento;
    }

    public JMenuItem getjSMIExpedicaoFinalizados() {
        return jSMIExpedicaoFinalizados;
    }

    public JMenuItem getjSMIExpedicaoTransportadoras() {
        return jSMIExpedicaoTransportadoras;
    }

    public JMenuItem getjSMIPedidosFinalizados() {
        return jSMIPedidosFinalizados;
    }

    public JMenuItem getjSMIProducaoEmAndamento() {
        return jSMIProducaoEmAndamento;
    }

    public JMenuItem getjSMIProducaoFinalizados() {
        return jSMIProducaoFinalizados;
    }

    public JMenuItem getjSMITintaCatalogo() {
        return jSMITintaCatalogo;
    }

    public JMenuItem getjSMITintasAvaliacao() {
        return jSMITintasAvaliacao;
    }

    public JMenu getjSMListarEstoque() {
        return jSMListarEstoque;
    }

    public JMenu getjSMListarExpedição() {
        return jSMListarExpedição;
    }

    public JMenu getjSMListarPedidos() {
        return jSMListarPedidos;
    }

    public JMenu getjSMListarProducao() {
        return jSMListarProducao;
    }

    public JMenu getjSMListarTintas() {
        return jSMListarTintas;
    }

    public JDesktopPane getjDPPrincipal() {
        return jDPPrincipal;
    }

    public JMenuItem getjSMIPedidosEmExpedição() {
        return jSMIPedidosEmExpedição;
    }

    public JMenuItem getjSMIPedidosEmLaboratorio() {
        return jSMIPedidosEmLaboratorio;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAjuda;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCadastrarCliente;
    private javax.swing.JButton jBCatalogoDeTintas;
    private javax.swing.JButton jBNovoPedido;
    private javax.swing.JButton jBSairDoUsuario;
    private javax.swing.JButton jBSobreOUsuario;
    private javax.swing.JCheckBoxMenuItem jCBMIVizualisarBarraDeAcessoRapido;
    private javax.swing.JDesktopPane jDPPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMBTelaInicial;
    private javax.swing.JMenu jMCadastrar;
    private javax.swing.JMenu jMConfiguracoes;
    private javax.swing.JMenu jMFerramentas;
    private javax.swing.JMenuItem jMIBuscarEndereco;
    private javax.swing.JMenuItem jMICadastrarCliente;
    private javax.swing.JMenuItem jMICadastrarFornecedores;
    private javax.swing.JMenuItem jMICadastrarFornecedores1;
    private javax.swing.JMenuItem jMICadastrarFuncionario;
    private javax.swing.JMenuItem jMICadastrarTinta;
    private javax.swing.JMenuItem jMICadastrarTransportadora;
    private javax.swing.JMenuItem jMIHistoricoDeAvaliacao;
    private javax.swing.JMenuItem jMIListarClientes;
    private javax.swing.JMenuItem jMIListarFuncionarios;
    private javax.swing.JMenuItem jMINovoAvaliacaoDeTinta;
    private javax.swing.JMenuItem jMINovoExpedicao;
    private javax.swing.JMenuItem jMINovoMateriaPrima;
    private javax.swing.JMenuItem jMINovoPedido;
    private javax.swing.JMenuItem jMINovoProducao;
    private javax.swing.JMenuItem jMIRelatorioVendas;
    private javax.swing.JMenu jMListar;
    private javax.swing.JMenu jMNovo;
    private javax.swing.JMenu jMRelatorio;
    private javax.swing.JPanel jPMenuAcessoRapido;
    private javax.swing.JMenuItem jSMIEstoqueFornecedores;
    private javax.swing.JMenuItem jSMIEstoqueMateriaPrima;
    private javax.swing.JMenuItem jSMIExpedicaoEmAndamento;
    private javax.swing.JMenuItem jSMIExpedicaoFinalizados;
    private javax.swing.JMenuItem jSMIExpedicaoTransportadoras;
    private javax.swing.JMenuItem jSMIPedidosEmExpedição;
    private javax.swing.JMenuItem jSMIPedidosEmLaboratorio;
    private javax.swing.JMenuItem jSMIPedidosEmProducao;
    private javax.swing.JMenuItem jSMIPedidosFinalizados;
    private javax.swing.JMenuItem jSMIProducaoEmAndamento;
    private javax.swing.JMenuItem jSMIProducaoFinalizados;
    private javax.swing.JMenuItem jSMITintaCatalogo;
    private javax.swing.JMenuItem jSMITintasAvaliacao;
    private javax.swing.JMenu jSMListarEstoque;
    private javax.swing.JMenu jSMListarExpedição;
    private javax.swing.JMenu jSMListarPedidos;
    private javax.swing.JMenu jSMListarProducao;
    private javax.swing.JMenu jSMListarTintas;
    // End of variables declaration//GEN-END:variables
}
