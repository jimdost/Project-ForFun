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
public class Bazooka extends Item {

    int transparand = 255;
    
    public Bazooka() {
        setOppakbaar(true);
    }

    @Override
    protected void pakOp() {
        setOppakbaar(false);
        System.out.println("Bazooka");
        transparand = transparand - 255;
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        
        Color c = new Color(0, 0, 255, transparand);
        g.setColor(c);
        g.fillOval(2, 2, 16, 16);
    }

}
