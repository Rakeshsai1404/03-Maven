package passportsaving;

import java.util.Scanner;

public class userinput {
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("please enter ptnumber");
		
		int  number = Integer.parseInt(sca.nextLine());
		
		System.out.println("please enter expiry date");
		
		String expdat = sca.nextLine();
		
		insertintoquery is = new insertintoquery();
		
		passport pt = new passport();
		
		pt.setPptnumber(number);
		
		pt.setPexpdat(expdat);
		
		is.save(pt);
		
		System.out.println("done");
		
		
		
		
	}

}
