package fr.crash.core;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WoZTest {
    
    @Test
    public void testPlayerIsDead() 
    {
    	WoZ woz1 = new WoZ("toto");
    	woz1.getPlayer().setHp(0);
    	assertEquals(false, woz1.isAlivePlayer(woz1.getPlayer()));	
    }
    
    @Test
    public void testPlayerIsNotDead() 
    {
    	WoZ woz1 = new WoZ("toto");
    	assertEquals(true, woz1.isAlivePlayer(woz1.getPlayer()));
    }
    
    @Test
    public void moveIsPossible() 
    {	
    	
    	Zone glade,forestE;
    	Path glade_forestE;
    	glade = new Zone("glade", "a calm zone",null);
        forestE = new Zone("forestE", "the east part of the forest", null);
    	
    	Key key1;
    	WoZ woz1 = new WoZ("toto");
    	key1=new Key("cle","bla bla", null);
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
