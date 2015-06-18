/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author wytze
 */
public class Muur extends Element {

    private int sterkte;
    
    Muur(int sterkte) {        
        setLoopbaar(false);        
        this. sterkte = sterkte;
    }
    
    public void gethit(Raket r){
        sterkte = sterkte - r.getSterkteExplosie();
        if(sterkte <= 0){
            veld.setElement(null);
            this.setVisible(false);
        }
    }

    public int getSterkte() {
        return sterkte;
    }

    public void setSterkte(int sterkte) {
        this.sterkte = sterkte;
    }
 
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();        
        Image i = new ImageIcon(getClass().getClassLoader().getResource("Images/WallBricks.png")).getImage();
        g2.drawImage(i, 0, 0, 30, 30, null, this);
        g2.dispose();

    }

}
