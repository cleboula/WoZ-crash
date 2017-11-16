package core;


/**
 * Cette classe représente des armes "Weapon" permettant
 * d'appliquer des dégats à un ennemi tout en utilisant 
 * de l'énergie du joueur
 *
 * @author Groupe1 WoZ
 * @version 09/11/2017
 */
public class Weapon extends Item
{
    private int damages; //points de vie enlevés à l'ennemi
    private int energybyshot; //points d'énergie pris au joueur
    //ces points ne peuvent pas être négatifs
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
     * Cette méthode applique des dégats à l'ennemi "damages"
     * en utilisant de l'énergie "energybyshot"
     */
    private void shot()
    {
        
    }
}
