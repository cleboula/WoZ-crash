package core;


/**
 * Cette classe représente des objets "Medikit" permettant de guérir notre joueur
 * en augmentant ses points de vie "HP" et ses points d'énergie "EP"
 *
 * @author Groupe1 WoZ
 * @version 09/11/2017
 */
public class Medikit extends Item
{
    private int hpPlayer; //points de vie redonnés au joueur
    private int epPlayer; //points d'énergie redonnés au joueur
    //ces points ne peuvent pas être négatifs
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
     * Cette méthode applique ses points de vie et d'énergie aux points du joueur
     */
    private void cure()
    {
        //il faudrait un setHP dans le player
    }
}
