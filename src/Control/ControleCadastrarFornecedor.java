/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import View.TelasCadastrar.TCadastrarFornecedor;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarFornecedor {
    
    private TCadastrarFornecedor cadastrarFornecedor; 
    
    public ControleCadastrarFornecedor() {
    
      cadastrarFornecedor =new TCadastrarFornecedor();
    
    }

    public TCadastrarFornecedor getCadastrarFornecedor() {
        return cadastrarFornecedor;
    }

   
    
}
