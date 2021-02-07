package personsaving;

import java.util.Scanner;

public class userinput {
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("enter user name");
		
		String name = sca.nextLine();
		
		System.out.println("enter age");
		
		int age = Integer.parseInt( sca.nextLine());
		
		System.out.println("enter salary");
		
		int salary =Integer.parseInt(sca.nextLine());
		
		System.out.println("enter qualification");
		
		String qual = sca.nextLine();
		
		savestudent sd = new savestudent();
		
		person p = new person();
		
		p.setName(name);
		p.setAge(age);
		p.setQual(qual);
		p.setSalary(salary);
		
		
		sd.save(p);
		
		System.out.println("done");
		
		
		
	}

}
