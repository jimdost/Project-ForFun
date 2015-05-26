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
public class Level implements ActionListener {

    private int levelNumb = 1;

    private JPanel panel;
    private JLabel timer;
    public Object[][] level;
    private int mazeSize;

    private final Speler SPELER;
    private Element element;

    Timer t = new Timer(1, this);
    public int time;

    Level(int id) {
        SPELER = new Speler(20, 20);
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

    public Object[][] GetLevel() {
        return level;
    }

    public Speler GetSpeler() {
        return SPELER;
    }

    private Object[][] Maze1() {

        Muur m = new Muur();
        Pad p = new Pad();
        Vriend v = new Vriend();
        Helper h = new Helper();

        Object[][] Maze = {
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

    private Object[][] Maze2() {

        Muur m = new Muur();
        Pad p = new Pad();
        Vriend v = new Vriend();
        Helper h = new Helper();

        Object[][] Maze = {
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

    private Object[][] Maze3() {

        Muur m = new Muur();
        Pad p = new Pad();
        Vriend v = new Vriend();
        Helper h = new Helper();

        Object[][] Maze = {
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

    private Object[][] Maze4() {

        Muur m = new Muur();
        Pad p = new Pad();
        Vriend v = new Vriend();
        Helper h = new Helper();

        Object[][] Maze = {
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
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            
        };

        return Maze;
    }

    private Object[][] createLevel(Object[][] maze) {

        mazeSize = maze.length;

        for (int x = 0; x < mazeSize; x++) {
            for (int y = 0; y < mazeSize; y++) {
                if (maze[x][y] instanceof Muur) {
                    Muur muurCreate = new Muur();
                    maze[x][y] = muurCreate;
                } else if (maze[x][y] instanceof Pad) {
                    Pad padCreate = new Pad();
                    maze[x][y] = padCreate;
                } else if (maze[x][y] instanceof Vriend) {
                    Vriend vriendCreate = new Vriend();
                    maze[x][y] = vriendCreate;
                } else if (maze[x][y] instanceof Helper) {
                    Helper helperCreate = new Helper();
                    maze[x][y] = helperCreate;
                }

            }
        }
        return maze;
    }

    public int getMaseSize() {
        return mazeSize;
    }

    public void DrawLevel() {
        {
            panel = new JPanel();
            panel.setLayout(null);

            timer = new JLabel("" + time);
            timer.setBounds(5, 5, 60, 10);
            timer.setForeground(Color.white);
            panel.add(timer);

            SPELER.setBounds(SPELER.getTileX(), SPELER.getTileY(), 20, 20);
            panel.add(SPELER);

            mazeSize = level.length;

            int x = 0;
            int y = 0;

            for (int i = 0; i < mazeSize; i++) {
                for (int j = 0; j < mazeSize; j++) {

                    element = (Element) level[i][j];
                    element.setBounds(x, y, 20, 20);
                    panel.add(element);

                    x = x + 20;
                }
                y = y + 20;
                x = 0;
            }

            panel.setBackground(Color.black);
            panel.repaint();
            panel.revalidate();
        }
    }

    public void ReDrawLevel(Object[][] mazeIN) {
        {
            panel.removeAll();

            SPELER.setBounds(SPELER.getTileX(), SPELER.getTileY(), 20, 20);
            panel.add(SPELER);

            mazeSize = level.length;

            int x = 0;
            int y = 0;

            for (int i = 0; i < mazeSize; i++) {
                for (int j = 0; j < mazeSize; j++) {

                    element = (Element) mazeIN[i][j];
                    element.setBounds(x, y, 20, 20);
                    panel.add(element);

                    x = x + 20;
                }
                y = y + 20;
                x = 0;
            }
            panel.setBackground(Color.black);
            panel.repaint();
        }
    }

    public JPanel getLevelPanel() {
        return panel;
    }

    public boolean showNextButton = false;

    public void DrawWin() {

        panel.removeAll();

        Rectangle r = panel.getBounds();

        JLabel wintext = new JLabel("JEEEJ!");
        wintext.setBounds((r.height / 2) - 75, (r.width / 2) - 50, 150, 50);
        wintext.setFont(new Font("Serif", Font.PLAIN, 50));
        wintext.setForeground(Color.black);
        panel.add(wintext);
        panel.setBackground(Color.red);
        panel.setFocusable(false);

        panel.repaint();
    }

    public boolean getShowNextButton() {
        return showNextButton;
    }

    public void setShowNextButton(boolean showNextButton) {
        showNextButton = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        time++;
        timer.repaint();

    }

}
