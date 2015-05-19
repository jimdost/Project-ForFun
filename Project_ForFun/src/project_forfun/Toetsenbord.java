/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_forfun;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jim
 */
public class Toetsenbord extends JFrame implements KeyListener
{
    private static JLabel label;
    GameCharacter gch= new GameCharacter();
     
    
    public Toetsenbord()
    {
        super();
        JPanel p = new JPanel();
        label = new JLabel("Key Listener!");
        p.add(label);
        add(p);
        addKeyListener(this);
        setSize(200, 100);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
       
    }

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
    {
        
    }
    public static void main(String[] args) 
    {
        new Toetsenbord();
    }
}
