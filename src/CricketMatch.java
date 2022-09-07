import java.util.Scanner;

public class CricketMatch {
public void weather(String s) {
	switch (s) {
	case "good":System.out.println("ready to play the match");
		
		break;
	case "onehour":System.out.println("match reduced by 10 overs");
	   break;
	case "twohours":System.out.println("match reduced by 25 overs");
	break;
	
	case ">threehours":System.out.println("match cancelled due to bad weather");
	        System.exit(0);
		break;
		default:System.out.println("enter correct weather format");
		       System.exit(0);
	}
	}


public void winner(int i,int ii) {
	if (i>ii) {
		int a=i-ii;
		System.out.println("mumbai indians won by"+"  "+a);
	}else {
		int b=ii-i;
		System.out.println("gujarat titans won by"+" "+b);
	}
}
	public static void main(String[] args) {
		CricketMatch c=new CricketMatch();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter weather status "+" "+"if good enter good,if bad enter enter in hours till two hours and for greater than equal to three hours enter >threehours");
		String s=sc.next();
		c.weather(s);
		System.out.println("enter Mumbai indians score");
		int i=sc.nextInt();
		System.out.println("enter Gujarat titans score");
		int ii=sc.nextInt();
		c.winner(i,ii);
		sc.close();

	}

}
