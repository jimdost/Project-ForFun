/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_forfun;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author Jim
 */
public class Element extends JPanel
{
    private int posX;
    private int posY;
    private Graphics afbeelding;
    
    public int getPosX()
    {
        return posX;
    }
    public void setPosX(int newX)
    {
        posX = newX;
    }
    public int getPosY()
    {
        return posY;
    }
    public void setPosY(int newY)
    {
        posY = newY;
    }
    
}
