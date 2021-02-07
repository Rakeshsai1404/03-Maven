package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// program for reading the data

public class test3 {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("java.sql.Driver");
				
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relation", "root1" , "root1");
			  
			PreparedStatement ps =con.prepareStatement("select * from person ");
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()) {
			  
			int id 		=	rs.getInt("pid");
			String name =	rs.getString("pname");
			int age 	=	rs.getInt("page");
			String qual =	rs.getString("pqual");
			int salary 	=	rs.getInt("psalary");
				
				System.out.println(id);
				System.out.println(name);
				System.out.println(age);
				System.out.println(qual);
				System.out.println(salary);
				System.out.println("===============");
			}
			
			   rs.close();
			   ps.close();
			   con.close();
			 			
		} catch (Exception e) {
			
			e.printStackTrace();
		}


	}

}
