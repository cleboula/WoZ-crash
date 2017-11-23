package core;


/**
* This class represents the paths between the zones. 
 * A path can be locked or not. 
 * Each path gives access to a different zone of the current zone. 
 * Locked paths need a key to open and allow the player to pass. 
 *
 * @author Groupe 1 WoZ
 * @version 09/11/2017
 */
public class Path
{
    private Zone nextZone; //zone where the path goes
    private boolean isLocked; //boolean to know if the path is blocked or not
//    private Player player1; //this is the player who is moving through the path
    private Key associatedPathKey; //key associated to the path
    
    /**
     * Object builder for Path class
     */
    public Path(Zone zone, boolean isPathLocked, Key assoKey)
    {
    	nextZone = zone;
        isLocked = isPathLocked;
        associatedPathKey = assoKey;

    }

    /**
     * This method gives the name of the zone which is on the other side of the path, 
     * depending on the current zone
     * @return     zone where the path goes
     */
    public Zone getExit ()
    {
        return (nextZone);
    }
    
    /**
     * This method allows to know if the path to go to the next zone is locked or not
     * @return     boolean of the state of the path, locked (true) or not (false)
     */
    public boolean getIsLocked ()
    {
        return (isLocked);
    }
    
    /**
     * This method checks if the path is locked. 
     * If yes, it checks into the inventory of the player 
     * if he owns the right key to open it or not.
     * @return	boolean of the new state of the path, still locked (true) or not (false)
    */
    public boolean checkZone(Player player1)
    {
        if(getIsLocked()){
            //check if key is in inventory;
        	if(associatedPathKey.searchInventory(player1, associatedPathKey)){
        		isLocked = false;
        	// the character can move
        	}
        }
        return(isLocked);
    }
}

