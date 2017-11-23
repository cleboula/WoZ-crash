package fr.crash.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import core.Chest;
import core.Key;
import core.Player;

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
        chest1 = new Chest(content, "chest", "Contents a map",associatedKey);
    }
    
    @Test
    public void testCreation()
    {
    	chest1 = new Chest(content, "chest", "Contents a map",associatedKey);
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
    	
        chest2 = new Chest(content, "chest2", "contents a map",associatedKey);
    	chest2.getIsOpened();
        assertEquals(false, chest2.getIsOpened());
    }
    
    @Test
    public void testIsOpenedTrue()
    {
        chest3 = new Chest(content, "chest3", "contents a map",associatedKey);
        chest3.open();
    	chest3.getIsOpened();
        assertEquals(true, chest3.getIsOpened());
    }
    
    @Test
    public void testCheckChestNoKey()
    {
    	player1 = new Player("bob");
    	associatedKey = new Key("kkey","testKey");
    	content = new Key("map","testContentKey");
        chest3 = new Chest(content, "chest3", "contents a map",associatedKey);
    	chest3.checkChest(player1);
        assertEquals(false, chest3.getIsOpened());
    }
    
    @Test
    public void testCheckChestWithKey()
    {
    	player1 = new Player("bob");
    	associatedKey = new Key("kkey","testKey");
        chest3 = new Chest(content, "chest3", "contents a map",associatedKey);
        player1.getInventory().add(associatedKey);
    	chest3.checkChest(player1);
    	//jouter un addItem pour lui fournir la clef
        assertEquals(true, chest3.getIsOpened());
        assertEquals(true, chest3.searchInventory(player1,content));
    }
}
