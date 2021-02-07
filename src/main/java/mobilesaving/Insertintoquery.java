package mobilesaving;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertintoquery {
	
	public void save (mobile m) {
		
		try {
			Class.forName("java.sql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relation", "root1" , "root1");
			
			PreparedStatement ps = con.prepareStatement("insert into mobile(mnumber,msim) values (? ,?)");
			
			ps.setString(1, m.getNumber());
			ps.setString(2, m.getSim());
			
			ps.executeUpdate();
			
			ps.close();
			con.close();
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		
	}
	
	

}
