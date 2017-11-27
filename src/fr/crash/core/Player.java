package fr.crash.core;

import java.util.ArrayList;
/**
 * This class represents our principal player
 *
 * @author Group 1 WoZ
 * @version 09/11/2017
 */
public class Player
{
    private int hp; //health points of our player (not negative)
    private int ep; //energy points of our player (not negative)
    private String namePlayer; //player name
    private ArrayList<Item> inventory; //inventory with collected objects 
    private ArrayList<Item> listM; // list of medikit in the inventory

    private Player player1;
    private WoZ woz;

    //private NPC npc;

    /**
     * Constructor of player class
     */
    public Player(String name)
    {
        hp = 100; //default value for health points
        ep = 100; //default value for energy points
        
        inventory = new ArrayList<Item> ();
        
        name = name.trim(); //trim() removes any leading and trailing whitespace
        if (verifName(name) == true){ //if the name is correct, the player name is accepted
            namePlayer = name;
        }
    }

    /**
     * This method check if the name is correct or not
     * @return correctName boolean indicates if the name is correct or not
     */
    private boolean verifName(String nom)
    {
        boolean correctName = true; //certifies that the name has the correct format or not
        if (nom.length() < 1 || nom.length() > 20){
            correctName = false;
        }
        else {
            correctName = true;
        }
        return correctName;
    }

    /**
	 * @return the inventory
	 */
	public ArrayList<Item> getInventory() {
		return (inventory);
	}

	/**
	 * @param hp the health point to set
	 */
	public void setHp(int hp) {	
		this.hp = hp;
	}

	/**
	 * @param ep the energy points to set
	 */
	public void setEp(int ep) {
		this.ep = ep;
	}
   
    /**
     * This method return the player's health points
     */
    public int getHP()
    {
        return(hp);
    }
    
    /**
     * This method return the player's energy points
     */
    public int getEP()
    {
        return(ep);
    }
    /**
     * This method return the player's name
     */
    public String getPlayerName()
    {
        return namePlayer;
    }

    
    /**
     * This method calls fight if the player wants to fight
     */
   // public void attack()
   // {
   // 	woz.fight(player1,npc);
   // }


    /**
    * search all medikits in the inventory
    */
    public ArrayList<Item> searchItem(Player player,Item item)
        {
        	for (int i = 0; i < player.getInventory().size(); i++) {
        		if (item == player.getInventory().get(i)) {
        			listM.add(player.getInventory().get(i));
        		}
        	}
            return(listM);
        }

	
}
