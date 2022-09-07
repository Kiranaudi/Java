import java.util.*;
public class Linkedhashexample {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		TreeSet<Integer> ts=new TreeSet<Integer>();
		SortedSet<Integer> ss=new TreeSet<Integer>();
		h.add(22);
		h.add(7);
		h.add(1990);
		h.add(1998);
		h.add(227);
		h.add(220);
          System.out.println(h); 
		lh.add(22);
		lh.add(7);
		lh.add(1998);
		lh.add(1990);
	int x =	lh.size();
		ts.add(66);
		ts.add(45);
		ts.addAll(lh);
	    ss.add(22);
	    ss.add(43);
	    ss.add(23);
	    ss.addAll(lh);
	    ss.addAll(ts);
	    ts.addAll(ss);
	    System.out.println(lh);
	    System.out.println(ts);
	    System.out.println(ss);
	    System.out.println(x);
	    System.out.println(ss.size());
	}

}
