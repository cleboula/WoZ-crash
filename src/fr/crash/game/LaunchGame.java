package fr.crash.game;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import fr.crash.core.WoZ;
import fr.crash.view.HUD;

/**
 * This class displays the title "World of Zuul", a field name that is disabled when we press "enter",
 * a "start game" button that is enabled when we press "enter"
 * @author Groupe1
 *
 */
public class LaunchGame implements ActionListener {
	
	private JLabel title;
	private JButton butStart;
	private JFrame myFrame;
	private String playerName;
	private JTextField fieldName;
	private JPanel myPanel;
	
	public LaunchGame() {

		myFrame = new JFrame();//creation of the frame
		myFrame.setTitle("World Of Zuul");//title
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill the application when we close the window

	    //title creation
	    title = new JLabel("World Of Zuul",JLabel.CENTER);
	    title.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,75));
	    title.setForeground(Color.white);
	    
	    //label name creation
	    JLabel labelName = new JLabel("Enter your name :  ");
	    labelName.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
	    labelName.setForeground(Color.white);
	    
	    //field name creation
	    fieldName = new JTextField(15);
	    fieldName.addActionListener(this);
	    
	    //panel creation with the label name and the field name
	    JPanel panelName = new JPanel();
	    panelName.add(labelName);
	    panelName.add(fieldName);
	    panelName.setOpaque(false);
	    
	    //button creation
	    butStart = new JButton();
        butStart.setOpaque(false);
        butStart.setContentAreaFilled(false);
        butStart.setBorderPainted(false);
        butStart.setText("Start Game");
        butStart.setForeground(Color.white);
        butStart.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,75));
        butStart.setVerticalTextPosition(SwingConstants.CENTER);
        butStart.setHorizontalTextPosition(SwingConstants.CENTER);
        butStart.setEnabled(false); //disabled the button
        butStart.addActionListener(this);
        
        //panel creation with the title, the panel name and the start button
        myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(4,1));
        myPanel.add(title);
        myPanel.add(panelName);
        myPanel.add(butStart);
        myPanel.setOpaque(false);
        
        //container creation wit the background image, and the general panel
        Container c = new JLabel(new ImageIcon(getClass().getResource("/images/fondGris.png")));
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        c.add(myPanel);
        c.setPreferredSize(new Dimension(800,800));
        c.setMaximumSize(new Dimension(800,800));
        c.setMinimumSize(new Dimension(800,800));
        myFrame.add(c);
        myFrame.setResizable(false);
        myFrame.setPreferredSize(new Dimension(1000,550));
        myFrame.setMaximumSize(new Dimension(1000,550));
        myFrame.setMinimumSize(new Dimension(1000,550));
        myFrame.setLocationRelativeTo(null);
        myFrame.pack();
        myFrame.setVisible(true);          
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == butStart)
		{
			playerName = fieldName.getText(); //the playerName takes the string enter in the text field
			WoZ woz = new WoZ(playerName); //create the World
			@SuppressWarnings("unused")
			HUD hud = new HUD(woz);	//call the interface
			myFrame.dispose(); //close the window
				
		} else if (e.getSource() == fieldName){
			//when we validate the name, disables the field name, enables the start button
			if (fieldName.getText().length()!=0) { //verify that the textfield is not empty
				butStart.setEnabled(true);
				fieldName.setEditable(false);
			}
			
		}
	}
}

