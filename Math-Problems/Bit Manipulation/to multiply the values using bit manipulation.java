to multiply the values using bit manipulation


import java.util.Scanner;

public class Bitmanipulations {

   public  static  void  main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
      int res=0;
      while(m>0){
          if((m&1)==1){
              res+=n;
          }

          n<<=1;//increse
          m>>=1;//decrese
      }
       System.out.println(res);
    }


}
