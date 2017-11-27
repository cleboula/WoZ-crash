package fr.crash.game;

import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.crash.core.Path;
import fr.crash.core.Zone;
import fr.crash.view.HUD;

public class InitializeGame {
	//construction of our world
	public Zone currentZone;
	public ArrayList<Zone> listZone;

	public Zone glade, forestE, forestS, forestW, forestN, bridge, cityentrance, marketplace, house, church,
			jailentrance, jail, caveentrance, frozenlake, mountainbase, pick, cave, lairofthebeast, crashZone;

	public Path glade_forestE, forestE_glade, glade_forestS, forestS_glade, glade_forestW, forestW_glade,
			glade_forestN, forestN_glade, bridge_forestW, forestW_bridge, bridge_forestN, forestN_bridge,
			bridge_cityentrance, forestN_caveentrance, caveentrance_forestN, pick_mountainbase,
			cavenentrance_frozenlake, mountainbase_pick, mountainbase_caveentrance, caveentrance_mountainbase,
			caveentrance_cave, cave_caveentrance, caveentrance_frozenlake, frozenlake_caveentrance, cave_lairofthebeast,
			lairofthebeast_cave, jailentrance_jail, jail_jailentrance, jailentrance_marketplace,
			marketplace_jailentrance, marketplace_church, church_marketplace, marketplace_cityentrance,
			cityentrance_bridge, cityentrance_marketplace, marketplace_house, house_marketplace;
	
	public Icon crashZonePic;
	
public InitializeGame() {
		   //images
		   crashZonePic = new ImageIcon(getClass().getResource("/images/crash.png"));
		   
			//create zones
		   crashZone = new Zone("crashZone", crashZonePic);
           glade = new Zone("glade",null);
           forestE = new Zone("forestE",null);
           forestS = new Zone("forestS",null);
           forestW = new Zone("forestW",null);
           forestN = new Zone("forestN",null);
           bridge = new Zone("bridge",null);
           cityentrance = new Zone("cityentrance",null);
           marketplace = new Zone("marketplace",null);
           house= new Zone("house",null);
           church = new Zone("church",null);
           jailentrance = new Zone("jailentrance",null);
           jail = new Zone("jail",null);
           caveentrance = new Zone("caveentrance",null);
           frozenlake = new Zone("frozenlake",null);
           mountainbase= new Zone("mountainbase",null);
           pick = new Zone("pick",null);
           cave = new Zone("cave",null);
           lairofthebeast = new Zone("lairofthebeast",null);
         
           //create path
           /*glade_forestE = new Path(forestE,false);
           forestE_glade = new Path(glade,false);
           glade_forestS = new Path(forestS,false);
           forestS_glade = new Path(glade,false);
           glade_forestW = new Path(forestW,false);
           forestW_glade = new Path(glade,false);
           glade_forestN = new Path(forestN,false);
           forestN_glade = new Path(glade,false);
           bridge_forestW = new Path(forestW,false);
           forestW_bridge = new Path(bridge,false);
           bridge_forestN = new Path(forestN,false);
           forestN_bridge = new Path(bridge,false);
           bridge_cityentrance = new Path(cityentrance,false);
           cityentrance_bridge = new Path(bridge,false);
           forestN_caveentrance = new Path(caveentrance,false);
           caveentrance_forestN = new Path(forestN,false);
           pick_mountainbase = new Path(mountainbase, false);
           mountainbase_pick = new Path(pick, false);
           mountainbase_caveentrance = new Path(caveentrance, false);
           caveentrance_mountainbase = new Path(mountainbase, false);
           caveentrance_cave = new Path(cave, false);
           cave_caveentrance = new Path(caveentrance, false);
           caveentrance_frozenlake = new Path(frozenlake, false);
           frozenlake_caveentrance = new Path(caveentrance, false);
           cave_lairofthebeast = new Path(lairofthebeast, false);
           lairofthebeast_cave = new Path(cave, false);
           jailentrance_jail = new Path(jail, false);
           jail_jailentrance = new Path(jailentrance, false);
           jailentrance_marketplace = new Path(marketplace, false);
           marketplace_jailentrance = new Path(jailentrance, false);
           marketplace_church = new Path(church, false);
           church_marketplace = new Path(marketplace, false);
           marketplace_cityentrance = new Path(cityentrance, false);
           cityentrance_marketplace = new Path(marketplace, false);
           marketplace_house = new Path(house, false);
           house_marketplace = new Path(marketplace, false);*/
 
         
           //initialization of exits
           glade.setExits("north",glade_forestN);
           glade.setExits("east",glade_forestE);
           glade.setExits("west",glade_forestW);
           glade.setExits("south",glade_forestS);
           
           forestE.setExits("west",forestE_glade);
           
           forestS.setExits("north",forestS_glade);        
           
           forestW.setExits("east",forestW_glade);
           forestW.setExits("north",forestW_bridge);
           
           forestN.setExits("west",forestN_bridge);
           forestN.setExits("north",forestN_caveentrance);
           
           caveentrance.setExits("north",caveentrance_cave);
           caveentrance.setExits("east",cavenentrance_frozenlake);
           caveentrance.setExits("west",caveentrance_mountainbase);
           caveentrance.setExits("south",caveentrance_forestN);
           
           frozenlake.setExits("west",frozenlake_caveentrance);
           
           cave.setExits("east",cave_lairofthebeast);
           cave.setExits("south",cave_caveentrance);
           
           lairofthebeast.setExits("west",lairofthebeast_cave);
           
           mountainbase.setExits("north",mountainbase_pick);
           mountainbase.setExits("east",mountainbase_caveentrance);
           
           bridge.setExits("west",bridge_cityentrance);
           bridge.setExits("south",bridge_forestW);
           bridge.setExits("east",bridge_forestN);
           
           cityentrance.setExits("west",cityentrance_marketplace);
           cityentrance.setExits("east",cityentrance_bridge);
           
           marketplace.setExits("west",marketplace_church);
           marketplace.setExits("north",marketplace_jailentrance);
           marketplace.setExits("east",marketplace_cityentrance);
           marketplace.setExits("south",marketplace_house);
           
           house.setExits("north",house_marketplace);
           
           church.setExits("east",church_marketplace);
           
           jailentrance.setExits("north",jailentrance_jail);
           jailentrance.setExits("south",jailentrance_marketplace);
           
           jail.setExits("south",jail_jailentrance);
           
           //creation of NPC
           //TODO
           
           //creation of chest
           //TODO
           
           //creation of key
           //TODO
           
           //creation of medikit
           //TODO
           
           //creation of the player
           //TODO
           
           //creation of images
           //TODO
           
           //LaunchGame launchGame = new LaunchGame();
           //HUD hud = new HUD();
           

	}
}
