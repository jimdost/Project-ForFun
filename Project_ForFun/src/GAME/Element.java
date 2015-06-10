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
public abstract class Element extends JComponent{

    
    private boolean loopbaar = true;
    Veld veld;
    //moet veld kennen

    public Element() {
         
    }

    public Veld getVeld() {
        return veld;
    }

    public void setVeld(Veld veld) {
        this.veld = veld;
    }
    
    protected boolean getLoopbaar() {
        return loopbaar;
    }

    protected void setLoopbaar(boolean loopbaar) {
        this.loopbaar = loopbaar;
    }   

}
