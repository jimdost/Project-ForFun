package mazegame;


import java.awt.Color;
import java.awt.Panel;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W.J.Bruinsma
 */
public class DrawFrame extends JFrame{
    
    public Panel panel;
    
    public DrawFrame(){
        
        panel = new Panel();
        panel.setSize(200, 400);
        
        DrawComp dw = new DrawComp();
        dw.setSize(100, 100);
        panel.add(dw);
        add(panel);
        
    }


    
}
