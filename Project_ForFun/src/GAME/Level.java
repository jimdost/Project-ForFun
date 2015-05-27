/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author wytze
 */
public class Level {

    private int levelNumb = 1;

    private JPanel panel;
    private JLabel timer;
    private Element[][] level;
    int ELEMENT_SIZE;
    private int mazeSize;

    private Speler speler;
    private Element element;
    private Keyboard keyboard = new Keyboard();

    Level(int id) {
         ELEMENT_SIZE = 20;

        speler = new Speler(ELEMENT_SIZE, ELEMENT_SIZE);
        if (id == 1) {
            level = createLevel(Maze1());
        }
        if (id == 2) {
            level = createLevel(Maze2());
        }
        if (id == 3) {
            level = createLevel(Maze3());
        }
        if (id == 4) {
            level = createLevel(Maze4());
        }
        DrawLevel();
    }

    public Keyboard getKeybord() {
        return keyboard;
    }

    public Element[][] GetLevel() {
        return level;
    }

    public Speler GetSpeler() {
        return speler;
    }

    public JPanel getLevelPanel() {
        return panel;
    }

    public int getMaseSize() {
        return mazeSize;
    }

    private Element[][] createLevel(Element[][] maze) {
        mazeSize = maze.length;

        for (int x = 0; x < mazeSize; x++) {
            for (int y = 0; y < mazeSize; y++) {
                if (maze[x][y] instanceof Muur) {
                    Muur muurCreate = new Muur();
                    muurCreate.setPositieX(x);
                    muurCreate.setPositieX(y);
                    maze[x][y] = muurCreate;
                } else if (maze[x][y] instanceof Pad) {
                    Pad padCreate = new Pad();
                    padCreate.setPositieX(x);
                    padCreate.setPositieX(y);
                    maze[x][y] = padCreate;
                } else if (maze[x][y] instanceof Vriend) {
                    Vriend vriendCreate = new Vriend();
                    vriendCreate.setPositieX(x);
                    vriendCreate.setPositieX(y);
                    maze[x][y] = vriendCreate;
                } else if (maze[x][y] instanceof Helper) {
                    Helper helperCreate = new Helper();
                    helperCreate.setPositieX(x);
                    helperCreate.setPositieX(y);
                    maze[x][y] = helperCreate;
                }
            }
        }
        return maze;
    }

    public void DrawLevel() {
        {
            panel = new JPanel();
            panel.setLayout(null);

            speler.setBounds(speler.getTileX(), speler.getTileY(), ELEMENT_SIZE, ELEMENT_SIZE);
            panel.add(speler);

            mazeSize = level.length;

            int x = 0;
            int y = 0;

            for (int i = 0; i < mazeSize; i++) {
                for (int j = 0; j < mazeSize; j++) {

                    element = (Element) level[i][j];
                    element.setBounds(x, y, ELEMENT_SIZE, ELEMENT_SIZE);
                    panel.add(element);

                    x = x + ELEMENT_SIZE;
                }
                y = y + ELEMENT_SIZE;
                x = 0;
            }

            panel.setBackground(Color.black);
            panel.repaint();
            panel.revalidate();
        }
    }

    public void ReDrawLevel(Element[][] mazeIN) {
        {
            panel.removeAll();

            speler.setBounds(speler.getTileX(), speler.getTileY(), ELEMENT_SIZE, ELEMENT_SIZE);
            panel.add(speler);

            mazeSize = level.length;

            int x = 0;
            int y = 0;

            for (int i = 0; i < mazeSize; i++) {
                for (int j = 0; j < mazeSize; j++) {

                    element = (Element) mazeIN[i][j];
                    element.setBounds(x, y, ELEMENT_SIZE, ELEMENT_SIZE);
                    panel.add(element);

                    x = x + ELEMENT_SIZE;
                }
                y = y + ELEMENT_SIZE;
                x = 0;
            }
            panel.setBackground(Color.black);
            panel.repaint();
        }
    }

    public void DrawWin() {

        panel.removeAll();

        Rectangle r = panel.getBounds();

        JLabel wintext = new JLabel("JEEEJ!");
        wintext.setBounds((r.height / 3), (r.width / 3), 150, 50);
        wintext.setFont(new Font("Serif", Font.PLAIN, 50));
        wintext.setForeground(Color.black);
        panel.add(wintext);
        panel.setBackground(Color.red);
        panel.setFocusable(false);

        panel.repaint();
    }

    private Element[][] Maze1() {

        Muur m = new Muur();
        Pad p = new Pad();
        Vriend v = new Vriend();
        Helper h = new Helper();

        Element[][] Maze = {
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, p, p, p, p, p, p, p, p, p, p, m, p, p, p, p, p, p, p, m},
            {m, p, m, m, m, m, p, m, m, m, p, m, p, m, m, m, m, m, p, m},
            {m, p, p, p, p, m, p, p, p, m, p, p, p, m, p, p, p, m, p, m},
            {m, m, p, m, p, m, p, m, m, m, p, m, p, m, p, m, p, p, p, m},
            {m, m, p, m, p, m, p, m, p, p, p, m, p, m, p, m, m, m, m, m},
            {m, m, p, m, p, m, p, m, m, m, m, m, p, m, p, p, p, p, m, m},
            {m, p, p, m, p, p, p, p, p, p, m, m, p, m, m, m, m, p, p, m},
            {m, p, m, m, m, m, m, m, p, m, m, p, p, p, p, p, m, m, p, m},
            {m, p, p, p, p, p, m, p, p, p, p, p, m, m, m, m, m, m, p, m},
            {m, m, m, p, m, m, m, m, m, h, m, p, m, p, p, p, p, m, p, m},
            {m, p, p, p, p, p, m, p, p, p, m, p, m, m, m, m, p, m, p, m},
            {m, p, m, m, m, p, m, p, m, p, m, p, p, p, p, m, p, m, p, m},
            {m, p, m, p, m, p, m, p, m, p, m, m, m, m, p, p, p, m, p, m},
            {m, p, m, p, m, p, m, p, m, p, p, p, p, m, m, m, m, m, p, m},
            {m, p, m, p, m, m, m, p, m, p, m, m, p, m, p, p, p, p, p, m},
            {m, p, m, p, p, p, p, p, m, p, p, m, p, p, p, m, m, m, m, m},
            {m, p, m, m, m, m, m, m, m, m, p, m, m, m, m, m, p, p, p, m},
            {m, p, p, p, p, p, p, p, p, m, p, p, p, p, p, p, p, m, v, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m}
        };

        return Maze;
    }

    private Element[][] Maze2() {

        Muur m = new Muur();
        Pad p = new Pad();
        Vriend v = new Vriend();
        Helper h = new Helper();

        Element[][] Maze = {
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m},
            {m, m, m, p, m, p, m, p, m, m, m, m, m, p, m, p, m, m, m, p, m},
            {m, p, p, p, m, p, m, p, m, p, p, p, p, p, m, p, p, p, m, p, m},
            {m, p, m, m, m, p, m, p, m, p, m, m, m, m, m, m, m, p, m, p, m},
            {m, p, m, p, p, p, m, p, p, p, m, p, p, p, p, p, p, p, m, p, m},
            {m, p, m, p, m, m, m, p, m, p, m, p, m, p, m, p, m, p, m, p, m},
            {m, p, m, p, p, p, m, p, m, p, p, p, m, p, m, p, m, p, m, p, m},
            {m, p, m, m, m, p, m, p, m, p, m, m, m, p, m, p, m, p, m, p, m},
            {m, p, p, p, p, p, p, p, m, p, p, p, h, p, m, p, m, p, m, p, m},
            {m, m, m, m, m, p, m, m, m, p, m, m, m, m, m, p, m, p, m, p, m},
            {m, p, p, p, m, p, p, p, p, p, m, p, p, p, p, p, m, p, m, p, m},
            {m, p, m, p, m, m, m, p, m, m, m, p, m, m, m, m, m, p, m, p, m},
            {m, p, m, p, p, p, p, p, m, p, p, p, m, p, p, p, p, p, p, p, m},
            {m, p, m, m, m, m, m, m, m, p, m, p, m, m, m, m, m, m, m, m, m},
            {m, p, p, p, p, p, p, p, p, p, m, p, m, p, p, p, m, p, p, p, m},
            {m, p, m, m, m, m, m, m, m, m, m, p, m, p, m, p, m, p, m, p, m},
            {m, p, m, p, p, p, m, p, p, p, p, p, p, p, m, p, p, p, m, p, m},
            {m, p, m, p, m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, v, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m}
        };

        return Maze;
    }

    private Element[][] Maze3() {

        Muur m = new Muur();
        Pad p = new Pad();
        Vriend v = new Vriend();
        Helper h = new Helper();

        Element[][] Maze = {
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, p, h, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m},
            {m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m, p, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m, p, m},
            {m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m, p, m},
            {m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m, p, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m, p, m},
            {m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m, p, m},
            {m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, v, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m}
        };

        return Maze;
    }

    private Element[][] Maze4() {

        Muur m = new Muur();
        Pad p = new Pad();
        Vriend v = new Vriend();
        Helper h = new Helper();

        Element[][] Maze = {
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, p, p, p, p, p, p, p, p, m, p, p, p, p, p, m, p, p, p, p, m, m, m, m, p, p, p, p, p, p, p, p, p, m, p, m, p, p, p, m},
            {m, p, m, m, m, m, p, m, p, m, p, m, m, m, p, m, p, m, m, p, m, p, p, m, p, m, m, m, m, m, m, m, p, m, p, m, p, m, p, m},
            {m, p, m, p, p, p, p, m, p, m, p, m, m, m, p, m, p, m, m, p, m, p, m, m, p, m, p, p, p, p, p, p, p, m, p, m, p, m, p, m},
            {m, p, m, p, m, m, p, p, p, m, p, m, p, p, p, m, p, m, p, p, p, p, p, p, p, m, p, m, m, m, m, m, m, m, p, m, p, m, p, m},
            {m, p, m, p, m, m, m, m, p, m, p, m, p, m, m, m, p, m, p, m, m, m, m, m, p, m, p, m, p, p, p, p, p, p, p, m, p, m, p, m},
            {m, p, m, p, p, p, p, p, p, m, p, m, p, m, p, p, p, m, p, m, p, p, p, p, p, m, p, m, p, m, m, m, m, m, p, m, p, m, p, m},
            {m, p, m, m, m, p, m, m, m, m, p, m, p, m, p, m, m, m, m, m, p, m, m, m, m, m, p, m, p, m, p, p, p, m, p, m, p, m, p, m},
            {m, p, p, p, p, h, p, p, p, p, p, m, p, p, p, m, p, p, p, p, p, p, p, p, p, m, p, m, p, p, p, m, p, m, p, p, p, m, p, m},
            {m, m, m, m, m, p, m, m, m, m, m, m, m, m, p, m, p, m, m, m, m, m, m, m, p, m, p, m, m, m, m, m, p, m, p, m, p, m, p, m},
            {m, p, p, p, m, p, m, m, p, p, p, p, p, p, p, p, p, m, p, p, p, p, p, m, p, m, p, p, p, p, p, p, p, m, p, m, p, m, p, m},
            {m, m, m, p, m, p, m, m, p, m, m, m, m, m, m, m, p, m, m, m, m, m, p, m, p, m, p, m, m, m, m, m, m, m, p, m, p, m, p, m},
            {m, p, m, p, m, p, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, m, p, m, p, p, p, p, p, p, p, p, p, m, p, m, p, m},
            {m, p, m, p, m, m, m, m, m, m, p, m, m, m, m, m, p, m, m, m, m, m, p, m, p, m, m, m, m, m, m, m, m, m, m, m, p, m, p, m},
            {m, p, m, p, p, p, p, p, p, p, p, m, p, p, p, p, p, p, p, p, p, m, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, m, p, m},
            {m, p, m, p, m, m, m, m, m, m, m, m, p, m, m, m, p, m, m, m, p, m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, p, m, p, m, p, p, p, p, p, p, m, p, p, p, p, p, m, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m},
            {m, p, m, p, m, p, m, m, m, m, p, m, p, p, m, m, m, m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m},
            {m, p, m, p, m, p, m, p, p, p, p, p, p, p, p, m, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m, p, m},
            {m, p, m, m, m, p, m, p, m, m, m, m, m, m, p, m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m, p, m},
            {m, p, p, p, p, p, m, p, m, p, p, p, p, m, p, m, p, p, m, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, m, p, m, p, m},
            {m, p, m, m, m, m, m, m, m, p, m, m, p, m, p, m, m, p, m, p, m, m, m, p, m, m, m, m, m, m, m, m, m, m, p, m, p, m, p, m},
            {m, p, m, p, p, p, p, p, p, p, m, m, p, m, p, p, m, p, p, p, p, p, m, p, m, p, m, p, p, p, p, p, p, p, p, m, p, m, p, m},
            {m, p, m, p, m, m, m, m, m, m, m, m, p, m, m, p, m, p, m, p, m, p, m, p, m, p, m, p, m, m, m, m, m, m, m, m, p, m, p, m},
            {m, p, m, p, m, p, p, p, p, p, p, m, p, p, m, p, m, p, m, p, m, p, m, p, m, p, m, p, p, p, p, p, p, p, p, m, p, m, p, m},
            {m, p, m, p, m, p, m, m, m, m, p, m, m, p, m, p, m, p, m, p, m, p, m, p, m, p, m, m, m, m, m, m, m, m, p, m, p, m, p, m},
            {m, p, m, p, m, p, m, p, p, m, p, p, p, p, m, p, m, p, m, p, p, p, m, p, m, p, p, p, p, p, p, p, p, p, p, p, p, m, p, m},
            {m, p, m, p, m, p, m, p, p, m, m, m, m, m, m, p, m, p, m, m, m, m, m, p, m, m, m, m, m, m, m, m, m, m, m, m, p, m, m, m},
            {m, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m, p, p, v, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},};

        return Maze;
    }

}
