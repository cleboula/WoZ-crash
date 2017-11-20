package core;

import java.util.HashMap;
import java.util.ArrayList;
/**
 * This zone is a part of the world
 *
 * @author Groupe 1 WoZ
 * @version 09/11/2017
 */
public class Zone
{
    private HashMap<String,Path> hmap;
    private String nameZone;
    private ArrayList<Item> listItems;
 

    /**
     * Object builder for Zone class
     */
    public Zone(String name)
    {
        nameZone = " ";
        hmap = new HashMap<String, Path>();
        
        /*hmap is the object Hashmap which is a list with 
        2 entries of the differents rooms.*/
        listItems = new ArrayList<Item>();
    }
    /**
     * Display all the accessible zone from the current zone
     */
    public HashMap getExitZone()   //Create a view of the hashmap elements to return them
    {
    	return(hmap);
    }
   
   
	/**
     *Define the exits of this room. 
     */
    public void setExits(String direction,Path path){
        hmap.put(direction,path);
    }
    /**
     * Return the current zone name
     * @return nom de zone
     */
    public String getZoneName()
    {
       return("nameZone"); 
    }
}
