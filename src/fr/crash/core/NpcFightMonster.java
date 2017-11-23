package fr.crash.core;

/**
 *  Simple Monster , Basic oponent
 * @author G1
 * @version 21/11/17
 */

public class NpcFightMonster extends NpcFight {

	//Monster constructor
	public NpcFightMonster(int hp1,int atk1,String name,String description){
		
		super(hp1,atk1,name,description);
	}
	
	
	//Attack pattern : simple attack every turns
	public int attackPattern(){ 
		
	
	return(super.getAtk());
	}
		
}
