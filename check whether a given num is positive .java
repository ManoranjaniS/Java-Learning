check whether a given num is positive or negative or zero
Ans:
import java.util.Scanner;
public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a num");
         int a=sc.nextInt();
         if(a>0) {
        	 System.out.println("Positive");
         }
         else if(a<0) {
        	 System.out.println("Negative");
         }
         else {
        	 System.out.println("zero");
         }
	}

}

