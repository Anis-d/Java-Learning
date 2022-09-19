import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//int num=102;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int org_num=num;
		int r=0;
		while(num!=0) {
			r=r*10 + num%10;
			num =num/10;
		}
		if(org_num==r) {
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
	}

}
