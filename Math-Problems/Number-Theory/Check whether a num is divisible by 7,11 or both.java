Check whether a num is divisible by 7,11 or both
Ans:
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%7==0 && a%11==0) {
			System.out.println("It is divisible by both");
		}
		else {
			System.out.println("It is divisible by only one");
		}

	}

}
