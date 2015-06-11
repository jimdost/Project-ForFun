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
    
    private int cheatingAantalStappen;

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
        setVisible(false);
    }
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.orange);
        g.fillOval(2, 2, 16, 16);
    }    
}
