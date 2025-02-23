to find the unique element


import java.util.Scanner;

public class Bitmanipulations {

   public  static  void  main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int res=0;
      for(int j:arr){
          res=res^j;
          System.out.print(res);
      }
       System.out.println();
       System.out.println(res);
    }


}