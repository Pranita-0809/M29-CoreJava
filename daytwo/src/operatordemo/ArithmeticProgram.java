package operatordemo;

import java.util.Scanner;

public class ArithmeticProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
				System.out.println("add two numbers"+(x+y));
		System.out.println("sub two numbers"+(x-y));
		
		System.out.println("add two numbers"+(x*y));
		
		System.out.println("div two numbers"+(x/y));
		
		System.out.println("mod two numbers"+(x%y));
		
		
	}

}
