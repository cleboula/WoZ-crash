package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class PathTest {

	private Path path1;
    private Zone zone1;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        path1 = new Path(zone1, true);
    }
    
    @Test
    public void initialTest()
    {
        path1.getIsLocked();
        assertEquals(false, path1.getIsLocked());
        path1.getExit();
        assertEquals("glade", path1.getExit());
        path1.checkZone();
        assertEquals(false, path1.checkZone());
    }

}
