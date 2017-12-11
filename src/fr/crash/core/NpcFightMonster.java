package fr.crash.core;

/**
 *  Simple Monster , Basic oponent
 * @author G1
 * @version 21/11/17
 */

public class NpcFightMonster extends NpcFight {

	/**
	 * Constructor of NpcDialog
	 * @param hp1 the Npc health points
	 * @param atk1 the Npc attack score
	 * @param name the Npc name
	 * @param description the Npc description
	 */
	public NpcFightMonster(int hp1,int atk1,String name,String description){
		
		super(hp1,atk1,name,description);
	}


	/**
	 * This method is used to define the pattern of fight for the monster
	 * Attack pattern : simple attack every turns
	 * @return     the atk of the monster for this turn
	 */
	public int attackPattern(){ 
		
	
	return(super.getAtk());
	}
		
}
