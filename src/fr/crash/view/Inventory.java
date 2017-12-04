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

public class Inventory implements ActionListener{
	
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

    public Inventory(WoZ woz) {
}
