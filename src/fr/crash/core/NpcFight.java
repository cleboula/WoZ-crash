package fr.crash.core;

/**
 * Npc_Fight is the canvas class for all the Npc that are meant to fight
 * They are definided by their attack score
 * @author G1
 * @version 21/11/17
 */
public abstract class NpcFight extends Npc {
	
	private int hp;
	private int atk;


	/**
	 * Constructor of NpcDialog
	 * @param hp1 the Npc health points
	 * @param atk1 the Npc attack score
	 * @param name the Npc name
	 * @param description the Npc description
	 */
	public NpcFight(int hp1,int atk1,String name,String description){
		super(name, description);
		hp=hp1;
		atk=atk1;
	}

	/**
	 * Abstract method for the pattern of attacks of the monsters
	 */
	public abstract int attackPattern();


	/**
	 * This method is used to get the hp of the Npc.
	 * @return     the hp of the Npc
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * This method is used to get the Atk of the Npc.
	 * @return     the Atk of the Npc
	 */
	public int getAtk() {
		return atk;
	}

	/**
	 * Setter of the current Hp
	 * @param hp the new hp points
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * Setter of the current atk
	 * @param atk the new atk Spoints
	 */
	public void setAtk(int atk) {
		this.atk = atk;
	}

	
	
	
}
