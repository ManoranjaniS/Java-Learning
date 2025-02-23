Diamond Star Pattern


  *  
 ***
***** 
*****  
 ***
  * 

Ans:

import java.util.Scanner;

public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outerloop
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
           for(int j=1;j<=2*(n-i)-1;j++){
               System.out.print("*");
           }
            System.out.println();
        }


    }
}
