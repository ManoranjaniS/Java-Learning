to print as 16->8->4->2->1->5 if the n is even then n/2;3n/2
Ans:
import java.util.Scanner;
public class Sc1 {
    public static void main(String args[]){
        int a=5;
        int c=0;
        while(a>1){
            if(a%2==0){
                a=a/2;
               // a++;
            }
            else {
                a=3*a+1;
               // a++;
            }
            c++;
            System.out.print(a+"->");
        }
        System.out.println(c);
    }

}
