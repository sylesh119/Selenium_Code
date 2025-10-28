package All_Actions;

import java.util.Scanner;

public class hello {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number:");
		int a = sc.nextInt();
		
		System.out.print("enter 2nd number:");
		int b = sc.nextInt();
		
		int c = a+b;
		
		System.out.println("The sum of "+ a + " and " + b + " is: " + c);
		
		sc.close();
	}

}
