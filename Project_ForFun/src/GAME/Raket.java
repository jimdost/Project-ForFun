/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;


/**
 *
 * @author Tiko
 */
public class Raket extends Element {

    private int sterkteExplosie = 5;

    public Raket() {

    }

    public int getSterkteExplosie() {
        return sterkteExplosie;
    }

    public void setSterkteExplosie(int sterkteExplosie) {
        this.sterkteExplosie = sterkteExplosie;
    }

    int afstand = 0;

    void move(String direction) {

        Veld buur = veld.getLevel().getBuuren(veld.getPositieY(), veld.getPositieX(), direction);

        if (buur.getElement() != null) {
            if (buur.getElement() instanceof Muur) {                
                Muur muur = (Muur) buur.getElement();
                muur.gethit(this);
            }else{
                buur.getElement().setVisible(false);
                buur.setElement(null);                
            }              
        } else {
            veld.setElement(null);
            buur.setElement(this);
            move(direction);
        }
        veld.setElement(null);
    }
}
