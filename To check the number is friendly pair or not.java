To check the number is friendly pair or not
Ans:
import java.util.Scanner;

public class Abudant {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum1=0;

        int sum2=0;
        int tem=a;
        for(int i=1;i<a;i++){
           if(a%i==0) {
               sum1 += a;
           }
        }
        for(int i=1;i<b;i++){
            if(b%i==0){
                sum2+=b;
            }
        }
        if((sum1%a==0) && (sum2%b==0)){

            System.out.println("Friendly pair");
        }
        else{
            System.out.println("No");
        }

    }
}
