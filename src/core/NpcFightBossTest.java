package core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NpcFightBossTest {
	
	private NpcFightBoss npcBoss;
	
    @Test
    void getHp() {
    	npcBoss = new NpcFightBoss(500, 50, "PG", "PG...", 50);
    	assertEquals(500,npcBoss.getHp());
    }

    @Test
    void setHp() {
    	npcBoss = new NpcFightBoss(500, 50, "PG", "PG...", 50);
    	npcBoss.setHp(200);
    	assertEquals(200,npcBoss.getHp());
    }
	
    @Test
    void getEp() {
    	npcBoss = new NpcFightBoss(500, 50, "PG", "PG...", 50);
    	assertEquals(50,npcBoss.getEp());
    }
    

    @Test
    void setEp() {
    	npcBoss = new NpcFightBoss(500, 50, "PG", "PG...", 50);
    	npcBoss.setEp(20);
    	assertEquals(20,npcBoss.getEp());
    }

    @Test
    void attackPattern() {
    	npcBoss = new NpcFightBoss(500, 50, "PG", "PG...", 50);
    	npcBoss.attackPattern();
    	assertEquals(500,npcBoss.getHp());
    	assertEquals(50,npcBoss.getEp());
    }

}