/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import View.TelasCadastrar.Funcionario.TCadastrarFuncionario;
import View.TelasCadastrar.TCadastrarTransportadora;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarFuncionario {
    
   private TCadastrarFuncionario CadastrarFuncionario; 
    
    public ControleCadastrarFuncionario () {
    
      CadastrarFuncionario = new TCadastrarFuncionario();
    
    }

    public TCadastrarFuncionario getCadastrarFuncionario() {
        return CadastrarFuncionario;
    }

 
}
