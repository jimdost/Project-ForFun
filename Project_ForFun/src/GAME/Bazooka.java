/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Tiko
 */
public class Bazooka extends Item {
    
    public Bazooka() {
        
    }
    
    @Override
    protected void pakOp() {
        Raket r = new Raket();
        veld.level.getSpeler().setList(r);
        setVisible(false);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);        
        Graphics2D g2 = (Graphics2D) g.create();          
        Image i = new ImageIcon(getClass().getClassLoader().getResource("Images/Bazooka.png")).getImage();
        g2.drawImage(i, 0, 0, 30, 30, null, this);
        g2.dispose();
    }
    
}
