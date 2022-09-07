import java.util.*;
public class Adding {
     int a;
     int b;
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a value");
		int a=s.nextInt();
		System.out.println("enter b value");
		float b=s.nextFloat();
		float c=a+b;
		float d=b%10;
		System.out.println("adding of two variables is" +d);
		s.close();
	}

}
