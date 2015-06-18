/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author wytze
 */
public class Level {

    private ArrayList<String[][]> mazeList;
    private static final int VELDSIZE = 30;
    SpelPanel spelpanel;
    private Veld[][] bord;
    private Speler speler;
    HashMap<String, Veld> buren;

    public Level(int levelNumb) {
        getMazes();
        MazeToBord(levelNumb);
    }

    protected Veld getBuuren(int positieY, int positieX, String Direction) { 

        buren = new HashMap<>();

        buren.put("UP", bord[positieY - 1][positieX]);
        buren.put("DOWN", bord[positieY + 1][positieX]);
        buren.put("LEFT", bord[positieY][positieX - 1]);
        buren.put("RIGHT", bord[positieY][positieX + 1]);

        return buren.get(Direction);
    }

    private Veld[][] MazeToBord(int levelNumb) {

        String[][] levelOpzet = mazeList.get(levelNumb);
        bord = new Veld[levelOpzet.length][levelOpzet.length];

        for (int x = 0; x < levelOpzet.length; x++) {
            for (int y = 0; y < levelOpzet.length; y++) {
                Veld v = new Veld();
                switch (levelOpzet[x][y]) {
                    case "Bm":
                        Muur muurCreateBuiten = new Muur(1000);
                        v.setElement(muurCreateBuiten);
                        break;
                    case "bm":
                        Muur muurCreateBinnen = new Muur(5);
                        v.setElement(muurCreateBinnen);
                        break;
                    case "v":
                        Vriend vriendCreate = new Vriend();
                        v.setElement(vriendCreate);
                        break;
                    case "h":
                        Helper helperCreate = new Helper();
                        v.setElement(helperCreate);
                        break;
                    case "c":
                        Valsspeler valsspelerCreate = new Valsspeler();
                        v.setElement(valsspelerCreate);
                        break;
                    case "r":
                        Bazooka bazookaCreate = new Bazooka();
                        v.setElement(bazookaCreate);
                        break;
                    case "s":
                        speler = new Speler();
                        v.setElement(speler);
                        break;
                }
                v.setLevel(this);
                v.setPositieX(y);
                v.setPositieY(x);
                bord[x][y] = v;
            }
        }
        return bord;
    }

    public Veld[][] getBord() {
        return bord;
    }

    public void setBord(Veld[][] bord) {
        this.bord = bord;
    }

    public int getVeltSize() {
        return VELDSIZE;
    }

    public Speler getSpeler() {
        return speler;
    }
    
    private void getMazes() {

        mazeList = new ArrayList<>();

        String s = "s"; //This is the player.
        String m = "bm"; //This is a breakable inner wall.
        String x = "Bm"; //This is a neigh unbreakable outer wall.
        String p = "p"; //This is for te paths. At the moment this is basically an element with nothing in it.
        String v = "v"; //This is the friend of the player.
        String h = "h"; //This is the helper.
        String c = "c"; //This is the cheater who resets the step counter.
        String r = "r"; //This is the Bazooka.

        String[][] Maze1 = {
            {x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x},
            {x, s, p, p, r, p, p, p, p, p, h, m, p, p, p, p, p, p, p, x},
            {x, p, m, m, m, m, p, m, m, m, p, m, p, m, m, m, m, m, p, x},
            {x, p, p, p, p, m, p, p, p, m, p, p, p, m, p, p, p, m, p, x},
            {x, m, p, m, p, m, p, m, m, m, p, m, p, m, p, m, p, p, p, x},
            {x, m, p, m, p, m, p, m, p, p, p, m, p, m, p, m, m, m, m, x},
            {x, m, p, m, p, m, p, m, m, m, m, m, p, m, p, p, p, p, m, x},
            {x, p, r, m, p, p, p, p, p, p, m, m, p, m, m, m, m, p, p, x},
            {x, p, m, m, m, m, m, m, p, m, m, p, p, p, p, p, m, m, p, x},
            {x, p, p, p, p, p, m, p, p, p, p, p, m, m, m, m, m, m, p, x},
            {x, m, m, p, m, m, m, m, m, h, m, p, m, p, p, p, p, m, p, x},
            {x, p, p, p, p, p, m, p, p, p, m, p, m, m, m, m, p, m, p, x},
            {x, p, m, m, m, p, m, p, m, p, m, p, p, p, p, m, p, m, p, x},
            {x, p, m, p, m, p, m, p, m, p, m, m, m, m, p, p, p, m, p, x},
            {x, p, m, p, m, p, m, p, m, p, p, c, p, m, m, m, m, m, p, x},
            {x, p, m, p, m, m, m, p, m, p, m, m, p, m, p, p, p, p, p, x},
            {x, p, m, p, p, p, p, p, m, p, p, m, p, p, p, m, m, m, m, x},
            {x, p, m, m, m, m, m, m, m, m, p, m, m, m, m, m, p, p, p, x},
            {x, p, p, p, p, p, p, p, p, m, p, p, p, p, p, p, p, m, v, x},
            {x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x}
        };

        String[][] Maze2 = {
            {x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x},
            {x, s, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, x},
            {x, m, m, p, m, p, m, p, m, m, m, m, m, p, m, p, m, m, m, p, x},
            {x, p, p, p, m, p, m, p, m, p, p, p, p, p, m, p, p, p, m, p, x},
            {x, p, m, m, m, p, m, p, m, p, m, m, m, m, m, m, m, p, m, p, x},
            {x, p, m, p, p, p, m, p, p, p, m, p, p, p, p, p, p, p, m, p, x},
            {x, p, m, p, m, m, m, p, m, p, m, p, m, p, m, p, m, p, m, p, x},
            {x, p, m, p, p, p, m, p, m, p, p, p, m, p, m, p, m, p, m, p, x},
            {x, p, m, m, m, p, m, p, m, p, m, m, m, p, m, p, m, p, m, p, x},
            {x, p, p, p, p, p, p, p, m, p, p, p, h, p, m, p, m, p, m, p, x},
            {x, m, m, m, m, p, m, m, m, p, m, m, m, m, m, p, m, p, m, p, x},
            {x, p, p, p, m, p, p, p, p, p, m, p, p, p, p, p, m, p, m, p, x},
            {x, p, m, p, m, m, m, p, m, m, m, p, m, m, m, m, m, p, m, p, x},
            {x, p, m, p, p, p, p, p, m, p, c, p, m, r, p, p, p, p, p, p, x},
            {x, p, m, m, m, m, m, m, m, p, m, p, m, m, m, m, m, m, m, m, x},
            {x, p, p, p, p, p, p, p, p, p, m, p, m, p, p, p, m, p, p, p, x},
            {x, p, m, m, m, m, m, m, m, m, m, p, m, p, m, p, m, p, m, p, x},
            {x, p, m, p, p, p, m, p, p, p, p, p, p, p, m, p, p, p, m, p, x},
            {x, p, m, p, m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, p, x},
            {x, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, v, x},
            {x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x}
        };

        String[][] Maze3 = {
            {x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x},
            {x, s, p, p, p, p, p, p, p, p, h, p, p, p, p, p, p, p, p, r, x},
            {x, p, m, m, m, m, m, m, m, m, p, m, m, m, m, m, m, m, m, p, x},
            {x, p, p, m, v, p, p, m, p, p, p, p, p, p, p, p, p, p, m, p, x},
            {x, m, p, m, m, m, p, m, m, m, m, m, m, m, m, m, m, p, m, p, x},
            {x, p, p, m, p, p, p, p, p, p, p, m, p, p, p, p, p, p, m, p, x},
            {x, p, m, m, m, m, m, m, m, m, p, m, p, m, m, m, m, m, m, p, x},
            {x, p, p, p, p, m, p, p, p, p, p, m, p, p, p, p, p, p, m, p, x},
            {x, m, m, m, p, m, p, m, m, m, m, m, m, m, m, m, m, p, m, p, x},
            {x, p, m, m, p, m, p, p, p, p, m, p, p, p, p, p, p, p, m, p, x},
            {x, p, m, p, p, m, m, m, m, p, m, p, m, m, m, m, m, m, m, p, x},
            {x, p, p, p, m, m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, x},
            {x, p, m, p, p, m, p, m, m, c, m, p, m, m, m, m, m, m, m, p, x},
            {x, p, m, m, p, m, p, p, m, m, m, p, m, p, p, p, p, p, m, p, x},
            {x, p, p, m, p, m, m, m, m, p, p, p, m, p, m, m, m, p, m, p, x},
            {x, m, p, m, p, p, p, p, m, p, m, m, m, p, p, p, m, p, m, p, x},
            {x, p, p, m, m, m, m, p, m, p, m, p, m, m, p, m, m, p, m, p, x},
            {x, p, m, m, m, p, p, p, m, p, m, p, p, m, p, m, p, p, p, p, x},
            {x, p, p, m, m, p, m, m, m, p, m, m, p, m, p, m, p, m, m, p, x},
            {x, m, p, p, p, p, m, c, p, p, p, p, p, p, p, m, p, p, p, p, x},
            {x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x}
        };

        String[][] Maze4 = {
            {x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x},
            {x, s, p, p, p, p, p, p, p, m, p, p, p, p, p, m, p, p, p, p, m, m, m, m, p},
            {x, p, m, m, m, m, p, m, p, m, p, m, m, m, p, m, p, m, m, p, m, p, p, m, p},
            {x, p, m, p, p, p, p, m, p, m, p, m, r, m, p, m, p, m, m, p, m, p, m, m, p},
            {x, p, m, p, m, m, p, p, p, m, p, m, p, p, p, m, p, m, p, p, p, p, p, p, p},
            {x, p, m, p, m, m, m, m, p, m, p, m, p, m, m, m, p, m, p, m, m, m, m, m, p},
            {x, p, m, p, p, p, p, p, p, m, p, m, p, m, p, p, p, m, p, m, p, p, p, p, p},
            {x, p, m, m, m, p, m, m, m, m, p, m, p, m, p, m, m, m, m, m, p, m, m, m, m},
            {x, p, p, p, p, p, p, p, p, p, p, m, p, p, p, m, p, p, p, p, p, p, p, p, p},
            {x, m, m, m, m, p, m, m, m, m, m, m, m, m, p, m, p, m, m, m, m, m, m, m, p},
            {x, p, p, p, m, p, p, m, p, p, p, p, p, p, p, p, p, m, p, p, p, p, p, m, p},
            {x, m, m, p, m, p, m, m, p, m, m, m, m, m, m, m, p, m, m, m, m, m, p, m, p},
            {x, p, m, p, m, p, p, p, p, m, p, p, p, p, p, p, h, p, p, p, p, p, p, m, p},
            {x, p, m, p, m, m, m, m, m, m, p, m, m, m, m, m, p, m, m, m, m, m, p, m, p},
            {x, p, m, p, p, p, p, p, p, p, p, m, p, p, p, p, p, p, p, p, p, m, p, m, p},
            {x, p, m, p, m, m, m, m, m, m, m, m, p, m, m, m, p, m, m, m, p, m, p, m, m},
            {x, p, m, p, m, p, p, p, p, p, p, m, p, p, p, p, p, m, p, p, p, m, p, p, p},
            {x, p, m, p, m, p, m, m, m, m, p, m, p, p, m, m, m, m, p, m, m, m, m, m, m},
            {x, p, m, p, m, p, m, p, p, p, p, p, p, p, p, m, p, p, p, m, p, p, p, p, p},
            {x, p, m, m, m, p, m, p, m, m, m, m, m, m, p, m, p, m, m, m, m, m, m, m, m},
            {x, p, p, p, p, p, m, p, m, p, p, p, p, m, p, m, p, p, m, p, p, p, m, p, p},
            {x, p, m, m, m, m, m, m, m, p, m, m, p, m, p, m, m, p, m, p, m, m, m, p, m},
            {x, p, m, p, p, p, p, p, p, p, m, m, p, m, p, p, m, p, p, p, p, p, m, p, m},
            {x, p, m, p, m, m, m, m, m, m, m, m, p, m, m, p, m, p, m, p, m, p, m, v, m},
            {x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x},};

        mazeList.add(Maze1);
        mazeList.add(Maze2);
        mazeList.add(Maze3);
        mazeList.add(Maze4);
    }

}
