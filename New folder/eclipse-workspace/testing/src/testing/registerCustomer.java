package testing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class registerCustomer extends registerForm implements ActionListener{
	
	JLabel membershipL = new JLabel("Membership ID:");
	JLabel addressL = new JLabel("Address:");
	
	private JTextField membershipTF = new JTextField();
	private JTextField addressTF = new JTextField("");
	private JTextField rolesTF = new JTextField("customer");
	
	
	public registerCustomer()
	{
		super();
		setCustLocation();
		addCustCTF();
		actionCustEv();
		 
	}
	
	public void setCustLocation()
	{
		
		setLocationAndSize();
		addComponentsToFrame();
	}
	
	public void addCustCTF()
	{
		
		membershipL.setBounds(100,288,200,50);
		addressL.setBounds(100,315,200,50);
		
		membershipTF.setBounds(230,303,165,23);
		addressTF.setBounds(230,335,165,23);
		
		rolesTF.setBounds(200,330,165,23);
	}
	
	public void actionCustEv()
	{
		frame.add(membershipL);
		frame.add(addressL);
		frame.add(membershipTF);
		frame.add(addressTF);
		
	}
	
	
	
	public JTextField getMembershipTF() {
		return membershipTF;
	}

	public void setMembershipTF(JTextField membershipTF) {
		this.membershipTF = membershipTF;
	}

	public JTextField getAddressTF() {
		return addressTF;
	}

	public void setAddressTF(JTextField addressTF) {
		this.addressTF = addressTF;
	}

	public JTextField getRolesTF() {
		return rolesTF;
	}

	public void setRolesTF(JTextField rolesTF) {
		this.rolesTF = rolesTF;
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==registerButton)
		{
			try 
			{
				Connection myConn = null;
				PreparedStatement myStmt = null;
				
				myConn = DriverManager.getConnection("jdbc:mysql://localhost/smfs?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
				
				String sql = "insert into register " + " (first_name, last_name, userName, userPassword, noPhone, gender, userID, address, roles)" + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
						
				myStmt = myConn.prepareStatement(sql);
				
				 
			
				// set param values
				myStmt.setString(1, firstNameTextField.getText());
				myStmt.setString(2, LastNameTextField.getText());
				myStmt.setString(3, userNameTextField.getText());
				myStmt.setString(4, passwordField.getText());
				myStmt.setString(5, noPhoneTF.getText());
				myStmt.setString(6, userGenTF.getText());
				myStmt.setString(7, membershipTF.getText());
				myStmt.setString(8, addressTF.getText());
				myStmt.setString(9, rolesTF.getText());
				
				try {
					
					if(userNameTextField.getText().isEmpty())
					{
						throw new MatchException("Username Not Fill");
					}
					if(!passwordField.getText().equalsIgnoreCase(confirmPasswordField.getText()))
					{
						throw new MatchException("Password Not Match");
					}
					else
					{
						myStmt.executeUpdate();
						JOptionPane.showMessageDialog(null,"Data Registered Successfully", "Login Succesfull", 1);
					}
					
				}	
				catch(MatchException a)
				{
					if(userNameTextField.getText().isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please Fill Username", "Invalid TextFields", JOptionPane.ERROR_MESSAGE);
					}
					if(!passwordField.getText().equalsIgnoreCase(confirmPasswordField.getText()))
					{
						JOptionPane.showMessageDialog(null, "Password Not Same", "Invalid TextFields", JOptionPane.ERROR_MESSAGE);
					}
					
				}
				
				
		
				
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		if(e.getSource()==resetButton)
		{
			firstNameTextField.setText("");
			LastNameTextField.setText("");
			userNameTextField.setText("");
			passwordField.setText("");
			confirmPasswordField.setText("");
			noPhoneTF.setText("");
			userGenTF.setText("");
			membershipTF.setText("");
			addressTF.setText("");
		}
		if(e.getSource()==loginButton)
		{
			new userLogin();
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		 
		} 
	}
		
		
	
	
	
	public static void main(String[] args) {
		new registerCustomer();
	}

}
