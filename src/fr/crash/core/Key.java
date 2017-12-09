package fr.crash.core;

import javax.swing.Icon;

/**
 * This class represents a key of a chest or path. There are two different types of keys. 
 * Some keys allow the opening of chest and others allow the passage of certain paths. A key 
 * is necessarily linked to a path or a chest. Once the key is used it disappears. The key 
 * must be present in the player's inventory to be used.
 * Key are associated to a path or a chest in Path or Chest constructors.
 *
 * @author Group 1
 * @version 09/11/2017
 */
public class Key extends Item
{
    /**
     * Constructor of objects of class Key
     */
    public Key(String name, String description, Icon image)
    {
        super(name,description,image);
    }   
}
