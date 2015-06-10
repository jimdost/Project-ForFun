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
public class Helper extends Item {

    Element[][] daMaze;
    int mazeSize;

    public Helper() {   
        setLoopbaar(true);        
    }

    @Override
    protected void pakOp() {
        setOppakbaar(false);
        System.out.println("Helper");
    }
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);        
        
        g.setColor(Color.pink);
        g.fillOval(2, 2, 16, 16);

    }
}
