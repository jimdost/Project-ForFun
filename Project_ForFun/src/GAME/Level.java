/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;


import java.util.ArrayList;


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
                    case "Bm":
                        Muur muurCreateBuiten = new Muur(100000);
                        v = new Veld(muurCreateBuiten);
                        muurCreateBuiten.setVeld(v);
                        break;
                    case "bm":
                        Muur muurCreateBinnen = new Muur(500);
                        v = new Veld(muurCreateBinnen);
                        muurCreateBinnen.setVeld(v);
                        break;
                    case "v":
                        Vriend vriendCreate = new Vriend(true);
                        v = new Veld(vriendCreate);
                        vriendCreate.setVeld(v);
                        break;
                    case "h":
                        Helper helperCreate = new Helper(true);
                        v = new Veld(helperCreate);
                        helperCreate.setVeld(v);
                        break;
                    case "c":
                        Valsspeler valsspelerCreate = new Valsspeler(0, true);
                        v = new Veld(valsspelerCreate);
                        valsspelerCreate.setVeld(v);
                        break;
                    case "s":
                        speler = new Speler();
                        v.setElement(speler);
                        speler.setVeld(v);
                        break;
                    case "r":
                        Bazooka bazookaCreate = new Bazooka(true);
                        v = new Veld(bazookaCreate);
                        bazookaCreate.setVeld(v);
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
            {x, p, s, p, p, p, p, p, p, p, p, m, p, p, p, p, p, p, p, x},
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
            {x, m, p, m, p, m, p, m, m, m, m, m, m, m, m, m, m, p, m, p, x},
            {x, p, p, m, m, m, p, p, p, p, m, p, p, p, p, p, p, p, m, p, x},
            {x, p, m, p, p, p, m, m, m, p, m, p, m, m, m, m, m, m, m, p, x},
            {x, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, x},
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
            {x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x},
            {x, s, p, p, p, p, p, p, p, m, p, p, p, p, p, m, p, p, p, p, m, m, m, m, p, p, p, p, p, p, p, p, p, m, p, m, p, p, p, x},
            {x, p, m, m, m, m, p, m, p, m, p, m, m, m, p, m, p, m, m, p, m, p, p, m, p, m, m, m, m, m, m, m, p, m, p, m, p, m, p, x},
            {x, p, m, p, p, p, p, m, p, m, p, m, r, m, p, m, p, m, m, p, m, p, m, m, p, m, p, p, p, p, p, p, p, m, p, m, p, m, p, x},
            {x, p, m, p, m, m, p, p, p, m, p, m, p, p, p, m, p, m, p, p, p, p, p, p, p, m, p, m, m, m, m, m, m, m, p, m, p, m, p, x},
            {x, p, m, p, m, m, m, m, p, m, p, m, p, m, m, m, p, m, p, m, m, m, m, m, p, m, p, m, p, p, p, p, p, p, p, m, p, m, p, x},
            {x, p, m, p, p, p, p, p, p, m, p, m, p, m, p, p, p, m, p, m, p, p, p, p, p, m, p, m, p, m, m, m, m, m, p, m, p, m, p, x},
            {x, p, m, m, m, p, m, m, m, m, p, m, p, m, p, m, m, m, m, m, p, m, m, m, m, m, p, m, p, m, p, p, p, m, p, m, p, m, p, x},
            {x, p, p, p, p, p, p, p, p, p, p, m, p, p, p, m, p, p, p, p, p, p, p, p, p, m, p, m, p, p, p, m, p, m, p, p, p, m, p, x},
            {x, m, m, m, m, p, m, m, m, m, m, m, m, m, p, m, p, m, m, m, m, m, m, m, p, m, p, m, m, m, m, m, p, m, p, m, p, m, p, x},
            {x, p, p, p, m, p, p, m, p, p, p, p, p, p, p, p, p, m, p, p, p, p, p, m, p, m, p, p, p, p, p, p, p, m, p, m, p, m, p, x},
            {x, m, m, p, m, p, m, m, p, m, m, m, m, m, m, m, p, m, m, m, m, m, p, m, p, m, p, m, m, m, m, m, m, m, p, m, p, m, p, x},
            {x, p, m, p, m, p, p, p, p, m, p, p, p, p, p, p, h, p, p, p, p, p, p, m, p, m, p, p, p, p, p, p, p, p, p, m, p, m, p, x},
            {x, p, m, p, m, m, m, m, m, m, p, m, m, m, m, m, p, m, m, m, m, m, p, m, p, m, m, m, m, m, m, m, m, m, m, m, p, m, p, x},
            {x, p, m, p, p, p, p, p, p, p, p, m, p, p, p, p, p, p, p, p, p, m, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, m, p, x},
            {x, p, m, p, m, m, m, m, m, m, m, m, p, m, m, m, p, m, m, m, p, m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, x},
            {x, p, m, p, m, p, p, p, p, p, p, m, p, p, p, p, p, m, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, x},
            {x, p, m, p, m, p, m, m, m, m, p, m, p, p, m, m, m, m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, x},
            {x, p, m, p, m, p, m, p, p, p, p, p, p, p, p, m, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m, p, x},
            {x, p, m, m, m, p, m, p, m, m, m, m, m, m, p, m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m, p, x},
            {x, p, p, p, p, p, m, p, m, p, p, p, p, m, p, m, p, p, m, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, m, p, m, p, x},
            {x, p, m, m, m, m, m, m, m, p, m, m, p, m, p, m, m, p, m, p, m, m, m, p, m, m, m, m, m, m, m, m, m, m, p, m, p, m, p, x},
            {x, p, m, p, p, p, p, p, p, p, m, m, p, m, p, p, m, p, p, p, p, p, m, p, m, p, m, p, p, p, p, p, p, p, p, m, p, m, p, x},
            {x, p, m, p, m, m, m, m, m, m, m, m, p, m, m, p, m, p, m, p, m, p, m, p, m, p, m, p, m, m, m, m, m, m, m, m, p, m, p, x},
            {x, p, m, p, m, p, p, p, p, p, p, m, p, p, m, p, m, p, m, p, m, p, m, p, m, p, m, p, p, p, p, p, p, p, p, m, p, m, p, x},
            {x, p, m, p, m, p, m, m, m, m, p, m, m, p, m, p, m, p, m, p, m, p, m, p, m, p, m, m, m, m, m, m, m, m, p, m, p, m, p, x},
            {x, p, m, p, m, p, m, p, p, m, p, p, p, p, m, p, m, p, m, p, p, p, m, p, m, p, p, p, p, p, p, p, p, p, p, p, p, m, p, x},
            {x, p, m, p, m, p, m, p, p, m, m, m, m, m, m, p, m, p, m, m, m, m, m, p, m, m, m, m, m, m, m, m, m, m, m, m, p, m, m, x},
            {x, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, m, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, p, m, p, p, m, x},
            {x, m, p, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, m, p, m, m, m, m, m, m, m, m, m, p, p, x},
            {x, m, p, m, p, m, p, p, p, p, m, c, m, p, p, p, p, m, p, p, p, m, p, p, p, m, p, p, p, p, p, p, p, p, m, p, m, p, m, x},
            {x, p, p, m, p, p, p, m, m, p, m, p, m, p, m, m, p, p, p, m, p, m, p, m, p, p, p, m, p, m, m, m, m, p, m, p, p, p, m, x},
            {x, p, m, m, p, m, m, m, p, p, m, p, p, p, m, p, p, m, m, m, p, m, p, m, m, m, m, m, p, m, p, p, m, p, m, p, m, p, p, x},
            {x, p, p, p, p, m, m, p, p, m, m, m, p, m, m, p, m, m, p, p, p, m, p, p, p, p, m, p, p, m, p, m, m, p, m, m, m, m, p, x},
            {x, m, m, m, p, m, p, p, m, m, p, m, p, p, m, p, v, m, p, m, p, m, m, m, m, p, m, m, p, p, p, m, p, p, p, p, m, p, p, x},
            {x, m, p, m, p, m, p, m, m, p, p, p, m, p, m, m, m, m, m, m, p, p, p, m, p, p, p, m, m, m, m, m, p, m, m, p, m, p, m, x},
            {x, m, p, p, p, m, p, m, p, p, m, m, m, p, m, p, p, p, p, m, m, m, p, m, m, m, p, m, p, p, p, p, m, m, m, p, m, p, p, x},
            {x, m, p, m, m, m, p, p, p, m, m, p, p, p, m, p, m, m, p, m, p, m, p, p, p, m, p, m, p, m, m, m, m, p, m, p, m, m, p, x},
            {x, m, p, p, p, m, m, m, p, p, p, p, m, p, p, p, m, p, p, m, p, p, p, m, p, p, p, m, p, p, p, p, p, p, m, p, p, p, p, x},
            {x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x, x},};

        mazeList.add(Maze1);
        mazeList.add(Maze2);
        mazeList.add(Maze3);
        mazeList.add(Maze4);
    }

}
