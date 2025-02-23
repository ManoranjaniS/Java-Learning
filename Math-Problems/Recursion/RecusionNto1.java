
Recusion


Print numbers from N to 1 (space separated) without the help of loops.

Example 1:

Input:
N = 10
Output: 10 9 8 7 6 5 4 3 2 1

Ans:


import java.util.Scanner;

public class Problemsolving {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i=n;
    public void c(){
        if(i>n || i<0){
            return;
        }
        System.out.print(i+" ");
        i=i-1;
        c();


    }

    public static void main(String args[]) {
        Problemsolving p = new Problemsolving();
        p.c();

    }
}