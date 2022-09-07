import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check whether it is palindrome or not");
		int nu=sc.nextInt();
		int n,r,d;
		n = nu;
		r = 0;
		while (nu > 0)
		{
		    d = nu % 10;
		    r = r * 10 + d;
		    nu = nu / 10;
		}
		if(n==r) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		sc.close();
	}

}
