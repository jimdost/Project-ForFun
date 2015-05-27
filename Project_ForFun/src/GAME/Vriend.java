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
public class Vriend extends Element {

    Vriend() {
        setLoopbaar(true);
        getPositieX();
        getPositieY();
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.green);
        g.fillOval(2, 2, 16, 16);

    }
}
