
Binary Number Triangle Pattern

1
01
101


import java.util.Scanner;

public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outerloop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0"+" ");
                } else {
                    System.out.print("1"+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
