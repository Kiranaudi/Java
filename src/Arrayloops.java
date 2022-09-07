import java.util.*;
public class Arrayloops {
	
	
	public static void main(String[] args) {
	int i;
	int a[]= {1,2,3,4};
		for(int i1:a) {
			System.out.println(i1);
			
		}
		System.out.println("reverse order:");
		for(i=a.length-1;i>=0;i--) {
			
			System.out.println(a[i]);
		}
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int ar[]=new int[n];
		for(i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		System.out.println("array elements");
		for(int i2:ar) {
			System.out.println(i2);
		}
		System.out.println("reverse order");
		for(i=n-1;i>=0;i--) {
			System.out.println(ar[i]);
		}
				s.close();
	
	}

}
