to find the left mostbvalue
Ans:
import java.util.Scanner;

public class LeftMost {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>=9){
           a= a/10;//1234
            System.out.println(a);
        }

    }
}
