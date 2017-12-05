package fr.crash.core;

import java.util.HashMap;

import fr.crash.core.Path;
import fr.crash.core.Zone;
import fr.crash.game.InitializeGame;

/**
 * This class represents our world
 * the player can move search items and interact with its environment
 *
 * @author Group 1 WoZ
 * @version 09/11/2017
 */
public class WoZ
{
	private Player player; 
    private Zone currentZone; //the zone where the player is
	private boolean currentfight; //if the player is in the middle of a fight (true) if not (false)
    
    /**
     * Constructor of the world
     * All elements of the world is created
     * It manages the
     */
     public WoZ(String playerName)
    {
    	 InitializeGame objGame = new InitializeGame(); //creates all element of the world
    	 currentZone = objGame.getCurrentZone();//because it is private
    	 player = new Player(playerName,objGame); //create the player
       	 currentfight=false;	 
    }
     
    /**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}
	
	/**
     * This method simulates a fight between our main player and an enemy
     * If the npc is dead, the fight is over and the player wins
     * If the player dies, the game is over
     * @param player : the main player
     * @param npc : the enemy involved in the fight
     * @return messageatk : the message displays during the fight
     */
   public String fight(Player player1,NpcFight npc1){
	   String messageatk ="";
	   currentfight=true;	   
	   if(player1.getHP()!=0 && npc1.getHp()!=0) { //if both player and npc are alive
		   player1.setHp(player1.getHP()-npc1.attackPattern());//set the player hp
		   npc1.setHp(npc1.getHp()-player1.getCurrentWeapon().getDamages());//set the npc hp
		   messageatk ="You have"+player1.getHP()+"health point left. Your opponent is bleeding,"+npc1.getHp()+"health point left !";
	   }else if(npc1.getHp()==0){ 
		   currentfight=false;
		   messageatk ="You won the fight, you can move out this zone";
	   }else if(player1.getHP()==0){
		   //game over  
	   }
	   return messageatk;
	}

   /**
    * This method allows the player to switch weapon 
    * @param player1
    */
   //TODO pourquoi la mettre ici et pas dans player ?
   	public void switchWeapon(Player player1){
   		Item item1;
   		for(int i=0; i<player1.getListweapon().size(); i++) { 			
   		    item1=player1.getListweapon().get(i);
	   		    if ( player1.getCurrentWeapon()!=null){
	   			player1.setCurrentWeapon(((Weapon)item1));	
	   		    }
   		}   		
   	}

   /**
    * This method checks if the player does not have life anymore.
    * @param player 
    * @return boolean if the player is alive (true) if not (false)
    */
    public boolean isAlivePlayer(Player player){  	
    	if (player.getHP()> 0) {
    		return(true);
    	}else {
    		return(false);
    	}
    }
    
    /**
     * This method return the value of the boolean current fight
     * @return currentfight true if the player is in the middle of a fight false if it is not
     */
    public boolean isCurrentfight() {
		return currentfight;
	}
    
    /**
     * This method defines a new current zone
     * @param zone the new current zone
     */
    public void setCurrentZone(Zone zone) {
        this.currentZone = zone;
    }
    
    /**
     * This method returns the current zone
     * @return current zone, the zone where the player is
     */
    public Zone getCurrentZone() {
		return currentZone;
	}
    
    /**
     * This method allow the player to move
     * He is blocked when the path is locked until he gets the right item
     * He can move when the path is not locked
     * When he enter in a new zone, a monster can attack him
     * @param dir the direction chosen
     * @return message the message that will be displayed
     */
    public String move(String dir) {
    	String message = "";
    	if (dir!="") {
    		message = "You are in " + currentZone.getZoneName();
    		for (HashMap.Entry<String, Path> entry:currentZone.getHMap().entrySet()){
                String key= entry.getKey();
                Path value= entry.getValue();              
        		                           
                if(dir.equals(key)) {  
                	if (value.getIsLocked() == false) { //if the path is not locked
                		setCurrentZone(value.getExit()); //the player is in a new current zone
                		message = "You are in " + currentZone.getZoneName();
                		if(getCurrentZone().getCurrentNpcFightMonster()!=null) { //if there is a fight monster in the zone
                			message= "You are in " + currentZone.getZoneName()+", a monster jumped on you ! Be ready to fight";
                			fight(player,getCurrentZone().getCurrentNpcFightMonster()); 
                			
                		}else if(getCurrentZone().getCurrentNpcFightBoss()!=null){ //if there is the boss in the zone
                			message= "You are in " + currentZone.getZoneName()+", Trump is ready to fight you ! Be ready to fight";
                			fight(player,getCurrentZone().getCurrentNpcFightBoss()); 
                			
                		}
                	} else { //if the path is locked, there is a different message according to the zone
                		if (currentZone.getZoneName() == "mountainbase") {
                	    message = "You cannot go this way ! This mountain is frozen, you need a grapple.";
                 		}else{
                        	if (currentZone.getZoneName() == "marketplace") {
                        		message = "You cannot go this way ! The door is close.";
                            }else{
                        		if (currentZone.getZoneName() == "bridge") {
                        			message = "You cannot go this way ! You need wood to build the bridge.";
                        		}else{
                            		if (currentZone.getZoneName() == "jailentrance") {
                            			message = "You cannot go this way ! Do you really want to go to jail ?";
                            		}else{
                            			if (currentZone.getZoneName() == "glade") {
                            				message = "You cannot go this way ! You need a machete to cut branches ";
                            			}
                            		}
                            	}
                        	}
                		}
                	}
                }   
    		}
    	} 
	return message;	
    }  

    

    /**
     * This method check if there are items in the current zone 
     * and displays them
     * @return message to describe present items
     */
    public String search() {
    	String zoneItems = "";
    	String message = "";
    	String newline = System.getProperty("line.separator");
    	if (getCurrentZone().getListItems().isEmpty()) { //if there is no item is the current zone
    		message = "It seems there is nothing interesting to take in this zone.";
    	}else { //if there are items
    		for (Item i : getCurrentZone().getListItems()) { //the list of items of the current zone
    			zoneItems = zoneItems + newline + i.getName() + ": " + i.getDescription(); 
    			message = "In this zone, you can find: " + zoneItems; //to display objects of this zone
    		}
    	}
    	return message;
    }
}
