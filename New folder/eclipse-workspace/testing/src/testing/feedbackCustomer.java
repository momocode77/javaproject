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

public class feedbackCustomer extends feedback implements ActionListener{
	
	JLabel fIdL = new JLabel("2.Your Membership ID: ");
	JLabel satisL = new JLabel("5.How Satisfied Were You With Our Services?.");
	JLabel suggestL = new JLabel("6.Would you recommend our product or service to your friend?");
	JLabel prodL = new JLabel("7.Would You Use Our Product In The Future?");
	
	private JTextField fIdTF = new JTextField();
	
	private JCheckBox cb1 = new JCheckBox("Vey Satisfied!");
	private JCheckBox cb2 = new JCheckBox("Normal!");
	private JCheckBox cb3 = new JCheckBox("Not Satisfied!");
	
	private JCheckBox sb1 = new JCheckBox("Yes");
	private JCheckBox sb2 = new JCheckBox("No");
	
	private JCheckBox pb1 = new JCheckBox("Definitely");
	private JCheckBox pb2 = new JCheckBox("Not Sure");
	private JCheckBox pb3 = new JCheckBox("Definitely Not");
	
	
	public feedbackCustomer()
	{
		super();
		createWindow();
		setLocationCust();
		addCustFrame();
		actionEvCust();
		
	}
	
	public void createWindow()
	{
		   cb1.setBackground(Color.pink);
	       cb2.setBackground(Color.pink);
	       cb3.setBackground(Color.pink);
	       
	       ButtonGroup bg = new ButtonGroup();
	        bg.add(cb1);
	        bg.add(cb2);
	        bg.add(cb3);
	        
	       sb1.setBackground(Color.pink);
	       sb2.setBackground(Color.pink);
	       
	       ButtonGroup sg = new ButtonGroup();
	        sg.add(sb1);
	        sg.add(sb2);
	        
	       pb1.setBackground(Color.pink);
		   pb2.setBackground(Color.pink);
		   pb3.setBackground(Color.pink);
		   
	       ButtonGroup pg = new ButtonGroup();
	        pg.add(pb1);
	        pg.add(pb3);
	       
	}
	
	public void setLocationCust()
	{
		
		fIdL.setBounds(50,110,300,30);
		fIdTF.setBounds(50,140,300,20);
		
		satisL.setBounds(50,267,300,30);
		cb1.setBounds(50,295,120,20);
		cb2.setBounds(170,295,90,20);
		cb3.setBounds(280,295,120,20);
		
		suggestL.setBounds(50,315,500,30);
		sb1.setBounds(50,340,120,20);
		sb2.setBounds(170,340,120,20);
		
		prodL.setBounds(50,360,500,30);
		pb1.setBounds(50,380,120,30);
		pb2.setBounds(170,380,120,30);
		pb3.setBounds(280,380,120,30);
	}
	
	public void addCustFrame()
	{
		frame.add(fIdL);
		frame.add(fIdTF);
		
			
		frame.add(satisL);
		frame.add(cb1);
		frame.add(cb2);
		frame.add(cb3);
		
		frame.add(suggestL);
		frame.add(sb1);
		frame.add(sb2);
		
		frame.add(prodL);
		frame.add(pb1);
		frame.add(pb2);
		frame.add(pb3);
		
	}
	
	public void actionEvCust()
	{
		 submitBtn.addActionListener(this);
	}
	
	
	
	public JTextField getfIdTF() {
		return fIdTF;
	}

	public void setfIdTF(JTextField fIdTF) {
		this.fIdTF = fIdTF;
	}

	public JCheckBox getCb1() {
		return cb1;
	}

	public void setCb1(JCheckBox cb1) {
		this.cb1 = cb1;
	}

	public JCheckBox getCb2() {
		return cb2;
	}

	public void setCb2(JCheckBox cb2) {
		this.cb2 = cb2;
	}

	public JCheckBox getCb3() {
		return cb3;
	}

	public void setCb3(JCheckBox cb3) {
		this.cb3 = cb3;
	}

	public JCheckBox getSb1() {
		return sb1;
	}

	public void setSb1(JCheckBox sb1) {
		this.sb1 = sb1;
	}

	public JCheckBox getSb2() {
		return sb2;
	}

	public void setSb2(JCheckBox sb2) {
		this.sb2 = sb2;
	}

	public JCheckBox getPb1() {
		return pb1;
	}

	public void setPb1(JCheckBox pb1) {
		this.pb1 = pb1;
	}

	public JCheckBox getPb2() {
		return pb2;
	}

	public void setPb2(JCheckBox pb2) {
		this.pb2 = pb2;
	}

	public JCheckBox getPb3() {
		return pb3;
	}

	public void setPb3(JCheckBox pb3) {
		this.pb3 = pb3;
	}

public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Submit"))
    	{
		
    		try 
    		{
    			Connection myConn = null;
    			PreparedStatement myStmt = null;
    			
    			myConn = DriverManager.getConnection("jdbc:mysql://localhost/smfs?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
    			
    			String sql = "insert into feedbackcustomer " + " (FeedbackType, customerID, ServiceOption, PaymentMethod, ServiceSatisfaction, SuggestToFriend, productFuture, Comment)" + " values (?, ?, ?, ?, ?, ?, ?, ? )";
    			
    			
    			myStmt = myConn.prepareStatement(sql);
    			
    			String check=null;
    			if(cb1.isSelected()== true)  check = "Very Satisfied!";
    			if(cb2.isSelected()== true)  check = "Normal!";
    			if(cb3.isSelected()== true)  check = "Not Satisfied!";
    			
    			String checksb =null;
    			if(sb1.isSelected()== true)  checksb = "Yes";
    			if(sb2.isSelected()== true)  checksb = "No!";
    			
    			
    			String checkpb =null;
    			if(pb1.isSelected()== true)  checkpb = "Definitely!";
    			if(pb2.isSelected()== true)  checkpb = "Not Sure!";
    			if(pb3.isSelected()== true)  checkpb = "Definitely Not!";
    			
    			
    			myStmt.setString(1, getComboAge().getSelectedItem().toString());
    			myStmt.setString(2, fIdTF.getText());
				myStmt.setString(3, getComboVisit().getSelectedItem().toString());
				myStmt.setString(4, getComboPayment().getSelectedItem().toString());
				myStmt.setString(5, checksb);
				myStmt.setString(6, check);				
				myStmt.setString(7, checkpb);
				myStmt.setString(8, getComTF().getText());
				
			
				
				try {
					
					if(fIdTF.getText().isEmpty())
					{
						throw new MatchException("ID Not Fill");
					}
					
					else
					{
						myStmt.executeUpdate();
						JOptionPane.showMessageDialog(null, "Thank For Your Feedback");
						frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
						voucherPoint j2 = new voucherPoint();
						j2.show();
					}
					
				}	
				catch(MatchException a)
				{
					
						JOptionPane.showMessageDialog(null, "Fill In Your ID", "Invalid TextFields", JOptionPane.ERROR_MESSAGE);
	
				}
								
    			
    		}catch (SQLException e2) {
    			JOptionPane.showMessageDialog(null, "Form Not Complete!", "Invalid TextFields", JOptionPane.ERROR_MESSAGE);
    			e2.printStackTrace();
    		} 		
    		 
    	}
			
	}
	
	public static void main(String[] args) {
		new feedbackCustomer();
	}

}
