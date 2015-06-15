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
public final class Frame extends JFrame{

    private final int frameHeight = 600;
    private final int frameWidh = 400;
    private final Keyboard KEYBBOARD;
    private MenuPanel menu;
    protected SpelPanel spel;
    protected static int levelNr = 0;

    public Frame() {
        setSize(frameWidh, frameHeight);        
        setLocationRelativeTo(null);        
        KEYBBOARD = new Keyboard();        
        addKeyListener(KEYBBOARD);  
        createMenuComponents();  
        createSpelComponents(levelNr);
    }
    
    private void createMenuComponents(){
        menu = new MenuPanel();         
        add(menu , BorderLayout.NORTH);
        menu.frame = (this);
    }
    
    public void createSpelComponents(int levelNr){
        spel = new SpelPanel(levelNr);
        spel.frame = (this);
        KEYBBOARD.speler = spel.getLevel().getSpeler();
        KEYBBOARD.spelpanel = spel;        
        add(spel , BorderLayout.CENTER);
        setSize(spel.getSize());
    }
}
