/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_forfun;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jim
 */
public class SpelScherm extends JPanel implements ActionListener
{
    private static final int SIZE_X = 900;
    private static final int SIZE_y = 700;
    private GameCharacter ghc;
    private static JPanel panel;
    private static JFrame frame; 
   

    public SpelScherm()
    {
        createFrame();
        ghc = new GameCharacter();
        addKeyListener(new Toetsenbord());
        setFocusable(true);
        
        
    }
    
    public static void createFrame()
    {
        frame = new JFrame();
        frame.setSize(SIZE_X, SIZE_y);
        frame.setTitle("Random rectangles and squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
    }
    

    @Override
    public void actionPerformed(ActionEvent e)
    {
      repaint();
    }
    
}
