package fr.crash.core;

import java.util.ArrayList;

import fr.crash.game.InitializeGame;
/**
 * This class represents our principal player. He has health and energy points.
 * He can collect items and store them in his inventory. He also has
 * a weapon to defeat his enemies.
 * 
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
    private Weapon currentWeapon; //the current weapon

	/**
     * Constructor of player class
     */
    public Player(String name, InitializeGame objGame)
    {
        hp = 100; //default value for health points
        ep = 100; //default value for energy points
        
        inventory = new ArrayList<Item> (); //creation of an empty inventory
        
        namePlayer = name.trim(); //trim() removes any leading and trailing whitespace
        
        currentWeapon = objGame.getKnife(); //the default weapon is the knife
        inventory.add(currentWeapon); //add this current weapon to the inventory
    }  

    /**
     * Getter of the current weapon
     * @return the current weapon
     */
    public Weapon getCurrentWeapon() {
		return currentWeapon;
	}

    /**
     * Setter of the current weapon
     * @param currentWeapon
     */
	public void setCurrentWeapon(Weapon currentWeapon) {
		this.currentWeapon = currentWeapon;
	}


	/**
	 * Getter of the inventory
	 * @return the inventory
	 */
	public ArrayList<Item> getInventory() {
		return (inventory);
	}

	/**

	 * Setter of the player health points
	 * @param hp the health point to set
	 */
	public void setHp(int hp) {	
		this.hp = hp;
	}

	/**
	 * Setter of the player energy points
	 * @param ep the energy points to set
	 */
	public void setEp(int ep) {
		this.ep = ep;
	}
   
    /**
     * Getter of the player health points
     * @return health points
     */
    public int getHP()
    {
        return(hp);
    }
    
    /**
     * Getter of the player energy points
     * @return energy points
     */
    public int getEP()
    {
        return(ep);
    }
    /**
     * Getter of the player name
     * @return namePlayer
     */
    public String getPlayerName()
    {
        return namePlayer;
    }
    
    /**
     * This method is used to search if a specific item is present in the inventory of 
     * the player
     * @param item
     * @return true if the item is present in the inventory of the player
     */
    public boolean searchInventory(Item item)
    {
    	for (int i = 0; i < getInventory().size(); i++) {
    		if (item == getInventory().get(i)) {
    			return(true);
    		}
    	}
        return(false);
    }

    /**
     * This method add an item to the inventory
     * @param item to add to the inventory (key or medikit or weapon)
     */
    public void addItem(Item item)
    {
        getInventory().add(item);
    }

}
