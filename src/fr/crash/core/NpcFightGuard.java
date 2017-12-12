package fr.crash.core;

/**
 *  Guard Character, are defined by the use chain method that teleport the player
 * @author G1
 * @version 14/11/17
 */

public class NpcFightGuard extends NpcFight {
	private Zone zonejail;
	private int hpmax;
	private WoZ woz1;

	/**
	 * Constructor of NpcDialog
	 * @param hp1 the Npc health points
	 * @param atk1 the Npc attack score
	 * @param name the Npc name
	 * @param description the Npc description
	 * @param zone1 the zone targeted by the npc
	 */
	public NpcFightGuard(int hp1,int atk1,String name,String description,Zone zone1){
		
		super(hp1,atk1,name,description);
		zonejail=zone1;
		hpmax=hp1;
	}

	/**
	 * This method is used to define the pattern of fight for the guard
	 * If the Guard has less than 99% hp he teleport the player to jail and is dead, if not he attack
	 * @return     the atk of the guard for this turn
	 */
	public int attackPattern(){
		
		chain();
		
	
	return(super.getAtk());
	}


	/**
	 * This method teleport the player to the jail
	 */
	//teleport the player to the zone JAIL
	public void chain(){
		woz1.setCurrentZone(zonejail);
	}
		
}
