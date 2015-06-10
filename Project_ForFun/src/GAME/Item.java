/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Tiko
 */
public abstract class Item extends Element {
    boolean oppakbaar;

    public Item(boolean oppakbaar) {
        getVeld();
        setLoopbaar(true);
        this.oppakbaar = oppakbaar;
    }

    public boolean getOppakbaar() {
        return oppakbaar;
    }

    public void setOppakbaar(boolean oppakbaar) {
        this.oppakbaar = oppakbaar;
    }
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.white);
        g.fillOval(2, 2, 16, 16);
    }
}
