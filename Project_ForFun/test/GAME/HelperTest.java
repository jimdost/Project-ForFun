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
public class HelperTest {
    
    public HelperTest() {
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
     * Test of pakOp method, of class Helper.
     */
    @Test
    public void testPakOp() {
        System.out.println("pakOp");
        Helper instance = new Helper();
        instance.pakOp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class Helper.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        Helper instance = new Helper();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solveGame method, of class Helper.
     */
    @Test
    public void testSolveGame() {
        System.out.println("solveGame");
        Helper instance = new Helper();
        instance.solveGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findpath method, of class Helper.
     */
    @Test
    public void testFindpath() {
        System.out.println("findpath");
        int row = 0;
        int col = 0;
        int[] pathsofar = null;
        int lengthsofar = 0;
        Helper instance = new Helper();
        instance.findpath(row, col, pathsofar, lengthsofar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beenhere method, of class Helper.
     */
    @Test
    public void testBeenhere() {
        System.out.println("beenhere");
        int row = 0;
        int col = 0;
        int[] pathsofar = null;
        int lengthsofar = 0;
        Helper instance = new Helper();
        boolean expResult = false;
        boolean result = instance.beenhere(row, col, pathsofar, lengthsofar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showmypath method, of class Helper.
     */
    @Test
    public void testShowmypath() {
        System.out.println("showmypath");
        int[] mypath = null;
        int mylength = 0;
        Helper instance = new Helper();
        instance.showmypath(mypath, mylength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vindVriend method, of class Helper.
     */
    @Test
    public void testVindVriend() {
        System.out.println("vindVriend");
        Helper instance = new Helper();
        instance.vindVriend();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
