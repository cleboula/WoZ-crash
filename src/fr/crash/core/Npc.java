package fr.crash.core;
/**
 *
 *  The Npc (Non player character) Class is a super class that will implements Basics for all the Non-player-character of WoZ
 * @author G1
 * @version 21/11/17
 */

public abstract class Npc {
	
	private String name;
	// the name of the Npc
	private String description;
	//the description of the Npc
	
	//private Npc npc;
	
		//constructeur Npc
		public Npc(String name1, String description1){   
			
			name=name1;
			description=description1;
		
		}
		//getter Name
		public String getName(){
			
			return(name);		
		}
		
		//getter Description
		public String getDescription(){
			return(description);		
		}
		
}
