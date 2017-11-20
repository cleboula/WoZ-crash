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
        key1.getName();
    	assertEquals(true, key1.getName());
    	key1.getDescription();
        assertEquals(true, key1.getDescription());
    }
}