

import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class pointOfSales {
	
	JFrame frame;
	JPanel centerP, southP, westP, northP, eastP, optionNorthP;
	JLabel posL, quantityL, paymentL, creditNumL,zeroL;
	JTextField creditNumTF, quantityTF;
	JButton DoneBtn;
	String[] choices = {"Visa", "Master Card"};	
	
	JComboBox combo =  new JComboBox(choices);	
	
	
	JPanel panel = new JPanel();
	JRadioButton cb1 = new JRadioButton("Crunchy Combo 1 - RM19.70");
	JRadioButton cb2 = new JRadioButton("Hot VarietyBox - RM28.28");
	JRadioButton cb3 = new JRadioButton("Hot Power Meal 2 - RM53.90");
	JRadioButton cb4 = new JRadioButton("Crunchy Combo 2 - RM26.90");
	JRadioButton cb5 = new JRadioButton("Hot Power Meal 1 - RM22.90"); 
	
	pointOfSales(){
		
		frame = new JFrame("Point Of Sales");
		frame.setSize(500,400);
		init();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		combo.setSelectedIndex(1);
	}
	
	void init() {
		
		
		
		eastP = new JPanel();
		eastP.setLayout(new GridLayout(4,2));
		
		westP = new JPanel();
		westP.setLayout(new GridLayout (2,1));	
		
		posL = new JLabel("Select Item: ");
		westP.add(posL);
		
		southP = new JPanel();
		southP.setLayout(new GridLayout(5,2));
		
		
		eastP.add(cb1);
		eastP.add(cb2);
		eastP.add(cb3);
		eastP.add(cb4);
		eastP.add(cb5);
		
		DoneBtn = new JButton();
			
		quantityL = new JLabel("Quantity :");
		southP.add(quantityL);
		quantityTF = new JTextField(20);
		southP.add(quantityTF);
		
		paymentL = new JLabel("Payment Method:");
		southP.add(paymentL);
		combo = new JComboBox(choices);
		southP.add(combo);
		
		creditNumL = new JLabel("Select Item:");
		southP.add(creditNumL);
		creditNumTF = new JTextField(20);
		southP.add(creditNumTF);
		zeroL = new JLabel("");
		southP.add(zeroL);
		
		DoneBtn = new JButton("Done!");
		southP.add(DoneBtn);
		
		frame.add(southP, BorderLayout.SOUTH);
		frame.add(eastP, BorderLayout.EAST);
		frame.add(westP, BorderLayout.WEST);
	
	}
		
	

	public static void main(String[] args) {
		
		pointOfSales salesPoint = new pointOfSales();

	}

}

