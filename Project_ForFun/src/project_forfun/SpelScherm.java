/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_forfun;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Jim
 */
public class SpelScherm extends JPanel implements ActionListener
{
    private GameCharacter ghc;
   

    public SpelScherm()
    {
        ghc = new GameCharacter();
        addKeyListener(new Toetsenbord());
        setFocusable(true);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e)
    {
      repaint();
    }
    
}
