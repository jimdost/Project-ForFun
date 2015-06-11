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
public final class SpelPanel extends JPanel {

    private final Veld[][] bord;
    private Level level;
    private final int aantalStappen;

    public SpelPanel(int levelnummer) {
        setLayout(null);
        aantalStappen = 0;

        level = new Level(levelnummer);
        bord = level.getBord();
        DrawLevel();

        setSize(bord.length * level.getVeltSize() + 5, bord.length * level.getVeltSize() + 62);
        setBackground(Color.BLACK);
        revalidate();
    }

    protected void DrawLevel() {        
        int xB = 0;
        int yB = 0;
        
        for (int x = 0; x < bord.length; x++) {
            for (int y = 0; y < bord.length; y++) {                
                if (bord[x][y].getElement() != null) {   
                    Veld veld = bord[x][y];
                    veld.getElement().setBounds(xB, yB, level.getVeltSize(), level.getVeltSize());
                    add(veld.getElement());
                }                
                xB = xB + level.getVeltSize();
            }
            yB = yB + level.getVeltSize();
            xB = 0;
        }        
    }

    protected void UpdateLevel() {        
        int xB = 0;
        int yB = 0;

        for (int x = 0; x < bord.length; x++) {
            for (int y = 0; y < bord.length; y++) {
                
                if (bord[x][y].getElement() instanceof Speler || bord[x][y].getElement() instanceof PadSolved) {  
                    Veld veld = bord[x][y];
                    veld.getElement().setBounds(xB, yB, level.getVeltSize(), level.getVeltSize());
                    add(veld.getElement());
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

    public void nextLevel() {

    }

}
