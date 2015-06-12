/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;



import java.util.HashMap;

/**
 *
 * @author wytze
 */
public class Veld{

    int veltCordinateX;
    int veltCordinateY;
    Veld[][] bord;
    Element element = null; 
    HashMap<String, Veld> buren;    
    
    Veld() {        
                 
    }

    protected void getBuuren(int positieY, int positieX){
                
     buren = new HashMap<>();     
     
     buren.put("UP", bord[positieY - 1][positieX]);
     buren.put("DOWN", bord[positieY + 1][positieX]);
     buren.put("LEFT", bord[positieY][positieX - 1]);
     buren.put("RIGHT", bord[positieY][positieX + 1]);        
    }

    public void setElement(Element element) {
        this.element = element;
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
