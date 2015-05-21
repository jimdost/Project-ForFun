/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project_forfun;

import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JPanel;


/**
 *
 * @author Jim
 */
public class Project_ForFun 
{
    private static GameCharacter speler;
    private static SpelScherm scherm;
    
    public static void main(String[] args) {
        
        scherm = new SpelScherm();
        Graphics g = null;
        speler.paintComponent(g);
    }
   
}
