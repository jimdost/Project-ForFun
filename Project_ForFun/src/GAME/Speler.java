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

    Level level;
    Veld[][] bord;

    Speler() {
        setLoopbaar(true);
    }

    public void move(String direction) {

        if (direction.equals("UP")) {
            if (bord[veld.veltCordinateX][veld.veltCordinateY - 1].getElement().getLoopbaar()) {
                veld.setPositieY(veld.veltCordinateY - 1);
            } else {
                System.out.println("muur");
            }
        }
        if (direction.equals("DOWN")) {
            if (bord[veld.veltCordinateX][veld.veltCordinateY + 1].getElement().getLoopbaar()) {
                veld.setPositieY(veld.veltCordinateY + 1);
            } else {
                System.out.println("muur");
            }
        }
        if (direction.equals("LEFT")) {
            if (bord[veld.veltCordinateX - 1][veld.veltCordinateY].getElement().getLoopbaar()) {
                veld.setPositieX(veld.veltCordinateX - 1);
            } else {
                System.out.println("muur");
            }
        }
        if (direction.equals("RIGHT")) {
            if (bord[veld.veltCordinateX + 1][veld.veltCordinateY].getElement().getLoopbaar()) {
                veld.setPositieX(veld.veltCordinateX + 1);
            } else {
                System.out.println("muur");
            }
        }

        System.out.println(veld.veltCordinateX);
        System.out.println(veld.veltCordinateY);

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.yellow);
        g.fillOval(2, 2, 16, 16);

    }
}
