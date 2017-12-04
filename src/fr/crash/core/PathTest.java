package fr.crash.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import fr.crash.game.InitializeGame;

class PathTest {

	private Path path1;
    private Zone zone1;
    private Key assoKey;
    private Player player1;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        path1 = new Path(zone1, true, assoKey);
    }
    
    @Test
    public void initialTest()
    {
    	assoKey = new Key("testKey", "opening first path",null);
        path1 = new Path(zone1, true, assoKey);
        InitializeGame objGame = new InitializeGame();
    	player1 = new Player("toto", objGame);

        path1.getIsLocked();
        assertEquals(true, path1.getIsLocked());
        path1.getExit();
        assertEquals(zone1, path1.getExit());
        path1.checkZone(player1);
        assertEquals(true, path1.checkZone(player1));
    }


}
