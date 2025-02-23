to check the given value is even or odd
Ans:
import java.util.Scanner;

public class TocheckEven {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         int sum;
         int flag=0;
        while(a>0){
            int rem=a%10;//124213
            if(rem%2==0){
                a=a/10;
                flag=0;
            }
            else{
                flag=1;
                System.out.println("odd");
                break;

            }

        }
        if(flag==0){
            System.out.println("even");
        }

    }
}