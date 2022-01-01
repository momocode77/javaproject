package testing;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class userLogin implements ActionListener {
	
	JFrame frame;
	JLabel titleloginL = new JLabel("Welcome To Mall Feedback System!");
	JLabel welcomeUser = new JLabel("LOGIN SECTION !");
	JLabel userNameLabel = new JLabel("Username:");
	JLabel passwordLabel = new JLabel("Password:");
	
	String[] roleChoice = {"Staff", "Customer"};
	
	JTextField userNameTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	
	JButton registerButton = new JButton ("Login");
	JButton resetButton = new JButton ("Reset");
	JButton backButton = new JButton ("Register Now!");
	
	JComboBox comboRoles =  new JComboBox(roleChoice);
	
	public userLogin()
	{
		logincreateWindow();
		setLoginLocationAndSize();
		addLoginComponentsToFrame();
		loginActionEvent();
	}
	
	public void logincreateWindow()
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
	
	public void setLoginLocationAndSize()
	{
		titleloginL.setBounds(100,50,400,30);
		welcomeUser.setBounds(180,100,200,30);
		userNameLabel.setBounds(100,150,200,30);
		passwordLabel.setBounds(100,200,200,30);
		userNameTextField.setBounds(200,153,165,23);
		passwordField.setBounds(200,200,165,23);
		comboRoles.setBounds(200,240,165,23);
		registerButton.setBounds(130,280,100,35);
        resetButton.setBounds(240,280,100,35);
        backButton.setBounds(130,320,210,35);
        
        
        titleloginL.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
        welcomeUser.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 10));
	}
	
	public void addLoginComponentsToFrame()
	{
		frame.add(titleloginL);
		frame.add(welcomeUser);
		frame.add(userNameLabel);
		frame.add(passwordLabel);
		frame.add(userNameTextField);
		frame.add(passwordField);
		frame.add(registerButton);
		frame.add(resetButton);
		frame.add(backButton);
		frame.add(comboRoles);
		
		
	}
	
	public void loginActionEvent()
    {
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
        backButton.addActionListener(this);
    }
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==registerButton)
		{
			try 
			{
				Connection myConn = null;
				PreparedStatement myStmt = null;
				
				String username = userNameTextField.getText();
				String password = passwordField.getText();
				String roles = comboRoles.getSelectedItem().toString();
				
				myConn = DriverManager.getConnection("jdbc:mysql://localhost/smfs?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			
				String sql = "select * from `register` where `userName` = '"+username+"' AND `userPassword` = '"+password+"' AND `roles` = '"+roles+"'" ;
				
				
				myStmt = myConn.prepareStatement(sql);
				ResultSet resultSet = myStmt.executeQuery(sql);
				
				if(resultSet.next())
				{
					
					if(roles.equals("Customer"))
					{
						JOptionPane.showMessageDialog(null, "Login Successfull", "Login Success", 1);
						new feedbackCustomer();
						frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
						
					}
					if(roles.equals("Staff"))
					{
						JOptionPane.showMessageDialog(null, "Login Successfull", "Login Success", 1);
						new feedbackWorker();
						frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
						 
					}
							
					
                     
				}
				else{
                    JOptionPane.showMessageDialog(null, "Incorrect Username/Password Or Roles", "Login Failed", 2);
                }
		 
				
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource()==resetButton)
		{
			userNameTextField.setText("");
			passwordField.setText("");
		 
		}
		if(e.getSource()==backButton)
		{
			new userInterface();
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		 
		}
		
	}
	
	public static void main(String[] args) {
		new userLogin();
	}
	

}
