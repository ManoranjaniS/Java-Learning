Right-Angled Number Pyramid - II

Input Format: N = 3
Result: 
1
2 2 
3 3 3

Ans:


import java.util.Scanner;

public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outerloop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}
