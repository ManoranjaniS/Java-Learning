to add 2 values using bit manipulation



import java.util.Scanner;

public class Bitmanipulations {

   public  static  void  main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
      while(m!=0){
          int c=n&m;
          System.out.println(c);
          n=n^m;
          System.out.println(n);
          m=c<<1;
          System.out.println(m);
      }
       System.out.println(n);
    }


}
