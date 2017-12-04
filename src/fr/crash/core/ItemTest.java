package fr.crash.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.crash.game.InitializeGame;


class ItemTest {
	
	private Player player1;
	private Key key1;

	@Test 
    public void testAddItem()
    {
		InitializeGame objGame = new InitializeGame();
    	player1 = new Player("toto", objGame);
		key1 = new Key("kkey","testKey",null);
    	key1.addItem(key1);
    	assertEquals(true, key1.searchInventory(player1, key1));
    }
	
	@Test 
    public void testSearchInventory()
    {
		InitializeGame objGame = new InitializeGame();
    	player1 = new Player("toto", objGame);
		key1 = new Key("kkey","testKey",null);
    	player1.getInventory().add(key1);
    	assertEquals(true, key1.searchInventory(player1, key1));
    }

}
