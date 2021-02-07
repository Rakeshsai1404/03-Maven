package mobilesaving;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("please enter mobile number");
		
		String mnumber = sca.nextLine();
		
		System.out.println("please enter sim ");
		
		String sim = sca.nextLine();
		
		Insertintoquery is = new Insertintoquery();
		
		mobile m = new mobile();
		
		m.setNumber(mnumber);
		
		m.setSim(sim);
		
		is.save(m);
		
		System.out.println("done");
		
		
		
		

	}

}
