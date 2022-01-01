package testing;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import java.awt.font.*;

public class userInterface implements ActionListener{
	
		
		JFrame frame;
		JLabel loginL = new JLabel("Welcome To Mall Feedback System!");
		JLabel chooseL = new JLabel("Serving You The Best!");
		JLabel joinL = new JLabel("Join Us Now !");
		
		JButton loginBtn = new JButton("Login Menu");
		JButton RegisterBtn = new JButton("Staff Registeration!");
		JButton RegisterTwoBtn = new JButton("Customer Registeration!");
		
		public JLabel rolestype = new JLabel();
		public JTextField roles = new JTextField();
		
		userInterface()
		{
			interfaceWindow();
			setLocationAndSize();
			addIntComponentToFrame();
			InterfaceActionEvent();
				 
		}
		
		public void interfaceWindow()
		{
			frame = new JFrame();
			frame.setTitle("Shopping Mall Feedback System");
			frame.setBounds(60,60,500,600);
			frame.getContentPane().setBackground(Color.pink);
	        frame.getContentPane().setLayout(null);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	        frame.setResizable(false);
	        
		}
		
		public void setLocationAndSize() 
		{
			loginL.setBounds(108,100,300,30);
			chooseL.setBounds(180,150,200,30);
			joinL.setBounds(190,218,200,30);
			
			loginBtn.setBounds(137,183,190,30);
			RegisterBtn.setBounds(137,250,190,30);
			RegisterTwoBtn.setBounds(137,290,190,30);
			
			loginL.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
			chooseL.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 10));
		}
		
		public void addIntComponentToFrame()
		{
			frame.add(loginL);
			frame.add(chooseL);
			frame.add(joinL);
			
			frame.add(loginBtn);
			frame.add(RegisterBtn);
			frame.add(RegisterTwoBtn);
		
		}
		
		public void InterfaceActionEvent()
		{
			loginBtn.addActionListener(this);
			RegisterBtn.addActionListener(this);
			RegisterTwoBtn .addActionListener(this);
			
		}	 
		
		 public void actionPerformed(ActionEvent e) {
	        	
	        	
	        	if (e.getActionCommand().equals("Staff Registeration!"))
	        	{
	        		new registerWorker();
	        		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	        		 
	        	}
	        	if (e.getActionCommand().equals("Customer Registeration!"))
	        	{
	        		new registerCustomer();		
	        		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	        		 
	        	}
	        	if(e.getActionCommand().equals("Login Menu"))
	        	{
	        		 	        	 
	        		
	        		new userLogin(); 
	        		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	        		         		 
	        	}
	        
	        	
	        }
		 	 
		
}


	 
	 	


