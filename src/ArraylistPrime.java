import java.util.*;
//import java.util.ArrayList;
public class ArraylistPrime {

	public static void main(String[] args) {
		List<Integer> al= Arrays.asList(22,7,6,8,12,24,49,13,47,53,59,29,23,37,43,88);
		for(int n:al) {
			if(prime(n)) 
			{
				System.out.println(n);
			}
		}
	}
	private static boolean prime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			 if(n%i==0) {
				 c=c+1;
			 }
		}
			 if(c==2) {
				 return true;
			 }
	  return false;
	}

}

