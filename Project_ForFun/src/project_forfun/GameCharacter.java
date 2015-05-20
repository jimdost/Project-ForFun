/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_forfun;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 * @author Jim
 */
public class GameCharacter extends Element implements ActionListener
{
    private int velX;
    private int velY;
    private int x;
    private int y;
    
    
    public GameCharacter()
    {
       
    }    
    public void bewegen()
    {
        
    }
    public void oppakken()
    {
        
    }
    public void vuurRaket()
    {
        
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(0, 0, 15, 15));
    }
    public void moveLeft()
    {
        velY=0;
        velX=-4;
        movePosY(velY);
        movePosX(velX);
    }
    public void moveRight()
    {
        velY=0;
        velX=4;
        movePosY(velY);
        movePosX(velX);
    }
    public void moveUp()
    {
        velY=-4;
        velX=0;
        movePosY(velY);
        movePosX(velX);
    }
    public void moveDown()
    {
        velY=4;
        velX=0;
        movePosY(velY);
        movePosX(velX);
    }
    
    public void movePosX(int newX)
    {
         x = super.getPosX();
         x += newX;
    }
    public void movePosY(int newY)
    {
         y = super.getPosY();
         y += newY;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
         repaint();
    }

    
}
