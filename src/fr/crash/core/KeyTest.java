package fr.crash.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class KeyTest {

	private Key key1;

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        key1 = new Key("key", "Opens a door",null);
    }

    @Test
    public void testCreationKey()
    {
    	key1 = new Key("key", "Opens a door",null);
        key1.getName();
    	assertEquals("key", key1.getName());
    	key1.getDescription();
        assertEquals("Opens a door", key1.getDescription());
    }
}

