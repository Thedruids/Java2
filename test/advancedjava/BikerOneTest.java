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
public class BikerOneTest {

    public BikerOneTest() {
    }

    private BikerOne b1;
    private Object name = "Thomas";
    private Object age = 29;
    private int racerID = 1234;

    @Before
    public void setUp() {
        b1 = new BikerOne();
    }

    @After
    public void tearDown() {
        b1 = null;
    }

    @Test
    public void testContructors() {
        BikerOne r = new BikerOne(1234, "Thomas", 29, true);
        assertEquals("ID did not set as expected",
                racerID,
                r.getRacerId());
        assertEquals("Name did not set as expected",
                name,
                r.getName());
        assertEquals("Age did not set as expected",
                age,
                r.getAge());

        BikerOne r2 = new BikerOne();
        assertNotNull("Constructor could not create", r);
        assertNotNull("Constructor could not create", r2);

    }
    
        /**
     * Test of getName method, of class BikerOne.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BikerOne instance = new BikerOne(1234, "Thomas", 29, true);
        String expResult = "Thomas";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class BikerOne.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Thomas";
        BikerOne instance = new BikerOne();
        instance.setName(name);
        assertTrue("Did not set name as expected: ", name.contains("Thomas"));
    }

    /**
     * Test of getAge method, of class BikerOne.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        BikerOne instance = new BikerOne();
        instance.setAge(29);
        int expResult = 29;
        int result = instance.getAge();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAge method, of class BikerOne.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 29;
        BikerOne instance = new BikerOne();
        instance.setAge(age);
        assertTrue("Did not set age as expected: ", (age == 29));
    }

    /**
     * Test of setRacerID method, of class BikerOne.
     */
    @Test
    public void testSetRacerID() {
        System.out.println("setRacerID");
        int racerId = 0;
        BikerOne instance = new BikerOne();
        instance.setRacerID(racerId);
        assertNotNull("racerId is null ", racerId);
        assertEquals("racerId is not equal ", racerId, 0);
    }

    /**
     * Test of getRacerId method, of class BikerOne.
     */
    @Test
    public void testGetRacerId() {
        System.out.println("getRacerId");
        BikerOne instance = new BikerOne();
        instance.setRacerID(racerID);
        int expResult = 1234;
        int result = instance.getRacerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of performRaceActivity method, of class BikerOne.
     */
    @Test
    public void testPerformRaceActivity() {
        System.out.println("performRaceActivity");
        BikerOne instance = new BikerOne();
        String expResult = "Cycling......";
        String result = instance.performRaceActivity();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class BikerOne.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BikerOne instance = new BikerOne(1234, "Thomas", 29, true);
        instance.setName("Thomas");
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals("toString did not match", expResult, result);

        String rID = String.format("%s", instance.getRacerId());
        
        assertTrue("String did not contain RacerID: ", result.contains(rID));

        String rClass = String.format("%s", instance.getClass());
        assertTrue("String did not contain class: ", result.contains(rClass));

        assertTrue("String did not contain name: ", result.contains(instance.getName()));

        String rAge = String.format("%s", instance.getAge());
        assertTrue("String did not contain age: ", result.contains(rAge));
        
        String rClips = String.format("%s", instance.getUsesClips());
        assertTrue("String did not contain uses clips: ", result.contains(rClips));

        assertTrue("String did not contain " + instance.performRaceActivity() + ": ", result.contains(instance.performRaceActivity()));

    }

   

}
