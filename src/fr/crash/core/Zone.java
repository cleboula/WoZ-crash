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
    //private Npc currentNpc; 
    private NpcFight currentNpc; 
    private Icon picZone;
 

    /**
     * Object builder for Zone class
     */
    public Zone(String name, Icon pic)
    {
    	picZone = pic;
        nameZone = name;
        hmap = new HashMap<String, Path>();
        currentNpc = null;
        
        /*hmap is the object Hashmap which is a list with 
        2 entries of the differents rooms.*/
        listItems = new ArrayList<Item>();
        
        if(nameZone=="forestN"||nameZone=="forestW")
        {
        	currentNpc = new NpcFightMonster(10,2,"Snake","small snake");
        }
        else if(nameZone=="caveentrance")
        {
        	currentNpc = new NpcFightMonster(20,5,"Snake","big snake");
        }
        else if(nameZone=="cave")
        {
        	currentNpc = new NpcFightMonster(50,10,"Wolf","black wolf");
        }
        else if(nameZone == "bridge")
        {
        	currentNpc = new NpcFightMonster(25,5,"Shark","shark");
        }
    }
    /**
     * This method gives all of the names of the zones in which the player can go into, 
     * depending on his actual zone.
     */
    public HashMap<String, Path> getHMap()   //Create a view of the hashmap elements to return them
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
     * This method returns the NPC present in the zone 
     */
    public NpcFight getCurrentNpc() {
		return currentNpc;
	}
    /**
     * This method implements the NPC present in the zone 
     * @param npc is the NPC that can be found in the zone
     */
    public void setNPC(NpcFight npc)
    {
    	currentNpc = npc;
    }
    /**
	 * @return the picZone
	 */
	public Icon getPicZone() {
		return picZone;
	}
	/**
	 * @return the listItems
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