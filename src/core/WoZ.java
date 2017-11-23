package core;

//import java.util.ArrayList;
//import java.util.HashMap;
/**
 * This class represents our world
 *
 * @author Group 1 WoZ
 * @version 09/11/2017
 */
public class WoZ
{
    //private Zone currentZone;
    //private ArrayList<Zone> listZone;
    
    
/*    private Zone glade,forestE,forestS,forestW,forestN,bridge,
    cityentrance,marketplace,house,church,jailentrance, 
    jail,caveentrance,frozenlake,mountainbase,pick,cave,
    lairofthebeast;
        
    private Path glade_forestE,forestE_glade,glade_forestS,
        forestS_glade,glade_forestW,forestW_glade,
        glade_forestN,forestN_glade,bridge_forestW,
        forestW_bridge,bridge_forestN,forestN_bridge,
        bridge_cityentrance,forestN_caveentrance,caveentrance_forestN,
        pick_mountainbase,cavenentrance_frozenlake,mountainbase_pick,mountainbase_caveentrance,
        caveentrance_mountainbase,caveentrance_cave,
        cave_caveentrance,caveentrance_frozenlake,
        frozenlake_caveentrance ,cave_lairofthebeast,
        lairofthebeast_cave,jailentrance_jail,
        jail_jailentrance,jailentrance_marketplace,
        marketplace_jailentrance,marketplace_church,
        church_marketplace,marketplace_cityentrance,cityentrance_bridge,
        cityentrance_marketplace,marketplace_house,house_marketplace;*/

    
    

    /**
     * Constructeur d'objets de classe WoZ
     * Création player, zones, personnages
     */
     public WoZ()
    {
        
  
    }

    // /**
     // * Cette methode créée toutes les zones du monde
     // */
    // private void createZone ()
    // {
                // //create zones
        // glade = new Zone("glade");
        // forestE = new Zone("forestE");
        // forestS = new Zone("forestS");
        // forestW = new Zone("forestW");
        // forestN = new Zone("forestN");
        // bridge = new Zone("bridge");
        // cityentrance = new Zone("cityentrance");
        // marketplace = new Zone("marketplace");
        // house= new Zone("house");
        // church = new Zone("church");
        // jailentrance = new Zone("jailentrance");
        // jail = new Zone("jail");
        // caveentrance = new Zone("caveentrance");
        // frozenlake = new Zone("frozenlake");
        // mountainbase= new Zone("mountainbase");
        // pick = new Zone("pick");
        // cave = new Zone("cave");
        // lairofthebeast = new Zone("lairofthebeast");
        
        // //create path
        // glade_forestE = new Path(forestE,false);
        // forestE_glade = new Path(glade,false);
        // glade_forestS = new Path(forestS,false);
        // forestS_glade = new Path(glade,false);
        // glade_forestW = new Path(forestW,false);
        // forestW_glade = new Path(glade,false);
        // glade_forestN = new Path(forestN,false);
        // forestN_glade = new Path(glade,false);
        // bridge_forestW = new Path(forestW,false);
        // forestW_bridge = new Path(bridge,false);
        // bridge_forestN = new Path(forestN,false);
        // forestN_bridge = new Path(bridge,false);
        // bridge_cityentrance = new Path(cityentrance,false);
        // cityentrance_bridge = new Path(bridge,false);
        // forestN_caveentrance = new Path(caveentrance,false);
        // caveentrance_forestN = new Path(forestN,false);
        // pick_mountainbase = new Path(mountainbase, false);
        // mountainbase_pick = new Path(pick, false);
        // mountainbase_caveentrance = new Path(caveentrance, false);
        // caveentrance_mountainbase = new Path(mountainbase, false);
        // caveentrance_cave = new Path(cave, false);
        // cave_caveentrance = new Path(caveentrance, false);
        // caveentrance_frozenlake = new Path(frozenlake, false);
        // frozenlake_caveentrance = new Path(caveentrance, false);
        // cave_lairofthebeast = new Path(lairofthebeast, false);
        // lairofthebeast_cave = new Path(cave, false);
        // jailentrance_jail = new Path(jail, false);
        // jail_jailentrance = new Path(jailentrance, false);
        // jailentrance_marketplace = new Path(marketplace, false);
        // marketplace_jailentrance = new Path(jailentrance, false);
        // marketplace_church = new Path(church, false);
        // church_marketplace = new Path(marketplace, false);
        // marketplace_cityentrance = new Path(cityentrance, false);
        // cityentrance_marketplace = new Path(marketplace, false);
        // marketplace_house = new Path(house, false);
        // house_marketplace = new Path(marketplace, false);

        
        // //initialize zones exits
        // glade.setExits("north",glade_forestN);
        // glade.setExits("east",glade_forestE);
        // glade.setExits("west",glade_forestW);
        // glade.setExits("south",glade_forestS);
        // forestE.setExits("west",forestE_glade);
        // forestS.setExits("north",forestS_glade);        
        // forestW.setExits("east",forestW_glade);
        // forestW.setExits("north",forestW_bridge);
        // forestN.setExits("west",forestN_bridge);
        // forestN.setExits("north",forestN_caveentrance);
        // caveentrance.setExits("north",caveentrance_cave);
        // caveentrance.setExits("east",cavenentrance_frozenlake);
        // caveentrance.setExits("west",caveentrance_mountainbase);
        // caveentrance.setExits("south",caveentrance_forestN);
        // frozenlake.setExits("west",frozenlake_caveentrance);
        // cave.setExits("east",cave_lairofthebeast);
        // cave.setExits("south",cave_caveentrance);
        // lairofthebeast.setExits("west",lairofthebeast_cave);
        // mountainbase.setExits("north",mountainbase_pick);
        // mountainbase.setExits("east",mountainbase_caveentrance);
        // bridge.setExits("west",bridge_cityentrance);
        // bridge.setExits("south",bridge_forestW);
        // bridge.setExits("east",bridge_forestN);
        // cityentrance.setExits("west",cityentrance_marketplace);
        // cityentrance.setExits("east",cityentrance_bridge);
        // marketplace.setExits("west",marketplace_church);
        // marketplace.setExits("north",marketplace_jailentrance);
        // marketplace.setExits("east",marketplace_cityentrance);
        // marketplace.setExits("south",marketplace_house);
        // house.setExits("north",house_marketplace);
        // church.setExits("east",church_marketplace);
        // jailentrance.setExits("north",jailentrance_jail);
        // jailentrance.setExits("south",jailentrance_marketplace);
        // jail.setExits("south",jail_jailentrance);
    
    /**
     * This method simulates a fight between our main player and an enemy
     * If the npc is dead, the fight is over and the player wins
     * If the player dies, the game is over
     * @param player : the main player
     * @param npc : the enemy involved in the fight
     */
   //public void fight(Player player,NPC npc)
    //{
	   //get set
	  // while (player.getHP()!=0 && npc.getHP()!=0) //while the player and the npc are still not dead
	   //{ 
		 
		 //if attack() method is called 
		 //if they are both alive 
		 //Figther_npc --> attackPattern(Fighter npc) , decrease hp of player by the fighternpc atk and up hp_npc by 
		 //Player --> check currentweapon , decrease fighter npc by atk number
		   
		   //attackPattern(npc);
		   //player.setHP()=player.getHP()-atknpc;
		   //npc.setHP()= npchp-player.currentweapon.atk;
	    
	   //}
        
    //}
   
    /*
     * This method checks if the player does not have life anymore.
     * @param player : the main player
     */
    public boolean isAlivePlayer(Player player){
    	
    	if (player.getHP()> 0) {
    		return(true);
    	}else {
    		return(false);
    	}
    }
    
    /*This method checks if the npc does not have life anymore.
     * @param npc : the enemy involved in the fight
     */
//    private boolean isAliveNpc(NPC npc){
//    	
//    	if (npc.getHP()> 0) {
//    		return(true);
//    	}else {
//    		return(false);
//    	}
//    }
}
