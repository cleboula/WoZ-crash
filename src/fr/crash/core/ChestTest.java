package fr.crash.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.crash.game.InitializeGame;


class ChestTest {

	private Chest chest1,chest2,chest3;
    private Key content,associatedKey;
    private Player player1;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    public void setUp()
    {
        chest1 = new Chest(content, "chest", "Contents a map",associatedKey,null);
    }
    
    @Test
    public void testCreation()
    {
    	chest1 = new Chest(content, "chest", "Contents a map",associatedKey,null);
        chest1.getIsOpened();
        assertEquals(false, chest1.getIsOpened());
        chest1.getName();
        assertEquals("chest", chest1.getName());
        chest1.getDescription();
        assertEquals("Contents a map", chest1.getDescription());  
    }
    
    @Test
    public void testIsOpenedFalse()
    {
    	
        chest2 = new Chest(content, "chest2", "contents a map",associatedKey,null);
    	chest2.getIsOpened();
        assertEquals(false, chest2.getIsOpened());
    }
    
    @Test
    public void testIsOpenedTrue()
    {
        chest3 = new Chest(content, "chest3", "contents a map",associatedKey,null);
        chest3.open();
    	chest3.getIsOpened();
        assertEquals(true, chest3.getIsOpened());
    }
    
    @Test
    public void testCheckChestNoKey()
    {
    	InitializeGame objGame = new InitializeGame();
    	player1 = new Player("bob", objGame);
    	associatedKey = new Key("kkey","testKey",null);
    	content = new Key("map","testContentKey",null);
        chest3 = new Chest(content, "chest3", "contents a map",associatedKey,null);
    	chest3.checkChest(player1);
        assertEquals(false, chest3.getIsOpened());
    }
    
    @Test
    public void testCheckChestWithKey()
    {
    	InitializeGame objGame = new InitializeGame();
    	player1 = new Player("bob", objGame);
    	associatedKey = new Key("kkey","testKey",null);
        chest3 = new Chest(content, "chest3", "contents a map",associatedKey,null);
        player1.getInventory().add(associatedKey);
    	chest3.checkChest(player1);
    	//jouter un addItem pour lui fournir la clef
        assertEquals(true, chest3.getIsOpened());
        assertEquals(true, player1.searchInventory(content));
    }
}
