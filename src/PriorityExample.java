import java.util.*;
public class PriorityExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> i=new PriorityQueue<Integer>();
		
		i.add(2);
		i.add(7);
		i.add(1);
		i.add(25);
		System.out.println("first integer" +i.peek());
		System.out.println("first integer" +i.element());
		System.out.println(i);
			
	}

}
