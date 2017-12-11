package fr.crash.game;

import fr.crash.core.*;

import javax.swing.*;

public class InitializeGame {
	//construction of our world
	private Zone currentZone; //the zone where the player is
	private Weapon knife, sword, gun;//the different weapon
	private Medikit medChurch, medLake;//the different medikit
	private Key keyForestS, keyForestW, keyHouse, keyJail, keyPick, keyChestMarketplace, keyChestHouse, keyChestChurch,
			keySSGenerator, keySSWheel, keySSEnergyCell, keySSFTL; //the different keys
	private Chest chestMarketplace, chestHouse, chestChurch;//the different chests
	private Zone glade, crashzone, forestS, forestW, forestN, bridge, cityentrance, marketplace, house, church,
			jailentrance, jail, caveentrance, frozenlake, mountainbase, pick, cave, lairofthebeast;//the different zones
	private Path glade_crashzone, crashzone_glade, glade_forestS, forestS_glade, glade_forestW, forestW_glade,
			glade_forestN, forestN_glade, bridge_forestW, forestW_bridge, bridge_forestN, forestN_bridge,
			bridge_cityentrance, forestN_caveentrance, caveentrance_forestN, pick_mountainbase,
			mountainbase_pick, mountainbase_caveentrance, caveentrance_mountainbase,
			caveentrance_cave, cave_caveentrance, caveentrance_frozenlake, frozenlake_caveentrance, cave_lairofthebeast,
			lairofthebeast_cave, jailentrance_jail, jail_jailentrance, jailentrance_marketplace,
			marketplace_jailentrance, marketplace_church, church_marketplace, marketplace_cityentrance,
			cityentrance_bridge, cityentrance_marketplace, marketplace_house, house_marketplace;//the different path
	private Icon crashZonePic, gladePic, forestWPic, forestSPic, forestNPic, bridgePic, cityentrancePic, 
	marketplacePic, housePic, churchPic,jailentrancePic, jailPic, caveentrancePic, frozenlakePic, 
	mountainbasePic, pickPic, cavePic, lairofthebeastPic;//the different zone pictures 	
	private Icon swordPic, knifePic, gunPic;//the different weapon pictures


public InitializeGame() {
	       //Non Player Characters
			//Hakunin, the shaman, will lead the player in his quest for freedom
			NpcDialog shaman = new NpcDialog("Hakunin","Some kind of Shaman is standing in front of you. He appraises you with his crazy eyes from somewhere in the world only he inhabits.", job.shaman);
			//The prisoner Npc
			NpcDialog prisoner = new NpcDialog("Gilgamesh","A weird kind of humanoid is in front of you, wearing rags, he looks tired and is dying",job.prisoner);
			// A bunch of generic citizen npc's
			NpcDialog citizen1 = new NpcDialog("Waldo","a local life form",job.citizen);
			NpcDialog citizen2 = new NpcDialog("Opipou","Typical girl next door, except you doesn't live here,it's not a girl an it's right in front of you",job.citizen);
			NpcDialog citizen3 = new NpcDialog("Fifou","he seems to be crazyly normal for an alien ... wait ... you are the alien here",job.citizen);
			NpcDialog citizen4 = new NpcDialog("Genericname","just another citizen",job.citizen);
			
			//Fighter Non player characters
			//the boss
			NpcFightBoss boss= new NpcFightBoss( 1000, 50, "transplantor"," uigfodnhk", 100);
			//the monsters
			NpcFightMonster snake1=new NpcFightMonster(10,2,"Snake","small snake");
			NpcFightMonster snake1bis=new NpcFightMonster(10,2,"Snake","small snake");
			NpcFightMonster snake2=new NpcFightMonster(20,5,"Snake","big snake");
			NpcFightMonster wolf=new NpcFightMonster(50,10,"Wolf","black wolf");
			NpcFightMonster shark=new NpcFightMonster(25,5,"Shark","shark");
			//the guard
			NpcFightGuard guard = new NpcFightGuard(100,1,"Guard","This is a city guard",house);     

			
		   //images
		   //zone pictures
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
		   //weapon pictures
		   swordPic = new ImageIcon(getClass().getResource("/images/sword.png"));
		   knifePic = new ImageIcon(getClass().getResource("/images/knife.png"));
		   gunPic = new ImageIcon(getClass().getResource("/images/gun.png"));
		   
			//creation of the items
			//creation of the weapons
			knife = new Weapon(5, 2, "knife", "This knife can be useful to fight small targets.", knifePic);
			sword = new Weapon(15, 6, "sword", "This sword was found in the Market place. It is surely more powerful than your knife!", swordPic);
			gun = new Weapon(30, 12, "gun", "This gun was taken from a guard. You will need it sooner than you think.", gunPic);
			
			//creation of the medikits
			medChurch = new Medikit(60, 40, "Small Medikit", "This is a medikit. Use it carefully!",null);
			medLake = new Medikit(30,30,"Magic Lake", "This lake is refreshing. Oh, it can heal you! Come back as much as you need.",null);
	
			// creation of the keys
			//keys to unlock the paths
			keyForestS = new Key("Machete", " Perfect to pull some wood out of the way.",null);
			keyForestW = new Key("Planks", " Great to build a path across gaps.",null);
			keyHouse = new Key("Old Key", " No idea of what it can open...",null);
			keyJail = new Key("Bunch of keys", " Given by a helpful prisoner in jail.",null);
			keyPick = new Key("Climbing kit", " Perfect to cross difficulties on the way.",null);
			//keys to open the chests
			keyChestMarketplace = new Key("A very old Key", " Found in the house.",null);
			keyChestHouse = new Key("A big old Key", " Wandering on the ground.",null);
			keyChestChurch = new Key("Small old Key", " Picked up on the Market place.",null);
			//keys to repair the spaceship (SS)
			keySSGenerator = new Key("Generator Cell", " Generator cell of your spaceship.",null);
			keySSWheel = new Key("Wheels", " Wheels of your spaceship.",null);
			keySSEnergyCell = new Key("Energy Cell", " Energy cell of your spaceship.",null);
			keySSFTL = new Key("FTL", " 'Faster Than Light' technology, necessary for your spaceship.",null);
			
			//creation of the chests
			chestMarketplace = new Chest(sword, "Old Chest", " A very old wooden chest, a bit hidden in the street.", keyChestMarketplace,null);
			chestHouse = new Chest(keySSWheel, "A Tidying Chest", " A big tidying chest. Something is shining inside...", keyChestHouse,null);
			chestChurch = new Chest(medChurch, "Chest", " There is a wooden chest in the church. Do you think you're allowed to open it?", keyChestChurch,null);
 
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
         
           //list of items per zone           
           forestS.setItems(keyForestS);
           forestS.setItems(keySSGenerator);
           
           forestW.setItems(keyForestW);
                      
           marketplace.setItems(chestMarketplace);
           marketplace.setItems(keyChestChurch);
           marketplace.setItems(keyHouse);
           
           house.setItems(chestHouse);
           house.setItems(keyChestMarketplace);
           
           church.setItems(chestChurch);
           
           caveentrance.setItems(keyChestHouse);
           
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
           bridge_cityentrance = new Path(cityentrance,true, keyForestW);//path initially blocked
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
           jailentrance_jail = new Path(jail, true, keyJail);//path always blocked, the way can be crossed only if the guards put the player in jail
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
              
            //Placement of Npcs
       		jailentrance.setCurrentNpcFightGuard(guard);

			lairofthebeast.setCurrentNpcFightBoss(boss);
			
			glade.setCurrentNpcDialog(shaman);
			cityentrance.setCurrentNpcDialog(citizen1);
			jail.setCurrentNpcDialog(prisoner);
			marketplace.setCurrentNpcDialog(citizen2);
			church.setCurrentNpcDialog(citizen3);
			house.setCurrentNpcDialog(citizen4);

			forestN.setCurrentNpcFightMonster(snake1);
			forestW.setCurrentNpcFightMonster(snake1bis);
			caveentrance.setCurrentNpcFightMonster(snake2);
			cave.setCurrentNpcFightMonster(wolf);
			bridge.setCurrentNpcFightMonster(shark);

	}



	/**
	 * This method allows to chose the right sentence depending on the situation
	 * @param player : the main player
	 * @param keyForestW : key of the west forest
	 * @param keyPick : key of the pick
	 * @param keyJail : key of the jail
	 * @param keyForestS : key of the south forest
	 * @param npcdial : the npc dialog concerned
	 * @return the sentence wanted
	 */
	public String dialogTree(Player player,Item keyForestW,Item keyPick, Item keyJail,Item keyForestS,NpcDialog npcdial)
	{
		String selecteddialogline = "";
		if (npcdial!=null){ //if there is a npc dialog
			if (npcdial.getJobnpc()== job.prisoner){ //if the npc is a prisoner
				selecteddialogline = "I hide a key in the wall ... but i'm too weak to escape" ;
			}
			else if (npcdial.getJobnpc()== job.citizen){ //if the npc is a citizen

				if (player.searchInventory(keyJail)) { //if the player is escaped
					selecteddialogline = "Guards !!!! seize that rogue !!!";
				}
				else if (!player.searchInventory(keyJail)) { //if the player is not escaped
					selecteddialogline = "We don't take kindly your types in here!";
				}
			}
		else if (npcdial.getJobnpc()== job.shaman) { //if the npc is the chaman

			if (player.searchInventory(keyPick)) {//if the player has the pick key
				selecteddialogline = "If you find all the ship parts it's time for you to leave";
			}
			else if (player.searchInventory(keyJail)) {//if the player has the jail key
				selecteddialogline = "In the mountain, you will have to climb to the peak to find the last part of the ship";
			}
			else if (player.searchInventory(keyForestW)) {//if the player has the forest west key
				selecteddialogline = "You must go to the city and find the next part of your starship";
			}
			else if (player.searchInventory(keyForestS)) {//if the player has the forest west key
				selecteddialogline = "You must build a bridge using the nature force if you want to proceed to the city";
			}
			else if (!player.searchInventory(keyForestS)) {//if the player has the forest south key
				selecteddialogline = "Hello stranger that fell from the stars, first find the machete to clear your path";
			}
			else { selecteddialogline ="??? ??? ??? You just can't understand this alien language ... if only you had a traductor";}

			}
		} return selecteddialogline;
	
	}

	/**
	 * @return the currentZone
	 */
	public Zone getCurrentZone() {
		return currentZone;
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
 * @return the keyForestW
 */
public Key getKeyForestW() {
	return keyForestW;
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



public Zone getPick() {
	return pick;
}



public Zone getLairofthebeast() {
	return lairofthebeast;
}



public Zone getForestS() {
	return forestS;
}



public Zone getHouse() {
	return house;
}

}
