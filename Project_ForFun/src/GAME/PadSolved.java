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
public class PadSolved extends Element{
    
    PadSolved() {
        setLoopbaar(true);
        getPositieX();
        getPositieY();
    }
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);       
        
        g.setColor(Color.black);
        g.fillRect(0, 0, 20, 20);
        
        g.setColor(Color.ORANGE);
        g.fillRect(6, 6, 8, 8);
        
        

    }    
}
