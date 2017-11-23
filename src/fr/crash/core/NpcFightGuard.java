package fr.crash.core;

/**
 *  Guard Character, are defined by the use chain method that teleport the player
 * @author G1
 * @version 14/11/17
 */

public class NpcFightGuard extends NpcFight {
	private Zone zonejail;
	// the targeted zone for the transportation of the player
	private int hpmax;
	// the maximum hp the guard can have when unmodified
	private WoZ woz1;
	// The world
	
	//Guard Fighter constructor
	public NpcFightGuard(int hp1,int atk1,String name,String description,Zone zone1){
		
		super(hp1,atk1,name,description);
		zonejail=zone1;
		hpmax=hp1;
	}
	
	//Attack pattern :
	// If the Guard has less than 99% hp he teleport the player to jail and is dead, if not he attack
	public int attackPattern(){ 
		if ( super.getHp() < hpmax*99/100 ){
		chain();
		super.setHp(0);
		}
	
	return(super.getAtk());
	}
	
	
	
	//teleport the player to the zone JAIL
	public void chain(){
		woz1.setCurrentZone(zonejail);
	}
		
}
