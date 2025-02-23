to swap using bit manipulation


import java.util.Scanner;

public class Bitmanipulations {

   public  static  void  main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       System.out.println("Before"+ n+ m);
       n=n^m;
       m=m^n;
       n=n^m;
       System.out.println("After "+n+ m);
    }


}
