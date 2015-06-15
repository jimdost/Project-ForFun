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
public class ElementTest {
    
    public ElementTest() {
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
     * Test of getVeld method, of class Element.
     */
    @Test
    public void testGetVeld() {
        System.out.println("getVeld");
        Element instance = new ElementImpl();
        Veld expResult = null;
        Veld result = instance.getVeld();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVeld method, of class Element.
     */
    @Test
    public void testSetVeld() {
        System.out.println("setVeld");
        Veld veld = null;
        Element instance = new ElementImpl();
        instance.setVeld(veld);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoopbaar method, of class Element.
     */
    @Test
    public void testGetLoopbaar() {
        System.out.println("getLoopbaar");
        Element instance = new ElementImpl();
        boolean expResult = false;
        boolean result = instance.getLoopbaar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoopbaar method, of class Element.
     */
    @Test
    public void testSetLoopbaar() {
        System.out.println("setLoopbaar");
        boolean loopbaar = false;
        Element instance = new ElementImpl();
        instance.setLoopbaar(loopbaar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ElementImpl extends Element {
    }
    
}
