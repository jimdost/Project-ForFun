/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author wytze
 */
public class Muur extends Element {

    Muur() {
        loopbaar = false;        
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.blue);
        g.fillRect(0, 0, 20, 20);

        Color c = new Color(255, 0, 0);
        g.setColor(c);
        g.fillRect(-3, -3, 21, 21);

    }

}
