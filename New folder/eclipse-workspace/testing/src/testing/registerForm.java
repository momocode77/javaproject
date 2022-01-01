package testing;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public abstract class registerForm implements ActionListener{
	
	//private static JLabel custRoles;
	//private static JTextField rolesTF;
	JFrame frame;
	
	JLabel titleL = new JLabel("Welcome To Mall Feedback System!");
	private JLabel firstNameLabel = new JLabel("Your First Name:");
	private JLabel LastNameLabel = new JLabel("Your Last Name:");		
	private JLabel userNameLabel = new JLabel("Username:");
	private JLabel passwordLabel = new JLabel("Password:");
	private JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
	private JLabel noPhoneL = new JLabel("Your Number Phone:");
	private JLabel	userGenL = new JLabel("Your Gender:");
	
	protected JTextField firstNameTextField = new JTextField();
	protected JTextField LastNameTextField = new JTextField();
	protected JTextField userNameTextField = new JTextField();
	protected JPasswordField passwordField = new JPasswordField();
	protected JPasswordField confirmPasswordField=new JPasswordField();
	protected JTextField noPhoneTF = new JTextField();
	protected JTextField userGenTF = new JTextField();
	

	JButton registerButton = new JButton ("Register");
	JButton resetButton = new JButton ("Reset");
	JButton loginButton = new JButton ("Login");
	
	public registerForm()
	{
		//super(custRoles, rolesTF);
		createWindow();
		setLocationAndSize();
		addComponentsToFrame();
		actionEvent();
	}
	
	public void createWindow()
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
	
	public void setLocationAndSize()
	{
		titleL.setBounds(103,30,400,30);
		firstNameLabel.setBounds(100,84,200,30);
		LastNameLabel.setBounds(100,114,200,30);
		userNameLabel.setBounds(100,144,200,30);
		passwordLabel.setBounds(100,174,200,30);
		confirmPasswordLabel.setBounds(100,194,200,50);
		noPhoneL.setBounds(100,227,200,50);
		userGenL.setBounds(100,258,200,50);
		
		firstNameTextField.setBounds(230,88,165,23);
		LastNameTextField.setBounds(230,118,165,23);
		userNameTextField.setBounds(230,148,165,23);
		passwordField.setBounds(230,178,165,23);
		confirmPasswordField.setBounds(230,209,165,23);
		noPhoneTF.setBounds(230,240,165,23);
		userGenTF.setBounds(230,271,165,23);
		
		registerButton.setBounds(165,418,205,35);
        resetButton.setBounds(270,380,100,35);
        loginButton.setBounds(165,380,100,35);
        
        titleL.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		
	}
	
	public void addComponentsToFrame()
	{
		frame.add(titleL);
		frame.add(firstNameLabel);
		frame.add(LastNameLabel);
		frame.add(userNameLabel);
		frame.add(passwordLabel);
		frame.add(confirmPasswordLabel);
		frame.add(noPhoneL);
		frame.add(userGenL);
		
		frame.add(firstNameTextField);
		frame.add(LastNameTextField);
		frame.add(userNameTextField);
		frame.add(passwordField);
		frame.add(confirmPasswordField);
		frame.add(noPhoneTF);
		frame.add(userGenTF);
		
		frame.add(registerButton);
		frame.add(resetButton);
		frame.add(loginButton);
		
		
	}
	
	public void actionEvent()
    {
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
        loginButton.addActionListener(this);
        
    }
	
	
	
	public JLabel getFirstNameLabel() {
		return firstNameLabel;
	}

	public void setFirstNameLabel(JLabel firstNameLabel) {
		this.firstNameLabel = firstNameLabel;
	}

	public JLabel getLastNameLabel() {
		return LastNameLabel;
	}

	public void setLastNameLabel(JLabel lastNameLabel) {
		LastNameLabel = lastNameLabel;
	}

	public JLabel getUserNameLabel() {
		return userNameLabel;
	}

	public void setUserNameLabel(JLabel userNameLabel) {
		this.userNameLabel = userNameLabel;
	}

	public JLabel getPasswordLabel() {
		return passwordLabel;
	}

	public void setPasswordLabel(JLabel passwordLabel) {
		this.passwordLabel = passwordLabel;
	}

	public JLabel getConfirmPasswordLabel() {
		return confirmPasswordLabel;
	}

	public void setConfirmPasswordLabel(JLabel confirmPasswordLabel) {
		this.confirmPasswordLabel = confirmPasswordLabel;
	}

	public JLabel getNoPhoneL() {
		return noPhoneL;
	}

	public void setNoPhoneL(JLabel noPhoneL) {
		this.noPhoneL = noPhoneL;
	}

	public JLabel getUserGenL() {
		return userGenL;
	}

	public void setUserGenL(JLabel userGenL) {
		this.userGenL = userGenL;
	}

	public JTextField getFirstNameTextField() {
		return firstNameTextField;
	}

	public void setFirstNameTextField(JTextField firstNameTextField) {
		this.firstNameTextField = firstNameTextField;
	}

	public JTextField getLastNameTextField() {
		return LastNameTextField;
	}

	public void setLastNameTextField(JTextField lastNameTextField) {
		LastNameTextField = lastNameTextField;
	}

	public JTextField getUserNameTextField() {
		return userNameTextField;
	}

	public void setUserNameTextField(JTextField userNameTextField) {
		this.userNameTextField = userNameTextField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JPasswordField getConfirmPasswordField() {
		return confirmPasswordField;
	}

	public void setConfirmPasswordField(JPasswordField confirmPasswordField) {
		this.confirmPasswordField = confirmPasswordField;
	}

	public JTextField getNoPhoneTF() {
		return noPhoneTF;
	}

	public void setNoPhoneTF(JTextField noPhoneTF) {
		this.noPhoneTF = noPhoneTF;
	}

	public JTextField getUserGenTF() {
		return userGenTF;
	}

	public void setUserGenTF(JTextField userGenTF) {
		this.userGenTF = userGenTF;
	}
	 


}
