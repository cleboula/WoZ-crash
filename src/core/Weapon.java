package core;


/**
 * This class corresponds to weapons allowing to attack and to cause damages to an enemy
 * Those weapons use player's energy point
 *
 * @author Groupe1 WoZ
 * @version 09/11/2017
 */
public class Weapon extends Item
{
    private int damages; //points de vie enlev�s � l'ennemi
    private int energybyshot; //points d'�nergie pris au joueur
    //ces points ne peuvent pas �tre n�gatifs
    /**
     * Constructeur d'objets de classe Medikit
     */
    public Weapon(int degats, int energieutilisee, String name, String description)
    {
        super(name,description); 
        damages = degats;
        energybyshot = energieutilisee;
    }

    /**
     * Cette m�thode applique des d�gats � l'ennemi "damages"
     * en utilisant de l'�nergie "energybyshot"
     */
    private void shot()
    {
        
    }
}
