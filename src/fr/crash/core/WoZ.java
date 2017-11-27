package fr.crash.core;

import java.util.HashMap;

import fr.crash.core.Path;
import fr.crash.core.Zone;
import fr.crash.game.InitializeGame;

//import java.util.ArrayList;
//import java.util.HashMap;
/**
 * This class represents our world
 *
 * @author Group 1 WoZ
 * @version 09/11/2017
 */
public class WoZ

{
    private Zone currentZone;
    
    /**
     * Constructeur d'objets de classe WoZ
     * Creation player, zones, personnages
     */
     public WoZ()
    {
    	 InitializeGame objGame = new InitializeGame();
    	 currentZone = objGame.crashzone;
    }

 
 
    /**
     * This method simulates a fight between our main player and an enemy
     * If the npc is dead, the fight is over and the player wins
     * If the player dies, the game is over
     * @param player : the main player
     * @param npc : the enemy involved in the fight
     */
   public void fight(Player player1,NpcFight npc1){
	   
	   if(player1.getHP()!=0 && npc1.getHp()!=0) { //if both player and npc are alive
		   player1.setHp(player1.getHP()-npc1.attackPattern());//set the player hp
		   npc1.setHp(npc1.getHp()-player1.getCurrentWeapon().getDamages(player1.getCurrentWeapon()));//set the npc hp
		   
	   }else if(player1.getHP()!=0){
		   //game over      
	   }
	}
   
   	public void switchWeapon(Player player1){
   		Item item1;
   		for(int i=0; i<player1.getListweapon().size(); i++) {
   		    item1=player1.getListweapon().get(i);
	   		    if ( player1.getCurrentWeapon()!=null){
	   			player1.setCurrentWeapon(player1.getListweapon().get(i));	
	   		    }
   		}   		
   	}
 



//search, fight ,speak, switch weapon
    //{
	   //get set
	  // while (player.getHP()!=0 && npc.getHP()!=0) //while the player and the npc are still not dead
	   //{ 
		 
		 //if attack() method is called 
		 //if they are both alive 
		 //Figther_npc --> attackPattern(Fighter npc) , decrease hp of player by the fighternpc atk and up hp_npc by 
		 //Player --> check currentweapon , decrease fighter npc by atk number
		   
		   //attackPattern(npc);
		   //player.setHP()=player.getHP()-atknpc;
		   //npc.setHP()= npchp-player.currentweapon.atk;
	    
	   //}
        
    //}
   
    /*
     * This method checks if the player does not have life anymore.
     * @param player : the main player
     */
    public boolean isAlivePlayer(Player player){
    	
    	if (player.getHP()> 0) {
    		return(true);
    	}else {
    		return(false);
    	}
    }
    
    /*
     * This method defines a new current zone
     */
    public void setCurrentZone(Zone glade) {
        this.currentZone = glade;
    }
    
    /*
     * This method returns the current zone
     * @return current zone, the zone where the player is
     */
    public Zone getCurrentZone() {
		return currentZone;
	}
    
    
    public Zone move(String dir) {
    	if (dir!="") {
    		for (HashMap.Entry<String, Path> entry:currentZone.getHMap().entrySet()){
                String key= entry.getKey();
                Path value= entry.getValue();              
                                          
                if(dir.equals(key)) {     
                	setCurrentZone(value.getExit());
                                   
                }
    		}
    	} 
		return currentZone;	
    }  
    /*This method checks if the npc does not have life anymore.
     * @param npc : the enemy involved in the fight
     */
//    private boolean isAliveNpc(NPC npc){
//    	
//    	if (npc.getHP()> 0) {
//    		return(true);
//    	}else {
//    		return(false);
//    	}
//    }



}
