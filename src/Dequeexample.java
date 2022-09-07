	import java.util.Deque;
	import java.util.ArrayDeque;
public class Dequeexample {

	
		public static void main(String[] args) {
	        Deque<String> s=new ArrayDeque<String>();
			
			s.add("hi");
			s.add("hiiiii");
			s.add("hello");
			s.add("hey");
			s.addFirst("audi");
			s.removeFirst();
			s.removeLast();
			System.out.println(s);
						
		}
	}

