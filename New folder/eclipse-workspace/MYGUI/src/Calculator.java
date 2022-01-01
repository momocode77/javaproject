import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;


public class Calculator implements ActionListener{
	
	private JFrame frame;
	private JLabel numoneL, numtwoL, calculatorL;
	private JTextField numoneTF, numtwoTF;
	private JButton addBtn, resetBtn;
	private JPanel centerP, southP;
	
	Calculator(){
		
		frame = new JFrame ("Simple Calculator");
		frame.setSize(400,200);
		init();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	void init() {
		
		centerP = new JPanel();
		centerP.setLayout(new GridLayout(2,2));
		
		southP = new JPanel();
		addBtn = new JButton();
		resetBtn = new JButton();
		
		
		calculatorL = new JLabel("Simple Calculator");
		
		frame.add(calculatorL);
		
		numoneL = new JLabel("First Number");
		centerP.add(numoneL);
		
		numoneTF = new JTextField(20);
		centerP.add(numoneTF);
		
		numtwoL = new JLabel("Second Number");
		centerP.add(numtwoL);
	
		numtwoTF = new JTextField(20);
		centerP.add(numtwoTF);
		
		addBtn = new JButton("Add");
		addBtn.addActionListener(this);
		southP.add(addBtn);
		
		resetBtn = new JButton("Reset");
		resetBtn.addActionListener(this);
		southP.add(resetBtn);
		
		frame.add(centerP, BorderLayout.CENTER);
		frame.add(southP, BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();

	}
	
	public void actionPerformed(ActionEvent e) {
		
		double numOne = Double.parseDouble(numoneTF.getText());
		double numTwo = Double.parseDouble(numtwoTF.getText());
		double total = numOne + numTwo;
		
		if(e.getActionCommand().equals("Add")) {
			JOptionPane.showMessageDialog(null,"Total: " +total);
		}
		
		else if (e.getActionCommand().equals("Reset")) {
			numoneTF.setText(null);
			numtwoTF.setText(null);
		}else {
			System.exit(0);
		}
	}
	

}
