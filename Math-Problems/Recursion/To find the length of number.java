To find the length of number


Logic 1:
import java.util.Scanner;
public class Recusionm {

int val1(int b) {
    if(b==0){
        return 0 ;
    }
    int c=0;
    while(b!=0){
        c++;
        b=b/10;
    }
    System.out.println(c);
    return c;
}
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int b=sc.nextInt();
       Recusionm sb=new Recusionm();
      // int rev=0;
        sb.val1(b);
    }

}
