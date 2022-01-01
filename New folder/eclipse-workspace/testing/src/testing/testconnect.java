package testing;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class testconnect{
	 public static void main(String args[]) {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn = null;
	            conn = DriverManager.getConnection("jdbc:mysql://localhost/javatest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	            //conn = DriverManager.getConnection("jdbc:mysql://,"root,");
	            System.out.print("Database is connected !");
	            conn.close();
	        }
	        catch(Exception e) {
	            System.out.print("Do not connect to DB - Error:"+e);
	        }
	        
	       
	       
	    }
	
}
