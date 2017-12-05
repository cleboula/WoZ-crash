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
     * this method allows to hit the enemy,
     * the enemy lose hp while the player lose energy (energybyshot)
     */
    //TODO the enemy does not lose hp here
    public void shot(Player player)
    {
        int epPlayer = player.getEP(); 
        player.setEp(epPlayer - energybyshot); 
        
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
     * 
     * @return
     */
    //TODO
    public String getType()
    {
    	return("weapon");
    }

	/**
	 * Getter of the weapon picture
	 * @return the picWeapon
	 */
	public Icon getPicWeapon() {
		return picWeapon;
	}

	/**
	 * Setter of the weapon picture
	 * @param picWeapon the picWeapon to set
	 */
	public void setPicWeapon(Icon picWeapon) {
		this.picWeapon = picWeapon;
	}
}