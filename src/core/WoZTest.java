package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class WoZTest {

	private Player player1;
    private NPC npc1;
    private WoZ woZTest;
    
    /**
     * Default constructor for test class WoZTest
     */
    public WoZTest()
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
        woZTest = new WoZ();
        player1 = new Player(" ");
        npc1 = new Boss();
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
    public void rigthsobject()
    {
    	
    }


}
