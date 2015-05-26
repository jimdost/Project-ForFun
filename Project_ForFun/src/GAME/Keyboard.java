/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author wytze
 */
public class Keyboard implements KeyListener {

    public Level level;
    public Element element;
    public Speler speler;
    private Object[][] Maze;
    private int TileX, TileY;

    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        Maze = level.GetLevel();
        TileX = (speler.getTileX()) / 20;
        TileY = (speler.getTileY()) / 20;

        int keycode = e.getKeyCode();

        if (keycode == KeyEvent.VK_W) {
            element = (Element) Maze[TileY - 1][TileX];
          
            if (element.getLoopbaar() == true) {
                speler.move(0, -20);
            }
        }
        if (keycode == KeyEvent.VK_S) {
            element = (Element) Maze[TileY + 1][TileX];
            
            if (element.getLoopbaar() == true) {
                speler.move(0, 20);
            }
        }
        if (keycode == KeyEvent.VK_A) {
            element = (Element) Maze[TileY][TileX - 1];

            if (element.getLoopbaar() == true) {
                speler.move(-20, 0);
            }
        }
        if (keycode == KeyEvent.VK_D) {
            element = (Element) Maze[TileY][TileX + 1];
            
            if (element.getLoopbaar() == true) {
                speler.move(20, 0);
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        TileX = (speler.getTileX()) / 20;
        TileY = (speler.getTileY()) / 20;

        if (Maze[TileY][TileX] instanceof Vriend) {
            level.DrawWin();
        }

        if (Maze[TileY][TileX] instanceof Helper) {
            Helper helper = (Helper) Maze[TileY][TileX];           
            level.ReDrawLevel(helper.solveGame(Maze , TileY, TileX ));  
        }
    }

}
