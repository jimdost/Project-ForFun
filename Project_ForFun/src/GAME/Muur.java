/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author wytze
 */
public class Muur extends Element {

    int sterkte;
    
    Muur(int sterkte) {
        
        setLoopbaar(false);        
        this. sterkte = sterkte;
    }

    public int getSterkte() {
        return sterkte;
    }

    public void setSterkte(int sterkte) {
        this.sterkte = sterkte;
    }

    public void destroyWall()
    {
        //The wall that has been hit by the rocket will be destroyed.
    }
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 30, 30);
        
        g.setColor(Color.WHITE);
        g.fillRect(3, 3, 23, 23);

    }

}
