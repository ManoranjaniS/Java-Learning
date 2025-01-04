A fruit seeler buys a dozen of banana at Rs X .he sells 1 banana at rs Y.write aprogram to determine profit or loss in rs for the fruit seller;
Input:
2 floting 
total cost,sold cost
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