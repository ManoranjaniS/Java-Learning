Sara wished to build a new house but she didn't have a sufficient amount. So she is planning to borrow some money from the bank on simple Interest. when she is borrowing some money  from the bank, she has to pay back the original amount accompanied by a certain amount of interest on that amount.She wants to find the interest for borrowed money within a certain period. Help her to find the simple interest.
Input: principle amount int
n=int duration
rate=float
Ans:
import java.util.Scanner;

//import.java.util.Scanner;
public class Simple_Interset {
        public static void main(String args[]) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter P");
              int p=sc.nextInt();
          	System.out.println("Enter N");
              int n=sc.nextInt();
          	System.out.println("Enter R");
              double r=sc.nextDouble();
              double res= ((p*n*r)/100);
              System.out.printf("%.2f",res);
              
              
              }
}
