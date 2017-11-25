/**
 * 
 */
package fr.crash.view;

import java.awt.BorderLayout;
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
    private JPanel myLittlePanelUp;//player name + labels of HP and EP 
    private JPanel myPanelUp;//myLittlePanelUp + button for the inventory + image of the weapon
    private JPanel myPanelDown;//image + text
    private JButton myInventory, myMap, myNorthArrow, myEastArrow, mySouthArrow, myWestArrow;
    private JButton mySearchButton, myOpenButton;
    
    private Icon crash;
    	//displays the image corresponding to the current zone
        //public HUD(String playerName) {
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
            myPlayerName = new JLabel("insert name here");
            myHP = new JLabel("insert HP here");
            myEP = new JLabel("insert EP here");
            myText = new JLabel("insert myText here");
            myWeapon = new JLabel("insert weapon here");

            //instantiation of panels
            myPanelArrows = new JPanel();
            myPanelArrows.setLayout(new GridLayout(3,3));
            myPanelArrows.add(myNorthArrow);
            myPanelArrows.add(myWestArrow);
            myPanelArrows.add(myEastArrow);
            myPanelArrows.add(mySouthArrow);
            
            myPanelRight = new JPanel();
            myPanelRight.setLayout(new GridLayout(5,1));
            myPanelRight.add(myMap);
            myPanelRight.add(myPanelArrows);
            myPanelRight.add(myMap);
            myPanelRight.add(mySearchButton);
            myPanelRight.add(myOpenButton);
            
            myLittlePanelUp = new JPanel();
            myLittlePanelUp.setLayout(new GridLayout(3,1));
            myLittlePanelUp.add(myPlayerName);
            myLittlePanelUp.add(myHP);
            myLittlePanelUp.add(myEP);
            
            myPanelUp = new JPanel();
            myPanelUp.setLayout(new GridLayout(3,1));
            myPanelUp.add(myLittlePanelUp);
            myPanelUp.add(myInventory);
            myPanelUp.add(myWeapon);
            
            myPanelDown = new JPanel();
            crash = new ImageIcon(getClass().getResource("/images/crash.png"));
            JLabel labelCrash = new JLabel(crash);
            labelCrash.setPreferredSize(new Dimension(1000,550));
            myPanelDown.setLayout(new GridLayout(2,1));
            myPanelDown.add(labelCrash);
            myPanelDown.add(myText);

            myPanel = new JPanel();
            
            //the all panel
            myPanel.setLayout(new BorderLayout());
            myPanel.add(myPanelUp, BorderLayout.NORTH);
            myPanel.add(myPanelDown, BorderLayout.WEST);
            myPanel.add(myPanelRight, BorderLayout.EAST);      
            
            myFrame.add(myPanel);
            myFrame.pack();
            myFrame.setVisible(true);
    	
    	
    }//
    
    
}
