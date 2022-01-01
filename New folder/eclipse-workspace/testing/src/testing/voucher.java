package testing;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

public class voucher extends voucherReward {
	
		
		JFrame frame;
		JLabel welcomeL = new JLabel("Welcome To Mall Feedback System!");
		JLabel tyL = new JLabel("Thanks For Your Feedback!");
		
		voucher()
		{
			super();
			 		 
		}
				
		@Override
		public void show()
		{
			JOptionPane.showMessageDialog(null, "500 POINT SUCCEFULLY ADDED!");
		}
	
		 	 
		public static void main(String[] args) {
			
			new voucherReward();
		}
}




	 
	 	


