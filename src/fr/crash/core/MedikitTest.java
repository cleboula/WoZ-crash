
package fr.crash.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.crash.game.InitializeGame;


class MedikitTest {
    
    @Test
    public void testCure()
    {
    	InitializeGame objGame = new InitializeGame();
    	Player player1 = new Player("toto", objGame);
        Medikit medikit1 = new Medikit(20, 10, "Medicine", "Small medikit to help you",null);
        player1.setHp(50);
        player1.setEp(50);
        medikit1.cure(player1);
        assertEquals(70, player1.getHP());
        assertEquals(60, player1.getEP());        
    }

}

