package fr.crash.game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Launcher implements ActionListener{
	//when we want to play first frame where we enter the name
	//Game
	private JButton nextButton, secondButton, thirdButton, fourthButton, fifthButton, sixthButton, seventhButton;
	private JFrame myFrame,mySecondFrame, myThirdFrame, myFourthFrame, myFifthFrame, mySixthFrame, mySeventhFrame;
	private JLabel firstLabel,secondLabel, thirdLabel, fourthLabel, fifthLabel, sixthLabel, seventhLabel;
	private JPanel firstPanel, secondPanel, thirdPanel, fourthPanel, fifthPanel, sixthPanel, seventhPanel;

	public Launcher() {

		myFrame = new JFrame();
		myFrame.setTitle("World Of Zuul");// Titre
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //----------------------------------------------------------------------
	    
	    //first label
	    firstLabel = new JLabel("<html>You are in a spaceship traveling quietly between the stars...</html>");
	    firstLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
	    firstLabel.setForeground(Color.white);
    
	    nextButton = new JButton("Next...");   
	    nextButton.setOpaque(false);
	    nextButton.setContentAreaFilled(false);
	    nextButton.setBorderPainted(false);
	    nextButton.setForeground(Color.white);
	    nextButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
	    nextButton.setVerticalTextPosition(SwingConstants.CENTER);
	    nextButton.setHorizontalTextPosition(SwingConstants.CENTER);
	    nextButton.addActionListener(this);
	    
	    firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(1,2));
	    firstPanel.add(firstLabel);
	    firstPanel.add(nextButton);
	    firstPanel.setOpaque(false);
	    
	    Container c = new JLabel(new ImageIcon(getClass().getResource("/images/espace.png")));
	    c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        c.add(firstPanel);
        c.setPreferredSize(new Dimension(800,600));
        c.setMaximumSize(new Dimension(800,600));
        c.setMinimumSize(new Dimension(800,600));
        myFrame.add(c);
        myFrame.setResizable(false);
        myFrame.setPreferredSize(new Dimension(800,600));
        myFrame.setMaximumSize(new Dimension(800,600));
        myFrame.setMinimumSize(new Dimension(800,600));
        myFrame.setLocationRelativeTo(null);
        myFrame.pack();
        myFrame.setVisible(true);      
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nextButton) {
			myFrame.dispose();
			mySecondFrame = new JFrame();
			mySecondFrame.setTitle("World Of Zuul");// Titre
			mySecondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
			secondLabel = new JLabel("<html>Suddenly, your engine is weakening! Smokes are leaking out from behind you. You are panicking !! You must land in emergency !!!</html>");
		    secondLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
		    secondLabel.setForeground(Color.white);
			
		    secondButton = new JButton("Next..."); 
		    secondButton.setPreferredSize(new Dimension(100,60));
		    secondButton.setOpaque(false);
		    secondButton.setContentAreaFilled(false);
		    secondButton.setBorderPainted(false);
		    secondButton.setForeground(Color.white);
		    secondButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
		    secondButton.setVerticalTextPosition(SwingConstants.CENTER);
		    secondButton.setHorizontalTextPosition(SwingConstants.CENTER);
		    secondButton.addActionListener(this);
		    
		    secondPanel = new JPanel();
	        secondPanel.setLayout(new GridLayout(1,2));
		    secondPanel.add(secondLabel);
		    secondPanel.add(secondButton);
		    secondPanel.setOpaque(false);
		    
			Container c = new JLabel(new ImageIcon(getClass().getResource("/images/onfireSpaceship.png")));
			c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
	        c.add(secondPanel);
	        c.setPreferredSize(new Dimension(700,450));
	        c.setMaximumSize(new Dimension(700,450));
	        c.setMinimumSize(new Dimension(700,450));
	        mySecondFrame.add(c);
	        mySecondFrame.setResizable(false);
	        mySecondFrame.setPreferredSize(new Dimension(700,450));
	        mySecondFrame.setMaximumSize(new Dimension(700,450));
	        mySecondFrame.setMinimumSize(new Dimension(700,450));
	        mySecondFrame.setLocationRelativeTo(null);
	        mySecondFrame.pack();
	        mySecondFrame.setVisible(true);
		    
		}else if (e.getSource() == secondButton){
			mySecondFrame.dispose();
			myThirdFrame = new JFrame();
			myThirdFrame.setTitle("World Of Zuul");// Titre
			myThirdFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
			thirdLabel = new JLabel("<html>There! An unknown planet!</html>");
			thirdLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
			thirdLabel.setForeground(Color.white);
			
		    thirdButton = new JButton("Next..."); 
		    thirdButton.setPreferredSize(new Dimension(100,60));
		    thirdButton.setOpaque(false);
		    thirdButton.setContentAreaFilled(false);
		    thirdButton.setBorderPainted(false);
		    thirdButton.setForeground(Color.white);
		    thirdButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
		    thirdButton.setVerticalTextPosition(SwingConstants.CENTER);
		    thirdButton.setHorizontalTextPosition(SwingConstants.CENTER);
		    thirdButton.addActionListener(this);
		    
		    thirdPanel = new JPanel();
		    thirdPanel.setLayout(new GridLayout(1,2));
		    thirdPanel.add(thirdLabel);
		    thirdPanel.add(thirdButton);
		    thirdPanel.setOpaque(false);
		    
			Container c = new JLabel(new ImageIcon(getClass().getResource("/images/newPlanet.png")));
			c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
	        c.add(thirdPanel);
	        c.setPreferredSize(new Dimension(700,450));
	        c.setMaximumSize(new Dimension(700,450));
	        c.setMinimumSize(new Dimension(700,450));
	        myThirdFrame.add(c);
	        myThirdFrame.setResizable(false);
	        myThirdFrame.setPreferredSize(new Dimension(700,450));
	        myThirdFrame.setMaximumSize(new Dimension(700,450));
	        myThirdFrame.setMinimumSize(new Dimension(700,450));
	        myThirdFrame.setLocationRelativeTo(null);
	        myThirdFrame.pack();
	        myThirdFrame.setVisible(true);
	        myThirdFrame.repaint();
	        myThirdFrame.revalidate();
	        
		} else if (e.getSource() == thirdButton) {
			myThirdFrame.dispose();
			myFourthFrame = new JFrame();
			myFourthFrame.setTitle("World Of Zuul");// Titre
			myFourthFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
			fourthLabel = new JLabel("<html>CRIC CRAC BOOM! You crashed! </html>");
			fourthLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
			fourthLabel.setForeground(Color.white);
			
		    fourthButton = new JButton("Next..."); 
		    fourthButton.setPreferredSize(new Dimension(100,60));
		    fourthButton.setOpaque(false);
		    fourthButton.setContentAreaFilled(false);
		    fourthButton.setBorderPainted(false);
		    fourthButton.setForeground(Color.white);
		    fourthButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
		    fourthButton.setVerticalTextPosition(SwingConstants.CENTER);
		    fourthButton.setHorizontalTextPosition(SwingConstants.CENTER);
		    fourthButton.addActionListener(this);
		    
		    fourthPanel = new JPanel();
		    fourthPanel.setLayout(new GridLayout(1,2));
		    fourthPanel.add(fourthLabel);
		    fourthPanel.add(fourthButton);
		    fourthPanel.setOpaque(false);
		    
			Container c = new JLabel(new ImageIcon(getClass().getResource("/images/fire.png")));
			c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
	        c.add(fourthPanel);
	        c.setPreferredSize(new Dimension(700,450));
	        c.setMaximumSize(new Dimension(700,450));
	        c.setMinimumSize(new Dimension(700,450));
	        myFourthFrame.add(c);
	        myFourthFrame.setResizable(false);
	        myFourthFrame.setPreferredSize(new Dimension(700,450));
	        myFourthFrame.setMaximumSize(new Dimension(700,450));
	        myFourthFrame.setMinimumSize(new Dimension(700,450));
	        myFourthFrame.setLocationRelativeTo(null);
	        myFourthFrame.pack();
	        myFourthFrame.setVisible(true);
	        myFourthFrame.repaint();
	        myFourthFrame.revalidate();
	        
		} else if (e.getSource() == fourthButton) {
			myFourthFrame.dispose();
			myFifthFrame = new JFrame();
			myFifthFrame.setTitle("World Of Zuul");// Titre
			myFifthFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
			fifthLabel = new JLabel("<html>The world around you is disappearing and you faint...</html>");
			fifthLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
			fifthLabel.setForeground(Color.white);
			
			fifthButton = new JButton("Next..."); 
		    fifthButton.setPreferredSize(new Dimension(100,60));
		    fifthButton.setOpaque(false);
		    fifthButton.setContentAreaFilled(false);
		    fifthButton.setBorderPainted(false);
		    fifthButton.setForeground(Color.white);
		    fifthButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
		    fifthButton.setVerticalTextPosition(SwingConstants.CENTER);
		    fifthButton.setHorizontalTextPosition(SwingConstants.CENTER);
		    fifthButton.addActionListener(this);
		    
		    fifthPanel = new JPanel();
		    fifthPanel.setLayout(new GridLayout(1,2));
		    fifthPanel.add(fifthLabel);
		    fifthPanel.add(fifthButton);
		    fifthPanel.setOpaque(false);
		    
			Container c = new JLabel(new ImageIcon(getClass().getResource("/images/black.png")));
			c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
	        c.add(fifthPanel);
	        c.setPreferredSize(new Dimension(700,450));
	        c.setMaximumSize(new Dimension(700,450));
	        c.setMinimumSize(new Dimension(700,450));
	        myFifthFrame.add(c);
	        myFifthFrame.setResizable(false);
	        myFifthFrame.setPreferredSize(new Dimension(700,450));
	        myFifthFrame.setMaximumSize(new Dimension(700,450));
	        myFifthFrame.setMinimumSize(new Dimension(700,450));
	        myFifthFrame.setLocationRelativeTo(null);
	        myFifthFrame.pack();
	        myFifthFrame.setVisible(true);
	        myFifthFrame.repaint();
	        myFifthFrame.revalidate();
	        
		} else if (e.getSource() == fifthButton) {
			myFifthFrame.dispose();
			mySixthFrame = new JFrame();
			mySixthFrame.setTitle("World Of Zuul");// Titre
			mySixthFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
			sixthLabel = new JLabel("<html>You are waking up in a forest. You are looking around you. Your spaceship is broken apart. You are discouraged… but at least you are not hurt.</html>");
			sixthLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
			sixthLabel.setForeground(Color.white);
			
		    sixthButton = new JButton("Next..."); 
		    sixthButton.setPreferredSize(new Dimension(100,60));
		    sixthButton.setOpaque(false);
		    sixthButton.setContentAreaFilled(false);
		    sixthButton.setBorderPainted(false);
		    sixthButton.setForeground(Color.white);
		    sixthButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
		    sixthButton.setVerticalTextPosition(SwingConstants.CENTER);
		    sixthButton.setHorizontalTextPosition(SwingConstants.CENTER);
		    sixthButton.addActionListener(this);
		    
		    sixthPanel = new JPanel();
		    sixthPanel.setLayout(new GridLayout(1,2));
		    sixthPanel.add(sixthLabel);
		    sixthPanel.add(sixthButton);
		    sixthPanel.setOpaque(false);
		    
			Container c = new JLabel(new ImageIcon(getClass().getResource("/images/crash.png")));
			c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
	        c.add(sixthPanel);
	        c.setPreferredSize(new Dimension(700,450));
	        c.setMaximumSize(new Dimension(700,450));
	        c.setMinimumSize(new Dimension(700,450));
	        mySixthFrame.add(c);
	        mySixthFrame.setResizable(false);
	        mySixthFrame.setPreferredSize(new Dimension(700,450));
	        mySixthFrame.setMaximumSize(new Dimension(700,450));
	        mySixthFrame.setMinimumSize(new Dimension(700,450));
	        mySixthFrame.setLocationRelativeTo(null);
	        mySixthFrame.pack();
	        mySixthFrame.setVisible(true);
	        mySixthFrame.repaint();
	        mySixthFrame.revalidate();
	        
		} else if (e.getSource() == sixthButton) {
			mySixthFrame.dispose();
			mySeventhFrame = new JFrame();
			mySeventhFrame.setTitle("World Of Zuul");// Titre
			mySeventhFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
			seventhLabel = new JLabel("<html>You are looking at the images from your headgear camera. Some native peoples have robbed multiple parts of your spaceship! You must find the different parts to repair your spaceship and to go home!</html>");
			seventhLabel.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
			seventhLabel.setForeground(Color.white);
			
		    seventhButton = new JButton("Next..."); 
		    seventhButton.setPreferredSize(new Dimension(100,60));
		    seventhButton.setOpaque(false);
		    seventhButton.setContentAreaFilled(false);
		    seventhButton.setBorderPainted(false);
		    seventhButton.setForeground(Color.white);
		    seventhButton.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
		    seventhButton.setVerticalTextPosition(SwingConstants.CENTER);
		    seventhButton.setHorizontalTextPosition(SwingConstants.CENTER);
		    seventhButton.addActionListener(this);
		    
		    seventhPanel = new JPanel();
		    seventhPanel.setLayout(new GridLayout(1,2));
		    seventhPanel.add(seventhLabel);
		    seventhPanel.add(seventhButton);
		    seventhPanel.setOpaque(false);
		    
			Container c = new JLabel(new ImageIcon(getClass().getResource("/images/crash.png")));
			c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
	        c.add(seventhPanel);
	        c.setPreferredSize(new Dimension(700,450));
	        c.setMaximumSize(new Dimension(700,450));
	        c.setMinimumSize(new Dimension(700,450));
	        mySeventhFrame.add(c);
	        mySeventhFrame.setResizable(false);
	        mySeventhFrame.setPreferredSize(new Dimension(700,450));
	        mySeventhFrame.setMaximumSize(new Dimension(700,450));
	        mySeventhFrame.setMinimumSize(new Dimension(700,450));
	        mySeventhFrame.setLocationRelativeTo(null);
	        mySeventhFrame.pack();
	        mySeventhFrame.setVisible(true);
	        mySeventhFrame.repaint();
	        mySeventhFrame.revalidate();
	        
		} else if (e.getSource() == seventhButton) {
			mySeventhFrame.dispose();
			LaunchGame launchgame = new LaunchGame();
		}
		
	}
		
}		

