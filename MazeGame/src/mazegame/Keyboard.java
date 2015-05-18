/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import java.awt.event.KeyEvent;

/**
 *
 * @author Jim
 */
public class Keyboard {
    public void keyPressed(KeyEvent e) {

    int key = e.getKeyCode();

    if (key == KeyEvent.VK_LEFT) {
        System.out.println("Left");
    }

    if (key == KeyEvent.VK_RIGHT) {
        System.out.println("right");
    }

    if (key == KeyEvent.VK_UP) {
        System.out.println("up");
    }

    if (key == KeyEvent.VK_DOWN) {
        System.out.println("down");
    }
}
    
}
