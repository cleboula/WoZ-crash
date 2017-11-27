package fr.crash.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ItemTest {
	
	private Player player1;
	private Key key1;

	@Test 
    public void testAddItem()
    {
		player1 = new Player("toto");
		key1 = new Key("kkey","testKey");
    	key1.addItem(key1);
    	assertEquals(true, key1.searchInventory(player1, key1));
    }
	
	@Test 
    public void testSearchInventory()
    {
		player1 = new Player("toto");
		key1 = new Key("kkey","testKey");
    	player1.getInventory().add(key1);
    	assertEquals(true, key1.searchInventory(player1, key1));
    }

}
