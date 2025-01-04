check whether the value is alphabet,vowel or num
Ans:
import java.util.Scanner;
public class Stung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		ch=Character.toLowerCase(ch);
		if(ch<='z' && ch>='a') 	{	
		System.out.println("it is alphabet");
			if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				System.out.println("it is  a vowel");
		}
		}
		else {
			System.out.println("It is  not a vowel");
	}

}
}
