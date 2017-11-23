package core;


/**
 * This class represents all the objects in the game. All these objects can be used by
 * the player. Each object has different characteristics. (Medikit, Weapon,Chest, Key)
 *
 * @author Groupe 1 WoZ
 * @version 09/11/2017
 */
public abstract class Item
{
    private String nameItem;
    private String descriptionItem;
    private Player player1;

    
    /**
     * Constructor of items
     * @param name the item name
     * @param description the item description
     */
    public Item(String name, String description)
    {
    	nameItem = name;
    	descriptionItem = description;
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
     * This method is used to search if a specific item is present in the inventory of 
     * the player
     * @param player
     * @param item
     * @return true if the item is present in the inventory of the player
     */
    public boolean searchInventory(Player player,Item item)
    {

    	for (int i = 0; i < player.getInventory().size(); i++) {
    		if (item == player.getInventory().get(i)) {
    			return(true);
    		}
    	}
        return(false);

    }
    
    /**
     * This method add an item to the inventory
     * @param item to add to the inventory (key or medikit or weapon)
     */
    public void addItem(Item item)
    {
        player1.getInventory().add(item);
    }

}

