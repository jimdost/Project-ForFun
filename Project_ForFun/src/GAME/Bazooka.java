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
    
    public Bazooka() {
        
    }
    
    @Override
    protected void pakOp() {        
        System.out.println("Bazooka");              
        setVisible(false);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        Color c = new Color(0, 0, 255);
        g.setColor(c);
        g.fillOval(2, 2, 16, 16);
    }
    
}
