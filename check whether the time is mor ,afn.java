check whether the time is morning,afternoonor night
Ans:
import java.util.Scanner;
public class Time1 {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the val");
	 double val=sc.nextDouble();
	 if(val<=12 && val>=6 ) {
		 System.out.println("It is a morn");
	 }
	 else {
		 System.out.println("Afn");
	 }
 }
}