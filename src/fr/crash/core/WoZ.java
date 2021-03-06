package fr.crash.core;

import fr.crash.game.InitializeGame;

import java.util.ArrayList;
import java.util.HashMap;

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
    private Zone currentZone, zone1, zone2, zone3, zone4; //the zone where the player is
	private boolean currentfight, havekey1234; //if the player is in the middle of a fight (true) if not (false)
    private InitializeGame objGame;
    private ArrayList<Item> newlist; //the list of items of the zone to displays when the player search


	/**
     * Constructor of the world
     * All elements of the world is created
     * It manages the
     */
     public WoZ(String playerName)
    {    	 
    	 objGame = new InitializeGame(); //creates all element of the world
    	 currentZone = objGame.getCurrentZone();//because it is private
    	 player = new Player(playerName,objGame); //create the player
    	 zone1 = objGame.getHouse();
    	 zone2 = objGame.getForestS();
    	 zone3 = objGame.getLairofthebeast();
    	 zone4 = objGame.getPick();
     currentfight=false;
	 newlist = new ArrayList<Item> (); // creation of a list of item in the current zone	 
    }
     
    /**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}
	
	/**
	 * @return the objGame
	 */
	public InitializeGame getObjGame() {
		return objGame;
	}
	
	/**
	 * @return the newlist
	 */
	public ArrayList<Item> getNewlist() {
		return newlist;
	}
	
    /**
	 * This method allows to set empty the list of items per zone after the player took them
	 */
	public void setnewlistEmpty() {
		newlist = new ArrayList<Item>();
	}
	
	/**
     * This method simulates a fight between our main player and an enemy
     * If the npc is dead, the fight is over and the player wins
     * If the player dies, the game is over
     * @param player1 : the main player
     * @param npc1 : the enemy involved in the fight
     * @return messageatk : the message displays during the fight
     */
   public String fightMonster(Player player1,NpcFightMonster npc1){
	   String messageatk ="";
	   
	   
	   //setCurrentfight(true);
	   
	    if(player1.getHP()!=0 && npc1.getHp()!=0) { //if both player and npc are alive
		   if (player1.getEP()>player1.getCurrentWeapon().getEnergybyshot()) {
		   player1.setHp(player1.getHP()-npc1.attackPattern());//set the player hp
		   player1.setEp(player1.getEP()-player1.getCurrentWeapon().getEnergybyshot());//set the player ep
		   npc1.setHp(npc1.getHp()-player1.getCurrentWeapon().getDamages());//set the npc hp
		   messageatk ="You have "+player1.getHP()+" health point left. Your opponent is bleeding, "+npc1.getHp()+" health point left !";
		   
		   }else if(player1.getEP()<player1.getCurrentWeapon().getEnergybyshot()) {
			   player1.setHp(player1.getHP()-npc1.attackPattern());//set the player hp
			   messageatk="you do not have enough EP to attack";
		   }
		   
	
		   
		   //if(npc1.getHp()==0 || npc1.getHp()<=0){ 
		   if(npc1.getHp()<1){ 
			   setCurrentfight(false);
			   messageatk ="You won the fight, you can move out this zone";
		   }
	   }
	   
	   return messageatk;
	}
	/**
    * This method simulates a fight between our main player and an enemy
    * If the npc is dead, the fight is over and the player wins
    * If the player dies, the game is over
    * @param player1 : the main player
    * @param npc1 : the enemy involved in the fight
    * @return messageatk : the message displays during the fight
    */
  public String fightBoss(Player player1,NpcFightBoss npc1){
	   String messageatk ="";
	    
	   if(player1.getHP()!=0 && npc1.getHp()!=0 ) { //if both player and npc are alive
		   if (player1.getEP()>player1.getCurrentWeapon().getEnergybyshot()) {
		   player1.setHp(player1.getHP()-npc1.attackPattern());//set the player hp
		   npc1.setHp(npc1.getHp()-player1.getCurrentWeapon().getDamages());//set the npc hp
		   messageatk ="You have"+player1.getHP()+"health point left. Your opponent is bleeding,"+npc1.getHp()+"health point left !";
		   }else if(player1.getEP()<player1.getCurrentWeapon().getEnergybyshot()) {
			   player1.setHp(player1.getHP()-npc1.attackPattern());//set the player hp
			   messageatk="you do not have enough EP to attack";
		   }
		   if(npc1.getHp()<1){ 
			   setCurrentfight(false);
			   messageatk ="You won the fight, you can move out this zone";
		   }
	   }
	   
	   return messageatk;
	}
	/**
   * This method simulates a fight between our main player and an enemy
   * If the npc is dead, the fight is over and the player wins
   * If the player dies, the game is over
   * @param player1 : the main player
   * @param npc1 : the enemy involved in the fight
   * @return messageatk : the message displays during the fight
   */
 public String fightGuard(Player player1,NpcFightGuard npc1){
	   String messageatk ="";
	   
	   //setCurrentfight(true);	   
	   if(player1.getHP()!=0 && npc1.getHp()!=0 ) { //if both player and npc are alive
		   
		  // npc1.attackPattern();//chain
		   
		   setCurrentfight(false);
		   setCurrentZone(objGame.getJail());
	   
			if (currentZone.getZoneName() == "jail") {
				messageatk = "The guard threw you in jail, you should not have stolen that chest";}

		 
	   }
	   
	   return messageatk;
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
    
    public void setCurrentfight(boolean currentfight) {
		this.currentfight = currentfight;
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

    public Zone getHouseZone() {
		return zone1;
	}
    
    public Zone getForestSZone() {
		return zone2;
	}
    
    public Zone getLairofthebeastZone() {
		return zone3;
	}
    
    public Zone getPickZone() {
		return zone4;
	}
    /*
     * This method checks if the player has all keys (4) required to win the game.
     */
     public boolean haveAllKey(){ 
    	 	if(getForestSZone().getListItems().isEmpty() && getHouseZone().getListItems().isEmpty() && getPickZone().getListItems().isEmpty() && getLairofthebeastZone().getListItems().isEmpty()) {
  			havekey1234 = true;
        }
     return(havekey1234);
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
    		message = "You are in " + currentZone.getDescriptionZone();
    		for (HashMap.Entry<String, Path> entry:currentZone.getHMap().entrySet()){
                String key= entry.getKey();
                Path value= entry.getValue();              
                if(dir.equals(key)) {  
                	if (value.getIsLocked() == false) { //if the path is not locked
                			if(currentZone.getZoneName() == "mountainbase") {
                				
                			}
                		setCurrentZone(value.getExit()); //the player is in a new current zone
                		message = "You are in " + currentZone.getDescriptionZone();

                		if(getCurrentZone().getCurrentNpcFightMonster()!=null && getCurrentZone().getCurrentNpcFightMonster().getHp()>=1 ) { 
                			setCurrentfight(true);//if there is a fight monster in the zone
                			message= "You are in " + currentZone.getDescriptionZone()+", a "+getCurrentZone().getCurrentNpcFightMonster().getName()+" jumped on you ! Be ready to fight";
                		
                		}else if(getCurrentZone().getCurrentNpcFightBoss()!=null && getCurrentZone().getCurrentNpcFightBoss().getHp()>=1 ){ //if there is the boss in the zone
                			setCurrentfight(true);//if there is a fight monster in the zone
                			message= "You are in " + currentZone.getDescriptionZone()+","+getCurrentZone().getCurrentNpcFightBoss().getName()+" is ready to fight you ! Be ready to fight";

                		}
                	} else { //if the path is locked, there is a different message according to the zone
                		if (currentZone.getZoneName() == "mountainbase") {
                	    message = "You cannot go this way ! This mountain is frozen, you need a grapple.";
                 		}else{
                        	if (currentZone.getZoneName() == "marketplace") {
                        		message = "You cannot go this way ! The door is closed.";
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
    	String zoneNPC = "";
    	String message = "";
    	String newline = System.getProperty("line.separator");
    	if (getCurrentZone().getListItems().isEmpty() && (getCurrentZone().getCurrentNpcDialog()==null )) {//if there is no item is the current zone
			message = "It seems there is nothing interesting to take in this zone.";
    	}else { //if there are items
    		for (Item i : getCurrentZone().getListItems()) { //the list of items of the current zone
    			zoneItems = zoneItems + newline + i.getName() + ": " + i.getDescription();
    		}
    		if (getCurrentZone().getCurrentNpcDialog()!=null) {
    			zoneNPC = getCurrentZone().getCurrentNpcDialog().getName() + ": " + getCurrentZone().getCurrentNpcDialog().getDescription();
    		}
    		
			message = "In this zone, you can find: " + zoneItems + newline + zoneNPC; //to display objects of this zone
    	}
    	return message;
    }
}

