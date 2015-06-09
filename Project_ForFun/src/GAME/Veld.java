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
public class Veld{

    Level level;
    int veltCordinateX;
    int veltCordinateY;
    Element element;
    
    Veld(Element element) { 
        this.element  = element;         
    }
    
    
    
        
    protected Element getElement(){
        return element;
    }

    protected int getPositieX() {
        return veltCordinateX;
    }

    protected int getPositieY() {
        return veltCordinateY;
    }

    protected void setPositieX(int posX) {
        this.veltCordinateX = posX;
    }

    protected void setPositieY(int posY) {
        this.veltCordinateY = posY;
    }

}
