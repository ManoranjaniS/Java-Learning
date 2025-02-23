to check automorphic or not
Ans:
import java.math.*;
public class Automorphic {
    public static void main(String args[]){
        int a=5;
        int count=0;
        for(int i=a;i>0;i=i/10){
            count++;
        }
        int s= (int) Math.pow(a,count);
        int flag=1;
        while(a>0){
            if(a%10!=s%10){
                flag=0;
                System.out.println("no");
                break;
            }
           a=a/10;
            s=s/10;
        }
        if(flag==1){
            System.out.println("a");
        }
    }
}
