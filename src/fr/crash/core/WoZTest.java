package fr.crash.core;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import core.Key;
import core.Path;
import core.Player;
import core.WoZ;
import core.Zone;

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
    
    @Test
    public void moveIsPossible() 
    {	
    	
    	Zone glade,forestE;
    	Path glade_forestE;
    	glade = new Zone("glade", null);
        forestE = new Zone("forestE", null);
    	
    	Key key1;
    	WoZ woz1 = new WoZ ();
    	key1=new Key("cl�","bla bla");
        glade_forestE = new Path(forestE,false,key1);
        glade.setExits("east",glade_forestE);
        woz1.setCurrentZone(glade);
        woz1.move("east");
    	
    	assertEquals(forestE, woz1.move("east"));
    	
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
