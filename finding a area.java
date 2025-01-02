Sheela has three things in her bags. she wants to compute the area of 3 things but 3 things are in different shapes.
the three things are in  square shape, rectangular and circular.
calculate area
Input:5,5,4,2.0
Input:2,3,6,5.0
Ans:
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("leng");
       int square_leng=sc.nextInt();
       System.out.println("rec_leng");
       int rectangle_leng=sc.nextInt();
       System.out.println("rec_bre");
       int rec_breadth=sc.nextInt();
       System.out.println("cir rad");
       double cir_rad=sc.nextFloat();
       int area_square=square_leng*square_leng;
       int area_rec=rectangle_leng*rec_breadth;
       double are_cir=(3.14*(cir_rad)*(cir_rad)*100);
       System.out.println(area_square);
       System.out.println(area_rec);
       System.out.println(are_cir);
       System.out.printf("%02f",Math.floor(cir_rad)*0.01);
       
       
       
	}

}
