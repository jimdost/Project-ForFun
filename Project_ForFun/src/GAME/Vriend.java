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
public class Vriend extends Item {

    Level level;

    Vriend() {
              
    }
   
    @Override
    protected void pakOp() {   
        level.spelpanel.DrawWin();
        level.getSpeler().setVisible(false);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.green);        
        g.fillRect(5, 5, 20, 20);
        
    }
}
