package core;


/**
 * This class represents "Medikit" objects to heal our player 
 * by increasing his "HP" health points and his "EP" energy points. 
 * The medikit must be present in the player's inventory to be used.
 * Once the medikit is used it disappears
 *
 * @author Groupe1 WoZ
 * @version 09/11/2017
 */
public class Medikit extends Item
{
    private int hpPlayer; //points de vie redonn�s au joueur
    private int epPlayer; //points d'�nergie redonn�s au joueur
    //ces points ne peuvent pas �tre n�gatifs
    /**
     * Constructeur d'objets de classe Medikit
     */
    public Medikit(int HP, int EP, String name, String description)
    {
        super(name,description);         
        hpPlayer = HP;
        epPlayer = EP;
    }
    
    public int getHP(Medikit med)
    {
        return(med.hpPlayer);
    }
    
    public int getEP(Medikit med)
    {
        return(med.epPlayer);
    }
    /**
     * Cette m�thode applique ses points de vie et d'�nergie aux points du joueur
     */
    private void cure(Medikit med,Player player)
    {
    	player.setHp(hpPlayer);
    	player.setEp(epPlayer);
    }
}
