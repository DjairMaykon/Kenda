/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JComponent;
import javax.swing.JToolTip;
import javax.swing.Popup;
import javax.swing.PopupFactory;

/**
 *
 * @author Djair Maykon
 */
public class ControleToolTip{
    
    Popup tooltip;
    
    public void showToolTip(JComponent component, String msg) {  
                  
        String toolTipText = "<html><font color=red>Aviso</font><br>" +  
                             msg + "</html>";  
                  
        JToolTip tooltip1 = component.createToolTip();  
  
        PopupFactory popupFactory = PopupFactory.getSharedInstance();  
        tooltip1.setTipText(toolTipText);  
          
        tooltip = popupFactory.getPopup(component, tooltip1,  
                        component.getLocationOnScreen().x,  
                        component.getLocationOnScreen().y + component.getHeight() + 2);  
          
          
        tooltip.show();  
        
    }  
          
    public void hideToolTip() {  
        
        if (tooltip != null)
            tooltip.hide();
        
    }
    
}
