base with power using recusion


import java.util.Scanner;
public class Recusionm {

int val1(int b) {
    if(b==0){
        return 0 ;
    }
    int x= (int)Math.pow(2,b);
    System.out.println(x);
    return x;

}
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int b=sc.nextInt();
       Recusionm sb=new Recusionm();
      // int rev=0;
        sb.val1(b);
    }

}
