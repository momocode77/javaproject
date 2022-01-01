package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public abstract class feedback implements ActionListener {
	
	JFrame frame;
	JLabel textL = new JLabel("CUSTOMER FEEDBACK FORM !");
	JLabel feedbackL = new JLabel("1.This Feedback is a:");
	JLabel visitL = new JLabel("3.Best Option To Provide Service?");
	JLabel paymentL = new JLabel("4.Best Option Payment Method?"); 
	
	JLabel comL = new JLabel("8.Please let us know the reason of rating or any suggestion?");
	JLabel tyL = new JLabel("Thank you for participating in this survey.");
	
	
	
	JTextField productTF = new JTextField();
	JTextField comTF = new JTextField();
	
	JButton submitBtn = new JButton ("Submit");
	
	List<String> AgeChoices = new ArrayList<String>();
	
	String[] visitCB = {"Online Website", "Walk In to Store"};
	String[] paymentOpt = {"Debit/Credit", "Cash", "EWallet Payment"};
	
	
	JComboBox<String> comboAge =  new JComboBox<>();
	JComboBox<String> comboVisit = new JComboBox<>(visitCB);
	JComboBox<String> comboPayment =  new JComboBox<>(paymentOpt);
	
	
	
	public feedback()
	{
		
		feedbackcreateWindow();
		comboCB();		
		setFeedbackLocationAndSize();
		addFeedbackComponentsToFrame();
		
		
			
	}
	
	public void comboCB()
	{
		AgeChoices.add("Suggestion");
		AgeChoices.add("Complaint");
		comboAge = new JComboBox(AgeChoices.toArray());
		
	}
	
	
	public void feedbackcreateWindow()
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
	
	public void setFeedbackLocationAndSize()
	{
		
		textL.setBounds(135,20,300,30);
		visitL.setBounds(50,160,300,30);
		comboVisit.setBounds(50,190,300,20);
		
		feedbackL.setBounds(50,60,300,30);
		comboAge.setBounds(50,90,300,20);
		
		paymentL.setBounds(50,210,300,30);
		comboPayment.setBounds(50,242,300,20);
		
		comL.setBounds(50,403,400,30);
		comTF.setBounds(50,430,300,30);
		
		tyL.setBounds(50,460,500,30);
		
		submitBtn.setBounds(50,490,100,30);
		
		textL.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		
		
	}
	

	public void addFeedbackComponentsToFrame()
	{
		
		
		frame.add(textL);
		
		
		frame.add(feedbackL);
		frame.add(comboAge);
		
		frame.add(productTF);
		
		frame.add(visitL);
		frame.add(comboVisit);
		
		frame.add(paymentL);
		frame.add(comboPayment);
		
			
		frame.add(comL);
		frame.add(comTF);
		
		frame.add(tyL);
		frame.add(submitBtn);
	}
	
	 
	


}
