/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;


import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wytze
 */
public class Frame extends JFrame{

    private final int frameHeight = 600;
    private final int frameWidh = 400;
    private final Keyboard KEYBBOARD;

    public Frame() {
        setSize(frameWidh, frameHeight);        
        setLocationRelativeTo(null);        
        KEYBBOARD = new Keyboard();        
        addKeyListener(KEYBBOARD);  
        createMenuComponents();  
        createSpelComponents();
    }
    
    private void createMenuComponents(){
        MenuPanel menu = new MenuPanel(); 
        add(menu , BorderLayout.NORTH);
    }
    
    private void createSpelComponents(){
        SpelPanel spel = new SpelPanel();
        KEYBBOARD.speler = spel.getLevel().getSpeler();
        
        add(spel , BorderLayout.CENTER);
        setSize(spel.getSize());
    }
}
