/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wytze
 */
public class Keyboard implements KeyListener {

    Speler speler;
    SpelPanel spelpanel;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int keycode = e.getKeyCode();

        if (keycode == KeyEvent.VK_W) {
            speler.move("UP");
        }
        if (keycode == KeyEvent.VK_S) {
            speler.move("DOWN");
        }
        if (keycode == KeyEvent.VK_A) {
            speler.move("LEFT");
        }
        if (keycode == KeyEvent.VK_D) {
            speler.move("RIGHT");
        }   
        if (keycode == KeyEvent.VK_SPACE) {
            speler.schiet();
        }   
        spelpanel.UpdateLevel();        
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
