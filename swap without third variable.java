Ques 3:
Write a java program to get 2 numbers from the user and swap their values without using 3rd variable
Ans:
import java.util.Scanner;

public class Swapping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Before");
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Enter B");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
	    a=a-b;
		System.out.println("After");
		System.out.println(a);
		System.out.println(b);
		
        
	}

}

