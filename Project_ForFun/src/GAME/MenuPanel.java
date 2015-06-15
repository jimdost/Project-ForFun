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

    Frame frame;
    JLabel menuLable;
    JButton resetButton;    
    private int levelnummer = 0;

    public MenuPanel() {
        setBackground(Color.BLUE);

        JLabel menuLable = new JLabel("The Maze Game                                      ");
        menuLable.setForeground(Color.WHITE);

        JButton resetButton = new JButton("Reset");
        resetButton.setBackground(Color.blue);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);        

        add(menuLable, new FlowLayout(FlowLayout.LEFT));
        add(resetButton, new FlowLayout(FlowLayout.RIGHT));        
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

    private void resetLevel() {
        frame.remove(frame.spel);
        frame.createSpelComponents(Frame.levelNr);
        frame.spel.revalidate();  
    }
}
