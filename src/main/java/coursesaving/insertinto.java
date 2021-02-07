package coursesaving;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertinto {
	
	//private static Logger logger = Loggerfactory.getLogger(insertinto.class);
	
	public void save(course c) {
		
		Connection con = null ;
		PreparedStatement ps =null;
		
		
		try {
			Class.forName("java.sql.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relation", "root1" , "root1");
			
			ps = con.prepareStatement("insert into course(cname , cduration) values (?,?)");
			
			ps.setString(1, c.getCourse());
			
			ps.setInt(2, c.getDuration());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				con.close();
				ps.close();
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
			
			
		}
		
		
		
		
		
		

	}

}
