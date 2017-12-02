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

import javax.swing.*;

import fr.crash.core.Chest;
import fr.crash.core.Item;
import fr.crash.core.WoZ;


/**
 * @author Group 1
 * @version 21/11/2017
 * This class represents the interface with the image, 
 * the buttons to move and interact with objects and the world
 */

public class HUD implements ActionListener {

	private JFrame myFrame;  
    private JLabel myPlayerName, myHP, myEP, myText;
    private JPanel myPanel;//the global panel
    private JPanel myPanelArrows;//all arrows
    private JPanel myPanelRight;//map + myPanelArrows + actions
    private JPanel myPanelUp;//player name + labels of HP and EP + button for the inventory + image of the weapon
    private JPanel myPanelLittleRight;//search button + open button
    private JLabel myEmptyLabel;//empty panel to the arrows panel
    private JButton myInventory, myMap, myNorthArrow, myEastArrow, mySouthArrow, myWestArrow;
    private JButton mySearchButton, myOpenButton;
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
                    /*Example
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
            mySearchButton.addActionListener(new ActionListener (){
            	public void actionPerformed (ActionEvent e){
            		String zoneItems = null;
            		for (Item i : woz.getCurrentZone().getListItems()) { //the list of items of the current zone
            			if (i instanceof Chest) { //if an item is a chest
            				myOpenButton.setEnabled(true); //the open button is available
            			}
						zoneItems = zoneItems + i.getName() + i.getDescription() + " "; 
						myText = new JLabel("In this zone, you can find : " + zoneItems); //to display objects of this zone
					}
            	}
            });
            
            //the open button
            myOpenButton = new JButton("Open");
            myOpenButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,20));
            myOpenButton.setForeground(Color.black);
            myOpenButton.setEnabled(false);//open button is not available
            myOpenButton.addActionListener(new ActionListener (){
            	public void actionPerformed (ActionEvent e){
            		for (Item i : woz.getCurrentZone().getListItems()) {//the list of items of the current zone
            			if (i instanceof Chest) {//in an item is a chest
            				((Chest) i).checkChest(woz.getPlayer());//check the chest and open it if it is ok
            				if (((Chest) i).getIsOpened() == true) {
            					myText = new JLabel("You have a new item ! A wonderful " + ((Chest)i).getContent().getDescription());            	
            }
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
            
            myText = new JLabel();
            myText.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,15));
            myText.setForeground(Color.black);

            //image of the current weapon
            JLabel myWeapon = new JLabel(woz.getPlayer().getCurrentWeapon().getPicWeapon());
            myWeapon.setPreferredSize(new Dimension(40,40));
          //image of the current zone
            JLabel labelZone = new JLabel(woz.getCurrentZone().getPicZone());
            labelZone.setPreferredSize(new Dimension(700,450));
            
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
            myPanelLittleRight.setLayout(new GridLayout(2,1));
            myPanelLittleRight.add(mySearchButton);
            myPanelLittleRight.add(myOpenButton);
            
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
            myFrame.setPreferredSize(new Dimension(1000,700));
            myFrame.setMaximumSize(new Dimension(1000,700));
            myFrame.setMinimumSize(new Dimension(1000,700));
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
    				
    				myText = new JLabel (woz.move("north"));	
    				myFrame.setContentPane(newPanel());
    				myFrame.repaint();
    				myFrame.revalidate();
	
    		} else if (e.getSource() == myEastArrow){
    			
            	myText = new JLabel (woz.move("east"));
    		    myFrame.setContentPane(newPanel());
    		    myFrame.repaint();
    		    myFrame.revalidate();
    		
		} else if (e.getSource() == mySouthArrow){
			
			myText = new JLabel (woz.move("south"));
		    myFrame.setContentPane(newPanel());
		    myFrame.repaint();
		    myFrame.revalidate();
 	    	
		} else if (e.getSource() == myWestArrow){
		    
		    myText = new JLabel (woz.move("west"));
		    myFrame.setContentPane(newPanel());
		    myFrame.repaint();
		    myFrame.revalidate();
		}
}	        
}
