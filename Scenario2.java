ask a user for their birth year encoded as two integers or digits ,like 62 for the current year two digits .to calculate the current age in centuary and same year.
Ans:
import java.util.Scanner;
public class Profiit_or_loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          float a=sc.nextFloat();
          float b=sc.nextFloat();
          float c=b*12;//1 dozen
          if(a>c) {
        	  System.out.printf("%.2f   loss",a-c);
          }
          else {
        	  System.out.println("profit");
          }
	}

}