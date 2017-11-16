package core;


/**
 * Cette classe représente les chemins entre les zones
 *
 * @author Groupe 1 WoZ
 * @version 09/11/2017
 */
public class Path
{
    private Zone nextZone; //zone auquel le chemin mene
    private boolean isLocked; //pour savoir si le chemin est bloqué ou pas
    
    /**
     * Constructeur d'objets de classe Path
     */
    public Path(Zone zone, boolean isLocked)
    {
        nextZone = zone;
        //nextZone = null;
    }

    /**
     * Cette méthode retourne la zone à laquelle mène le chemin
     * @return     zone au bout du chemin
     */
    public Zone getExit ()
    {
        return (nextZone);
    }
    
    /**
     * Cette méthode retourne l'état du chemin
     * @return     l'état du chemin (bloqué(true) ou non(false))
     */
    public boolean getIsLocked ()
    {
        return (isLocked);
    }
    
    /**
     * Cette méthode vérifie si le chemin est bloqué ou non 
     * Si c'est le cas, verification de la possession de la clé 
     * par le joueur et déplacement dans la zone suivante
     * Sinon, le joueur passe dans la zone suivante
    */
    public Zone checkZone()
    {
        if(getIsLocked()==true){
            //check if key is in inventory;
        }
        return(nextZone);
    }
}
