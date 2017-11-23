package fr.crash.core;
import java.util.Random;

/**
 *  Boss Character, are defined by the use of ep
 * @author G1
 * @version 21/11/17
 */
 
public class NpcFightBoss extends NpcFight {

	private int ep;
	// energy point for the Boss
	private int hpmax;
	//Max hp the Boss can have when unmodified
	private int atkmax;
	//Max atk the Boss can have when unmodified
	private int epmax;
	//Max ep the Boss can have when unmodified
	
	//Boss constructor
	public NpcFightBoss(int hp1,int atk1,String name,String description,int ep1){
		super(hp1,atk1,name,description);
		ep=ep1;
		epmax=ep1;
		hpmax=hp1;
		atkmax=atk1;
		
		
	}
	// Ep getter
	public int getEp() {
		return ep;
	}
	// Ep setter
	public void setEp(int ep) {
		this.ep = ep;
	}
	
	//Method that return the Boss's attack score for one turn and that make change in Hp and Ep in special cases
	// If the Hp are less than 25 % 6 random event can happen
	// If the Hp are less than 50 % atk is * 2
	// If the Hp are less than 75 % atk is normal
	// If the Hp are moore atk is divided by 2
	public int attackPattern(){ 
		
		
		
		if ( super.getHp() < hpmax*25/100){
			Random random = new Random();
			int nbrandom= random.nextInt(4);
				if(nbrandom==1){				
					super.setHp((hpmax*50/100)+super.getHp());
					setEp(getEp()-(epmax*50/100));
					super.setAtk(atkmax);
				}else if(nbrandom==2){				
					super.setHp((hpmax*25/100)+super.getHp());
					setEp(getEp()-(epmax*30/100));
					super.setAtk(atkmax);
				}else if(nbrandom==3){
					super.setAtk(atkmax*3);
				}else if(nbrandom==4){
					super.setAtk(atkmax*4);	
				}
					
		}else if(super.getHp() < hpmax*50/100){
			super.setAtk(atkmax*2);
			
		}else if(super.getHp() < hpmax*75/100){
			super.setAtk(atkmax);
		}else{
			super.setAtk(atkmax/2);
		};
	
	return(super.getAtk());
	}

	
}
