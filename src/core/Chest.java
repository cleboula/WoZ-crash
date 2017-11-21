package core;


/**
 * D�crivez votre classe Chest ici.
 *
 * @author Groupe 1 WoZ
 * @version 09/11/2017
 */
public class Chest extends Item
{
    private boolean isOpened;
    private Key content;

    /**
     * Constructeur d'objets de classe Chest
     */
    public Chest(Key cont, String name, String description)
    {
        super(name,description); 
        isOpened = false;
        content = cont;
    }

    /**
     * Cette m�thode retourne l'�tat du coffre
     * @return isOpened : �tat du coffre ouvert(true) 
     * ou ferm�(false)
     */
    public boolean getIsOpened()
    {
        return(isOpened);
    }
    
    public void checkChest()
    {
    	
    }
    
    public void open()
    {
        isOpened = true;
    }
}