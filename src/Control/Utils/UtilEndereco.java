/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Utils;

import Model.MEndereco;
import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Djair Maykon
 */
public class UtilEndereco{

    public static MEndereco buscarEndereco(String _cep){
        
        MEndereco end = null;
        
        try {
            
            end = new MEndereco();
            
            ArrayList<MEndereco> listar = end.listar();
        
            if(listar.isEmpty()){
            
                end.setCodigo(0);
            
            }else{
                
                for(MEndereco e : listar){
                    
                    if(e.getCep().equals(_cep)){
                        
                        return e;
                        
                    }
                    
                }
                
                int c = listar.get(0).getCodigo() + 1;
                end.setCodigo(c);
                
            }
            
            ViaCEP vCep = new ViaCEP(_cep);
            end.setBairro(vCep.getBairro());
            end.setCep(_cep);
            end.setCidade(vCep.getLocalidade());
            end.setRua(vCep.getLogradouro());
            end.setUf(vCep.getUf());
            
            end.adicionar();
            
        } catch (ViaCEPException ex) {
            JOptionPane.showMessageDialog(null, "Problemas ao Buscar o cep: " + _cep);
            throw new RuntimeException("Erro ao Buscar CEP: \n"+ex);
        }
        
        return end;
        
    }

}
