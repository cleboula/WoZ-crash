package fr.crash.game;

import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.crash.core.Path;
import fr.crash.core.Zone;
import fr.crash.view.HUD;
import fr.crash.core.Key;
import fr.crash.core.Chest;
import fr.crash.core.Weapon;
import fr.crash.core.Medikit;

public class InitializeGame {
	//construction of our world
	private Zone currentZone;
	private ArrayList<Zone> listZone;
	
	private Weapon knife, sword, gun;
	
	private Medikit medChurch, medLake;
	
	private Key keyForestS, keyForestWForestN, keyHouse, keyJail, keyPick, keyChestMarketplace, keyChestHouse, keyChestChurch,
			keySSGenerator, keySSWheel, keySSEnergyCell, keySSFTL;
	
	private Chest chestMarketplace, chestHouse, chestChurch;

	private Zone glade, crashzone, forestS, forestW, forestN, bridge, cityentrance, marketplace, house, church,
			jailentrance, jail, caveentrance, frozenlake, mountainbase, pick, cave, lairofthebeast;

	
	private Path glade_crashzone, crashzone_glade, glade_forestS, forestS_glade, glade_forestW, forestW_glade,
			glade_forestN, forestN_glade, bridge_forestW, forestW_bridge, bridge_forestN, forestN_bridge,
			bridge_cityentrance, forestN_caveentrance, caveentrance_forestN, pick_mountainbase,
			mountainbase_pick, mountainbase_caveentrance, caveentrance_mountainbase,
			caveentrance_cave, cave_caveentrance, caveentrance_frozenlake, frozenlake_caveentrance, cave_lairofthebeast,
			lairofthebeast_cave, jailentrance_jail, jail_jailentrance, jailentrance_marketplace,
			marketplace_jailentrance, marketplace_church, church_marketplace, marketplace_cityentrance,
			cityentrance_bridge, cityentrance_marketplace, marketplace_house, house_marketplace;
	
	public Icon crashZonePic;
	
public InitializeGame() {
		   //images
		   crashZonePic = new ImageIcon(getClass().getResource("/images/crash.png"));

			
			//creation of the items
			//creation of the weapons
			knife = new Weapon(5, 2, "knife", "This knife can be useful to fight small targets.", null);
			sword = new Weapon(15, 6, "sword", "This sword was found in the Market place. It is surely more powerful than your knife!", null);
			gun = new Weapon(30, 12, "gun", "This gun was taken from a guard. You will need it sooner than you think.", null);
			
			//creation of the medikits
			medChurch = new Medikit(60, 40, "medChurch", "This is a medikit. Use it carefully!");
			medLake = new Medikit(30,30,"medLake", "This lake is refreshing. Oh, it can heal you! Come back as much as you need.");
	
			// creation of the keys
			//keys to unlock the paths
			keyForestS = new Key("keyForestS", "This is a machete. Perfect to pull some wood out of the way.");
			keyForestWForestN = new Key("keyForestWForestN", "Large wooden planks, great to build a path across gaps.");
			keyHouse = new Key("keyHouse", "This is a key. No idea of what it can open...");
			keyJail = new Key("keyJail", "A bunch of keys, given by a helpful prisoner in jail.");
			keyPick = new Key("keyPick", "This is a climbing kit. Perfect to cross difficulties on the way.");
			//keys to open the chests
			keyChestMarketplace = new Key("keyChestMarketplace", "This is a key, found in the Market place.");
			keyChestHouse = new Key("keyChestHouse", "This is a key, found in a house.");
			keyChestChurch = new Key("keyChestChurch", "This is a key, pick up in the Church.");
			//keys to repair the spaceship (SS)
			keySSGenerator = new Key("keySSGenerator", "This is the generator cell of your spaceship.");
			keySSWheel = new Key("keySSWheel", "These are the wheels of your spaceship.");
			keySSEnergyCell = new Key("keySSEnergyCell", "This is the energy cell of your spaceship.");
			keySSFTL = new Key("keySSFTL", "This is your 'faster than light' technology, necessary for your spaceship.");
			
			//creation of the chests
			chestMarketplace = new Chest(sword, "chestMarketplace", "A very old wooden chest, a bit hidden in the street.", keyChestMarketplace);
			chestHouse = new Chest(keySSWheel, "chestHouse", "A big tidying chest. Something is shining inside...", keyChestHouse);
			chestChurch = new Chest(medChurch, "chestChurch", "There is a wooden chest in the church. Do you think you're allowed to open it?", keyChestChurch);

			//create zones
		   crashzone = new Zone("crashZone", crashZonePic);
           glade = new Zone("glade", null);
           forestS = new Zone("forestS", null);
           forestW = new Zone("forestW", null);
           forestN = new Zone("forestN", null);
           bridge = new Zone("bridge", null);
           cityentrance = new Zone("cityentrance", null);
           marketplace = new Zone("marketplace", null);
           house= new Zone("house", null);
           church = new Zone("church", null);
           jailentrance = new Zone("jailentrance", null);
           jail = new Zone("jail", null);
           caveentrance = new Zone("caveentrance", null);
           frozenlake = new Zone("frozenlake", null);
           mountainbase= new Zone("mountainbase", null);
           pick = new Zone("pick", null);
           cave = new Zone("cave", null);
           lairofthebeast = new Zone("lairofthebeast", null);

           //implementation of the list of zones
           listZone.add(glade);
           listZone.add(crashzone);
           listZone.add(forestS);
           listZone.add(forestW);
           listZone.add(forestN);
           listZone.add(bridge);
           listZone.add(cityentrance);
           listZone.add(marketplace);
           listZone.add(house);
           listZone.add(church);
           listZone.add(jailentrance);
           listZone.add(jail);
           listZone.add(caveentrance);
           listZone.add(frozenlake);
           listZone.add(mountainbase);
           listZone.add(pick);
           listZone.add(cave);
           listZone.add(lairofthebeast);
           
           
           //create path
           glade_crashzone = new Path(crashzone,false, null);
           crashzone_glade = new Path(glade,false, null);
           glade_forestS = new Path(forestS,false, null);
           forestS_glade = new Path(glade,false, null);
           glade_forestW = new Path(forestW,true, keyForestS);//path initially blocked
           forestW_glade = new Path(glade,false, null);
           glade_forestN = new Path(forestN,true, keyForestS);//path initially blocked
           forestN_glade = new Path(glade,false, null);
           bridge_forestW = new Path(forestW,false, null);
           forestW_bridge = new Path(bridge,false, null);
           bridge_forestN = new Path(forestN,false, null);
           forestN_bridge = new Path(bridge,false, null);
           bridge_cityentrance = new Path(cityentrance,true, keyForestWForestN);//path initially blocked
           cityentrance_bridge = new Path(bridge,false, null);
           forestN_caveentrance = new Path(caveentrance,false, null);
           caveentrance_forestN = new Path(forestN,false, null);
           pick_mountainbase = new Path(mountainbase, false, null);
           mountainbase_pick = new Path(pick, true, keyPick);// path initially blocked
           mountainbase_caveentrance = new Path(caveentrance, false, null);
           caveentrance_mountainbase = new Path(mountainbase, false, null);
           caveentrance_cave = new Path(cave, false, null);
           cave_caveentrance = new Path(caveentrance, false, null);
           caveentrance_frozenlake = new Path(frozenlake, false, null);
           frozenlake_caveentrance = new Path(caveentrance, false, null);
           cave_lairofthebeast = new Path(lairofthebeast, false, null);
           lairofthebeast_cave = new Path(cave, false, null);
           jailentrance_jail = new Path(jail, true, null);//path always blocked, the way can be crossed only if the guards put the player in jail
           jail_jailentrance = new Path(jailentrance, true, keyJail);//path initially blocked
           jailentrance_marketplace = new Path(marketplace, false, null);
           marketplace_jailentrance = new Path(jailentrance, false, null);
           marketplace_church = new Path(church, false, null);
           church_marketplace = new Path(marketplace, false, null);
           marketplace_cityentrance = new Path(cityentrance, false, null);
           cityentrance_marketplace = new Path(marketplace, false, null);
           marketplace_house = new Path(house, true, keyHouse);//path initially blocked
           house_marketplace = new Path(marketplace, false, null);
 
         
           //initialization of exits
           glade.setExits("north",glade_forestN);
           glade.setExits("east",glade_crashzone);
           glade.setExits("west",glade_forestW);
           glade.setExits("south",glade_forestS);
           
           crashzone.setExits("west",crashzone_glade);
           
           forestS.setExits("north",forestS_glade);        
           
           forestW.setExits("east",forestW_glade);
           forestW.setExits("north",forestW_bridge);
           
           forestN.setExits("west",forestN_bridge);
           forestN.setExits("north",forestN_caveentrance);
           forestN.setExits("south", forestN_glade);
           
           caveentrance.setExits("north",caveentrance_cave);
           caveentrance.setExits("east",caveentrance_frozenlake);
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
           
           pick.setExits("south", pick_mountainbase);
                      
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
