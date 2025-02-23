Recursion

Print numbers from 1 to n without the help of loops. You only need to complete the function printNos() that takes n as a parameter and prints the number from 1 to n recursively.

Ans:
import java.util.Scanner;

public class Problemsolving {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i=1;
   public  void c(){
        if(i>n){
              return;
        }
       System.out.println(i);
        i++;
        c();


   }

    public static void main(String args[]) {
              Problemsolving p = new Problemsolving();
              p.c();

    }
}
