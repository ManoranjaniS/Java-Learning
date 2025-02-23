
Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.

Examples:

Input: n = 5
Output: 225
Explanation: 13 + 23 + 33 + 43 + 53 = 225
Input: n = 7
Output: 784
Explanation: 13 + 23 + 33 + 43 + 53 + 63 + 73 = 784

===================================
By using recusion

Ans:

import java.util.Scanner;

public class Problemsolving {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i=1;
    int val=0;
    public void c(){
        if(i>n){
            return;
        }

        int cube=i*i*i;
        val+=cube;
        i++;
        if(i>n){
            System.out.println(val);
        }
        c();

        //return cube;
    }

    public static void main(String args[]) {
        Problemsolving p = new Problemsolving();
        p.c();

    }
}
====================================
Without Using recusion

Ans:

import java.util.Scanner;

public class Problemsolving {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val=0;
         for(int i=1;i<=n;i++){
             int cube=i*i*i;
             val+=cube;
             if(i>n){
                 break;
             }
         }
        System.out.println(val);
    }
}