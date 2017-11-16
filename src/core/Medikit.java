package core;


/**
 * Cette classe repr�sente des objets "Medikit" permettant de gu�rir notre joueur
 * en augmentant ses points de vie "HP" et ses points d'�nergie "EP"
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

    public String getName()
    {
        return(super.getName());
    }
    
    public String getDescription()
    {
        return(super.getDescription());
    }
    
    public int getHP()
    {
        return(hpPlayer);
    }
    
    public int getEP()
    {
        return(hpPlayer);
    }
    /**
     * Cette m�thode applique ses points de vie et d'�nergie aux points du joueur
     */
    private void cure()
    {
        //il faudrait un setHP dans le player
    }
}
