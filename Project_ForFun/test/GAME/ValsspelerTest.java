/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import java.awt.Graphics;
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
public class ValsspelerTest {
    
    public ValsspelerTest() {
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
     * Test of getCheatingAantalStappen method, of class Valsspeler.
     */
    @Test
    public void testGetCheatingAantalStappen() {
        System.out.println("getCheatingAantalStappen");
        Valsspeler instance = new Valsspeler();
        int expResult = 0;
        int result = instance.getCheatingAantalStappen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCheatingAantalStappen method, of class Valsspeler.
     */
    @Test
    public void testSetCheatingAantalStappen() {
        System.out.println("setCheatingAantalStappen");
        int cheatingAantalStappen = 0;
        Valsspeler instance = new Valsspeler();
        instance.setCheatingAantalStappen(cheatingAantalStappen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pakOp method, of class Valsspeler.
     */
    @Test
    public void testPakOp() {
        System.out.println("pakOp");
        Valsspeler instance = new Valsspeler();
        instance.pakOp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class Valsspeler.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        Valsspeler instance = new Valsspeler();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
