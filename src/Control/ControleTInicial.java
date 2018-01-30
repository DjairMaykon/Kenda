package Control;

import Model.MUsuario;
import View.TInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Djair Maykon
 */
class ControleTInicial {
    
    private TInicial telaInicial;
    private MUsuario modeloUsuario;

    public ControleTInicial(MUsuario u1) {
    
        modeloUsuario = u1;
        telaInicial = new TInicial();
        telaInicial.setVisible(true);
        
        telaInicial.getjMINovoPedido().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMINovoPedido(e);
            }
        });
        
        telaInicial.getjMINovoProducao().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMINovoProducao(e);
            }
        });
        
        telaInicial.getjMINovoExpedicao().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMINovoExpedicao(e);
            }
        });
        
        telaInicial.getjMINovoMateriaPrima().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMINovoMateriaPrima(e);
            }
        });
        
        telaInicial.getjMINovoAvaliacaoDeTinta().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMINovoAvaliacaoTinta(e);
            }
        });
        
        telaInicial.getjMICadastrarCliente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarCliente(e);
            }
        });
        
        telaInicial.getjMICadastrarTinta().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarTinta(e);
            }
        });
        
        telaInicial.getjMICadastrarTransportadora().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarTransportadora(e);
            }
        });
        
        telaInicial.getjMICadastrarFornecedores().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarFornecedor(e);
            }
        });
           
            
        telaInicial.getjMICadastrarFuncionario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarFuncionario(e);
            }
        });
             
        telaInicial.getjMICadastrarSetor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarSetor(e);
            }
        });
        
        telaInicial.getjCBMIVizualisarBarraDeAcessoRapido().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(telaInicial.getjCBMIVizualisarBarraDeAcessoRapido().isSelected())
                    telaInicial.getjPMenuAcessoRapido().setVisible(true);
                else
                    telaInicial.getjPMenuAcessoRapido().setVisible(false);
            }
        });
        
        telaInicial.getjMIListarClientes().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarCliente(e);
            }
        });
        
          
        telaInicial.getjMIListarFuncionarios().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarFuncionario(e);
            }
        });
        
         telaInicial.getjSMIEstoqueFornecedores().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarEstoqueFornecedores(e);
            }
        });
         
          telaInicial.getjSMIEstoqueMateriaPrima().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarEstoqueMateriaPrima(e);
            }
        });
          
           telaInicial.getjSMIExpedicaoEmAndamento().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarExpedicaoEmAndamento(e);
            }
        });
           
           telaInicial.getjSMIExpedicaoFinalizados().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarExpedicaoFinalizados(e);
            }
        });
         
             telaInicial.getjSMIExpedicaoTransportadoras().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarExpedicaoTransportadora(e);
            }
        });
             
              telaInicial.getjSMIPedidosEmExpedição().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarPedidosExpedicao(e);
            }
        });
              
              
               telaInicial.getjSMIPedidosEmLaboratorio().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarPedidosLaboratorio(e);
            }
        });
               
                 
               telaInicial.getjSMIPedidosEmProducao().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarPedidosProducao(e);
            }
        });
               
                  telaInicial.getjSMIPedidosFinalizados().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarPedidosFinalizado(e);
            }
        });
           
            
            telaInicial.getjSMIProducaoFinalizados().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarProducaoFinalizados(e);
            }
        });
            
            telaInicial.getjSMIProducaoEmAndamento().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarProducaoEmAndamento(e);
            }
        });
               
           telaInicial.getjSMITintaCatalogo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarTitasCatalogo(e);
            }
        });
           
           
            telaInicial.getjSMITintasAvaliacao().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMIListarTitasAvalicoes(e);
            }
        });
            
            
               
               
         
         
    }
    
    
    
    public void acaoMINovoPedido(ActionEvent evt){
        
        ControleNovoPedido cNovoPedido = new ControleNovoPedido();
        telaInicial.getjDPPrincipal().add(cNovoPedido.getTelaNovoPedido());
        cNovoPedido.getTelaNovoPedido().setVisible(true);
        
    }
    
    public void acaoMINovoProducao(ActionEvent evt){
        
        ControleNovoProducao cNovoProducao = new ControleNovoProducao();
        telaInicial.getjDPPrincipal().add(cNovoProducao.getTelaNovoProducao());
        cNovoProducao.getTelaNovoProducao().setVisible(true);
        
    }
    
    public void acaoMINovoExpedicao(ActionEvent evt){
        
        ControleNovoExpedicao cNovoExpedicao = new ControleNovoExpedicao();
        telaInicial.getjDPPrincipal().add(cNovoExpedicao.getTelaNovoExpedicao());
        cNovoExpedicao.getTelaNovoExpedicao().setVisible(true);
        
    }
    public void acaoMINovoMateriaPrima(ActionEvent evt){
        
        ControleNovoMateriaPrima cNovoMateriaPrima = new ControleNovoMateriaPrima();
        telaInicial.getjDPPrincipal().add(cNovoMateriaPrima.getTelaNovoMateriaPrima());
        cNovoMateriaPrima.getTelaNovoMateriaPrima().setVisible(true);
        
    }
    
    public void acaoMINovoAvaliacaoTinta(ActionEvent evt){
        
        ControleNovoAvaliacaoTinta cNovoAvaliacaoTinta = new ControleNovoAvaliacaoTinta();
        telaInicial.getjDPPrincipal().add(cNovoAvaliacaoTinta.getTelaNovoAvaliacaoTinta());
        cNovoAvaliacaoTinta.getTelaNovoAvaliacaoTinta().setVisible(true);
        
    }
    
    public void acaoMICadastrarCliente(ActionEvent evt){
        
        ControleCadastrarCliente cCadastrarCliente = new ControleCadastrarCliente();
        telaInicial.getjDPPrincipal().add(cCadastrarCliente.getTelaCadastrarCliente());
        cCadastrarCliente.getTelaCadastrarCliente().setVisible(true);
        
    }
    
    
    public void acaoMICadastrarSetor(ActionEvent evt){
        
        ControleCadastrarSetor cCadastrarSetor = new ControleCadastrarSetor();
        telaInicial.getjDPPrincipal().add(cCadastrarSetor.getTelaCadastrarSetor());
        cCadastrarSetor.getTelaCadastrarSetor().setVisible(true);
        
    }
     
    public void acaoMICadastrarTinta(ActionEvent evt){
        
        ControleCadastrarTinta cCadastrarTinta = new ControleCadastrarTinta();
        telaInicial.getjDPPrincipal().add(cCadastrarTinta.getTelaCadastrarTinta());
        cCadastrarTinta.getTelaCadastrarTinta().setVisible(true);
        
    }
      
    public void acaoMICadastrarFornecedor(ActionEvent evt){
        
        ControleCadastrarFornecedor cCadastrarFornecedor = new ControleCadastrarFornecedor();
        telaInicial.getjDPPrincipal().add(cCadastrarFornecedor.getTelaCadastrarFornecedor());
        cCadastrarFornecedor.getTelaCadastrarFornecedor().setVisible(true);
        
    }
    
    public void acaoMICadastrarTransportadora(ActionEvent evt){
        
        ControleCadastrarTransportadora cCadastrarTransportadora = new ControleCadastrarTransportadora();
        telaInicial.getjDPPrincipal().add(cCadastrarTransportadora.getTelaCadastrarTransportadora());
        cCadastrarTransportadora.getTelaCadastrarTransportadora().setVisible(true);
        
    }
          
    public void acaoMICadastrarFuncionario(ActionEvent evt){
        
        ControleCadastrarFuncionario cCadastrarFuncionario = new ControleCadastrarFuncionario();
        telaInicial.getjDPPrincipal().add(cCadastrarFuncionario.getTelaCadastrarFuncionario());
        cCadastrarFuncionario.getTelaCadastrarFuncionario().setVisible(true);
        
    }
    
    
           
    public void acaoMIListarFuncionario(ActionEvent evt){
        
        ControleListarFuncionario cListarFuncionario = new ControleListarFuncionario();
        telaInicial.getjDPPrincipal().add(cListarFuncionario.gettelaListarFuncionario());
        cListarFuncionario.gettelaListarFuncionario().setVisible(true);
        
    }
    
    public void acaoMIListarCliente(ActionEvent evt){
        
        ControleListarCliente cListarCliente = new ControleListarCliente();
        telaInicial.getjDPPrincipal().add(cListarCliente.getListarCliente());
        cListarCliente.getListarCliente().setVisible(true);
        
    }
    
    
     public void acaoMIListarEstoqueFornecedores(ActionEvent evt){
        
        ControleListarEstoqueFornecedores cListarEstoqueFornecedores = new ControleListarEstoqueFornecedores();
        telaInicial.getjDPPrincipal().add(cListarEstoqueFornecedores.gettelaListarEstoqueFornecedores());
        cListarEstoqueFornecedores.gettelaListarEstoqueFornecedores().setVisible(true);
        
    }
     
     
     public void acaoMIListarEstoqueMateriaPrima(ActionEvent evt){
        
        ControleListarEstoqueMateriaPrima cListarEstoqueMateriaPrima = new ControleListarEstoqueMateriaPrima();
        telaInicial.getjDPPrincipal().add(cListarEstoqueMateriaPrima.gettelaListarEstoqueMateriaPrima());
        cListarEstoqueMateriaPrima.gettelaListarEstoqueMateriaPrima().setVisible(true);
        
    }
     
     
       public void acaoMIListarExpedicaoEmAndamento(ActionEvent evt){
        
        ControleListarExpedicaoEmAndamento cListarExpedicaoEmAndamento = new ControleListarExpedicaoEmAndamento();
        telaInicial.getjDPPrincipal().add(cListarExpedicaoEmAndamento.gettelaListarExpedicaoEmAndamento());
        cListarExpedicaoEmAndamento.gettelaListarExpedicaoEmAndamento().setVisible(true);
        
    }
       
        public void acaoMIListarExpedicaoFinalizados(ActionEvent evt){
        
        ControleListarExpedicaoFinalizados cListarExpedicaoFinalizados = new ControleListarExpedicaoFinalizados();
        telaInicial.getjDPPrincipal().add(cListarExpedicaoFinalizados.gettelaListarExpedicaoFinalizados());
        cListarExpedicaoFinalizados.gettelaListarExpedicaoFinalizados().setVisible(true);
        
    }
        
        
         public void acaoMIListarExpedicaoTransportadora(ActionEvent evt){
        
        ControleListarExpedicaoTransportadora cListarExpedicaoTransportadora = new ControleListarExpedicaoTransportadora();
        telaInicial.getjDPPrincipal().add(cListarExpedicaoTransportadora.gettelaListarExpedicaoTransportadora());
        cListarExpedicaoTransportadora.gettelaListarExpedicaoTransportadora().setVisible(true);
        
    }
         
         
        public void acaoMIListarPedidosExpedicao(ActionEvent evt){
        
        ControleListarPedidosExpedicao cListarPedidosExpedicao = new ControleListarPedidosExpedicao();
        telaInicial.getjDPPrincipal().add(cListarPedidosExpedicao.gettelaListarPedidosExpedicao());
        cListarPedidosExpedicao.gettelaListarPedidosExpedicao().setVisible(true);
        
    }
           
           
      public void acaoMIListarPedidosFinalizado(ActionEvent evt){
        
        ControleListarPedidosFinalizado cListarPedidosFinalizado = new ControleListarPedidosFinalizado();
        telaInicial.getjDPPrincipal().add(cListarPedidosFinalizado.gettelaListarPedidosFinalizado());
        cListarPedidosFinalizado.gettelaListarPedidosFinalizado().setVisible(true);
        
    }
      
      
      public void acaoMIListarPedidosLaboratorio(ActionEvent evt){
        
        ControleListarPedidosLaboratorio cListarPedidosLaboratorio = new ControleListarPedidosLaboratorio();
        telaInicial.getjDPPrincipal().add(cListarPedidosLaboratorio.gettelaListarPedidosLaboratorio());
        cListarPedidosLaboratorio.gettelaListarPedidosLaboratorio().setVisible(true);
        
    }
      
      public void acaoMIListarPedidosProducao(ActionEvent evt){
        
        ControleListarPedidosProducao cListarPedidosProducao = new ControleListarPedidosProducao();
        telaInicial.getjDPPrincipal().add(cListarPedidosProducao.gettelaListarPedidosProducao());
        cListarPedidosProducao.gettelaListarPedidosProducao().setVisible(true);
        
    }
      
       public void acaoMIListarProducaoEmAndamento(ActionEvent evt){
        
        ControleListarProducaoEmAndamento cListarProducaoEmAndamento = new ControleListarProducaoEmAndamento();
        telaInicial.getjDPPrincipal().add(cListarProducaoEmAndamento.gettelaListarProducaoEmAndamento());
        cListarProducaoEmAndamento.gettelaListarProducaoEmAndamento().setVisible(true);
        
    }
       
       public void acaoMIListarProducaoFinalizados(ActionEvent evt){
        
        ControleListarProducaoFinalizados cListarProducaoFinalizados = new ControleListarProducaoFinalizados();
        telaInicial.getjDPPrincipal().add(cListarProducaoFinalizados.gettelaListarProducaoFinalizados());
        cListarProducaoFinalizados.gettelaListarProducaoFinalizados().setVisible(true);
        
    }
       
        public void acaoMIListarTitasAvalicoes(ActionEvent evt){
        
        ControleListarTintasAvaliacoes cListarTintasAvaliacoes = new ControleListarTintasAvaliacoes();
        telaInicial.getjDPPrincipal().add(cListarTintasAvaliacoes.gettelaListarTintasAvaliacoes());
        cListarTintasAvaliacoes.gettelaListarTintasAvaliacoes().setVisible(true);
        
    }
        
      public void acaoMIListarTitasCatalogo(ActionEvent evt){
        
        ControleListarTintasCatalogo cListarTintasCatalogo = new ControleListarTintasCatalogo();
        telaInicial.getjDPPrincipal().add(cListarTintasCatalogo.gettelaListarTintasCatalogo());
        cListarTintasCatalogo.gettelaListarTintasCatalogo().setVisible(true);
        
    }
     
      
      
    
      
      
    
    
    
    
    
}