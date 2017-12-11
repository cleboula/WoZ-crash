package fr.crash.core;

/**
 *  Npc_Dialog is the canvas for all the Npc in the game that are not meant to fight but to Dialog
 *  These are characters that are defined by their jobs and by the speak method
 *
 * @author G1
 * @version 11/12/17
 */
 
public class NpcDialog extends Npc {
	
	
	private job jobnpc;

	/**
	 * Constructor of NpcDialog
	 * @param name the Npc name
	 * @param description the Npc description
	 * @param npcjob the Npc job
	 */
	public NpcDialog(String name,String description,job npcjob){
		super(name,description);
		jobnpc=npcjob;
	}

    /**
     * This method is used to get the job of the Npc.
     * @return     the job of the Npc
     */
	public job getJobnpc() {
		return jobnpc;
		}

}
