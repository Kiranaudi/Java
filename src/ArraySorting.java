import java.util.*;
//import java.util.Collections;
public class ArraySorting {

	
	public static void main(String[] args) {
		int[] a= {2,33,23,45,3};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	    
      for(int i=a.length-1;i>=0;i--)
      {
    	   System.out.println(a[i]);
      }
     
	}

}
