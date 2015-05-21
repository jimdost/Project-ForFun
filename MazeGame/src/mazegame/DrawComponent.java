package mazegame;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static mazegame.MazeGame.CreateMaze;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W.J.Bruinsma
 */
public class DrawComponent extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
                
        int aantalhokjes = 20;
        
        int[][] Maze = CreateMaze();
        
        for (int rowIndex = 0; rowIndex < aantalhokjes; rowIndex++) {

            for (int colIndex = 0; colIndex < aantalhokjes; colIndex++) {

                System.out.printf("%2d", Maze[rowIndex][colIndex]);
                if(Maze[colIndex][rowIndex] == 1){
                    g.setColor(Color.red);
                }else if (Maze[colIndex][rowIndex] == 3){
                    g.setColor(Color.cyan);
                }else if (Maze[colIndex][rowIndex] == 5){
                    g.setColor(Color.green);
                }else if (Maze[colIndex][rowIndex] == 8){
                    g.setColor(Color.lightGray);
                }else if (Maze[colIndex][rowIndex] == 9){
                    g.setColor(Color.darkGray);
                }else if (Maze[colIndex][rowIndex] == 0){
                    g.setColor(Color.blue);
                }
                
                g.fillRect(rowIndex *21 , colIndex *21, 20, 20);
            }
            System.out.println("");
        }  
    } 
    
    
     
}
