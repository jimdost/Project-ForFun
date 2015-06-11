/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import java.util.logging.Logger;

/**
 *
 * @author wytze
 */
public class Speler extends Element {

    private boolean hasItem;
    private int sizeSpeler = 16;
    private int sizeBorderSpeler = 2;

    Thread t = new Thread() {

        @Override
        public void run() {
            while (true) {
                animation();
                try {
                    sleep(400);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SpelPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        }
    };

    Speler() {
        setLoopbaar(true);
        t.start();
    }

    public void getItem() {
        //When on the same place as an item. Pick up item.
    }

    public void shoot(String direction, boolean hasItem) {
        Raket raket = new Raket(550);
        if (direction.equals("UP")) {
            raket.move(direction.toString());
        } else if (direction.equals("DOWN")) {
            raket.move(direction.toString());
        } else if (direction.equals("LEFT")) {
            raket.move(direction.toString());
        } else if (direction.equals("RIGHT")) {
            raket.move(direction.toString());
        }
    }

    public void move(String direction) {

        veld.getBuuren(veld.getPositieY(), veld.getPositieX());         

        if ((veld.buren.get(direction).getElement() == null) || (veld.buren.get(direction).getElement().getLoopbaar())) {
            if(veld.buren.get(direction).getElement() instanceof Item){
                Item i = (Item) veld.buren.get(direction).getElement();                
                i.pakOp(); 
            }            
            veld.setElement(null);
            veld.buren.get(direction).setElement(this);
            (this).setVeld(veld.buren.get(direction));
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.yellow);
        g.fillOval(sizeBorderSpeler, sizeBorderSpeler, sizeSpeler, sizeSpeler);   
    }

    private void animation() {
        if (sizeSpeler > 15) {
            sizeSpeler = sizeSpeler - 2;
            sizeBorderSpeler = sizeBorderSpeler + 1;
        } else {
            sizeSpeler = sizeSpeler + 2;
            sizeBorderSpeler = sizeBorderSpeler - 1;
        }
        repaint();
    }
}
