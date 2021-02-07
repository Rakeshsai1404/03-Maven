package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class joinquery {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("please enter a name");
		
		String name = sca.nextLine();
		
		try {
			
			Class.forName("java.sql.Driver");
				
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relation", "root1" , "root1");
			  
			PreparedStatement ps =
	con.prepareStatement("select * from person p join passport ppt on p.pid = ppt.fkpid where pname = ? ");
			 
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				System.out.println("passport number of " + name + "  is ==");
				//System.out.println(rs.getString("p.pname"));
				System.out.println(rs.getString("ppt.ptnumber"));
			}else{
				
				System.out.println("given user has no passport");
				
			}
			  
			  
			 			
		} catch (Exception e) {
			
			e.printStackTrace();
		}


	}

}
