Fibonacci series using recur


Ans:
======

import java.util.Scanner;
public class Recusionm {

  int fib=1;
  int c=0;
    public int m1(int b){
        if(b<=1){
            return b;
        }
        int co=m1(b-1)+m1(b-2);
        System.out.println(co);
        return co;
    }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
       Recusionm sb=new Recusionm();
        sb.m1(b);
    }

}