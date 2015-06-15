/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wytze
 */
public class RaketTest {
    
    public RaketTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSterkteExplosie method, of class Raket.
     */
    @Test
    public void testGetSterkteExplosie() {
        System.out.println("getSterkteExplosie");
        Raket instance = null;
        int expResult = 0;
        int result = instance.getSterkteExplosie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSterkteExplosie method, of class Raket.
     */
    @Test
    public void testSetSterkteExplosie() {
        System.out.println("setSterkteExplosie");
        int sterkteExplosie = 0;
        Raket instance = null;
        instance.setSterkteExplosie(sterkteExplosie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Raket.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        String direction = "";
        Raket instance = null;
        instance.move(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
