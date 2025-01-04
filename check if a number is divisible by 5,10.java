check if a number is divisible by 5 and 10.
Ans:
import java.util.Scanner;

public class Looping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a num");
         int a=sc.nextInt();
         if(a%5==0 && a%10==0) {
        	 System.out.println("It is divisible");
         }
         else {
        	 System.out.println("It is not divisible");
         }
	}

}
