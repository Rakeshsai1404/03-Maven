package coursesaving;

import java.util.Scanner;

public class courseinput {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner (System.in);
		
		System.out.println("please enter course name");
		
		String cname = sca.nextLine();
		
		System.out.println("please enter duration");
		
		int duration = Integer.parseInt(sca.nextLine());
		
		course c= new course();
		
		c.setCourse(cname);
		
		c.setDuration(duration);
		
		insertinto in = new insertinto();
		
		in.save(c);
		
		System.out.println("done");
		
	}

}
