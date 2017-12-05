package fr.crash.core;

import java.util.ArrayList;

import fr.crash.game.InitializeGame;
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
    private ArrayList<Item> newlist;
    private ArrayList<Item> listM; // list of medikit in the inventory
    private ArrayList<Weapon>listweapon; //list of weapon in the inventory
    private Weapon currentWeapon; //the current weapon

	/**
     * Constructor of player class
     */
    public Player(String name, InitializeGame objGame)
    {
        hp = 100; //default value for health points
        ep = 100; //default value for energy points
        
        inventory = new ArrayList<Item> (); //creation of an empty inventory
		newlist = new ArrayList<Item> (); // creation of a list of item in the current zone
        listweapon = new ArrayList<Weapon>(); //creation of a weapon list
        
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
	 * Getter of the weapon list
	 * @return weapon list
	 */
	public ArrayList<Weapon> getListweapon() {
		return listweapon;
	}

	/**
	 * Setter of the weapon list
	 * @param listweapon
	 */
	public void setListweapon(ArrayList<Weapon> listweapon) {
		this.listweapon = listweapon;
	}

	/**
	 * Getter of the inventory
	 * @return the inventory
	 */
	public ArrayList<Item> getInventory() {
		return (inventory);
	}

	/**

	 * @return the list of item in the currentzone
	 */
	public ArrayList<Item> getnewlist() {
		return (newlist);
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
    * Search all medikits in the inventory and return the list of medikits
    * @param player
    * @param ite
    */
    //TODO do that method concern medikit or all item ? pas de player en param 
    public ArrayList<Item> searchItem(Player player,Item item)
    {
     	for (int i = 0; i < player.getInventory().size(); i++) {
       		if (item == player.getInventory().get(i)) {
       			listM.add(player.getInventory().get(i));
       		}
       	}
        return(listM);
    }

	/**
	 * Setter of the current weapon
	 * @param weapon the new weapon that will be used by the player
	 */
    public void setWeapon (Weapon weap)
    {
    	currentWeapon = weap;
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

    
    /**
	 * This method allows to set empty the list of items per zone after the player took them
	 */
    //TODO meme method que dans zone
	public void setnewlistEmpty() {
		newlist = new ArrayList<Item>();
	}



	/*public String dialogTree (Player player,Item keyForestWForestN,Item keyPick, Item keyJail,Item keyForestS,NpcDialog npcdial)
	{
		String selecteddialogline = "";
		if (npcdial.getJobnpc()== job.prisoner)
		{ selecteddialogline = "I hided a key in the wall ... but i'm too weak to escape" ;}
		else if (npcdial.getJobnpc()== job.citizen)
		{

			if (player.searchInventory(player, keyJail)) {
				selecteddialogline = "Guards !!!! seize that rogue !!!";
			}
			if (!player.searchInventory(player, keyJail)) {
				selecteddialogline = "We don't take kindly your types in here!";
			}
		}
		else if (npcdial.getJobnpc()== job.shaman) {
			if (!player.searchInventory(player, keyPick)) {
				selecteddialogline = "If you find all the ship parts it's time for you to leave";
			}
			if (!player.searchInventory(player, keyJail)) {
				selecteddialogline = "In the mountain, you will have to climb to the peak to find the last part of the ship";
			}
			if (player.searchInventory(player, keyForestWForestN)) {
				selecteddialogline = "You must go to the city and find the next part of your starship";
			}
			if (player.searchInventory(player, keyForestS)) {
				selecteddialogline = "You must build a bridge using the nature force if you want to proceed to the city";
			}
			if (!player.searchInventory(player, keyForestS)) {
				selecteddialogline = "Hello stranger that fell from the stars, first find the machete to clear your path";
			}
			else selecteddialogline ="??? ??? ??? You just can't understand this alien language ... if only you had a traductor";

		} return selecteddialogline;
			
	}*/

}
