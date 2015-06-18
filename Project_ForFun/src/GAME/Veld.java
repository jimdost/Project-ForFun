/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;



/**
 *
 * @author wytze
 */
public class Veld {

    private int veltCordinateX;
    private int veltCordinateY;
    private Element element;
    private Level level;

    Veld() {

    }

    public void setElement(Element element) {
        this.element = element;
        if (element != null) {
            element.setVeld(this);
        } else {
            this.element = null;
        }
    }

    public Element getElement() {
        return element;
    }

    public int getPositieX() {
        return veltCordinateX;
    }

    public int getPositieY() {
        return veltCordinateY;
    }

    public Level getLevel() {
        return level;
    }

    protected void setPositieX(int posX) {
        this.veltCordinateX = posX;
    }

    protected void setPositieY(int posY) {
        this.veltCordinateY = posY;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
