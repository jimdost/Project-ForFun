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

    private boolean hasItem;
    Level level;
    Veld[][] bord;

    Speler() {
        setLoopbaar(true);
    }
    
    public void getItem()
    {
        //When on the same place as an item. Pick up item.
    }
    
    public void shoot(String direction, boolean hasItem) {
        Raket raket = new Raket(550);
        if (direction.equals("UP"))
        {
            raket.move(direction.toString());
        }
        else if (direction.equals("DOWN"))
        {
            raket.move(direction.toString());
        }
        else if (direction.equals("LEFT"))
        {
            raket.move(direction.toString());
        }
        else if (direction.equals("RIGHT"))
        {
            raket.move(direction.toString());
        }
    }
    
    public void move(String direction) {        
        
        veld.getBuuren(veld.veltCordinateY, veld.veltCordinateX);   
        
        if(veld.buren.get(direction).getElement().getLoopbaar()){
            
            System.out.println(veld.buren.get(direction).getElement().getLoopbaar());
            System.out.println(veld.buren.get(direction).getPositieX());
            System.out.println(veld.buren.get(direction).getPositieY());
            veld.setPositieX(veld.buren.get(direction).getPositieX());
            veld.setPositieY(veld.buren.get(direction).getPositieY());
            
            repaint();
        }     
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.yellow);
        g.fillOval(2, 2, 16, 16);

    }

    void checkItem() {
        //This method is performed when the Spacebar Key is clicked. It checks to see if the player is holding a Bazooka.
        //If true, then call on the Shoot method. If false, then do nothing.
        //Shoot needs the directions too. Get them from somewhere.
        //In this method you give either true or false to the question of hasItem from the shoot method.
    }
}
