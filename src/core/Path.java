package core;


/**
 * Cette classe repr�sente les chemins entre les zones
 *
 * @author Groupe 1 WoZ
 * @version 09/11/2017
 */
public class Path
{
    private Zone nextZone; //zone auquel le chemin mene
    private boolean isLocked; //pour savoir si le chemin est bloqu� ou pas
    
    /**
     * Constructeur d'objets de classe Path
     */
    public Path(Zone zone, boolean isLocked)
    {
        nextZone = zone;
        //nextZone = null;
    }

    /**
     * Cette m�thode retourne la zone � laquelle m�ne le chemin
     * @return     zone au bout du chemin
     */
    public Zone getExit ()
    {
        return (nextZone);
    }
    
    /**
     * Cette m�thode retourne l'�tat du chemin
     * @return     l'�tat du chemin (bloqu�(true) ou non(false))
     */
    public boolean getIsLocked ()
    {
        return (isLocked);
    }
    
    /**
     * Cette m�thode v�rifie si le chemin est bloqu� ou non 
     * Si c'est le cas, verification de la possession de la cl� 
     * par le joueur et d�placement dans la zone suivante
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
