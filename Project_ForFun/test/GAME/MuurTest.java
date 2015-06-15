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
public class MuurTest {
    
    public MuurTest() {
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
     * Test of getSterkte method, of class Muur.
     */
    @Test
    public void testGetSterkte() {
        System.out.println("getSterkte");
        Muur instance = null;
        int expResult = 0;
        int result = instance.getSterkte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSterkte method, of class Muur.
     */
    @Test
    public void testSetSterkte() {
        System.out.println("setSterkte");
        int sterkte = 0;
        Muur instance = null;
        instance.setSterkte(sterkte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroyWall method, of class Muur.
     */
    @Test
    public void testDestroyWall() {
        System.out.println("destroyWall");
        Muur instance = null;
        instance.destroyWall();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class Muur.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        Muur instance = null;
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
