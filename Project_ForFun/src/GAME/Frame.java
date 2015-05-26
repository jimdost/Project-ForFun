
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author wytze
 */
public class Frame extends JFrame implements ActionListener{

    private JPanel north;

    private Keyboard KEYBOARD;

    private int levelNumb = 1;
    private Speler speler;
    private Level level;

    public boolean ShowNextButton = false;

    Frame() {
        north = new JPanel();
        JLabel label = new JLabel("hallo                                 ");
        label.setForeground(Color.WHITE);

        JButton resetButton = new JButton("Reset");
        resetButton.setBackground(Color.RED);
        resetButton.setFocusable(false);
        resetButton.setForeground(Color.WHITE);
        resetButton.addActionListener(this);

        JButton nextlevel = new JButton("next");
        nextlevel.setBackground(Color.RED);
        nextlevel.setFocusable(false);
        nextlevel.setForeground(Color.WHITE);
        nextlevel.addActionListener(this);

        north.add(label);
        north.add(resetButton);
        north.add(nextlevel);

        north.setBackground(Color.BLUE);
        north.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(north, BorderLayout.NORTH);

        createComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    private void createComponents() {

        level = new Level(levelNumb);

        speler = level.GetSpeler();
        KEYBOARD = speler.getKeybord();
        addKeyListener(KEYBOARD);
        setFocusable(true);

        KEYBOARD.speler = speler;
        KEYBOARD.level = level;

        getContentPane().add(level.getLevelPanel(), BorderLayout.CENTER);
        getContentPane().revalidate();
        setSize((level.getMaseSize() * 20) + 5, (level.getMaseSize() * 20) + 64);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String action = e.getActionCommand();
        if (action.equals("Reset")) {

            getContentPane().remove(level.getLevelPanel());
            createComponents();

        } else if (action.equals("next")) {

            getContentPane().remove(level.getLevelPanel());
            levelNumb++;

            if (5 <= levelNumb) {
                levelNumb = 1;
            }

            createComponents();
        }

    }
}
