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
public class Valsspeler extends Item{
    
    private int cheatingAantalStappen = 10;
    Level level;

    public Valsspeler() {       
                
    }

    public int getCheatingAantalStappen() {
        return cheatingAantalStappen;
    }

    public void setCheatingAantalStappen(int cheatingAantalStappen) {
        this.cheatingAantalStappen = cheatingAantalStappen;
    }
    
    @Override
    protected void pakOp() {        
        System.out.println("ValsSpeler");   
        level.spelpanel.aantalStappen = level.spelpanel.aantalStappen - cheatingAantalStappen;
        setVisible(false);
    }
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.orange);
        g.fillOval(5, 5, 20, 20);
    }    
}
