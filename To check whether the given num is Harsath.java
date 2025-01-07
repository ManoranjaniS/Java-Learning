To check whether the given num is Harsath or not
Ans:
import java.util.Scanner;
public class Abudant1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a = 12;
        int sum = 0;
        int temp = a;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += a;
            }
        }
        if (sum > temp) {
            System.out.println("Abudant");
        } else {
            System.out.println("no");
        }


    }
}