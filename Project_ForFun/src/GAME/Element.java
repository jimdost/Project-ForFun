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

    private int posX;
    private int posY;
    private boolean loopbaar;

    public Element() {

    }

    protected boolean getLoopbaar() {
        return loopbaar;
    }

    protected void setLoopbaar(boolean loopbaar) {
        this.loopbaar = loopbaar;
    }

    protected int getPositieX() {
        return posX;
    }

    protected int getPositieY() {
        return posY;
    }

    protected void setPositieX(int posX) {
        this.posX = posX;
    }

    protected void setPositieY(int posY) {
        this.posY = posY;
    }

}
