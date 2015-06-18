/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.List;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author wytze
 */
public class Speler extends Element {

    private int sizeSpeler = 30;
    private int sizeBorderSpeler = 0;
    private String direction = "RIGHT";
    private ArrayList<Raket> lijstRakketen = new ArrayList<>();

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

    public void move(String direction) {

        Veld buur = veld.level.getBuuren(veld.veltCordinateY, veld.veltCordinateX, direction);
        this.direction = direction;
        System.out.println(buur.getElement());

        if (buur.getElement() == null || buur.getElement().getLoopbaar()) {
            if (buur.getElement() instanceof Item) {
                Item i = (Item) buur.getElement();
                i.pakOp();
            }
            veld.setElement(null);
            buur.setElement(this);
        }
    }

    public void schiet() {
        if (!lijstRakketen.isEmpty()) {
            Raket r = lijstRakketen.get(0);
            veld.setElement(r);
            r.move(direction);
            lijstRakketen.remove(0);
        }
    }

    public void setList(Raket r) {
        for (int i = 0; i < 5; i++) {
            lijstRakketen.add(r);
        }
    }

    @Override
    public void paintComponent(Graphics g
    ) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        Image i = new ImageIcon(getClass().getClassLoader().getResource("Images/player.png")).getImage();
        g2.drawImage(i, 0, sizeBorderSpeler, 30, sizeSpeler, null, this);
        g2.dispose();
    }

    private void animation() {
        if (sizeSpeler > 29) {
            sizeSpeler = sizeSpeler - 1;
            sizeBorderSpeler = sizeBorderSpeler + 1;
        } else {
            sizeSpeler = sizeSpeler + 1;
            sizeBorderSpeler = sizeBorderSpeler - 1;
        }
        repaint();
    }
}
