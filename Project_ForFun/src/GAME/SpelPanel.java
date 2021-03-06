/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author wytze
 */
public final class SpelPanel extends JPanel implements ActionListener {

    private final Veld[][] bord;
    private Level level;
    private final JLabel stapppenLable;
    protected int aantalStappen;
    private Frame frame;

    public SpelPanel(int levelnummer) {
        setLayout(null);
        aantalStappen = 0;

        level = new Level(levelnummer);
        level.spelpanel = (this);
        bord = level.getBord();

        stapppenLable = new JLabel("Move teller:  " + aantalStappen);
        stapppenLable.setBounds(380, 0, 200, 25);
        stapppenLable.setFont(new Font("Serif", Font.PLAIN, 26));
        stapppenLable.setForeground(Color.white);
        add(stapppenLable);

        DrawLevel();

        setSize(bord.length * level.getVeltSize() + 5, bord.length * level.getVeltSize() + 62);
        setBackground(Color.gray);
        revalidate();
    }

    protected void DrawLevel() {
        int xB = 0;
        int yB = 0;

        for (Veld[] bord1 : bord) {
            for (int y = 0; y < bord.length; y++) {
                if (bord1[y].getElement() != null) {
                    Veld veld = bord1[y];
                    veld.getElement().setBounds(xB, yB, level.getVeltSize(), level.getVeltSize());
                    add(veld.getElement());
                }
                xB = xB + level.getVeltSize();
            }
            yB = yB + level.getVeltSize();
            xB = 0;
        }
        revalidate();
        repaint();
    }

    protected void UpdateVeld(Veld veld) {

        veld.getElement().setBounds(veld.getPositieX() * level.getVeltSize(), veld.getPositieY() * level.getVeltSize(), level.getVeltSize(), level.getVeltSize());
        add(veld.getElement());
        veld.getElement().repaint();
    }

    protected void DrawWin() {

        removeAll();
        level.getSpeler().setVisible(false);

        Rectangle r = getBounds();

        JLabel wintext = new JLabel("JEEEJ!");
        wintext.setBounds((r.height / 3) + 20, (r.width / 4), 150, 50);
        wintext.setFont(new Font("Serif", Font.PLAIN, 50));
        wintext.setForeground(Color.black);

        JButton nextlevel = new JButton("next level");
        nextlevel.setBackground(Color.blue);
        nextlevel.setBounds((r.height / 2) - 45, (r.width / 3) + 120, 80, 30);
        nextlevel.setFocusable(false);
        nextlevel.addActionListener(this);

        add(wintext);
        add(nextlevel);
        setBackground(Color.red);
        setFocusable(false);
        repaint();
    }

    Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    protected void updateAantalStappen() {
        aantalStappen++;
        stapppenLable.setText("Move teller:  " + aantalStappen);
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String action = e.getActionCommand();
        switch (action) {
            case "next level":
                frame.remove(this);
                Frame.setLevelNr(1);
                frame.setSpelComponents(Frame.levelNr);
                revalidate();
                break;
        }
    }

}
