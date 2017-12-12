package fr.crash.core;

import fr.crash.game.InitializeGame;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

	private Player player1;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    	InitializeGame objGame = new InitializeGame();
    	player1 = new Player("bob", objGame);
    }

    @Test 
    public void blankbeforename()
    {
    	InitializeGame objGame = new InitializeGame();
       player1 = new Player("  bob", objGame);
       assertEquals("bob",player1.getPlayerName());
    }
    @Test 
    public void blankaftername()
    {
    	InitializeGame objGame = new InitializeGame();
       player1 = new Player("bob   ", objGame);
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
    	InitializeGame objGame = new InitializeGame();
        player1 = new Player("bob   ", objGame);
        assertEquals(100,player1.getHP());
    }

    @Test 
    public void positiveep()
    {
    	InitializeGame objGame = new InitializeGame();
        player1 = new Player("bob", objGame);
    		assertEquals(100,player1.getEP());
    }
    
    @Test 
    public void testSetHP()
    {
    	InitializeGame objGame = new InitializeGame();
        player1 = new Player("bob", objGame);
        player1.setHp(50);
        assertEquals(50,player1.getHP());
    }
    
    @Test 
    public void testSetEP()
    {
    	InitializeGame objGame = new InitializeGame();
        player1 = new Player("bob", objGame);
     	player1.setEp(50);
        assertEquals(50,player1.getEP());
    }
    
}
