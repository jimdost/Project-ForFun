/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;


/**
 *
 * @author wytze
 */
public abstract class Item extends Element {
    
    boolean oppakbaar = true;

    public Item() {        
        setLoopbaar(true);        
    }
    
    abstract void pakOp();

    public boolean getOppakbaar() {
        return oppakbaar;
    }

    public void setOppakbaar(boolean oppakbaar) {
        this.oppakbaar = oppakbaar;
    }   
}
