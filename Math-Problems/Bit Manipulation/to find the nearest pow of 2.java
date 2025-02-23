to find the nearest pow of 2


import java.util.Scanner;

public class Bitmanipulations {

   public  static  void  main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int pow=1;
      while(pow<=n){
          pow =pow<<1;
          System.out.println(pow);
      }
       System.out.println(pow);
    }


}
