package core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WoZTest {
    
    @Test
    public void testPlayerIsDead() 
    {
    	WoZ woz1 = new WoZ ();
    	Player player1 = new Player("toto");
    	player1.setHp(0);
    	assertEquals(false, woz1.isAlivePlayer(player1));	
    }
    
    @Test
    public void testPlayerIsNotDead() 
    {
    	WoZ woz1 = new WoZ ();
    	Player player1 = new Player("toto");
    	assertEquals(true, woz1.isAlivePlayer(player1));
    }
    
//    @Test
//    public void testNpcIsDead() 
//    {
//    	WoZ woz1 = new WoZ ();
//    	NpcFight npc1 = new NpcFight(100,50,"toto","big wolf");
//    	npc1.setHp(0);
//    	assertEquals(true, woz1.isAliveNpc(npc1));	
//    }
//    
//    @Test
//    public void testNpcIsNotDead() 
//    {
//    	WoZ woz1 = new WoZ ();
//    	NpcFight npc1 = new NpcFight(100,50,"toto","big wolf");
//    	assertEquals(false, woz1.isAliveNpc(npc1));
//    	
//    }
    
}
