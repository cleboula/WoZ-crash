package fr.crash.core;

import javax.swing.Icon;

/**
 * This class corresponds to weapons allowing to attack and to cause damages to an enemy
 * Those weapons use player's energy point
 *
 * @author Groupe1 WoZ
 * @version 09/11/2017
 */

public class Weapon extends Item
{
    private int damages; //points of hp lost by the enemy
    private int energybyshot; //points of energy lost by the player
    //these parameters can't be negative
    private Icon picWeapon;

    /**
     * Constructor of class Weapon
     */
    public Weapon(int degats, int energieutilisee, String name, String description, Icon image)
    {
        super(name,description,image); 
        damages = degats;
        energybyshot = energieutilisee;
        //picWeapon = image;
    }

	/**
     * this method allows to hit the enemy,
     * he loose hp an the player loose energy (energybyshot)
     */
    public void shot(Player player)
    {
        int epPlayer = player.getEP();
        player.setEp(epPlayer - energybyshot); 
    }
    
    /**
     * this method prints the number of hp caused by the weapon
     */
    public int getDamages(Weapon weap)
    {
        return(weap.damages);
    }

    /**
     * this method prints the number of ep caused by the weapon
     */
    public int getEnergybyshot(Weapon weap)
    {
        return(weap.energybyshot);
    }
    public String getType()
    {
    	return("weapon");
    }
}