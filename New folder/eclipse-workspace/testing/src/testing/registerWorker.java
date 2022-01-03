package testing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class registerWorker extends registerForm implements ActionListener{
	
	JLabel fL = new JLabel("Staff ID:");
	JLabel deptL = new JLabel("Department:");
	
	private JTextField fTF = new JTextField();
	private JTextField deptTF = new JTextField();
	private JTextField rolesTF = new JTextField("staff");
	
	
	public registerWorker()
	{
		super();
		setLocation();
		addCTF();
		actionEv();
		actEvent();
	}
	
	public void setLocation()
	{
		
		setLocationAndSize();
		addComponentsToFrame();
	}
	
	public void addCTF()
	{
		
		fL.setBounds(100,288,200,50);
		deptL.setBounds(100,315,200,50);
		
		fTF.setBounds(230,303,165,23);
		deptTF.setBounds(230,335,165,23);
	}
	
	public void actionEv()
	{
		frame.add(fL);
		frame.add(deptL);
		frame.add(fTF);
		frame.add(deptTF);
	}
	
	public void actEvent()
	{
		actionEvent();
	}
	
	
	
	public JTextField getfTF() {
		return fTF;
	}

	public void setfTF(JTextField fTF) {
		this.fTF = fTF;
	}

	public JTextField getDeptTF() {
		return deptTF;
	}

	public void setDeptTF(JTextField deptTF) {
		this.deptTF = deptTF;
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
				
				String sql = "insert into register " + " (first_name, last_name, userName, userPassword, noPhone, gender, workID, department, roles)" + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
				
				myStmt = myConn.prepareStatement(sql);
			
				// set param values
				myStmt.setString(1, firstNameTextField.getText());
				myStmt.setString(2, LastNameTextField.getText());
				myStmt.setString(3, userNameTextField.getText());
				myStmt.setString(4, passwordField.getText());
				myStmt.setString(5, noPhoneTF.getText());
				myStmt.setString(6, userGenTF.getText());
				myStmt.setString(7, fTF.getText());
				myStmt.setString(8, deptTF.getText());
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
		if(e.getActionCommand().equals("Login"))
    	{
    		 	        	 
    		new userLogin(); 
    		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    		         		 
    	}
		if(e.getSource()==resetButton)
		{
			passwordField.setText("");
			confirmPasswordField.setText("");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new registerWorker();
	}

}
