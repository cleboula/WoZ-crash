/**
 * 
 */
package fr.crash.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.HashMap;
import java.util.ArrayList;

import javax.swing.*;

import fr.crash.core.Player;
import fr.crash.core.Chest;
import fr.crash.core.Item;
import fr.crash.core.Key;
import fr.crash.core.Medikit;
import fr.crash.core.Path;
import fr.crash.core.Weapon;
import fr.crash.core.WoZ;

import javax.swing.JOptionPane;

/**
 * @author Group 1
 * @version 21/11/2017
 * This class represents the interface with the image, 
 * the buttons to move and interact with objects and the world
 */

public class HUD implements ActionListener {
	private JFrame myFrame;  
    private JLabel myPlayerName, myHP, myEP, myInvent;
    private JPanel myPanelInventory, myPanelWeapon, myPanelKey, myPanelChest, myPanelMedikit, myPanelObject;  
    private JTextArea myText;
    private JPanel myPanel;//the global panel
    private JPanel myPanelArrows;//all arrows
    private JPanel myPanelRight;//map + myPanelArrows + actions
    private JPanel myPanelUp;//player name + labels of HP and EP + button for the inventory + image of the weapon
    private JPanel myPanelLittleRight;//search button + open button
    private JLabel myEmptyLabel;//empty panel to the arrows panel
    private JButton myInventory, myMap, myNorthArrow, myEastArrow, mySouthArrow, myWestArrow;
    private JButton mySearchButton, myOpenButton, myTakeButton, myAttackButton;
    private JButton talk;
    private WoZ woz;

    //private InitializeGame objGame;
    
        public HUD(WoZ woz) {

        	this.woz=woz;
         	myFrame = new JFrame("Crash");//give the name to the frame
         	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //kill the application when we close the window
            
            //instantiation of buttons
            //my inventory
            myInventory = new JButton("My Inventory");
            myInventory.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            myInventory.setForeground(Color.black);
            myInventory.addActionListener(new ActionListener (){
            	public void actionPerformed (ActionEvent e){
            		Player player = woz.getPlayer();
            		ArrayList<Item> inventory = player.getInventory();
   
            		JFrame inventFrame = new JFrame("Inventory");//create the inventory frame

                 	myPanelObject = new JPanel();
                 	int o = 1;
                 	myPanelWeapon = new JPanel();
                 	int w = 1;
                    //myPanelWeapon.setLayout(new GridLayout(1,2));
                    myPanelKey = new JPanel();
                    int k = 1;
                    //myPanelKey.setLayout(new GridLayout(3,3));
                    myPanelChest = new JPanel();
                    int c = 1;
                    //myPanelChest.setLayout(new GridLayout(3,3));
                    myPanelMedikit = new JPanel();
                    int m = 1;
                    //myPanelMedikit.setLayout(new GridLayout(3,3));
                    /*JOptionPane d = new JOptionPane();
                    int retour = d.showConfirmDialog(getFrame(),
                                                     "le message",
                                                     "le titre",
                                                     optionType);    */        		
                    for (int i = 0; i < inventory.size(); i++) {
            			if(inventory.get(i).getName() == "knife" || 
            					inventory.get(i).getName() == "sword"|| 
                    			inventory.get(i).getName() == "gun") {
            				myPanelWeapon.setLayout(new GridLayout(w++,2));
            				myPanelWeapon.add(new JLabel(inventory.get(i).getImage()));
            				myPanelWeapon.add(new JLabel(inventory.get(i).getName()));
            			}
            			else if(inventory.get(i).getName() == "Machete" ||
            					inventory.get(i).getName() == "Planks" ||
            					inventory.get(i).getName() == "Bunch of keys" ||
            					inventory.get(i).getName() == "Climbing kit") {
            				myPanelKey.setLayout(new GridLayout(k,3));
            				myPanelKey.add(new JLabel(inventory.get(i).getName()));
            			}
            			else if(inventory.get(i).getName() == "Small Medikit" ||
            					inventory.get(i).getName() == "Magic Lake") {
            				myPanelMedikit.setLayout(new GridLayout(m,2));
            				myPanelMedikit.add(new JLabel(inventory.get(i).getName()));
            			}
            			else if(inventory.get(i).getName() == "Old Key" ||
            					inventory.get(i).getName() == "A very old Key" ||
            					inventory.get(i).getName() == "A big old Key" ||
            					inventory.get(i).getName() == "Small old Key") {
            				myPanelChest.setLayout(new GridLayout(c,2));
            				myPanelChest.add(new JLabel(inventory.get(i).getName()));
            			}
            			else if(inventory.get(i).getName() == "Generator Cell" ||
            					inventory.get(i).getName() == "Wheels" ||
            					inventory.get(i).getName() == "Energy Cell" ||
            					inventory.get(i).getName() == "FTL") {
            				myPanelObject.setLayout(new GridLayout(o,2));
            				myPanelObject.add(new JLabel(inventory.get(i).getName()));
            			}
            			
            			//inventFrame.add(new JLabel(inventory.get(i).getName()));
            		}
            		if(inventory.size() == 0) {
            			inventFrame.add(new JLabel("L'inventaire est vide !"));
            		}
            		myPanelInventory = new JPanel();
            		myPanelInventory.setLayout(new BorderLayout());
            		myPanelInventory.add(myPanelChest, BorderLayout.NORTH);
            		myPanelInventory.add(myPanelObject, BorderLayout.CENTER);
            		myPanelInventory.add(myPanelMedikit, BorderLayout.SOUTH);
            		myPanelInventory.add(myPanelKey, BorderLayout.EAST);
            		myPanelInventory.add(myPanelWeapon, BorderLayout.WEST);
                 	inventFrame.add(myPanelInventory);
                 	inventFrame.setResizable(false);
                 	inventFrame.setPreferredSize(new Dimension(700,450));
                 	inventFrame.setMaximumSize(new Dimension(700,450));
                 	inventFrame.setMinimumSize(new Dimension(700,450));
                 	inventFrame.setLocationRelativeTo(null);
                 	inventFrame.pack();
                 	inventFrame.setVisible(true);
            	}
            });
            
            //my map
            myMap = new JButton(new ImageIcon(getClass().getResource("/images/mapButton.png")));
            myMap.addActionListener(new ActionListener (){
            	public void actionPerformed (ActionEvent e){
            		JFrame mapFrame = new JFrame("My Map");
            		JLabel myMapLabel = new JLabel(new ImageIcon(getClass().getResource("/images/map.png")));
            		mapFrame.setContentPane(myMapLabel);
            		mapFrame.setResizable(false);
            		mapFrame.setPreferredSize(new Dimension(700,450));
            		mapFrame.setMaximumSize(new Dimension(700,450));
            		mapFrame.setMinimumSize(new Dimension(700,450));
            		mapFrame.setLocationRelativeTo(null);
            		mapFrame.pack();
            		mapFrame.setVisible(true);
            		
            	}
            });
            
            //the arrow buttons
            myNorthArrow = new JButton(new ImageIcon(getClass().getResource("/images/flecheN.png")));
            myNorthArrow.addActionListener(this);
            myEastArrow = new JButton(new ImageIcon(getClass().getResource("/images/flecheE.png")));
            myEastArrow.addActionListener(this);
            mySouthArrow = new JButton(new ImageIcon(getClass().getResource("/images/flecheS.png")));
            mySouthArrow.addActionListener(this);
            myWestArrow = new JButton(new ImageIcon(getClass().getResource("/images/flecheW.png")));
            myWestArrow.addActionListener(this);
            
            //the search button
            mySearchButton = new JButton("Search");
            mySearchButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            mySearchButton.setForeground(Color.black);
            mySearchButton.addActionListener(this);

            // the take button
            myTakeButton = new JButton("Take");
            myTakeButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            myTakeButton.setForeground(Color.black);
            myTakeButton.addActionListener(this);
            myTakeButton.setEnabled(false);
            
            //the open button
            myOpenButton = new JButton("Open");
            myOpenButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            myOpenButton.setForeground(Color.black);
            myOpenButton.setEnabled(false);//open button is not available
            myOpenButton.addActionListener(this);

            // the talk button
            talk = new JButton("Talk to a character");
            talk.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            talk.setForeground(Color.black);
            talk.addActionListener(this);
            talk.setEnabled(false);
            
            
            
            //the Attack button
            myAttackButton = new JButton("Attack");
            myAttackButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            myAttackButton.setForeground(Color.black);
            myAttackButton.setEnabled(false);//attack button is not available
            if(woz.isCurrentfight()==true) {
                myAttackButton.setEnabled(true); //if the player is performing a fight set the attack button available
                myNorthArrow.setEnabled(false); // disable direction button
                myEastArrow.setEnabled(false);
                myWestArrow.setEnabled(false);
                mySouthArrow.setEnabled(false);
                
            }
            myAttackButton.addActionListener(new ActionListener (){
            	public void actionPerformed (ActionEvent e){
            		if(woz.getCurrentZone().getCurrentNpcFightMonster()!=null) {
	            		woz.fight(woz.getPlayer(), woz.getCurrentZone().getCurrentNpcFightMonster());
	            		if (woz.getCurrentZone().getCurrentNpcFightMonster().getHp()!=0) {
		            		myText =new JTextArea(woz.fight(woz.getPlayer(),woz.getCurrentZone().getCurrentNpcFightMonster()));
		            		myText.setEditable(false);
		            		myFrame.setContentPane(newPanel());
		        			myFrame.repaint();
		        			myFrame.revalidate();
	            		}
            		}
            	}
            });
            
            //instantiation of labels
            myPlayerName = new JLabel(woz.getPlayer().getPlayerName());
            myPlayerName.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            myPlayerName.setForeground(Color.black);
            
            myHP = new JLabel("My HP : " + woz.getPlayer().getHP());
            myHP.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            myHP.setForeground(Color.black);
            
            myEP = new JLabel("My EP : " + woz.getPlayer().getEP());
            myEP.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            myEP.setForeground(Color.black);
            
            myText = new JTextArea ("You crashed in " + woz.getCurrentZone().getZoneName() 
                	+ ".\n Your spaceship is broken and monsters have stolen some components,\n"  
                	+ " So you need to find the missing parts in order to escape this weird planet !!! ");
            myText.setEditable(false);
            myText.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,15));
            myText.setForeground(Color.black);

            //image of the current weapon
            JLabel myWeapon = new JLabel(woz.getPlayer().getCurrentWeapon().getImage());
            myWeapon.setPreferredSize(new Dimension(40,40));
          //image of the current zone
            JLabel labelZone = new JLabel(woz.getCurrentZone().getPicZone());
            labelZone.setPreferredSize(new Dimension(700,400));
            labelZone.setMaximumSize(new Dimension(700,400));
            labelZone.setMinimumSize(new Dimension(700,400));
            
            //instantiation of panels
            myPanelArrows = new JPanel();
            myPanelArrows.setLayout(new GridLayout(3,3));
            myPanelArrows.add(myEmptyLabel = new JLabel());
            myPanelArrows.add(myNorthArrow);
            myPanelArrows.add(myEmptyLabel = new JLabel());
            myPanelArrows.add(myWestArrow);
            myPanelArrows.add(myEmptyLabel = new JLabel());
            myPanelArrows.add(myEastArrow);
            myPanelArrows.add(myEmptyLabel = new JLabel());
            myPanelArrows.add(mySouthArrow);
            myPanelArrows.add(myEmptyLabel = new JLabel());
            
            myPanelLittleRight = new JPanel();
            myPanelLittleRight.setLayout(new GridLayout(4,1));
            myPanelLittleRight.add(mySearchButton);
            myPanelLittleRight.add(myTakeButton);
            myPanelLittleRight.add(talk);
            myPanelLittleRight.add(myAttackButton);
            
            myPanelRight = new JPanel();
            myPanelRight.setLayout(new GridLayout(3,1));
            myPanelRight.add(myMap);
            myPanelRight.add(myPanelArrows);
            myPanelRight.add(myPanelLittleRight);
            

            myPanelUp = new JPanel();
            myPanelUp.setLayout(new GridLayout(1,5));
            myPanelUp.add(myPlayerName);
            myPanelUp.add(myHP);
            myPanelUp.add(myEP);
            myPanelUp.add(myWeapon);
            myPanelUp.add(myInventory);
            

            //the all panel
            myPanel = new JPanel();
            myPanel.setLayout(new BorderLayout());
            myPanel.add(myPanelUp, BorderLayout.NORTH);
            myPanel.add(labelZone, BorderLayout.CENTER);
            myPanel.add(myText, BorderLayout.SOUTH);
            myPanel.add(myPanelRight, BorderLayout.EAST);
            
            myFrame.add(myPanel);
            
            myFrame.setResizable(false);
            myFrame.setPreferredSize(new Dimension(1050,700));
            myFrame.setMaximumSize(new Dimension(1050,700));
            myFrame.setMinimumSize(new Dimension(1050,700));
            myFrame.setLocationRelativeTo(null);
            myFrame.pack();
            myFrame.setVisible(true);
	
        }
        
        private JPanel newPanel() {
            JLabel l1 = new JLabel(woz.getCurrentZone().getPicZone());
            l1.setPreferredSize(new Dimension(700,450));
            JPanel p1 = new JPanel();
            p1.setLayout(new BorderLayout());
            p1.add(l1, BorderLayout.CENTER);
            p1.add(myPanelUp, BorderLayout.NORTH);
            p1.add(myText, BorderLayout.SOUTH);
            p1.add(myPanelRight, BorderLayout.EAST);
        	return p1;
        }
      
        public void dialogMove(String dir) {
        	if (dir!="") {
    				for (HashMap.Entry<String, Path> entry:woz.getCurrentZone().getHMap().entrySet()){
    	                String key= entry.getKey();
    	                Path value= entry.getValue(); 
    	                if(dir.equals(key)) {
    	                if (value.getIsLocked()==true) {
    	                	if (value.haveKey(woz.getPlayer())==true) {
        	                	//creation of the dialog box
        	                    int n = JOptionPane.showConfirmDialog(null,
        	                    "Do you want to unlock the path?",
        	                    "Information",
        	                    JOptionPane.YES_NO_OPTION);
        	                    
        	                    if (n == JOptionPane.YES_OPTION) {
        	                    	value.checkZone(woz.getPlayer());
        	    					JOptionPane.showMessageDialog(null,  "The path is unlocked! You can pass now.", "Information", JOptionPane.INFORMATION_MESSAGE);
        	                    
        	                    } else if (n == JOptionPane.NO_OPTION) {
        	                    	JOptionPane.showMessageDialog(null,  "The path is locked! You shall not pass.", "Information", JOptionPane.INFORMATION_MESSAGE);
        	                    }
        	                   }
    	                }
    				}}
        	}
        }
        
        /*public String dialogTree(Player player,Item keyForestW,Item keyPick, Item keyJail,Item keyForestS,NpcDialog npcdial)
    	{
    		String selecteddialogline = "";
    		if (npcdial!=null){
    		if (npcdial.getJobnpc()== job.prisoner)
    		{ selecteddialogline = "I hided a key in the wall ... but i'm too weak to escape" ;}
    		else if (npcdial.getJobnpc()== job.citizen)
    		{

    			if (player.searchInventory(keyJail)) {
    				selecteddialogline = "Guards !!!! seize that rogue !!!";
    			}
    			else if (!player.searchInventory(keyJail)) {
    				selecteddialogline = "We don't take kindly your types in here!";
    			}
    		}
    		else if (npcdial.getJobnpc()== job.shaman) {
    			if (!player.searchInventory(keyPick)) {
    				selecteddialogline = "If you find all the ship parts it's time for you to leave";
    			}
    			else if (!player.searchInventory(keyJail)) {
    				selecteddialogline = "In the mountain, you will have to climb to the peak to find the last part of the ship";
    			}
    			else if (player.searchInventory(keyForestW)) {
    				selecteddialogline = "You must go to the city and find the next part of your starship";
    			}
    			else if (player.searchInventory(keyForestS)) {
    				selecteddialogline = "You must build a bridge using the nature force if you want to proceed to the city";
    			}
    			else if (!player.searchInventory(keyForestS)) {
    				selecteddialogline = "Hello stranger that fell from the stars, first find the machete to clear your path";
    			}
    			else { selecteddialogline ="??? ??? ??? You just can't understand this alien language ... if only you had a traductor";}

    		}else {selecteddialogline = "Error: this character does not speak.";}
    		} return selecteddialogline;
    		
    			
    	}*/
        
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		if (e.getSource() == myNorthArrow)
    		{
    			myTakeButton.setEnabled(false);
    			myOpenButton.setEnabled(false);
    			dialogMove("north");
        		myText = new JTextArea (woz.move("north"));	
    			myText.setEditable(false);
    			myFrame.setContentPane(newPanel());
    			myFrame.repaint();
    			myFrame.revalidate();
	
    		} else if (e.getSource() == myEastArrow){
    			
    			myTakeButton.setEnabled(false);
    			myOpenButton.setEnabled(false);
    			dialogMove("east");
            	myText = new JTextArea (woz.move("east"));
            	myText.setEditable(false);
    		    myFrame.setContentPane(newPanel());
    		    myFrame.repaint();
    		    myFrame.revalidate();
    		
		} else if (e.getSource() == mySouthArrow){
			
			myTakeButton.setEnabled(false);
			myOpenButton.setEnabled(false);
			dialogMove("south");
			myText = new JTextArea (woz.move("south"));
			myText.setEditable(false);
		    myFrame.setContentPane(newPanel());
		    myFrame.repaint();
		    myFrame.revalidate();
 	    	
		} else if (e.getSource() == myWestArrow){
		    
			myTakeButton.setEnabled(false);
			myOpenButton.setEnabled(false);
			dialogMove("west");
		    myText = new JTextArea (woz.move("west"));
		    myText.setEditable(false);
		    myFrame.setContentPane(newPanel());
		    myFrame.repaint();
		    myFrame.revalidate();

		    
		} else if (e.getSource()== mySearchButton) {
			myText = new JTextArea(woz.search());
			myText.setEditable(false);
		    myFrame.setContentPane(newPanel());
		    myFrame.repaint();
		    myFrame.revalidate();
			for (Item j : woz.getCurrentZone().getListItems()) {
				if (j instanceof Weapon || j instanceof Key || j instanceof Medikit) {
					myTakeButton.setEnabled(true);
				} else if (j instanceof Chest) {
					myOpenButton.setEnabled(true);
					myTakeButton.setEnabled(true);
				}
		    }
			if (woz.getCurrentZone().getCurrentNpcDialog()!=null || woz.getCurrentZone().getCurrentNpcFightMonster()!=null || woz.getCurrentZone().getCurrentNpcFightBoss()!=null || woz.getCurrentZone().getCurrentNpcFightGuard()!=null) {
				talk.setEnabled(true);
			}
			
		} else if (myTakeButton.isEnabled() && e.getSource()==myTakeButton) {
			for (Item j : woz.getCurrentZone().getListItems()) {
				woz.getPlayer().getInventory().add(j);
				woz.getNewlist().add(j);
			}
			String content2 = "";
			for (Item item : woz.getNewlist()) {
     			content2 = content2 + item.getName() + "\n";
     		}
			JOptionPane.showMessageDialog(null, "Congratulations !!! \nyou earn :\n" + content2, "Information", JOptionPane.INFORMATION_MESSAGE);
			woz.getCurrentZone().setListItemsEmpty();
			woz.setnewlistEmpty();
			myTakeButton.setEnabled(false);
			
		} else if (e.getSource()==myOpenButton) {
			for (Item i : woz.getCurrentZone().getListItems()) {
    				if (i instanceof Chest) {//if an item is a chest
    					((Chest) i).checkChest(woz.getPlayer());//check the chest and open it if the corresponding key is in the inventory
    					if (((Chest) i).getIsOpened() == true) {
    						myText = new JTextArea("You have a new item! " + ((Chest)i).getContent().getDescription());
    						myText.setEditable(false);
    						myOpenButton.setEnabled(false);
    						woz.getCurrentZone().setListItemsEmpty();
    						myFrame.setContentPane(newPanel());
    						myFrame.repaint();
    						myFrame.revalidate();
    						woz.getPlayer().getInventory().remove((Chest) i);
    					}
    				}
			}
			
		} if (talk.isEnabled() && e.getSource()==talk) {
			String test = woz.getObjGame().dialogTree(woz.getPlayer(), woz.getObjGame().getKeyForestW(), woz.getObjGame().getKeyPick(), woz.getObjGame().getKeyJail(),woz.getObjGame().getKeyForestS(), woz.getCurrentZone().getCurrentNpcDialog());
        	myText = new JTextArea(test);
        	myText.setEditable(false);
        	talk.setEnabled(false);
        	myFrame.setContentPane(newPanel());
        	myFrame.repaint();
        	myFrame.revalidate();
		}
        	

    	}	            
}