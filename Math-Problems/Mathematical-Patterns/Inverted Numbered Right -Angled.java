Inverted Numbered Right Pyramid


1 2 3
1 2
1

Ans:

import java.util.Scanner;

public class Problemsolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outerloop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}

