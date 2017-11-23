package core;


/**
 * This class represents "Medikit" objects to heal our player by increasing his "HP" 
 * health points and his "EP" energy points. The medikit must be present in the 
 * player's inventory to be used.Once the medikit is used it disappears
 *
 * @author Groupe1 WoZ
 * @version 09/11/2017
 */
public class Medikit extends Item
{
    private int hpPlayer;
    private int epPlayer;
    /**
     * Constructor of objets of class Medikit
     */
    public Medikit(int HP, int EP, String name, String description)
    {
        super(name,description);         
        hpPlayer = HP;
        epPlayer = EP;
    }
    /**
     * This method allows to know how many HP the medikit can give to the player.
     * @param med
     * @return
     */
    public int getHP(Medikit med)
    {
        return(med.hpPlayer);
    }
    /**
     * This method allows to know how many EP the medikit can give to the player.
     * @param med
     * @return
     */
    public int getEP(Medikit med)
    {
        return(med.epPlayer);
    }
    /**
     * This method is used to allow the Player to use a medikit and have HP and EP back.
     */
    public void cure(Player player)
    {
    	int newHp;
    	int newEp;
    	newHp = player.getHP()+hpPlayer;
    	newEp = player.getEP()+epPlayer;
    	player.setHp(newHp);
    	player.setEp(newEp);
    }
}
