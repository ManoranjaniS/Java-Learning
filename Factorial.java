Factorial
ans:
/import javax.swing.*;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int fact=1;
      int i=1;
      while(i<=a){
          fact=fact*i;
          i++;
      }
      System.out.println(fact);
    }

}