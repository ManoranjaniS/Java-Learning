to minus 2 values


import java.util.Scanner;

public class Bitmanipulations {

   public  static  void  main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
      while(m!=0){
          int c=~n&m;
          n=n^m;
          m=c<<1;
          
      }
       System.out.println(n);
    }


}
