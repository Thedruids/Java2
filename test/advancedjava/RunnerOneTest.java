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

public class RunnerOneTest {

    public RunnerOneTest() {
    }

    private RunnerOne r1;
    private int racerID = 12;

    @Before
    public void setUp() {
        r1 = new RunnerOne(10);
    }

    @After
    public void tearDown() {
        r1 = null;
    }

    @Test
    public void testContructors() {
        RunnerOne r = new RunnerOne(10);
        RunnerOne r2 = new RunnerOne();
        assertNotNull("Constructor could not create", r);
        assertNotNull("Constructor could not create", r2);

    }

    /**
     * Test of setRacerID method, of class RunnerOne.
     */
    @Test
    public void testSetRacerID() {
        System.out.println("setRacerID");
        int racerId = 0;
        RunnerOne instance = new RunnerOne();
        instance.setRacerID(racerId);
        assertNotNull("racerId is null ", racerId);
        assertEquals("racerId is not equal ", racerId, 0);
    }

    /**
     * Test of getRacerId method, of class RunnerOne.
     */
    @Test
    public void testGetRacerId() {
        System.out.println("getRacerId");
        RunnerOne instance = new RunnerOne();
        instance.setRacerID(racerID);
        int expResult = 12;
        int result = instance.getRacerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of performRaceActivity method, of class RunnerOne.
     */
    @Test
    public void testPerformRaceActivity() {
        System.out.println("performRaceActivity");
        RunnerOne instance = new RunnerOne();
        String expResult = "Running.....";
        String result = instance.performRaceActivity();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class RunnerOne.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RunnerOne instance = new RunnerOne();
        instance.setRacerID(10);
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals("toString did not match", expResult, result);

        String rID = String.format("%d", instance.getRacerId());
        assertTrue("String did not contain RacerID: ", result.contains(rID));

        String rc = String.format("%s", instance.getClass());
        assertTrue("String did not contain class: ", result.contains(rc));

        assertTrue("String did not contain " + instance.performRaceActivity() + ": ", result.contains(instance.performRaceActivity()));

    }

}
