import java.util.PriorityQueue;
public class PriorityExamples {

	public static void main(String[] args) {
		PriorityQueue<String> s=new PriorityQueue<String>();
		
		s.add("hi");
		s.add("hiiiii");
		s.add("hello");
		s.add("hey");
		System.out.println("first integer" +s.peek());
		System.out.println("first integer" +s.element());
		System.out.println(s);
					
	}

}

