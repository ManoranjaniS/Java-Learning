multiplication table
Ans:
import java.util.Scanner;
public class Multiplication {

    //public class Multiplication_tablr_of_5 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
           int a=sc.nextInt();
            for(int i=1;i<=a;i++) {

                System.out.println(n*i);
            }
        }
}

