package core;


/**
 * Décrivez votre classe Chest ici.
 *
 * @author Groupe 1 WoZ
 * @version 09/11/2017
 */
public class Chest extends Item
{
    private boolean isOpened;
    private Key content;
    //private Player player1;
    private Key associatedKey;

    /**
     * Constructeur d'objets de classe Chest
     */
    public Chest(Key cont, String name, String description, Key assoKey)
    {
        super(name,description); 
        isOpened = false;
        content = cont;
        associatedKey = assoKey;
    }

    /**
     * Cette méthode retourne l'état du coffre
     * @return isOpened : état du coffre ouvert(true) 
     * ou fermé(false)
     */
    public boolean getIsOpened()
    {
        return(isOpened);
    }
    
    /**
     * If the chest is closed we look for the key, if we have the key we open it
     */
    public void checkChest(Player player1)
    {
    	if(isOpened == false) { //if the chest is closed, we look for the key
    		if(searchInventory(player1,associatedKey)) {//pb ici // if we have the key
    			// we open the chest
    			open();
    			// we retrieve the object inside
    			player1.getInventory().add(content);//pb ici
    		}
    	}
    }
    
    public void open()
    {
        isOpened = true;
    }
}