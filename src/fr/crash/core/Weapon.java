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
    private Icon picWeapon;

    /**
     * Constructor of class Weapon
     */
    public Weapon(int degats, int energieutilisee, String name, String description, Icon image)
    {
        super(name,description,image); //call the constructor of Item
        damages = degats;
        energybyshot = energieutilisee; //energy of the player used by the weapon 
        picWeapon = image;
    }


    
    /**
     * Getter of damages
     * @return damages
     */
    public int getDamages()
    {
        return(damages);
    }

    /**
     * Getter of energy by shot
     * @return the energy points needed for one shot
     */
    public int getEnergybyshot()
    {
        return(energybyshot);
    }

	/**
	 * Getter of the weapon picture
	 * @return the picWeapon
	 */
	public Icon getPicWeapon() {
		return picWeapon;
	}

}