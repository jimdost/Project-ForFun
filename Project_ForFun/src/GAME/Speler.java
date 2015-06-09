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

    private int tileX, tileY;

    public Speler(int x, int y) {
        tileX = x;
        tileY = y;
        setLoopbaar(true);
        getPositieX();
        getPositieY();
    }

    public int getTileX() {
        return tileX;
    }

    public int getTileY() {
        return tileY;
    }

    public void move(int dx, int dy) {
        tileX = tileX + dx;
        tileY = tileY + dy;
        setBounds(tileX, tileY, ELEMENT_SIZE, ELEMENT_SIZE);
    }

@Override
        public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.yellow);
        g.fillOval(2, 2, 16, 16);

    }
}
