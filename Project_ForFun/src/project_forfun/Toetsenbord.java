/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_forfun;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 *
 * @author Jim
 */
public class Toetsenbord implements KeyListener
{
    private GameCharacter gch;
     
    
    public Toetsenbord()
    {
        super();
        gch = new GameCharacter();
        
    }

    @Override
    public void keyTyped(KeyEvent e)
    {}

    @Override
    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            gch.moveRight();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            gch.moveLeft();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            gch.moveUp();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            gch.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {}
}
