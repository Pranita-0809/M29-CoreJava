package assignmentfunctionrecursion;
import java.util.Scanner;
public class additiondemo {
	//formal variable x&y
	static void addition (int x,int y) {
	//we can write a &b its actaual var 
		int sum =x+y;
System.out.println("the sum is "+sum);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of x and y");
		int y=s.nextInt();
		int x=s.nextInt();
	addition(x,y);
	
		//System.out.println(addition(x,y));

		// TODO Auto-generated method stub

	}
}

