package fr.crash.game;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import fr.crash.core.WoZ;
import fr.crash.core.Player;

public class LaunchGame implements ActionListener {
	//when we want to play first frame where we enter the name
	//Game

	private JLabel labTitle;
	private JButton butStart;
	private JFrame myFrame;
	private String playerName;
	private JTextField fieldName;
	
	public LaunchGame() {

		myFrame = new JFrame();
		myFrame.setTitle("World Of Zuul");// Titre
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //-----------------------------------------------------------------------
	    labTitle = new JLabel("World Of Zuul",JLabel.CENTER);
	    labTitle.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,75));
	    labTitle.setForeground(Color.white);
	    
	    JLabel labelName = new JLabel("Enter your name :  ");
	    labelName.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,30));
	    labelName.setForeground(Color.white);
	    
	    fieldName = new JTextField(15);
	    fieldName.addActionListener(this);
	    
	    JPanel panelName = new JPanel();
	    panelName.add(labelName);
	    panelName.add(fieldName);
	    panelName.setOpaque(false);
	    
	    butStart = new JButton();
        butStart.setPreferredSize(new Dimension(100,60));
        butStart.setOpaque(false);
        butStart.setContentAreaFilled(false);
        butStart.setBorderPainted(false);
        
        butStart.setText("Start Game");
        butStart.setForeground(Color.white);
        butStart.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,75));
        butStart.setVerticalTextPosition(SwingConstants.CENTER);
        butStart.setHorizontalTextPosition(SwingConstants.CENTER);
        butStart.setEnabled(false); 
        butStart.addActionListener(this);
        
        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(3,1));
        myPanel.add(labTitle);
        myPanel.add(panelName);
        myPanel.add(butStart);
        myPanel.setOpaque(false);
        

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
			playerName = fieldName.getText();
			WoZ woz = new WoZ(playerName);
			new Game(woz);
			myFrame.dispose();
				
		} else if (e.getSource() == fieldName){
			butStart.setEnabled(true);
			fieldName.setEditable(false);
		}
	}
		
}

