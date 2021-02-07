package passportsaving;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertintoquery {
	
	public void save(passport ppt) {
		
		try {
			Class.forName("java.sql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relation", "root1" , "root1");
			
			PreparedStatement ps = con.prepareStatement("insert into passport(ptnumber, pexpirydate) values(? ,?)");
			
			ps.setInt(1,ppt.getPptnumber());
			
			ps.setString(2, ppt.getPexpdat());
			
			ps.executeUpdate();
			
			ps.close();
			
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
