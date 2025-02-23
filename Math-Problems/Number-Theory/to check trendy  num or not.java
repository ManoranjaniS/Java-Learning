to check trendy  num or not
Ans:

import java.util.Scanner;
public class Trendy1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if( a>=99 && a<999){
            int rem=a%100;
            rem=(a%100)/10;
            if(rem%3==0){
                System.out.println("trendy");
            }
            else{
                System.out.println("not trendy");
            }
        }
        else{
            System.out.println("no");
        }

    }

}