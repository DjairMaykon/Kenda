package Control;

import Control.Novo.*;
import Control.Cadastrar.*;
import Model.MUsuario;
import View.Listar.Cliente.TListarCliente;
import View.Listar.Estoque.TListarEstoqueFornecedores;
import View.Listar.Estoque.TListarEstoqueMateriaPrima;
import View.Listar.Expedicao.TListarExpedicaoTransportadora;
import View.Listar.Tintas.TListarTintasCatalogo;
import View.TInicial;
import View.TelasNovo.*;
import View.TelasCadastrar.*;
import View.TelasCadastrar.Funcionario.TCadastrarFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Djair Maykon
 */
public class ControleTInicial {

    private TInicial telaInicial;
    private MUsuario modeloUsuario;
    
    private ControleNovoAvaliacaoTinta cNovoAvaliacaoDeTinta;
    private ControleNovoExpedicao cNovoExpedicao;
    private ControleNovoMateriaPrima cNovoMateriaPrima;
    private ControleNovoPedido cNovoPedido;
    private ControleNovoProducao cNovoProducao;

    private ControleCadastrarCliente cCadastrarCliente;
    private ControleCadastrarFornecedor cCadastrarFornecedor;
    private ControleCadastrarFuncionario cCadastrarFuncionario;
    private ControleCadastrarSetor cCadastrarSetor;
    private ControleCadastrarTinta cCadastrarTinta;
    private ControleCadastrarTransportadora cCadastrarTransportadora;
    
    private ControleListarTintasCatalogo cListarTintasCatalogo;
    private ControleListarCliente cListarClientes;
    private ControleListarEstoqueFornecedores cListarFornecedores;
    private ControleListarExpedicaoTransportadora cListarTransportadoras;
    private ControleListarEstoqueMateriaPrima cListarMateriaPrima;
    
    public ControleTInicial(MUsuario u1) {
        
        cNovoAvaliacaoDeTinta = null;
        cNovoExpedicao = null;
        cNovoMateriaPrima = null;
        cNovoPedido = null;
        cNovoProducao = null;
        
        cCadastrarCliente = null;
        cCadastrarFornecedor = null;
        cCadastrarFuncionario = null;
        cCadastrarSetor = null;
        cCadastrarTinta = null;
        cCadastrarTransportadora = null;
        
        cListarFornecedores=null;
        cListarTransportadoras=null;
        cListarTintasCatalogo=null;
        cListarClientes=null;
        cListarMateriaPrima=null;
        
        modeloUsuario = u1;
        telaInicial = new TInicial();
        telaInicial.setVisible(true);
        
        telaInicial.getjDPPrincipal().addContainerListener(new ContainerAdapter() {
            
            @Override
            public void componentRemoved(ContainerEvent e) {
                
                if(e.getChild() instanceof TNovoAvaliacaoTinta){
                    cNovoAvaliacaoDeTinta = null;
                }
                if(e.getChild() instanceof TNovoExpedicao){
                    cNovoExpedicao = null;
                }
                if(e.getChild() instanceof TNovoMateriaPrima){
                    cNovoMateriaPrima = null;
                }
                if(e.getChild() instanceof TNovoPedido){
                    cNovoPedido = null;
                }
                if(e.getChild() instanceof TNovoProducao){
                    cNovoProducao = null;
                }
                
                if(e.getChild() instanceof TCadastrarCliente){
                    cCadastrarCliente = null;
                }
                if(e.getChild() instanceof TCadastrarFornecedor){
                    cCadastrarFornecedor = null;
                }
                if(e.getChild() instanceof TCadastrarFuncionario){
                    cCadastrarFuncionario = null;
                }
                if(e.getChild() instanceof TCadastrarSetor){
                    cCadastrarSetor = null;
                }
                if(e.getChild() instanceof TCadastrarTinta){
                    cCadastrarTinta = null;
                }
                
                if(e.getChild() instanceof TCadastrarTransportadora){
                    cCadastrarTransportadora = null;
                }
                 if(e.getChild() instanceof TListarTintasCatalogo ){
                    cListarTintasCatalogo = null;
                }
                 if(e.getChild() instanceof TListarCliente){
                    cListarClientes = null;
                }
                if(e.getChild() instanceof TListarEstoqueFornecedores){
                    cListarFornecedores= null;
                }
                if(e.getChild() instanceof TListarExpedicaoTransportadora){
                    cListarTransportadoras= null;
                }
                if(e.getChild() instanceof TListarEstoqueMateriaPrima){
                    cListarMateriaPrima= null;
                }
            }
        });
        
        telaInicial.getjMINovoAvaliacaoDeTinta().addActionListener((ActionEvent e) -> {
            eventoChamarTelaNovoAvaliacaoDeTinta(e);
        });
         telaInicial.getjBCadastrarCliente().addActionListener((ActionEvent e) -> {
            eventoChamarTelaCadastrarCliente(e);
        });
         telaInicial.getjBNovoPedido().addActionListener((ActionEvent e) -> {
            eventoChamarTelaNovoPedido(e);
        });
        telaInicial.getjMINovoExpedicao().addActionListener((ActionEvent e) -> {
            eventoChamarTelaNovoExpedicao(e);
        });
        telaInicial.getjMINovoMateriaPrima().addActionListener((ActionEvent e) -> {
            eventoChamarTelaNovoMateriaPrima(e);
        });
        telaInicial.getjMINovoPedido().addActionListener((ActionEvent e) -> {
            eventoChamarTelaNovoPedido(e);
        });
        telaInicial.getjMINovoProducao().addActionListener((ActionEvent e) -> {
            eventoChamarTelaNovoProducao(e);
        });
        
        telaInicial.getjMICadastrarCliente().addActionListener((e) -> {
            eventoChamarTelaCadastrarCliente(e);
        });
        telaInicial.getjMICadastrarFornecedores().addActionListener((e) -> {
            eventoChamarTelaCadastrarFornecedores(e);
        });
        telaInicial.getjMICadastrarFuncionario().addActionListener((e) -> {
            eventoChamarTelaCadastrarFuncionario(e);
        });
        telaInicial.getjMICadastrarSetor().addActionListener((e) -> {
            eventoChamarTelaCadastrarSetor(e);
        });
        telaInicial.getjMICadastrarTinta().addActionListener((e) -> {
            eventoChamarTelaCadastrarTinta(e);
        });
        telaInicial.getjMICadastrarTransportadora().addActionListener((e) -> {
            eventoChamarTelaCadastrarTransportadora(e);
        });
        
        telaInicial.getjBSairDoUsuario().addActionListener((e) -> {
            eventoSairDoUsuario(e);
        });
        telaInicial.getjBAjuda().addActionListener((e) -> {
            eventoChamarTelaAjuda(e);
        });
        telaInicial.getjBCatalogoDeTintas().addActionListener((e) -> {
            eventoCatalogoDeTintas(e);
        });
        
        telaInicial.getjMIListarClientes().addActionListener((e) -> {
            eventoListarClientes(e);
        });
        telaInicial.getjSMIEstoqueFornecedores().addActionListener((e) -> {
            eventoListarFornecedores(e);
        });
        
        telaInicial.getjSMIExpedicaoTransportadoras().addActionListener((e) -> {
            eventoListarTransportadora(e);
        });
        
         telaInicial.getjSMIEstoqueMateriaPrima().addActionListener((e) -> {
            eventoListarMateriaPrima(e);
        });
        
    }
    
    public void eventoChamarTelaNovoAvaliacaoDeTinta(ActionEvent evt){
        
        if(cNovoAvaliacaoDeTinta != null)
            return;
        
        cNovoAvaliacaoDeTinta = new ControleNovoAvaliacaoTinta();
        telaInicial.getjDPPrincipal().add(cNovoAvaliacaoDeTinta.getTelaNovoAvaliacaoTinta());
        cNovoAvaliacaoDeTinta.getTelaNovoAvaliacaoTinta().setVisible(true);
                
    }
    
    public void eventoChamarTelaNovoExpedicao(ActionEvent evt){
        
        if(cNovoExpedicao != null)
            return;
        
        cNovoExpedicao = new ControleNovoExpedicao();
        telaInicial.getjDPPrincipal().add(cNovoExpedicao.getTelaNovoExpedicao());
        cNovoExpedicao.getTelaNovoExpedicao().setVisible(true);
                
    }
    
    public void eventoChamarTelaNovoMateriaPrima(ActionEvent evt){
        
        if(cNovoMateriaPrima != null)
            return;
        
        cNovoMateriaPrima = new ControleNovoMateriaPrima();
        telaInicial.getjDPPrincipal().add(cNovoMateriaPrima.getTelaNovoMateriaPrima());
        cNovoMateriaPrima.getTelaNovoMateriaPrima().setVisible(true);
                
    }
    
    public void eventoChamarTelaNovoPedido(ActionEvent evt){
        
        if(cNovoPedido != null)
            return;
        
        cNovoPedido = new ControleNovoPedido();
        telaInicial.getjDPPrincipal().add(cNovoPedido.getTelaNovoPedido());
        cNovoPedido.getTelaNovoPedido().setVisible(true);
                
    }
    
    public void eventoChamarTelaNovoProducao(ActionEvent evt){
        
        if(cNovoProducao != null)
            return;
        
        cNovoProducao = new ControleNovoProducao();
        telaInicial.getjDPPrincipal().add(cNovoProducao.getTelaNovoProducao());
        cNovoProducao.getTelaNovoProducao().setVisible(true);
                
    }

    private void eventoChamarTelaCadastrarCliente(ActionEvent e) {
    
        if(cCadastrarCliente != null)
            return;
        
        cCadastrarCliente = new ControleCadastrarCliente();
        telaInicial.getjDPPrincipal().add(cCadastrarCliente.getTelaCadastrarCliente());
        cCadastrarCliente.getTelaCadastrarCliente().setVisible(true);
        
    }
    
    private void eventoChamarTelaCadastrarFornecedores(ActionEvent e) {
    
        if(cCadastrarFornecedor != null)
            return;
        
        cCadastrarFornecedor = new ControleCadastrarFornecedor();
        telaInicial.getjDPPrincipal().add(cCadastrarFornecedor.getTelaCadastrarFornecedor());
        cCadastrarFornecedor.getTelaCadastrarFornecedor().setVisible(true);
        
    }
    
    private void eventoChamarTelaCadastrarFuncionario(ActionEvent e) {
    
        if(cCadastrarFuncionario != null)
            return;
        
        cCadastrarFuncionario = new ControleCadastrarFuncionario();
        telaInicial.getjDPPrincipal().add(cCadastrarFuncionario.getTelaCadastrarFuncionario());
        cCadastrarFuncionario.getTelaCadastrarFuncionario().setVisible(true);
        
    }
    
    private void eventoChamarTelaCadastrarSetor(ActionEvent e) {
    
        if(cCadastrarSetor != null)
            return;
        
        cCadastrarSetor = new ControleCadastrarSetor();
        telaInicial.getjDPPrincipal().add(cCadastrarSetor.getTelaCadastrarSetor());
        cCadastrarSetor.getTelaCadastrarSetor().setVisible(true);
        
    }
    
    private void eventoChamarTelaCadastrarTinta(ActionEvent e) {
    
        if(cCadastrarTinta != null)
            return;
        
        cCadastrarTinta = new ControleCadastrarTinta();
        telaInicial.getjDPPrincipal().add(cCadastrarTinta.getTelaCadastrarTinta());
        cCadastrarTinta.getTelaCadastrarTinta().setVisible(true);
        
    }
    
    private void eventoChamarTelaCadastrarTransportadora(ActionEvent e) {
    
        if(cCadastrarTransportadora != null)
            return;
        
        cCadastrarTransportadora = new ControleCadastrarTransportadora();
        telaInicial.getjDPPrincipal().add(cCadastrarTransportadora.getTelaCadastrarTransportadora());
        cCadastrarTransportadora.getTelaCadastrarTransportadora().setVisible(true);
        
    }
    
    private void eventoChamarTelaAjuda(ActionEvent e) {
    
        
        JOptionPane.showMessageDialog(null,"Sistema de Gerenciamento de Banco de Dados é simples de usar, possui desde adicionar \ndados ao banco"
                + " a listar informações. Ainda tem acesso rápido pelo menu inferior.");
        
    }
    
    
    private void eventoSairDoUsuario(ActionEvent e){
        
        telaInicial.dispose();
        ControlePrincipal.login();
    }
    
    private void eventoCatalogoDeTintas(ActionEvent e){
        
          if(cListarTintasCatalogo != null)
            return;
        
        cListarTintasCatalogo = new ControleListarTintasCatalogo();
        telaInicial.getjDPPrincipal().add(cListarTintasCatalogo.gettelaListarTintasCatalogo());
        cListarTintasCatalogo.gettelaListarTintasCatalogo().setVisible(true);
    }
     
    private void eventoListarClientes(ActionEvent e){
        
          if(cListarClientes != null)
            return;
        
        cListarClientes = new ControleListarCliente();
        telaInicial.getjDPPrincipal().add(cListarClientes.getListarCliente());
        cListarClientes.getListarCliente().setVisible(true);
        
    }
     
     
    private void eventoListarFornecedores(ActionEvent e){
        
          if(cListarFornecedores != null)
            return;
        
        cListarFornecedores = new ControleListarEstoqueFornecedores();
        telaInicial.getjDPPrincipal().add(cListarFornecedores.gettelaListarEstoqueFornecedores());
        cListarFornecedores.gettelaListarEstoqueFornecedores().setVisible(true);
        
    }
     
    private void eventoListarTransportadora(ActionEvent e){
        
          if(cListarTransportadoras != null)
            return;
        
        cListarTransportadoras= new ControleListarExpedicaoTransportadora();
        telaInicial.getjDPPrincipal().add(cListarTransportadoras.gettelaListarExpedicaoTransportadora());
        cListarTransportadoras.gettelaListarExpedicaoTransportadora().setVisible(true);
        
    }
      
      
    private void eventoListarMateriaPrima(ActionEvent e){
        
          if(cListarMateriaPrima != null)
            return;
        
        cListarMateriaPrima= new ControleListarEstoqueMateriaPrima();
        telaInicial.getjDPPrincipal().add(cListarMateriaPrima.gettelaListarEstoqueMateriaPrima());
        cListarMateriaPrima.gettelaListarEstoqueMateriaPrima().setVisible(true);
        
    }
    
    
}