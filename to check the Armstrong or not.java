to check the Armstrong or not
Ans:
import java.util.*;
import java.math.*;
public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //int a=sc.nextInt();
        int a =153;
        int temp=a;
        int count=0;
        int s=0;
       for(int i=a;i>0;i=i/10){
           count++;
       }
            while(a>0){
                int rem=a%10;
                s= (int) (s+Math.pow(rem,count));
               // int cube1 = cube;
                a=a/10;
            }

        if(s==temp){
            System.out.println("armstrong");
        }
        else{
            System.out.println("no");
        }
    }
}
