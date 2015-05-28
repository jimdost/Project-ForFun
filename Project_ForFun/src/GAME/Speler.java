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
    protected Element element;
    protected Level level;
    protected Speler speler;
    private Element[][] maze;
    
    public Speler(int x, int y)
    { 
        tileX = x;
        tileY = y;
        setLoopbaar(true);
        getPositieX();
        getPositieY();
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
        setBounds(tileX, tileY, ELEMENT_SIZE , ELEMENT_SIZE);
    }
    
    @Override
    public void paintComponent(Graphics g) {
    
        super.paintComponent(g);        
        
        g.setColor(Color.yellow);
        g.fillOval(2, 2, 16, 16);       
        
    }

    void moveUp() {
        element = (Element) maze[tileY - 1][tileX];

            if (element.getLoopbaar() == true) {
                speler.move(0, -20);
                System.out.println("Y  " + element.getPositieY());
                System.out.println("X  " + element.getPositieX());
            }
    }

    void moveDown() {
        element = (Element) maze[tileY + 1][tileX];

            if (element.getLoopbaar() == true) {
                speler.move(0, 20);
                System.out.println("Y  " + element.getPositieY());
                System.out.println("X  " + element.getPositieX());
            }
    }

    void moveLeft() {
        element = (Element) maze[tileY][tileX - 1];

            if (element.getLoopbaar() == true) {
                speler.move(-20, 0);
                System.out.println("Y  " + element.getPositieY());
                System.out.println("X  " + element.getPositieX());
            }
    }

    void moveRight() {
        element = (Element) maze[tileY][tileX + 1];

            if (element.getLoopbaar() == true) {
                speler.move(20, 0);
                System.out.println("Y  " + element.getPositieY());
                System.out.println("X  " + element.getPositieX());
            }
    }
}
