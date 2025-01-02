Oues2:
Write a java program to get 2 numbers from the user and swap their values without any loss of data
Ans:
import java.util. Scanner;
public class Second {
  public static void main (String args[]) {
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter A ");
	  int a=sc.nextInt();
	  System.out.println("Enter B");
	  int b=sc.nextInt();
	  System.out.println("Before SWapping");
	  System.out.println(a);
	  System.out.println(b);
	  int temp=a;
	  a=b;
	  b=temp;
	  System.out.println("After Swapping");
	  System.out.println(a);
	  System.out.println(b);
	  
	  
  }
}
