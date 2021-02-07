package personsaving;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class savestudent {
	
	public void save(person p) {
		
		try {
			Class.forName("java.sql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relation", "root1" , "root1");
			
			PreparedStatement ps = con.prepareStatement
					("insert into person(pname,page,pqual,psalary) values(?,?,?,?)");
			
			ps.setString(1,p.getName());
			ps.setInt(2,p.getAge() );
			ps.setString(3,p.getQual());
			ps.setInt(4, p.getSalary());
			
			ps.executeUpdate();
			ps.close();
			con.close();
			
		} 
		
		catch (Exception e) {
			
			
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void save(String sname, int sage, int salary, String quali)
	{
	
		try {
			Class.forName("java.sql.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/relation", "root1" , "root1");
			
			PreparedStatement ps = con.prepareStatement
					("insert into person(pname,page,pqual,psalary) values(?,?,?,?)");
			ps.setString(1,sname);
			ps.setInt(2,sage );
			ps.setString(3, quali);
			ps.setInt(4, salary);
			
			ps.executeUpdate();
			ps.close();
			con.close();
			
		} 
		
		catch (Exception e) {
			
			
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
