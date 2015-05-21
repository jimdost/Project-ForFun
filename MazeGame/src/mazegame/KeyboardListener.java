/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jim
 */
public class KeyboardListener extends JFrame implements KeyListener {

    private static JLabel label;
    
     public KeyboardListener() {
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
    public void keyTyped(KeyEvent e) {
        
    }
 
    @Override
    public void keyPressed(KeyEvent e) {
       if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left");
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Up");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Down");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        /*
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key Released");
        }
        */
    }
    
    
    
    public static void main(String[] args) {
        new KeyboardListener();
    }
}
