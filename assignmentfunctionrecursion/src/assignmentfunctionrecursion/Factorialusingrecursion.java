package assignmentfunctionrecursion;
import java.util.Scanner;
public class Factorialusingrecursion {
	static int factorial(int n)
	{
	if(n!=0)
		return n*factorial(n-1);
	return 1;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter no");
int n=s.nextInt();
System.out.println("factorial is"+factorial(n));
	}

}
