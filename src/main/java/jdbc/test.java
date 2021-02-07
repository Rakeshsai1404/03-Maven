package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//program for inserting data into table.

public class test {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
				
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relation", "root1" , "root1");
			  
			PreparedStatement ps =
					con.prepareStatement("insert into person values(?,?,?,?,?)");
			  
			  ps.setInt(1, 9); 
			  ps.setString(2, "RADHAKRISHNA.G"); 
			  ps.setInt(3, 24);
			  ps.setString(4, "EngineerING ASSISTANT");
			  ps.setInt(5, 15000);
			  
			  ps.executeUpdate();
			  
			  System.out.println("done");
			 			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
