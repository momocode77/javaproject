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

public class feedbackWorker extends feedback implements ActionListener{
	
	JLabel fIdL = new JLabel("2.Your Staff ID: ");
	JLabel satisL = new JLabel("5.Are You Satisfied With Production Facilities?.");
	JLabel suggestL = new JLabel("6.How Satisfied With Working Environment?");
	JLabel prodL = new JLabel("7.Would You Suggest Our Product To Your Friends or Family?");
	
	JTextField fIdTF = new JTextField();
	
	JCheckBox cb1 = new JCheckBox("Vey Satisfied!");
	JCheckBox cb2 = new JCheckBox("Normal!");
	JCheckBox cb3 = new JCheckBox("Not Satisfied!");
	
	JCheckBox sb1 = new JCheckBox("Yes");
	JCheckBox sb2 = new JCheckBox("No");
	
	JCheckBox pb1 = new JCheckBox("Definitely");
	JCheckBox pb2 = new JCheckBox("Not Sure");
	JCheckBox pb3 = new JCheckBox("Definitely Not");
	
	
	public feedbackWorker()
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
	
public void actionPerformed(ActionEvent e) {
	
		
		
		if (e.getActionCommand().equals("Submit"))
    	{
			
    		try 
    		{
    			Connection myConn = null;
    			PreparedStatement myStmt = null;
    			
    			myConn = DriverManager.getConnection("jdbc:mysql://localhost/smfs?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
    			
    			String sql = "insert into feedbackworker " + " (FeedbackType, staffID, ServiceOption, PaymentMethod, FacilitiesSatisfaction, WorkingEnvirontment, Suggestion, Comment)" + " values (?, ?, ?, ?, ?, ?, ?, ? )";
    			
    			
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
    			
    			
    			myStmt.setString(1, comboAge.getSelectedItem().toString());
    			myStmt.setString(2, fIdTF.getText());
				myStmt.setString(3, comboVisit.getSelectedItem().toString());
				myStmt.setString(4, comboPayment.getSelectedItem().toString());
				myStmt.setString(5, checksb);
				myStmt.setString(6, check);				
				myStmt.setString(7, checkpb);
				myStmt.setString(8, comTF.getText());
				
				boolean isID = false;
				
				
				while(!isID) {
							
						if(!fIdTF.getText().isEmpty())
						{
							
							isID = true;	
							fIdTF.getText().isEmpty();
							myStmt.executeUpdate();
							
							JOptionPane.showMessageDialog(null, "Thank For Your Feedback");
							frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
							voucher j2 = new voucher();
							j2.show();
						}
						if(!isID) {
							JOptionPane.showMessageDialog(null, "Please Enter ID", "Invalid TextFields", JOptionPane.ERROR_MESSAGE);
							break;
						}
					
				}
				
    			
    		}catch (SQLException e2) {
    			e2.printStackTrace();
    		} 		
    		 
    	}
			
	}
	
	public static void main(String[] args) {
		new feedbackWorker();
	}

}
