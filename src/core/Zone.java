package core;

import java.util.HashMap;
import java.util.ArrayList;
/**
 * Cette zone représente une partie de notre monde
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
     * Constructeur d'objets de classe Zone
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
     * Cette méthode affiche les zones accessibles à partir de
     * la zone actuelle
     */
    public String getExitZone()
    {
        return(" ");
    }
   
     /**
     *Define the exits of this room. 
     */
    public void setExits(String direction,Path path){
        hmap.put(direction,path);
    }
    /**
     * Cette méthode retourne le nom de la zone actuelle
     * @return nom de zone
     */
    public String getZoneName()
    {
       return(" "); 
    }
}
