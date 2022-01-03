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
	JLabel textL = new JLabel("FEEDBACK FORM !");
	JLabel feedbackL = new JLabel("1.This Feedback is a:");
	JLabel visitL = new JLabel("3.Best Option To Provide Service?");
	JLabel paymentL = new JLabel("4.Best Option Payment Method?"); 
	
	JLabel comL = new JLabel("8.Please let us know the reason of rating or any suggestion?");
	JLabel tyL = new JLabel("Thank you for participating in this survey.");
	
	
	
	private JTextField productTF = new JTextField();
	private JTextField comTF = new JTextField();
	
	JButton submitBtn = new JButton ("Submit");
	
	private List<String> AgeChoices = new ArrayList<String>();
	private List<String> visitCB = new ArrayList<String>();
	
	private String[] paymentOpt = {"Debit/Credit", "Cash", "EWallet Payment"};
	
	
	private JComboBox<String> comboAge =  new JComboBox<>();
	private JComboBox<String> comboVisit = new JComboBox<>();
	private JComboBox<String> comboPayment =  new JComboBox<>(paymentOpt);
	
	
	
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
		visitCB.add("Online Website");
		visitCB.add("Walk In To Store");
		comboVisit = new JComboBox(visitCB.toArray());
		
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
		
		textL.setBounds(145,20,300,30);
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

	public JTextField getProductTF() {
		return productTF;
	}

	public void setProductTF(JTextField productTF) {
		this.productTF = productTF;
	}

	public JTextField getComTF() {
		return comTF;
	}

	public void setComTF(JTextField comTF) {
		this.comTF = comTF;
	}

	public List<String> getAgeChoices() {
		return AgeChoices;
	}

	public void setAgeChoices(List<String> ageChoices) {
		AgeChoices = ageChoices;
	}

	public List<String> getVisitCB() {
		return visitCB;
	}

	public void setVisitCB(List<String> visitCB) {
		this.visitCB = visitCB;
	}

	public String[] getPaymentOpt() {
		return paymentOpt;
	}

	public void setPaymentOpt(String[] paymentOpt) {
		this.paymentOpt = paymentOpt;
	}

	public JComboBox<String> getComboAge() {
		return comboAge;
	}

	public void setComboAge(JComboBox<String> comboAge) {
		this.comboAge = comboAge;
	}

	public JComboBox<String> getComboVisit() {
		return comboVisit;
	}

	public void setComboVisit(JComboBox<String> comboVisit) {
		this.comboVisit = comboVisit;
	}

	public JComboBox<String> getComboPayment() {
		return comboPayment;
	}

	public void setComboPayment(JComboBox<String> comboPayment) {
		this.comboPayment = comboPayment;
	}
	
	 
	


}
