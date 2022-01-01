package testing;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class voucherReward {
	
		
		JFrame frame;
		JLabel welcomeL = new JLabel("Thank You For Your Feedback!");
		JLabel tyL = new JLabel("Your Feedback Recorded!!");
		
		
		
		voucherReward()
		{

			interfaceWindow();
			setLocationAndSize();
			addIntComponentToFrame();
			 
				 
		}
		
		public void interfaceWindow()
		{
			frame = new JFrame();
			frame.setTitle("Shopping Mall Feedback System");
			frame.setBounds(20,20,400,200);
			frame.getContentPane().setBackground(Color.pink);
	        frame.getContentPane().setLayout(null);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
	       
			welcomeL.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
	      
		}
		
		public void setLocationAndSize() 
		{
			welcomeL.setBounds(70,40,300,30);
			tyL.setBounds(110,80,200,30);
		}
		
		public void addIntComponentToFrame()
		{
			frame.add(welcomeL);
			frame.add(tyL);	 
		
		}
	 
		public void show()
		{
			JOptionPane.showMessageDialog(null, "VOUCHER CLAIMED!");
		}
	
		
		 	 
		public static void main(String[] args) {
			
			new voucherReward();
		}
}




	 
	 	


