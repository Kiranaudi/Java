import java.util.*;
import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
	
	Stack<String> s=new Stack<String>();
	s.push("hello");
	s.push("hii");
	s.push("hey");
	s.pop();
	System.out.println(s.peek());
	System.out.println(s);
	
	Iterator<String> i=s.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}