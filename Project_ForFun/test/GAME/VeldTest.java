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
public class VeldTest {
    
    public VeldTest() {
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
     * Test of getBuuren method, of class Veld.
     */
    @Test
    public void testGetBuuren() {
        System.out.println("getBuuren");
        int positieY = 0;
        int positieX = 0;
        Veld instance = new Veld();
        instance.getBuuren(positieY, positieX);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setElement method, of class Veld.
     */
    @Test
    public void testSetElement() {
        System.out.println("setElement");
        Element element = null;
        Veld instance = new Veld();
        instance.setElement(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElement method, of class Veld.
     */
    @Test
    public void testGetElement() {
        System.out.println("getElement");
        Veld instance = new Veld();
        Element expResult = null;
        Element result = instance.getElement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPositieX method, of class Veld.
     */
    @Test
    public void testGetPositieX() {
        System.out.println("getPositieX");
        Veld instance = new Veld();
        int expResult = 0;
        int result = instance.getPositieX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPositieY method, of class Veld.
     */
    @Test
    public void testGetPositieY() {
        System.out.println("getPositieY");
        Veld instance = new Veld();
        int expResult = 0;
        int result = instance.getPositieY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPositieX method, of class Veld.
     */
    @Test
    public void testSetPositieX() {
        System.out.println("setPositieX");
        int posX = 0;
        Veld instance = new Veld();
        instance.setPositieX(posX);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPositieY method, of class Veld.
     */
    @Test
    public void testSetPositieY() {
        System.out.println("setPositieY");
        int posY = 0;
        Veld instance = new Veld();
        instance.setPositieY(posY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
