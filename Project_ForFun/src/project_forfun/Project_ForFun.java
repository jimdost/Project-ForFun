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
public class Project_ForFun {
 private static final int SIZE_X = 700;
    private static final int SIZE_y = 500;
    private static JPanel panel;
    private static JFrame frame; 
    private static ActionListener listener;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createFrame();
        GameCharacter speler = new GameCharacter();
        Graphics g = null;
        speler.paintComponent(g);
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
}
