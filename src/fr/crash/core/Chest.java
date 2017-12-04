package fr.crash.core;

import javax.swing.Icon;

/**
 * This is a class representing chests. Chests can be opened by the player and contain keys.
 * A chest can not be empty. If a player open a chest, he must take the key inside. 
 * If a chest is already open, the player can no longer access it. Some chests are locked 
 * and need a key to be unlocked.
 *
 * @author Groupe 1 WoZ
 * @version 09/11/2017
 */
public class Chest extends Item
{
    private boolean isOpened; //true if the chest is already opened, false if it is not
    private Item content; //Content of the chest
    private Key associatedKey; //Key needed to open the chest

    /**
     * Constructor of objects of class Chest. At its creation the chest has a name, 
     * a description, a key to open it and a content. It is automatically closed.
     */
    public Chest(Item cont, String name, String description, Key assoKey, Icon image)
    {
        super(name,description,image); //call the constructor of Item
        isOpened = false;
        content = cont;
        associatedKey = assoKey;
    }

    /**
     * This method allows to check if a chest is opened yet or not.
     * @return isOpened : the chest is opened(true) 
     * or closed (false)
     */
    public boolean getIsOpened()
    {
        return(isOpened);
    }
    
    /**
     * This method checks in the inventory of the player if he owns
     * the key necessary to open the chest, if it is closed.
     */
    public void checkChest(Player player1)
    {
    	if(isOpened == false) { //if the chest is closed, we look for the key
    		if(player1.searchInventory(associatedKey)) {//if we have the key
    			// we open the chest
    			open();
    			// we add the object inside to the player inventory
    			player1.getInventory().add(content);
    		}
    	}
    }
    /**
	 * @return the content
	 */
	public Item getContent() {
		return content;
	}

	/**
     * This method allows to open a chest, by setting
     * a boolean isOpened from false to true.
     */
    public void open()
    {
        isOpened = true;
    }
}