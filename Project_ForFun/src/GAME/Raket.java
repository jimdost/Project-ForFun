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
public class Raket extends Element {

    int sterkteExplosie = 5;

    public Raket() {

    }

    public int getSterkteExplosie() {
        return sterkteExplosie;
    }

    public void setSterkteExplosie(int sterkteExplosie) {
        this.sterkteExplosie = sterkteExplosie;
    }

    int afstand = 0;

    void move(String direction) {
        
        System.out.println("piew");

        Veld buur = veld.level.getBuuren(veld.veltCordinateY, veld.veltCordinateX, direction);
        veld.setElement(null);
        if (buur.element == null) {
            buur.setElement(this);
            move(direction);
        }
        if (buur.element instanceof Item) {            
            Veld veldItem = buur.level.getBuuren(buur.veltCordinateY, buur.veltCordinateX, direction);
            System.out.println(veldItem.veltCordinateX);
            veldItem.setElement(this);             
        }
        if (buur.element instanceof Muur) {
            Muur muur = (Muur) buur.getElement();
            muur.gethit(this);
            muur.setVisible(false);
        }
    }
}
