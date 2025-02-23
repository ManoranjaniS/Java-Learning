Integer reverse using recursion




import java.util.Scanner;
public class Recusionm {

void  val1(int b) {
    int rev = 0;
    while (b> 0) {
        int rem = b % 10;
        rev = 0 * 10 + rem;
        b = b / 10;
        System.out.print(rev);
    }


}



    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int b=sc.nextInt();
       Recusionm sb=new Recusionm();
      // int rev=0;
        sb.val1(b);
    }

}
