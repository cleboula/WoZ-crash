package core;

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
	
	//Dialog Npc constructor
	public NpcDialog(String name,String description,job npcjob){
		super(name,description);
		jobnpc=npcjob;
	}
	
	//Method to show the string selected in the dialog tree depending on the job of the Dialog Npc

	//todo 211117
	//public String speak(){

	//}
}
