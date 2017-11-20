package core;

/**
 * This class represents a key of a chest or a path
 *
 * @author Group 1
 * @version 09/11/2017
 */
public class Key extends Item
{
    private Chest associatedChest;
    private Path associatedPath;

    /**
     * Constructor of objects of class Key
     */
    public Key(String name, String description, Chest chest)
    {
        super(name,description);
        associatedChest = chest;
        associatedPath = null;
    }
    
    /**
     * Constructor of objects of class Key
     */
    public Key(String name, String description, Path path)
    {
        super(name,description);
        associatedChest = null;
        associatedPath = path;
    }
    
    /**
     * 
     */
    public boolean researchKey()
    {
        if(searchInventory())
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
}
