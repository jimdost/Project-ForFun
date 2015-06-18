/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author wytze
 */
public class MenuPanel extends JPanel implements ActionListener {

    private Frame frame;
    private SpelPanel spel;
    private final JLabel MENULABEL;
    private final JButton RESETBUTTON;

    public MenuPanel() {
        setBackground(Color.BLUE);

        MENULABEL = new JLabel("The Maze Game                                      ");
        MENULABEL.setForeground(Color.WHITE);

        RESETBUTTON = new JButton("Reset");
        RESETBUTTON.setBackground(Color.blue);
        RESETBUTTON.setFocusable(false);
        RESETBUTTON.addActionListener(this);        

        add(MENULABEL, new FlowLayout(FlowLayout.LEFT));
        add(RESETBUTTON, new FlowLayout(FlowLayout.RIGHT));        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String action = e.getActionCommand();
        switch (action) {
            case "Reset":
                resetLevel();
                System.out.println("reset"); //This has no functionality yet.
                break;            
        }
    }

    public void setSpel(SpelPanel spel) {
        this.spel = spel;
    }

    private void resetLevel() {
        frame.remove(spel);
        frame.setSpelComponents(Frame.levelNr);
        spel.revalidate();  
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }
    
}
