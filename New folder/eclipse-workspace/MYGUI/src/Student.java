import javax.swing.*;
import java.awt.GridLayout;

public class Student {
	
	private JFrame frame;
	private JLabel studentL, nameL, matrixL;
	private JTextField nameTF, matricTF;
	private JButton submitBtn, resetBtn;
	private JPanel centerP, southP;
	
	Student(){
		
		frame = new Frame ("First Gui");
		frame.setSize(400,200);
		init();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	void init() {
		
		centerP = new JPanel();
		centerP.setLayout(new GridLayout(2,2));
		
		southP = new JPanel();
		
		studentL = new JLabel("Student");
		
		frame.add(studentL);
		
		nameL = new JLabel("Name");
		centerP.addAncestorListener(nameL);
		
		nameTF = new JTextField(30);
		centerP.addAncestorListener(nameTF);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student gui = new Student();

	}

}
