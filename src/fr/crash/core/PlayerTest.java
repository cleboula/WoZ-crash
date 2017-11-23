package fr.crash.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class PlayerTest {

	private Player player1;
	private Item item1;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        player1 = new Player("bob");
    }

    @Test 
    public void blankbeforename()
    {
       player1 = new Player("  bob");
       assertEquals("bob",player1.getPlayerName());
    }
    @Test 
    public void blankaftername()
    {
       player1 = new Player("bob   ");
       assertEquals("bob",player1.getPlayerName());
    }
    // @Test 
    // public void blankover20name()
    // {
       // player1 = new Player("Bob the best player in the world");
       
    // }

    @Test 
    public void positivehp()
    {
        player1 = new Player("bob"); 
        assertEquals(100,player1.getHP());
    }

    @Test 
    public void positiveep()
    {
        player1 = new Player("bob");
    		assertEquals(100,player1.getEP());
    }
    
    @Test 
    public void testSetHP()
    {
        player1 = new Player("bob");  
        player1.setHp(50);
        assertEquals(50,player1.getHP());
    }
    
    @Test 
    public void testSetEP()
    {
        player1 = new Player("bob");
     	player1.setEp(50);
        assertEquals(50,player1.getEP());
    }
    
}
