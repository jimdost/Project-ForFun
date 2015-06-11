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

    public Item() {        
        setLoopbaar(true);        
    }
    
    abstract void pakOp();
    
}
