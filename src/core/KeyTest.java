package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KeyTest {

	private Key key1;
	private Chest chest1;

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        key1 = new Key("key", "Opens a door", chest1);
    }

    @Test
    public void testCreationKey()
    {
    	key1 = new Key("key", "Opens a door", null);
        key1.getName();
    	assertEquals("key", key1.getName());
    	key1.getDescription();
        assertEquals("Opens a door", key1.getDescription());
    }
}
