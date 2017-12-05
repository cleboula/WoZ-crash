package fr.crash.core;

import java.util.HashMap;

import javax.swing.Icon;

import java.util.ArrayList;
 
/**
 * This class represents a part of the world. 
 * Each zone has a different name. 
 * Each zone has one or more path. 
 * A zone can contain objects that will be visible and accessible by the player.
 *
 * @author Groupe 1 WoZ
 * @version 09/11/2017
 */
public class Zone
{
    private HashMap<String,Path> hmap; // hashmap of the direction and the path possibles depending on the current zone
    private String nameZone; // name of the current zone
    private ArrayList<Item> listItems; // list of items present in the zone
    //NPC present in this zone
    private NpcDialog currentNpcDialog; 
    private NpcFightMonster currentNpcFightMonster;
    private NpcFightBoss currentNpcFightBoss;
    private NpcFightGuard currentNpcFightGuard;
    private Icon picZone;
 

    /**
     * Object builder for Zone class
     */
    public Zone(String name, Icon pic)
    {
    	picZone = pic;
        nameZone = name;
        
        //hmap is the object Hashmap which is a list with 2 entries of the different rooms.
        hmap = new HashMap<String, Path>();

        currentNpcFightMonster = null;
        currentNpcFightBoss=null;
        currentNpcFightGuard=null;
        currentNpcDialog = null;

        listItems = new ArrayList<Item>();
  
    }
    /**
     * This method return the hashmap corresponding to the paths around the zone
     * @return hmap
     */
    public HashMap<String, Path> getHMap() 
    {
    	return(hmap);
    }
   
	/**
	 * This method sets the exits of a zone, 
	 * depending on the direction and the path used.
	 * @param direction is the direction chosen by the player to move
	 * @param path is the path in which the player is going into,
	 * 		  with its direction and its current zone
	 */
    public void setExits(String direction,Path path){
        hmap.put(direction,path);
    }
    
    /**
     * This method gives the name of the current zone
     * in which the player currently stands.
     * @return the name of the current zone
     */
    public String getZoneName()
    {
       return(nameZone); 
    }
    
    /**
     * This method implements a list of the items 
     * that can be found by the player in a zone.
     * @param item is the item to add to the list of items present in the zone
     */
    public void setItems(Item item)
    {
    	listItems.add(item);
    }

    /**
     * Getter of the guard present in the zone
     * @return npc fight guard
     */
    public NpcFightGuard getCurrentNpcFightGuard() {
		return currentNpcFightGuard;
	}
    /**
     * Setter of the guard present in the zone
     * @param npc fight guard
     */
	public void setCurrentNpcFightGuard(NpcFightGuard currentNpcFightGuard) {
		this.currentNpcFightGuard = currentNpcFightGuard;
	}
	/**
     * Getter of the boss present in the zone
     * @return npc fight boss
     */
	public NpcFightBoss getCurrentNpcFightBoss() {
		return currentNpcFightBoss;
	}
	
	/**
     * Setter of the boss present in the zone
     * @param npc fight boss
     */
	public void setCurrentNpcFightBoss(NpcFightBoss currentNpcFightBoss1) {
		this.currentNpcFightBoss = currentNpcFightBoss1;
	}
	/**
     * Getter of the npc dialog present in the zone
     * @return npc dialog
     */
	public NpcDialog getCurrentNpcDialog() {
		return currentNpcDialog;
	}
	
	/**
     * Setter of the npc dialog present in the zone
     * @param npc dialog
     */
	public void setCurrentNpcDialog(NpcDialog currentNpcDialog) {
		this.currentNpcDialog = currentNpcDialog;
	}
	/**
     * Getter of the npc fight monster present in the zone
     * @return npc fight monster
     */
    public NpcFight getCurrentNpcFightMonster() {
		return currentNpcFightMonster;
	}
    /**
     * Setter of the npc fight monster present in the zone
     * @param npc fight monster
     */
    public void setCurrentNpcFightMonster(NpcFightMonster npc)
    {
    	currentNpcFightMonster = npc;
    }
    
    /**
	 * @return the picZone
	 */
	public Icon getPicZone() {
		return picZone;
	}
	/**
	 * @return the list of items present in the zone
	 */
	public ArrayList<Item> getListItems() {
		return listItems;
	}
	
	
	/**
	 * This method allows to set empty the list of items per zone after the player took them
	 */
	public void setListItemsEmpty() {
		listItems = new ArrayList<Item>();
	}
	
}