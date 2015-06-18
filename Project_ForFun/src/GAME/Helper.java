/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author wytze
 */
public class Helper extends Item {

    public Helper() {
        setLoopbaar(true);
    }

    @Override
    protected void pakOp() {        
        setVisible(false);
        solveGame();
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();        
        Image i = new ImageIcon(getClass().getClassLoader().getResource("Images/Helper.png")).getImage();
        g2.drawImage(i, 0, 0, 30, 30, null, this);
        g2.dispose();

    }

    private static int shortestpath[];
    private static int shortestlength;
    private Veld[][] daMaze;
    private int mazeSize;
    private int VriendX;
    private int VriendY;

    public void solveGame() {

        int x;				/*various counters*/
        int pathsofar[];		/*Path to get started with*/
        int lengthsofar;		/*length to get started with*/        
        daMaze = veld.getLevel().getBord();                /*the maze object*/
        mazeSize = daMaze.length;
        shortestpath = new int[mazeSize * mazeSize];

        pathsofar = new int[mazeSize * mazeSize];  /*for max size*/
        for (x = 0; x < mazeSize * mazeSize; x++) {
            shortestpath[x] = -1;  /* initializing the path arrays*/
            pathsofar[x] = -1;
        }

        /*initial lengths*/
        shortestlength = mazeSize * mazeSize + 1;
        lengthsofar = 0;

        //System.out.println("Finding Paths...");
        findpath(veld.getPositieY(), veld.getPositieX(), pathsofar, lengthsofar);
        //System.out.println("");
        //System.out.println("The shortest path found was the following of length " + shortestlength);
        showmypath(shortestpath, shortestlength);        
    }

    public void findpath(int row, int col, int pathsofar[], int lengthsofar) {
        
        if (veld.getPositieY() < 0 || veld.getPositieX() < 0 || row >= mazeSize || col >= mazeSize) {
            return;
        }
        if (daMaze[row][col].getElement() instanceof Muur) {
            return;
        }
        if (beenhere(row, col, pathsofar, lengthsofar)) {
            return;
        }
        int mypath[] = new int[lengthsofar + 1];

        System.arraycopy(pathsofar, 0, mypath, 0, lengthsofar);        
        mypath[lengthsofar++] = row * mazeSize + col;  

        vindVriend();
        if (row == VriendY && col == VriendX) {            
            if (lengthsofar <= shortestlength) { /*New shortest path?*/
                shortestlength = lengthsofar;
                System.arraycopy(mypath, 0, shortestpath, 0, lengthsofar);                
            }
            return;
        }
        findpath(row - 1, col, mypath, lengthsofar);
        findpath(row, col - 1, mypath, lengthsofar);
        findpath(row, col + 1, mypath, lengthsofar);
        findpath(row + 1, col, mypath, lengthsofar);
    }

    boolean beenhere(int row, int col, int pathsofar[], int lengthsofar) {
        
        int x;
        int target = row * mazeSize + col;  /*this computation gives a unique
         id to each maze square*/

        for (x = 0; x < lengthsofar; x++) {
            if (pathsofar[x] == target) {
                return true;
            }
        }
        return false;
    }

    public void showmypath(int mypath[], int mylength) {

        for (int r = 0; r < mazeSize; r++) {
            for (int c = 0; c < mazeSize; c++) {
                if (beenhere(r, c, mypath, mylength) && !(daMaze[r][c].getElement() instanceof Vriend) && !(daMaze[r][c].getElement() instanceof Item)) {
                    PadSolved padSolveCreate = new PadSolved();                    
                    daMaze[r][c].setElement(padSolveCreate);   
                    veld.getLevel().spelpanel.UpdateVeld(padSolveCreate.getVeld());
                    daMaze[r][c].setElement(null); 
                }
            }
        }        
    }

    public void vindVriend() {

        int r, c;

        for (r = 0; r < mazeSize; r++) {
            for (c = 0; c < mazeSize; c++) {
                if (daMaze[r][c].getElement() instanceof Vriend) {
                    VriendX = c;
                    VriendY = r;
                }
            }
        }
    }  
}
