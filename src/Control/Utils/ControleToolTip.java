/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Utils;

import javax.swing.JComponent;
import javax.swing.JToolTip;
import javax.swing.Popup;
import javax.swing.PopupFactory;

/**
 *
 * @author Djair Maykon
 */
public class ControleToolTip{
    
    private Popup tooltip;
    
    public void showToolTip(JComponent component, String msg) {  
        
        if(tooltip != null)
            return;
        
        String toolTipText = "<html><font color=#395D75><b>Aviso</b><br>" +  
                             msg + "</font></html>";  
                  
        JToolTip tooltip1 = component.createToolTip();  
  
        PopupFactory popupFactory = PopupFactory.getSharedInstance();  
        tooltip1.setTipText(toolTipText);  
          
        tooltip = popupFactory.getPopup(component, tooltip1,  
                        component.getLocationOnScreen().x,  
                        component.getLocationOnScreen().y + component.getHeight() + 2);  
        
        tooltip.show();  
        
    }  
          
    public void hideToolTip() {  
        
        if (tooltip != null){
            tooltip.hide();
            tooltip = null;
        }
        
    }

    public boolean isTooltipNull() {
        return tooltip == null;
    }
    
}
