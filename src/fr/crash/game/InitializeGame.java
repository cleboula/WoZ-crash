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
	
	private Icon crashZonePic, gladePic, forestWPic, forestSPic, forestNPic, bridgePic, cityentrancePic, 
	marketplacePic, housePic, churchPic,jailentrancePic, jailPic, caveentrancePic, frozenlakePic, 
	mountainbasePic, pickPic, cavePic, lairofthebeastPic;
	
	private Icon swordPic, knifePic, gunPic;
	
public InitializeGame() {
		   //images
		   crashZonePic = new ImageIcon(getClass().getResource("/images/crash.png"));
		   gladePic = new ImageIcon(getClass().getResource("/images/glade.jpg"));
		   forestWPic = new ImageIcon(getClass().getResource("/images/forestW.jpg"));
		   forestSPic = new ImageIcon(getClass().getResource("/images/forestS.jpg"));
		   forestNPic = new ImageIcon(getClass().getResource("/images/forestN.jpg"));
		   housePic = new ImageIcon(getClass().getResource("/images/house.jpg"));
		   lairofthebeastPic = new ImageIcon(getClass().getResource("/images/lairodthebeastPic.jpg"));
		   cavePic = new ImageIcon(getClass().getResource("/images/cave.jpg"));
		   frozenlakePic = new ImageIcon(getClass().getResource("/images/frozenlake.gif"));
		   pickPic = new ImageIcon(getClass().getResource("/images/peak.jpg"));
		   mountainbasePic = new ImageIcon(getClass().getResource("/images/mountainbase.jpg"));
		   bridgePic = new ImageIcon(getClass().getResource("/images/bridge.jpg"));
		   jailPic = new ImageIcon(getClass().getResource("/images/jail.jpg"));
		   jailentrancePic = new ImageIcon(getClass().getResource("/images/jailentrance.jpg"));
		   churchPic = new ImageIcon(getClass().getResource("/images/church.jpg"));
		   cityentrancePic = new ImageIcon(getClass().getResource("/images/cityentrance.jpg"));
		   marketplacePic = new ImageIcon(getClass().getResource("/images/marketplace.jpg"));
		   caveentrancePic = new ImageIcon(getClass().getResource("/images/caveentrance.png"));
		   
		   
		   swordPic = new ImageIcon(getClass().getResource("/images/sword.png"));
		   knifePic = new ImageIcon(getClass().getResource("/images/knife.png"));
		   gunPic = new ImageIcon(getClass().getResource("/images/gun.png"));
			//creation of the items
			//creation of the weapons
			knife = new Weapon(5, 2, "knife", "This knife can be useful to fight small targets.", knifePic);
			sword = new Weapon(15, 6, "sword", "This sword was found in the Market place. It is surely more powerful than your knife!", swordPic);
			gun = new Weapon(30, 12, "gun", "This gun was taken from a guard. You will need it sooner than you think.", gunPic);
			
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
           glade = new Zone("glade", gladePic);
           forestS = new Zone("forestS", forestSPic);
           forestW = new Zone("forestW", forestWPic);
           forestN = new Zone("forestN", forestNPic);
           bridge = new Zone("bridge", bridgePic);
           cityentrance = new Zone("cityentrance", cityentrancePic);
           marketplace = new Zone("marketplace", marketplacePic);
           house= new Zone("house", housePic);
           church = new Zone("church", churchPic);
           jailentrance = new Zone("jailentrance", jailentrancePic);
           jail = new Zone("jail", jailPic);
           caveentrance = new Zone("caveentrance", caveentrancePic);
           frozenlake = new Zone("frozenlake", frozenlakePic);
           mountainbase= new Zone("mountainbase", mountainbasePic);
           pick = new Zone("pick", pickPic);
           cave = new Zone("cave", cavePic);
           lairofthebeast = new Zone("lairofthebeast", lairofthebeastPic);
           currentZone = crashzone;
 
       
/*           //implementation of the list of zones
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
 */          
           //list of items per zone
           forestS.setItems(keyForestS);
           forestS.setItems(keySSGenerator);
           
           forestW.setItems(keyForestWForestN);
           
           forestN.setItems(keyForestWForestN);
           
           marketplace.setItems(chestMarketplace);
           marketplace.setItems(keyChestMarketplace);
           marketplace.setItems(keyHouse);
           
           house.setItems(chestHouse);
           house.setItems(keyChestHouse);
           
           church.setItems(chestChurch);
           church.setItems(keyChestChurch);
           
           jailentrance.setItems(gun);
           
           jail.setItems(keyJail);
           
           frozenlake.setItems(medLake);
           
           pick.setItems(keySSFTL);
           
           cave.setItems(keyPick);
           
           lairofthebeast.setItems(keySSEnergyCell);
           
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
              

	}

/**
 * @return the currentZone
 */
public Zone getCurrentZone() {
	return currentZone;
}

/**
 * @return the listZone
 */
public ArrayList<Zone> getListZone() {
	return listZone;
}

/**
 * @return the knife
 */
public Weapon getKnife() {
	return knife;
}

/**
 * @return the sword
 */
public Weapon getSword() {
	return sword;
}

/**
 * @return the gun
 */
public Weapon getGun() {
	return gun;
}

/**
 * @return the medChurch
 */
public Medikit getMedChurch() {
	return medChurch;
}

/**
 * @return the medLake
 */
public Medikit getMedLake() {
	return medLake;
}

/**
 * @return the keyForestS
 */
public Key getKeyForestS() {
	return keyForestS;
}

/**
 * @return the keyForestWForestN
 */
public Key getKeyForestWForestN() {
	return keyForestWForestN;
}

/**
 * @return the keyHouse
 */
public Key getKeyHouse() {
	return keyHouse;
}

/**
 * @return the keyJail
 */
public Key getKeyJail() {
	return keyJail;
}

/**
 * @return the keyPick
 */
public Key getKeyPick() {
	return keyPick;
}

/**
 * @return the keyChestMarketplace
 */
public Key getKeyChestMarketplace() {
	return keyChestMarketplace;
}

/**
 * @return the keyChestHouse
 */
public Key getKeyChestHouse() {
	return keyChestHouse;
}

/**
 * @return the keyChestChurch
 */
public Key getKeyChestChurch() {
	return keyChestChurch;
}

/**
 * @return the keySSGenerator
 */
public Key getKeySSGenerator() {
	return keySSGenerator;
}

/**
 * @return the keySSWheel
 */
public Key getKeySSWheel() {
	return keySSWheel;
}

/**
 * @return the keySSEnergyCell
 */
public Key getKeySSEnergyCell() {
	return keySSEnergyCell;
}

/**
 * @return the keySSFTL
 */
public Key getKeySSFTL() {
	return keySSFTL;
}

/**
 * @return the chestMarketplace
 */
public Chest getChestMarketplace() {
	return chestMarketplace;
}

/**
 * @return the chestHouse
 */
public Chest getChestHouse() {
	return chestHouse;
}

/**
 * @return the chestChurch
 */
public Chest getChestChurch() {
	return chestChurch;
}

/**
 * @return the glade
 */
public Zone getGlade() {
	return glade;
}

/**
 * @return the crashzone
 */
public Zone getCrashzone() {
	return crashzone;
}

/**
 * @return the forestS
 */
public Zone getForestS() {
	return forestS;
}

/**
 * @return the forestW
 */
public Zone getForestW() {
	return forestW;
}

/**
 * @return the forestN
 */
public Zone getForestN() {
	return forestN;
}

/**
 * @return the bridge
 */
public Zone getBridge() {
	return bridge;
}

/**
 * @return the cityentrance
 */
public Zone getCityentrance() {
	return cityentrance;
}

/**
 * @return the marketplace
 */
public Zone getMarketplace() {
	return marketplace;
}

/**
 * @return the house
 */
public Zone getHouse() {
	return house;
}

/**
 * @return the church
 */
public Zone getChurch() {
	return church;
}

/**
 * @return the jailentrance
 */
public Zone getJailentrance() {
	return jailentrance;
}

/**
 * @return the jail
 */
public Zone getJail() {
	return jail;
}

/**
 * @return the caveentrance
 */
public Zone getCaveentrance() {
	return caveentrance;
}

/**
 * @return the frozenlake
 */
public Zone getFrozenlake() {
	return frozenlake;
}

/**
 * @return the mountainbase
 */
public Zone getMountainbase() {
	return mountainbase;
}

/**
 * @return the pick
 */
public Zone getPick() {
	return pick;
}

/**
 * @return the cave
 */
public Zone getCave() {
	return cave;
}

/**
 * @return the lairofthebeast
 */
public Zone getLairofthebeast() {
	return lairofthebeast;
}

/**
 * @return the glade_crashzone
 */
public Path getGlade_crashzone() {
	return glade_crashzone;
}

/**
 * @return the crashzone_glade
 */
public Path getCrashzone_glade() {
	return crashzone_glade;
}

/**
 * @return the glade_forestS
 */
public Path getGlade_forestS() {
	return glade_forestS;
}

/**
 * @return the forestS_glade
 */
public Path getForestS_glade() {
	return forestS_glade;
}

/**
 * @return the glade_forestW
 */
public Path getGlade_forestW() {
	return glade_forestW;
}

/**
 * @return the forestW_glade
 */
public Path getForestW_glade() {
	return forestW_glade;
}

/**
 * @return the glade_forestN
 */
public Path getGlade_forestN() {
	return glade_forestN;
}

/**
 * @return the forestN_glade
 */
public Path getForestN_glade() {
	return forestN_glade;
}

/**
 * @return the bridge_forestW
 */
public Path getBridge_forestW() {
	return bridge_forestW;
}

/**
 * @return the forestW_bridge
 */
public Path getForestW_bridge() {
	return forestW_bridge;
}

/**
 * @return the bridge_forestN
 */
public Path getBridge_forestN() {
	return bridge_forestN;
}

/**
 * @return the forestN_bridge
 */
public Path getForestN_bridge() {
	return forestN_bridge;
}

/**
 * @return the bridge_cityentrance
 */
public Path getBridge_cityentrance() {
	return bridge_cityentrance;
}

/**
 * @return the forestN_caveentrance
 */
public Path getForestN_caveentrance() {
	return forestN_caveentrance;
}

/**
 * @return the caveentrance_forestN
 */
public Path getCaveentrance_forestN() {
	return caveentrance_forestN;
}

/**
 * @return the pick_mountainbase
 */
public Path getPick_mountainbase() {
	return pick_mountainbase;
}

/**
 * @return the mountainbase_pick
 */
public Path getMountainbase_pick() {
	return mountainbase_pick;
}

/**
 * @return the mountainbase_caveentrance
 */
public Path getMountainbase_caveentrance() {
	return mountainbase_caveentrance;
}

/**
 * @return the caveentrance_mountainbase
 */
public Path getCaveentrance_mountainbase() {
	return caveentrance_mountainbase;
}

/**
 * @return the caveentrance_cave
 */
public Path getCaveentrance_cave() {
	return caveentrance_cave;
}

/**
 * @return the cave_caveentrance
 */
public Path getCave_caveentrance() {
	return cave_caveentrance;
}

/**
 * @return the caveentrance_frozenlake
 */
public Path getCaveentrance_frozenlake() {
	return caveentrance_frozenlake;
}

/**
 * @return the frozenlake_caveentrance
 */
public Path getFrozenlake_caveentrance() {
	return frozenlake_caveentrance;
}

/**
 * @return the cave_lairofthebeast
 */
public Path getCave_lairofthebeast() {
	return cave_lairofthebeast;
}

/**
 * @return the lairofthebeast_cave
 */
public Path getLairofthebeast_cave() {
	return lairofthebeast_cave;
}

/**
 * @return the jailentrance_jail
 */
public Path getJailentrance_jail() {
	return jailentrance_jail;
}

/**
 * @return the jail_jailentrance
 */
public Path getJail_jailentrance() {
	return jail_jailentrance;
}

/**
 * @return the jailentrance_marketplace
 */
public Path getJailentrance_marketplace() {
	return jailentrance_marketplace;
}

/**
 * @return the marketplace_jailentrance
 */
public Path getMarketplace_jailentrance() {
	return marketplace_jailentrance;
}

/**
 * @return the marketplace_church
 */
public Path getMarketplace_church() {
	return marketplace_church;
}

/**
 * @return the church_marketplace
 */
public Path getChurch_marketplace() {
	return church_marketplace;
}

/**
 * @return the marketplace_cityentrance
 */
public Path getMarketplace_cityentrance() {
	return marketplace_cityentrance;
}

/**
 * @return the cityentrance_bridge
 */
public Path getCityentrance_bridge() {
	return cityentrance_bridge;
}

/**
 * @return the cityentrance_marketplace
 */
public Path getCityentrance_marketplace() {
	return cityentrance_marketplace;
}

/**
 * @return the marketplace_house
 */
public Path getMarketplace_house() {
	return marketplace_house;
}

/**
 * @return the house_marketplace
 */
public Path getHouse_marketplace() {
	return house_marketplace;
}

/**
 * @return the crashZonePic
 */
public Icon getCrashZonePic() {
	return crashZonePic;
}


}
