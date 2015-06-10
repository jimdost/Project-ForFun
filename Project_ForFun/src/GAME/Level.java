/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author wytze
 */
public class Level {

    private ArrayList<String[][]> mazeList;
    private static final int VELDSIZE = 20;
    private Veld[][] bord;
    private Speler speler;

    public Level() {
        getMazes();
        MazeToBord();
    }

    private Veld[][] MazeToBord() {

        String[][] levelOpzet = mazeList.get(0);
        bord = new Veld[levelOpzet.length][levelOpzet.length];

        for (int x = 0; x < levelOpzet.length; x++) {
            for (int y = 0; y < levelOpzet.length; y++) {
                Element e = new Element() {
                };
                Veld v = new Veld(e);
                switch (levelOpzet[x][y]) {
                    case "m":
                        Muur muurCreate = new Muur();
                        v.setElement(muurCreate);
                        muurCreate.setVeld(v);
                        break;
                    case "v":
                        Vriend vriendCreate = new Vriend();
                        v.setElement(vriendCreate);
                        vriendCreate.setVeld(v);
                        break;
                    case "h":
                        Helper helperCreate = new Helper();
                        v.setElement(helperCreate);
                        helperCreate.setVeld(v);
                        break;
                    case "s":
                        speler = new Speler();
                        v.setElement(speler);
                        speler.setVeld(v);
                        break;
                }
                v.setPositieX(y);
                v.setPositieY(x);
                v.bord = bord;
                bord[x][y] = v;

            }
        }
        return bord;
    }

    public Veld[][] getBord() {
        return bord;
    }

    public int getVeltSize() {
        return VELDSIZE;
    }

    public Speler getSpeler() {
        return speler;
    }

    private void getMazes() {

        mazeList = new ArrayList<>();

        String s = "s";
        String m = "m";
        String p = "p";
        String v = "v";
        String h = "h";

        String[][] Maze1 = {
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, p, s, p, p, p, p, p, p, p, p, m, p, p, p, p, p, p, p, m},
            {m, p, m, m, m, m, p, m, m, m, p, m, p, m, m, m, m, m, v, m},
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
            {m, p, p, p, p, p, p, p, p, m, p, p, p, p, p, p, p, m, p, m},
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m}
        };

        String[][] Maze2 = {
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, s, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m},
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

        String[][] Maze3 = {
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, s, h, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m},
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

        String[][] Maze4 = {
            {m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m},
            {m, s, p, p, p, p, p, p, p, m, p, p, p, p, p, m, p, p, p, p, m, m, m, m, p, p, p, p, p, p, p, p, p, m, p, m, p, p, p, m},
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

        mazeList.add(Maze1);
        mazeList.add(Maze2);
        mazeList.add(Maze3);
        mazeList.add(Maze4);
    }

}
