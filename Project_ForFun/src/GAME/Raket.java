/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

/**
 *
 * @author Tiko
 */
public class Raket {
    int sterkteExplosie;

    public Raket(int sterkteExplosie) {
        this.sterkteExplosie = sterkteExplosie;
    }

    public int getSterkteExplosie() {
        return sterkteExplosie;
    }

    public void setSterkteExplosie(int sterkteExplosie) {
        this.sterkteExplosie = sterkteExplosie;
    }

    void move(String direction) {
        //While the rocket hasn't touched a wall, move in the direction of shooting.
        //When contacted with the wall, subtract explosion damage from wall strength.
    }
    
    
}
