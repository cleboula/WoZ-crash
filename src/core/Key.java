package core;

/**
 * This class represents a key to a chest or path. 
 * There are two different types of keys. 
 * Some keys allow the opening of chest and 
 * other allow the passage of certain path. 
 * A key is necessarily linked to a path or a chest. 
 * Once the key is used it disappears. 
 * The key must be present in the player's inventory to be used
 *
 * @author Group 1
 * @version 09/11/2017
 */
public class Key extends Item
{
    //private Chest associatedChest;
    //private Path associatedPath;

    /**
     * Constructor of objects of class Key
     */
    public Key(String name, String description, Chest chest)
    {
        super(name,description);
        //associatedChest = chest;
        //associatedPath = null;
    }
    
    /**
     * Constructor of objects of class Key
     */
    //public Key(String name, String description, Path path)
   // {
   //     super(name,description);
   //     associatedChest = null;
   //     associatedPath = path;
    //}
    
   
}
