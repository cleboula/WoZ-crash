package fr.crash.core;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZoneTest {

private Zone zone1, glade;
private Path toGlade;
private Key assoZoneKey;
    
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
    	glade = new Zone("glade","blabla", null);
    	toGlade = new Path(glade, false, assoZoneKey);
        zone1 = new Zone("crash zone","blabla",null);
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
    	glade = new Zone("glade", "blabla", null);
    	toGlade = new Path(glade, false, assoZoneKey);
        zone1 = new Zone("crash zone", "blabla", null);
        zone1.setExits("west",toGlade);
        
        zone1.getZoneName();
        assertEquals("crash zone", zone1.getZoneName());
        zone1.getHMap();
        assertEquals(zone1.getHMap(), zone1.getHMap());
    }

}
