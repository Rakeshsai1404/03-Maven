package personsaving;

import java.util.Scanner;

public class GetstudentById {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("please enter id ");
		
		int id = Integer.parseInt( sca.nextLine());
		
		GetStudentfromDb gd = new GetStudentfromDb();
		
		person ps = gd.saveperson(id);
		
		System.out.println(ps.getName());
		System.out.println(ps.getAge());
		System.out.println(ps.getQual());
		System.out.println(ps.getSalary());

	}

}
