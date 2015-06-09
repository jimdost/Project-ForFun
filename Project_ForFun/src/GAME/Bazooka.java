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

    public Bazooka(boolean oppakbaar) {
        super(oppakbaar);
        setOppakbaar(true);
    }
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.blue);
        g.fillOval(2, 2, 16, 16);
    }
    
}
