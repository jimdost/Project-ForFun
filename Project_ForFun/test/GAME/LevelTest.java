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
public class LevelTest {
    
    public LevelTest() {
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
     * Test of getBord method, of class Level.
     */
    @Test
    public void testGetBord() {
        System.out.println("getBord");
        Level instance = null;
        Veld[][] expResult = null;
        Veld[][] result = instance.getBord();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBord method, of class Level.
     */
    @Test
    public void testSetBord() {
        System.out.println("setBord");
        Veld[][] bord = null;
        Level instance = null;
        instance.setBord(bord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeltSize method, of class Level.
     */
    @Test
    public void testGetVeltSize() {
        System.out.println("getVeltSize");
        Level instance = null;
        int expResult = 0;
        int result = instance.getVeltSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeler method, of class Level.
     */
    @Test
    public void testGetSpeler() {
        System.out.println("getSpeler");
        Level instance = null;
        Speler expResult = null;
        Speler result = instance.getSpeler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
