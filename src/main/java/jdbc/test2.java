package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// program for updating the data.


public class test2 {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("java.sql.Driver");
				
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relation", "root1" , "root1");
			  
			PreparedStatement ps =
					con.prepareStatement("UPDATE PERSON SET pname = ? where pid = ?");
			  
			  ps.setString(1, "BABU.MD"); 
			  ps.setInt(2, 5); 
				/*
				 * ps.setInt(3, 24); ps.setString(4, "EngineerING ASSISTANT"); ps.setInt(5,
				 * 15000);
				 */
			  ps.executeUpdate();
			  
			  System.out.println("done");
			 			
		} catch (Exception e) {
			
			e.printStackTrace();
		}


	}

}
