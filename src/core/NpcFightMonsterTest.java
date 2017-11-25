package core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class NpcFightMonsterTest {
	private NpcFightMonster npcMonster;
	
	@Test
    void getHp() {
		npcMonster = new NpcFightMonster(100, 10, "Guard", "He is a guard");
    	assertEquals(100,npcMonster.getHp());
    }

    @Test
    void setHp() {
    	npcMonster = new NpcFightMonster(100, 10, "Guard", "He is a guard");
    	npcMonster.setHp(90);
    	assertEquals(90,npcMonster.getHp());
    }
    
    @Test
    void attackPattern() {
    	npcMonster = new NpcFightMonster(100, 10, "Guard", "He is a guard");
    	npcMonster.attackPattern();
    	assertEquals(10,npcMonster.getAtk());
    }

}