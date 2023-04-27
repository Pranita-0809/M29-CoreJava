//program for user input
package userinptdemo;
import java.util.Scanner;
public class UserInputProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your salary");
		float salary=s.nextFloat();	
		System.out.println("enter name");
        String name=s.next();
      s.nextLine();
        System.out.println("enter name1");
        String name1=s.nextLine();
		System.out.println("enter char");
        char ch=s.next().charAt(0);
		System.out.println("salary is"+salary);
		System.out.println("name is" +name);
		System.out.println("name1 is" +name1);
		System.out.println("characyer is" +ch);
		s.close();

	}

}
