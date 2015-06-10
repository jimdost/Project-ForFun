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

    

    public MenuPanel() {
        setBackground(Color.BLUE);        

        JLabel label = new JLabel("The Maze Game                                 ");
        label.setForeground(Color.WHITE);     

        JButton resetButton = new JButton("Reset");
        resetButton.setBackground(Color.blue);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        JButton nextlevel = new JButton("next");
        nextlevel.setBackground(Color.blue);
        nextlevel.setFocusable(false);
        nextlevel.addActionListener(this);

        add(label, new FlowLayout(FlowLayout.LEFT));
        add(resetButton, new FlowLayout(FlowLayout.RIGHT));
        add(nextlevel, new FlowLayout(FlowLayout.RIGHT));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String action = e.getActionCommand();
        switch (action) {
            case "Reset":
                System.out.println("reset"); //This has no functionality yet.
                break;
            case "next":
                System.out.println("next"); //This has no functionality yet.
                break;
        }
    }

}
