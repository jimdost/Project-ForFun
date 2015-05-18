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
public class DrawComp extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g) {
        
        int aantalhokjes = 20;
        
        int[][] Maze = CreateMaze();
        
        //g.fillRect(0, 0, 20, 20);
        
        
        for (int rowIndex = 0; rowIndex < aantalhokjes; rowIndex++) {

            for (int colIndex = 0; colIndex < aantalhokjes; colIndex++) {

                System.out.printf("%2d", Maze[rowIndex][colIndex]);
                if(Maze[colIndex][rowIndex] == 1){
                    g.setColor(Color.red);
                }else{
                    g.setColor(Color.blue);
                }
                
                g.fillRect(rowIndex *21 , colIndex *21, 20, 20);
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        /*      
        
        super.paintComponent(g);        
        Graphics2D g2d = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();  
           
        
        for (int i = 0; i < 800000; i++) {  
            
            Random r = new Random();
            int ran1 = r.nextInt(250);
            int ran2 = r.nextInt(250);
            int ran3 = r.nextInt(250);  
            Color c = new Color(ran1,ran2,ran3);
            g2d.setPaint(c);

            int x = Math.abs(r.nextInt()) % w;
            int y = Math.abs(r.nextInt()) % h;
            //g2d.drawLine(x, y, x, y);
    }

*/
    
    }
    
}
