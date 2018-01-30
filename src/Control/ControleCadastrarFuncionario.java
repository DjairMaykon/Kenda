/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import View.TelasCadastrar.Funcionario.TCadastrarFuncionario;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarFuncionario {
    
   private TCadastrarFuncionario telaCadastrarFuncionario; 
    
    public ControleCadastrarFuncionario () {
    
      telaCadastrarFuncionario = new TCadastrarFuncionario();
    
    }

    public TCadastrarFuncionario getTelaCadastrarFuncionario() {
        return telaCadastrarFuncionario;
    }

 
}
