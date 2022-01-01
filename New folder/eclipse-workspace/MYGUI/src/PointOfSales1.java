

import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;

public class PointOfSales1 {
	
	JFrame frame;
	
	JLabel selectL = new JLabel("Select Item:");
	JLabel quantityL = new JLabel("Quantity:");
	JLabel paymentL = new JLabel("Payment Method:");
	JLabel creditNumL = new JLabel("Credit Card Number:");
	String[] choices = {"Visa", "Master Card"};
	
	JTextField creditNumTF = new JTextField();
	
	JButton DoneBtn = new JButton ("Done!");
	
	JComboBox combo =  new JComboBox(choices);	
	JTextField quantityTF = new JTextField();
	
	
	JCheckBox cb1 = new JCheckBox("Crunchy Combo 1 - RM19.70");
	JCheckBox cb2 = new JCheckBox("Hot VarietyBox - RM28.28");
	JCheckBox cb3 = new JCheckBox("Hot Power Meal 2 - RM53.90");
	JCheckBox cb4 = new JCheckBox("Crunchy Combo 2 - RM26.90");
	JCheckBox cb5 = new JCheckBox("Hot Power Meal 1 - RM22.90");
	
	
	
	PointOfSales1(){
		
		createGUI();
		frameComponent();
		locationSize();
	}
	
	public void createGUI() {
		
		 frame = new JFrame();
		 frame.setTitle("Point Of Sales");
		 frame.setSize(600,400);
		 frame.getContentPane().setLayout(null);
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setResizable(false);
		 combo.setSelectedIndex(1);
		 
		 
		
	}
	
	public void locationSize() {
		
		selectL.setBounds(50,50,200,30);
		
		cb1.setBounds(150,15,200,30);
		cb2.setBounds(150,45,200,30);
		cb3.setBounds(150,70,200,30);
		cb4.setBounds(370,15,200,30);
		cb5.setBounds(370,45,200,30);
		
		quantityL.setBounds(50,130,200,30);
		paymentL.setBounds(50,180,200,30);
		creditNumL.setBounds(50,230,200,30);
		
		combo.setBounds(280,180,200,30);
		
		quantityTF.setBounds(280,130,200,30);
		creditNumTF.setBounds(280,230,200,30);
		
		DoneBtn.setBounds(280,280,200,30);
		
	}
	
	public void frameComponent() {
		
		frame.add(selectL);
		frame.add(cb1);
		frame.add(cb2);
		frame.add(cb3);
		frame.add(cb4);
		frame.add(cb5);
		
		frame.add(quantityL);
		frame.add(paymentL);
		frame.add(creditNumL);
		
		frame.add(combo);
		
		frame.add(quantityTF);
		frame.add(creditNumTF);
		
		frame.add(DoneBtn);
		
	}

	public static void main(String[] args) {
		
		PointOfSales1 salesPoint = new PointOfSales1();

	}

}

