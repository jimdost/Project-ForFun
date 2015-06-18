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

    Vriend() {
              
    }
   
    @Override
    protected void pakOp() {   
        veld.level.spelpanel.DrawWin();         
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.green);        
        g.fillRect(5, 5, veld.level.getVeltSize() * 2/3, veld.level.getVeltSize() * 2/3);
        
    }
}
