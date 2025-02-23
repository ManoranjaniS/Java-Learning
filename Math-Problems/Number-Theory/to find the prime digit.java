to find the prime digit
import java.util.Scanner;

public class PrimeDight {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>0){
            a=a%10;//123
            if((a%1==0) &&(a%a==0)){
                System.out.println(a);
            }
            a=a/10;
        }

    }
}
