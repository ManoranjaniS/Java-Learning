Fibonacci Number

import java.util.Scanner;
public class Stringhandllying {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int fib=0;
        System.out.print("0 1"+" ");
        for(int i=2;i<n;i++){
            fib=a+b;
            a=b;
            b=fib;
            System.out.print(" "+ fib);
        }

    }
}

