/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedjava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thomas
 */
public class SwimmerOneTest {

    public SwimmerOneTest() {

    }

    SwimmerOne s1;

    @Before
    public void setUp() {
        s1 = new SwimmerOne();
    }

    @After
    public void tearDown() {
        s1 = null;
    }

    /**
     * Test of setRacerID method, of class SwimmerOne.
     */
    @Test
    public void testContructors() {
        SwimmerOne s = new SwimmerOne(10);
        SwimmerOne s2 = new SwimmerOne(10);
        assertNotNull("Constructor could not create", s);
        assertNotNull("Constructor could not create", s2);

    }

    @Test
    public void testSetRacerID() {
        System.out.println("setRacerID");
        int racerId = 10;
        int expected = 10;
        SwimmerOne instance = new SwimmerOne();
        instance.setRacerID(racerId);
        assertNotNull("RacerID is null: ", racerId);
        assertEquals("Racer id does not match: ", racerId, expected);
    }

    /**
     * Test of getRacerId method, of class SwimmerOne.
     */
    @Test
    public void testGetRacerId() {
        System.out.println("getRacerId");
        SwimmerOne instance = new SwimmerOne(10);
        int expResult = 10;
        int result = instance.getRacerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of performRaceActivity method, of class SwimmerOne.
     */
    @Test
    public void testPerformRaceActivity() {
        System.out.println("performRaceActivity");
        SwimmerOne instance = new SwimmerOne();
        String expResult = "Swimming.....";
        String result = instance.performRaceActivity();
        assertEquals(expResult, result);
    }

}
