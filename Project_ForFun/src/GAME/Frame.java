/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;


import java.awt.BorderLayout;
import javax.swing.JFrame;


/**
 *
 * @author wytze
 */
public class Frame extends JFrame{

    private final int frameHeight = 600;
    private final int frameWidh = 400;
    private final Keyboard KEYBBOARD;
    MenuPanel menu;
    SpelPanel spel;

    public Frame() {
        setSize(frameWidh, frameHeight);        
        setLocationRelativeTo(null);        
        KEYBBOARD = new Keyboard();        
        addKeyListener(KEYBBOARD);  
        createMenuComponents();  
        createSpelComponents();
    }
    
    private void createMenuComponents(){
        menu = new MenuPanel(); 
        menu.spelPanel = spel;
        add(menu , BorderLayout.NORTH);
    }
    
    private void createSpelComponents(){
        spel = new SpelPanel();
        KEYBBOARD.speler = spel.getLevel().getSpeler();
        KEYBBOARD.spelpanel = spel;
        add(spel , BorderLayout.CENTER);
        setSize(spel.getSize());
    }
}
