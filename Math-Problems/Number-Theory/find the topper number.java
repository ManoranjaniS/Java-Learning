find the topper number
import java.util.Scanner;
public class TopperNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          int rem;
          int s=0;
          int o=0;
          while(n>0){
              rem=n%10;//7126
              if(rem%2==1) {
                  s += rem;
              }
              if(rem%2==0){
                  o+=rem;
              }
              n=n/10;
          }
          if(s==o){
              System.out.println("Topper");
          }
          else{
              System.out.println("no");
          }
    }

}
