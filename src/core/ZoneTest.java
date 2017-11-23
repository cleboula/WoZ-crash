package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class ZoneTest {

private Zone zone1, glade;
private Path toGlade;
    
    /**
     * Default constructor for test class ZoneTest
     */
    public ZoneTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    	glade = new Zone("glade");
    	toGlade = new Path(glade, false);
        zone1 = new Zone("crash zone");
        zone1.setExits("west",toGlade);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testInitialState()
    {
        zone1.getZoneName();
        assertEquals("crash zone", zone1.getZoneName());
        zone1.getExitZone();
        assertEquals("glade", zone1.getExitZone());
    } 

}
