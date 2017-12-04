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
import java.util.ArrayList;

import javax.swing.*;

import fr.crash.core.Player;
import fr.crash.core.Chest;
import fr.crash.core.Item;
import fr.crash.core.Key;
import fr.crash.core.Medikit;
import fr.crash.core.Weapon;
import fr.crash.core.WoZ;


/**
 * @author Group 1
 * @version 21/11/2017
 * This class represents the interface with the image, 
 * the buttons to move and interact with objects and the world
 */

public class HUD implements ActionListener {

	private JFrame myFrame, frameInventory;  
    private JLabel myPlayerName, myHP, myEP, myInvent;
    private JPanel myPanelInventory, myPanelWeapon, myPanelKey, myPanelChest, myPanelMedikit, myPanelObject;  
    private JTextArea textInventory, myText;
    private JPanel myPanel;//the global panel
    private JPanel myPanelArrows;//all arrows
    private JPanel myPanelRight;//map + myPanelArrows + actions
    private JPanel myPanelUp;//player name + labels of HP and EP + button for the inventory + image of the weapon
    private JPanel myPanelLittleRight;//search button + open button
    private JLabel myEmptyLabel;//empty panel to the arrows panel
    private JButton myInventory, myMap, myNorthArrow, myEastArrow, mySouthArrow, myWestArrow;
    private JButton mySearchButton, myOpenButton, myTakeButton, myAttackButton, myOpenPathButton;
    private WoZ woz;
    
   
    	//displays the image corresponding to the current zone
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
            		
            		JFrame inventFrame = new JFrame("Inventory");//give the name to the frame
                 	//myInvent = new JLabel("Voila l'inventaire");
                 	myPanelObject = new JPanel();
                    myPanelObject.setLayout(new GridLayout(2,2));
                 	myPanelWeapon = new JPanel();
                    myPanelWeapon.setLayout(new GridLayout(2,2));
                    myPanelKey = new JPanel();
                    myPanelKey.setLayout(new GridLayout(3,3));
                    myPanelChest = new JPanel();
                    myPanelChest.setLayout(new GridLayout(3,3));
                    myPanelMedikit = new JPanel();
                    myPanelMedikit.setLayout(new GridLayout(3,3));
            		for (int i = 0; i < inventory.size(); i++) {
            			if(inventory.get(i).getName() == "knife" || 
            					inventory.get(i).getName() == "sword"|| 
                    			inventory.get(i).getName() == "gun") {
            				myPanelWeapon.add(new JLabel(inventory.get(i).getImage()));
            			}
            			else if(inventory.get(i).getName() == "Machete" ||
            					inventory.get(i).getName() == "Planks" ||
            					inventory.get(i).getName() == "Bunch of keys" ||
            					inventory.get(i).getName() == "Climbing kit") {
            				myPanelKey.add(new JLabel(inventory.get(i).getName()));
            			}
            			else if(inventory.get(i).getName() == "Small Medikit" ||
            					inventory.get(i).getName() == "Magic Lake") {
            				myPanelMedikit.add(new JLabel(inventory.get(i).getName()));
            			}
            			else if(inventory.get(i).getName() == "Old Key" ||
            					inventory.get(i).getName() == "A very old Key" ||
            					inventory.get(i).getName() == "A big old Key" ||
            					inventory.get(i).getName() == "Small old Key") {
            				myPanelChest.add(new JLabel(inventory.get(i).getName()));
            			}
            			else if(inventory.get(i).getName() == "Generator Cell" ||
            					inventory.get(i).getName() == "Wheels" ||
            					inventory.get(i).getName() == "Energy Cell" ||
            					inventory.get(i).getName() == "FTL") {
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
                    /*Example
            		 if (e.getSource()==myInventory) {
            				String content = "";
            				frameInventory = new JFrame("Inventory");
            	         	//frameInventory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	         	if (woz.getPlayer().getInventory().isEmpty()) {
            	         		textInventory = new JTextArea ("Inventory is empty");
            	         		textInventory.setEditable(false);
            	         	} else {
            	         		for (Item item : woz.getPlayer().getInventory()) {
            	         			content = content + item.getName() + "\n";
            	         		}
            	         		textInventory = new JTextArea (content);
            	         		textInventory.setEditable(false);
            	         	}
            	         	frameInventory.add(textInventory);
            	         	frameInventory.setResizable(false);
            	         	frameInventory.setPreferredSize(new Dimension(500,200));
            	         	frameInventory.setMaximumSize(new Dimension(500,200));
            	         	frameInventory.setMinimumSize(new Dimension(500,200));
            	         	frameInventory.setLocationRelativeTo(null);
            	         	frameInventory.pack();
            	         	frameInventory.setVisible(true);
            		 }
            	}
            });
            /*myInventory.addActionListener(new ActionListener (){
            	public void actionPerformed (ActionEvent e){
                    Example

                    answer = areaToWrite.getText();
                    areaToWrite.setText("");
                    addMessageToConsole(answer);
                    ok.setEnabled(false);*/
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

			/*myOpenButton.addActionListener(new ActionListener (){
            	public void actionPerformed (ActionEvent e){
            		for (Item i : woz.getCurrentZone().getListItems()) {//the list of items of the current zone
            			if (i instanceof Chest) {//in an item is a chest
            				((Chest) i).checkChest(woz.getPlayer());//check the chest and open it if it is ok
            				if (((Chest) i).getIsOpened() == true) {
            					myText = new JTextArea("You have a new item ! A wonderful " + ((Chest)i).getContent().getDescription());            	
            					myText.setEditable(false);
            				}
            			}
				}
            	}
            });*/

            myOpenPathButton = new JButton("Unlock Path");
            myOpenPathButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            myOpenPathButton.setForeground(Color.black);
            myOpenPathButton.setEnabled(false);//open button is not available
            myOpenPathButton.addActionListener(this);
            
            //the Attack button
            myAttackButton = new JButton("Attack");
            myAttackButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            myAttackButton.setForeground(Color.black);
            myAttackButton.setEnabled(false);//attack button is not available
            if(woz.isCurrentfight()==true) {
                myAttackButton.setEnabled(true); //if the player is performing a fight set the attack button available
            }
            myAttackButton.addActionListener(new ActionListener (){
            	public void actionPerformed (ActionEvent e){
            		if(woz.getCurrentZone().getCurrentNpcFight()!=null) {
	            		woz.fight(woz.getPlayer(), woz.getCurrentZone().getCurrentNpcFight());
	            		if (woz.getCurrentZone().getCurrentNpcFight().getHp()!=0) {
		            		myText = new JTextArea("You have" + woz.getPlayer().getHP()+"health point !"+" Your opponent has " + woz.getCurrentZone().getCurrentNpcFight());
		            		myText.setEditable(false);
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
            myPanelLittleRight.add(myOpenButton);
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
      
        
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		if (e.getSource() == myNorthArrow)
    		{
    			myTakeButton.setEnabled(false);
    			myOpenButton.setEnabled(false);
    			myText = new JTextArea (woz.move("north"));	
    			myText.setEditable(false);
    			myFrame.setContentPane(newPanel());
    			myFrame.repaint();
    			myFrame.revalidate();
	
    		} else if (e.getSource() == myEastArrow){
    			
    			myTakeButton.setEnabled(false);
    			myOpenButton.setEnabled(false);
            	myText = new JTextArea (woz.move("east"));
            	myText.setEditable(false);
    		    myFrame.setContentPane(newPanel());
    		    myFrame.repaint();
    		    myFrame.revalidate();
    		
		} else if (e.getSource() == mySouthArrow){
			
			myTakeButton.setEnabled(false);
			myOpenButton.setEnabled(false);
			myText = new JTextArea (woz.move("south"));
			myText.setEditable(false);
		    myFrame.setContentPane(newPanel());
		    myFrame.repaint();
		    myFrame.revalidate();
 	    	
		} else if (e.getSource() == myWestArrow){
		    
			myTakeButton.setEnabled(false);
			myOpenButton.setEnabled(false);
		    myText = new JTextArea (woz.move("west"));
		    myText.setEditable(false);
		    myFrame.setContentPane(newPanel());
		    myFrame.repaint();
		    myFrame.revalidate();
/*<<<<<<< HEAD
		} else if (e.getSource() == myInventory){
		    
		    myText = new JLabel (woz.move("west"));
		    
		}
=======*/
		    
		} else if (e.getSource()== mySearchButton) {
			myText = new JTextArea(woz.search());
			myText.setEditable(false);
		    myFrame.setContentPane(newPanel());
		    myFrame.repaint();
		    myFrame.revalidate();
			for (Item j : woz.getCurrentZone().getListItems()) {
				if (j instanceof Weapon || j instanceof Key || j instanceof Medikit) {
					myTakeButton.setEnabled(true);}
				else if (j instanceof Chest) {
					myOpenButton.setEnabled(true);
					myTakeButton.setEnabled(true);
				}
		    }
		} else if (myTakeButton.isEnabled() && e.getSource()==myTakeButton) {
			for (Item j : woz.getCurrentZone().getListItems()) {
				woz.getPlayer().getInventory().add(j);
			}
			woz.getCurrentZone().setListItemsEmpty();
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
			
		} /*else if (myOpenPathButton.isEnabled() && e.getSource()==myOpenPathButton) {
			for (Item itemKey : woz.getPlayer().getInventory()) {
    			if (itemKey instanceof Key) {
    				(((Key) itemKey).checkZone(woz.getPlayer()));
    				if (((Key) itemKey).getIsLocked()==false) {
    					myText = new JLabel("The path is unlocked! You can pass now.");
    				}
    			}
		//	woz.getCurrentZone().getHMap().checkZone(woz.getPlayer());
			}
		}*/

}	        
            
        }

