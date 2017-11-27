/**
 * 
 */
package fr.crash.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;

/**
 * @author Group 1
 * @version 21/11/2017
 * This class represents the interface with the image, 
 * the buttons to move and interact with objects and the world
 */
public class HUD {
	
	private JFrame myFrame;  
    private JLabel myPlayerName, myHP, myEP, myWeapon, myText;
    private JPanel myPanel;//the global panel
    private JPanel myPanelArrows;//all arrows
    private JPanel myPanelRight;//map + myPanelArrows + actions
    private JPanel myPanelUp;//player name + labels of HP and EP + button for the inventory + image of the weapon
    //private JPanel myPanelDown;//image + text
    private JPanel myPanelLittleRight;//search button + open button
    private JLabel myEmptyLabel;//empty panel to the arrows panel
    private JButton myInventory, myMap, myNorthArrow, myEastArrow, mySouthArrow, myWestArrow;
    private JButton mySearchButton, myOpenButton;
    
    private Icon crash;// to remove
    
    	//displays the image corresponding to the current zone
        //public HUD(Player player, Zone currentZone) {
        public HUD() {
        	myFrame = new JFrame("Crash");
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //kill the application when we close the window
            
            //instantiation of buttons
            myInventory = new JButton("My Inventory");
            myMap = new JButton("The Map");
            myNorthArrow = new JButton("North");//put an image here
            myEastArrow = new JButton("East");//put an image here
            mySouthArrow = new JButton("South");//put an image here
            myWestArrow = new JButton("West");//put an image here
            mySearchButton = new JButton("Search");
            myOpenButton = new JButton("Open");
            
            //instantiation of labels
            //myPlayerName = new JLabel(playerName);
            myPlayerName = new JLabel("player.getName()");
            myHP = new JLabel("My HP : " + "player.getHP()");
            myEP = new JLabel("My EP : " + "player.getEP()");
            myText = new JLabel("insert myText here");
            myWeapon = new JLabel("insert weapon here");
         
            
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
            
            //myPanelDown = new JPanel();
            crash = new ImageIcon(getClass().getResource("/images/crash.png"));
            JLabel labelCrash = new JLabel(crash);
            labelCrash.setPreferredSize(new Dimension(700,500));
            //myPanelDown.add(labelCrash);
            //myPanelDown.add(myText);

            myPanel = new JPanel();
            
            //the all panel
            myPanel.setLayout(new BorderLayout());
            myPanel.add(myPanelUp, BorderLayout.NORTH);
            //myPanel.add(myPanelDown, BorderLayout.CENTER);
            myPanel.add(labelCrash, BorderLayout.CENTER);
            myPanel.add(myText, BorderLayout.SOUTH);
            myPanel.add(myPanelRight, BorderLayout.EAST);
            //myPanel.setOpaque(false);
            
            //myFrame.setContentPane(new JLabel(new ImageIcon("/images/fondGris.png")));
            
            //Container c = new JLabel(new ImageIcon(getClass().getResource("/images/fondGris.png")));
            //c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
            //c.add(myPanel);
            //c.setPreferredSize(new Dimension(1000,570));
            //c.setMaximumSize(new Dimension(1000,570));
            //c.setMinimumSize(new Dimension(1000,570));
            myFrame.add(myPanel);
            
            myFrame.setResizable(false);
            myFrame.setPreferredSize(new Dimension(1000,700));
            myFrame.setMaximumSize(new Dimension(1000,700));
            myFrame.setMinimumSize(new Dimension(1000,700));
            myFrame.setLocationRelativeTo(null);
            myFrame.pack();
            myFrame.setVisible(true);
    	
    	
    }
}
