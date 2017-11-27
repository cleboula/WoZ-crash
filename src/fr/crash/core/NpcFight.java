package fr.crash.core;

/**
 * Npc_Fight is the canvas class for all the Npc that are meant to fight
 * They are definided by their attack score
 * @author G1
 * @version 21/11/17
 */
public abstract class NpcFight extends Npc {
	
	private int hp;
	//Npc Fighters Health points
	private int atk;
	//Npc Fighters Attack Score
	
	
	//NpcFight constructor
	public NpcFight(int hp1,int atk1,String name,String description){
		super(name, description);
		hp=hp1;
		atk=atk1;
	}
	
	//The canvas for the attackPattern method that implement the Fighter Behavior
	public abstract int attackPattern();

	
	//Hp getter
	public int getHp() {
		return hp;
	}
	//Atk getter
	public int getAtk() {
		return atk;
	}
	
	//Hp setter
	public void setHp(int hp) {
		this.hp = hp;
	}

	//Atk setter
	public void setAtk(int atk) {
		this.atk = atk;
	}

	
	
	
}
