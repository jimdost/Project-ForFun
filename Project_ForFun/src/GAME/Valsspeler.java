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
        setOppakbaar(true);        
    }

    public int getCheatingAantalStappen() {
        return cheatingAantalStappen;
    }

    public void setCheatingAantalStappen(int cheatingAantalStappen) {
        this.cheatingAantalStappen = cheatingAantalStappen;
    }
    
    @Override
    protected void pakOp() {
        setOppakbaar(false);
        System.out.println("ValsSpeler");
    }
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.orange);
        g.fillOval(2, 2, 16, 16);
    }    
}
