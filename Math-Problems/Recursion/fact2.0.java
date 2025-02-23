A number n is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n.

Examples:

Input: n = 3
Output: 1 2
Explanation: The first factorial number is 1 which is less than equal to n. The second number is 2 which is less than equal to n,but the third factorial number is 6 which is greater than n. So we print only 1 and 2.

Ans:

==========Using recursion=========

import java.util.Scanner;
public class Recusionm {
    int sum=1;
    public int m1(int b){
        if(b==0){
            return b ;
        }
        int c= b*m1(b-1);
        System.out.println(c);
        return c;
    }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
       Recusionm sb=new Recusionm();
        sb.m1(b);
    }

}



================================

import java.util.Scanner;

public class Problemsolving {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        int i=1;
        for(i=1;i<n;i++){
            fact=fact*i;
            if(fact<=n) {
                System.out.print(i+" ");
            }
        }
        // System.out.println(fact);
    }
}


