package fr.crash.core;

import javax.swing.Icon;

/**
 * This class represents all the objects in the game. All these objects can be used by
 * the player. Each object has different characteristics. (Medikit, Weapon, Chest, Key)
 *
 * @author Groupe 1 WoZ
 * @version 09/11/2017
 */
public abstract class Item
{
    private String nameItem;
    private String descriptionItem;
    private Icon imageItem;
    
    /**
     * Constructor of items
     * @param name the item name
     * @param description the item description
     * @param image the item image
     */
    public Item(String name, String description, Icon image)
    {
    	nameItem = name;
    	descriptionItem = description;
    	imageItem = image;
    }
    
    /**
     * This method is used to get the name of the item to use.
     * @return     the name of the item
     */
    public String getName()
    {
        return(nameItem);
    }

    /**
     * This method gives the description of an item, so that the player can know how to 
     * use it.
     * @return     the description of the item
     */
    public String getDescription()
    {
        return(descriptionItem);
    }
    /**
     * This method return the image of an item
     * @return     the icon of the item
     */
    public Icon getImage()
    {
        return(imageItem);
    } 
    
}

