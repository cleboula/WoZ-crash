package fr.crash.game;

import fr.crash.core.Player;
import fr.crash.core.WoZ;
import fr.crash.view.HUD;

public class Game {
	//deroulement du jeu
	//appelle interfaces en cas de besoin
	
	public Game(WoZ woz) {
	//public Game(Player player, WoZ woz) {	
		HUD hud = new HUD(woz);
		//HUD hud = new HUD(player, woz);
		
	}
}
