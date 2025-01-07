  to check Strong num or not
Ans:
import java.util.Scanner;
public class Strong_Num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();

        int n=145;
        int s = 0;
        int temp = n;
        //int rem = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            int i = 1;
            int fact = 1;

            while (i <= rem) {
                fact = fact * i;
                i++;
            }
            s = s + fact;
            n = n / 10;
        }

        if (s == temp) {
            System.out.println("strong");
        } else {
            System.out.println("Not strong");
        }
    }
}