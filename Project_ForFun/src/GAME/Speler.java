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

public class Speler extends Element {    
    
    private int tileX ,tileY; 
    private Keyboard keyboard = new Keyboard();
    
    public Speler(int x, int y)
    {   
        keyboard = new Keyboard();
        tileX = x;
        tileY = y;
        loopbaar = true;
    }   
    
    public Keyboard getKeybord(){
        return keyboard;
    }
    
    public int getTileX()
    {
        return tileX;
    }
    
    public int getTileY()
    {
        return tileY;
    }    
    
    public void move(int dx, int dy){        
        tileX = tileX + dx;
        tileY = tileY + dy; 
        setBounds(tileX, tileY, 20, 20);
    }
    
    @Override
    public void paintComponent(Graphics g) {
    
        super.paintComponent(g);        
        
        g.setColor(Color.yellow);
        g.fillOval(2, 2, 16, 16);       
        
    }
}
