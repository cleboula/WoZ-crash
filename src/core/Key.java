package core;



/**
 * Cette classe repr�sente une cl� d'un coffre (Chest) 
 * ou d'un chemin (Path)
 *
 * @author Groupe 1
 * @version 09/11/2017
 */
public class Key extends Item
{
    
    private Chest associatedChest;
    private Path associatedPath;
    private boolean isInventory;

    /**
     * Constructeur d'objets de classe Key
     */
    public Key(String name, String description, Chest chest)
    {
        super(name,description);
        associatedChest = chest;
        associatedPath = null;
        isInventory = false;
    }
    
    /**
     * Constructeur d'objets de classe Key
     */
    public Key(String name, String description, Path path)
    {
        super(name,description);
        associatedChest = null;
        associatedPath = path;
        isInventory = false;
    }
    
    /**
     * Methode qui permet de rechercher si la clef est pr�sente dans l'inventaire et si on peut ouvrir la porte ou le coffre
     * cette m�thode appelle une m�thode pr�sente dans la super classe Item
     */
    public boolean researchKey()
    {
        if(rechercheInventaire())
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
}
