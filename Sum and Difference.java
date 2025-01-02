Ques1
 Write a java program to get 2 numbers from the user and calculate their sum and difference using '+'  and '-' operators respectively.Print the corresponding sum and differnce of the numbers as output in the console
Ans:
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("A=");
    	int a=sc.nextInt();
      	System.out.println("B= ");
    	int b=sc.nextInt();
    	int sum=a+b;
    	int diff=a-b;
    	System.out.println(sum);
    	System.out.println(diff);
       
    }
}
 