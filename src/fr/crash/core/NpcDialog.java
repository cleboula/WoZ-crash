package fr.crash.core;

/**
 *  Npc_Dialog is the canvas for all the Npc in the game that are not meant to fight but to Dialog
 *  These are characters that are defined by their jobs and by the speak method
 *
 * @author G1
 * @version 21/11/17
 */
 
public class NpcDialog extends Npc {
	
	
	private job jobnpc;
	//job is a enum

	//todo implement with speak()
	//private string selecteddialog

	//Dialog Npc constructor
	public NpcDialog(String name,String description,job npcjob){
		super(name,description);
		jobnpc=npcjob;
	}

	public job getJobnpc() {
		return jobnpc;
		}


	//Method to show the string selected in the dialog tree depending on the job of the Dialog Npc
	//Method that grab the var from Game files that contain the dialog tree
	//the dialog tree return the dialog line wich is "selected dialog"
	//The game feature of "Dialogue Tree" must be :
	// A conditional verification of the job of the Npc
	// Followed of a conditional verification of the Player Inventory
	// Depending of the Job Npc and of the Player Inventory, a String is returned
	//todo Once Game features implemented
	//public String speak(){

	//	dialogtree(String);
	//		return selecteddialog;
	//}
}
