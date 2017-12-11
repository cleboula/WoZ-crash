package fr.crash.core;
/**
 * This class represents the canvas for all the Non player character (Npc) in the game
 *
 * @author Group 1 WoZ
 * @version 11/12/2017
 */

public abstract class Npc {
	
	private String name;
	private String description;

	/**
	 * Constructor of Npc
	 * @param name1 the Npc name
	 * @param description1 the Npc description
	 */
		public Npc(String name1, String description1){   
			
			name=name1;
			description=description1;
		
		}
	/**
	 * This method is used to get the name of the Npc.
	 * @return     the name of the Npc
	 */
		public String getName(){
			
			return(name);		
		}

	/**
	 * This method is used to get the descriptions of the Npc.
	 * @return     the description of the Npc
	 */
		public String getDescription(){
			return(description);		
		}
		
}
