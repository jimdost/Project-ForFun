/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import javax.swing.JComponent;

/**
 *
 * @author wytze
 */
public abstract class Element extends JComponent {
    
    boolean loopbaar;

    public Element() {       
        
    } 
    
    public boolean getLoopbaar(){
        return loopbaar;
    }
    
}
