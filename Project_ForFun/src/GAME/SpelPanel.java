/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Color;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author wytze
 */
public class SpelPanel extends JPanel {

    private Veld[][] bord;
    private Level level;
    private int aantalStappen;

    public SpelPanel() {
        setLayout(null);
        aantalStappen = 0;
        level = new Level();
        bord = level.getBord();

        DrawLevel();

        setSize(bord.length * level.getVeltSize() + 5, bord.length * level.getVeltSize() + 62);
        setBackground(Color.BLACK);
        revalidate();
    }

    private void DrawLevel() {
        Element element;
        int xB = 0;
        int yB = 0;

        for (int x = 0; x < bord.length; x++) {
            for (int y = 0; y < bord.length; y++) {
                if (bord[x][y] != null) {
                    element = bord[x][y].getElement();
                    element.setBounds(xB, yB, level.getVeltSize(), level.getVeltSize());
                    add(element);
                }
                xB = xB + level.getVeltSize();
            }
            yB = yB + level.getVeltSize();
            xB = 0;
        }
        repaint();
    }

    protected void UpdateLevel() {
        Element element;
        int xB = 0;
        int yB = 0;

        for (int x = 0; x < bord.length; x++) {
            for (int y = 0; y < bord.length; y++) {
                if ((bord[x][y].getElement() instanceof Speler) || (bord[x][y].getElement() instanceof Item)) {
                    element = bord[x][y].getElement();
                    element.setBounds(xB, yB, level.getVeltSize(), level.getVeltSize());
                    add(element);
                }
                xB = xB + level.getVeltSize();
            }
            yB = yB + level.getVeltSize();
            xB = 0;
        }
        repaint();
    }

    Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

}
