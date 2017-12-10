package fr.crash.game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/** 
 * This class displays the context of the game
 * with frame with piece of story and next button
 * @author Groupe 1
 */
public class Launcher implements ActionListener{
	
	private JButton nextButton, secondButton, thirdButton, fourthButton, fifthButton, sixthButton, seventhButton;
	private JFrame myFrame;
	private JLabel firstLabel,secondLabel, thirdLabel, fourthLabel, fifthLabel, sixthLabel, seventhLabel;

	/**
	 * This class represents the first frame of the game context
	 * There are the text and the next button on a background image
	 */
	public Launcher() {
		firstLabel = new JLabel("<html>You are in a spaceship traveling quietly between the stars...</html>");
	    firstLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
	    firstLabel.setForeground(Color.white);
	    nextButton = newButton();//create the button
		JPanel panel = newPanel(firstLabel, nextButton);//create the panel
		ImageIcon image = new ImageIcon(getClass().getResource("/images/espace.png"));//create the image
		Container myContainer = newContainer(image, panel);//Create the container
		myFrame = newFrame(myContainer);//create the new frame
	}

	/**
	 * This method creates a new button with the good appearance
	 * @return new button
	 */
	private JButton newButton() {
		JButton button = new JButton("Next...");   
	    button.setOpaque(false);
	    button.setContentAreaFilled(false);
	    button.setBorderPainted(false);
	    button.setForeground(Color.white);
	    button.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
	    button.setVerticalTextPosition(SwingConstants.CENTER);
	    button.setHorizontalTextPosition(SwingConstants.CENTER);
	    button.addActionListener(this);
	    return button;
	}
	
	/**
	 * This method creates a new panel with a label and a button
	 * @return new panel
	 * @param label
	 * @param button
	 */
	private JPanel newPanel (JLabel label, JButton button) {
		JPanel panel;
		panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));
	    panel.add(label);
	    panel.add(button);
	    panel.setOpaque(false);
	    return panel;
	}
	
	/**
	 * This method creates a new container with an image and a panel
	 * @param image
	 * @param panel
	 * @return new container with a background image and the panel
	 */
	private Container newContainer(ImageIcon image, JPanel panel) {
		Container c = new JLabel(image);
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        c.add(panel);
        c.setPreferredSize(new Dimension(800,600));
        c.setMaximumSize(new Dimension(800,600));
        c.setMinimumSize(new Dimension(800,600));
        return c;
	}
	
	/**
	 * This method dispose the previous frame and creates a new frame with a container and the good appearance
	 * @param c the container 
	 * @return new frame
	 */
	private JFrame newFrame(Container c) {
		JFrame myFrame;
		myFrame = new JFrame();
		myFrame.setTitle("World Of Zuul");// Titre
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(c);
        myFrame.setResizable(false);
        myFrame.setPreferredSize(new Dimension(700,450));
        myFrame.setMaximumSize(new Dimension(700,450));
        myFrame.setMinimumSize(new Dimension(700,450));
        myFrame.setLocationRelativeTo(null);
        myFrame.pack();
        myFrame.setVisible(true);
		return myFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nextButton) {
			myFrame.dispose();//close the precedent window
			secondLabel = new JLabel("<html>Suddenly, your engine is weakening! Smokes are leaking out from behind you. You are panicking !! You must land in emergency !!!</html>");
		    secondLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
		    secondLabel.setForeground(Color.white);
		    secondButton = newButton();
			JPanel panel = newPanel(secondLabel, secondButton);
			ImageIcon image = new ImageIcon(getClass().getResource("/images/onfireSpaceship.png"));
			Container myContainer = newContainer(image, panel);
			myFrame = newFrame(myContainer);
		    
		}else if (e.getSource() == secondButton){
			
			myFrame.dispose();//close the precedent window
			thirdLabel = new JLabel("<html>There! An unknown planet!</html>");
		    thirdLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
		    thirdLabel.setForeground(Color.white);
		    thirdButton = newButton();
			JPanel panel = newPanel(thirdLabel, thirdButton);
			ImageIcon image = new ImageIcon(getClass().getResource("/images/newPlanet.png"));
			Container myContainer = newContainer(image, panel);
			myFrame = newFrame(myContainer);
	        
		} else if (e.getSource() == thirdButton) {
			
			myFrame.dispose();//close the precedent window
			fourthLabel = new JLabel("<html>CRIC CRAC BOOM! You crashed! </html>");
		    fourthLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
		    fourthLabel.setForeground(Color.white);
		    fourthButton = newButton();
			JPanel panel = newPanel(fourthLabel, fourthButton);
			ImageIcon image = new ImageIcon(getClass().getResource("/images/fire.png"));
			Container myContainer = newContainer(image, panel);
			myFrame = newFrame(myContainer);
	        
		} else if (e.getSource() == fourthButton) {
			
			myFrame.dispose();//close the precedent window
			fifthLabel = new JLabel("<html>The world around you is disappearing and you faint...</html>");
			fifthLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
			fifthLabel.setForeground(Color.white);
		    fifthButton = newButton();
			JPanel panel = newPanel(fifthLabel, fifthButton);
			ImageIcon image = new ImageIcon(getClass().getResource("/images/black.png"));
			Container myContainer = newContainer(image, panel);
			myFrame = newFrame(myContainer);
			
		} else if (e.getSource() == fifthButton) {
			
			myFrame.dispose();//close the precedent window
			sixthLabel = new JLabel("<html>You are waking up in a forest. You are looking around you. Your spaceship is broken apart. You are discouraged� but at least you are not hurt.</html>");
			sixthLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
			sixthLabel.setForeground(Color.white);
		    sixthButton = newButton();
			JPanel panel = newPanel(sixthLabel, sixthButton);
			ImageIcon image = new ImageIcon(getClass().getResource("/images/crash.png"));
			Container myContainer = newContainer(image, panel);
			myFrame = newFrame(myContainer);
	        
		} else if (e.getSource() == sixthButton) {
			
			myFrame.dispose();//close the precedent window
			seventhLabel = new JLabel("<html>You are looking at the images from your headgear camera. Some native peoples have robbed multiple parts of your spaceship! You must find the different parts to repair your spaceship and to go home!</html>");
			seventhLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
			seventhLabel.setForeground(Color.white);
		    seventhButton = newButton();
			JPanel panel = newPanel(seventhLabel, seventhButton);
			ImageIcon image = new ImageIcon(getClass().getResource("/images/crash.png"));
			Container myContainer = newContainer(image, panel);
			myFrame = newFrame(myContainer);
	        
		} else if (e.getSource() == seventhButton) {
			myFrame.dispose();//close the precedent window
			@SuppressWarnings("unused")
			LaunchGame launchgame = new LaunchGame();//call the frame that allow the player to enter his name
		}
	}		
}		

