package fr.crash.core;

import javax.swing.Icon;

/**
 * This class represents "Medikit" objects to heal our player by increasing his "HP" 
 * health points and his "EP" energy points. The medikit must be present in the 
 * player's inventory to be used.Once the medikit is used it disappears
 *
 * @author Groupe1 WoZ
 * @version 09/11/2017
 */
public class Medikit extends Item
{
    private int hpPlayer; //health points to give to the player
    private int epPlayer; //energy points to give to the player
    /**
     * Constructor of objets of class Medikit
     */
    public Medikit(int HP, int EP, String name, String description, Icon image)
    {
        super(name,description, image); //call the Item constructor         
        hpPlayer = HP;
        epPlayer = EP;
    }
  
    /**
     * This method allows to know how many HP the medikit can give to the player.
     * @param med
     * @return health points to give back to the player
     */
    public int getHP()
    {
        return(hpPlayer);
    }
    /**
     * This method allows to know how many EP the medikit can give to the player.
     * @param med
     * @return energy points to give back to the player
     */
    public int getEP()
    {
        return(epPlayer);
    }
    /**
     * This method is used to allow the Player to use a medikit and have HP and EP back.
     * @param player
     */
    public void cure(Player player)
    {
    	int newHp;
    	int newEp;
    	newHp = player.getHP()+hpPlayer;
    	newEp = player.getEP()+epPlayer;
    	if(newHp>100) {
    		newHp=100;
    	}
    	if(newEp>100) {
    		newEp=100;
    	}
    	player.setHp(newHp);
    	player.setEp(newEp);
    }
}
