Recusion
========

Print GFG n times without the loop.



Ans:


import java.util.Scanner;

public class Problemsolving {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int val=sc.nextInt();
    int i=1;
   public  void c(){
        if(i>val){
            return;
        }
       System.out.println(n);
        i++;
        c();


   }


    public static void main(String args[]) {
              Problemsolving p = new Problemsolving();
              p.c();

    }
}