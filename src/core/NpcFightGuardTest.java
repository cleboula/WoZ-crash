package core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NpcFightGuardTest {
	
	private NpcFightGuard npcGuard;
	private Zone zone1;
	
	@Test
    void getHp() {
		npcGuard = new NpcFightGuard(100, 10, "Guard", "He is a guard", zone1);
    	assertEquals(100,npcGuard.getHp());
    }

    @Test
    void setHp() {
    	npcGuard = new NpcFightGuard(100, 10, "Guard", "He is a guard", zone1);
    	npcGuard.setHp(90);
    	assertEquals(90,npcGuard.getHp());
    }

    @Test
    void attackPattern() {
    	npcGuard = new NpcFightGuard(100, 10, "Guard", "He is a guard", zone1);
    	npcGuard.attackPattern();
    	assertEquals(10,npcGuard.attackPattern());
    }

    @Test
    void chain() {
    }

}