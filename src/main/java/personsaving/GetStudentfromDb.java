package personsaving;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetStudentfromDb {
	
	public person saveperson(int id) {
		
		person p = new person();
		
		try {
			Class.forName("java.sql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relation", "root1" , "root1");
			
			PreparedStatement ps = con.prepareStatement("select * from person where pid = ?");
			
			ps.setInt(1, id);
			
			ResultSet rs =	ps.executeQuery();
			
			if(rs.next()) {
				
				p.setId(rs.getInt("pid"));
				p.setName(rs.getString("pname"));
				p.setAge(rs.getInt("page"));
				p.setQual(rs.getString("pqual"));
				p.setSalary(rs.getInt("psalary"));
			}
			
			rs.close();
			ps.close();
			con.close();
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return p;
	}

}
