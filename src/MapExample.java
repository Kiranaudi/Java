import java.util.*;
public class MapExample {

	public static void main(String[] args) {
	    HashMap<Integer,String> hm=new HashMap<Integer,String>();
	    LinkedHashMap<Integer,String> lhm= new LinkedHashMap<Integer,String>();
	    SortedMap<Integer,String> shm= new TreeMap<Integer,String>();
	    TreeMap<Integer,String> thm= new TreeMap<Integer,String>();
	    hm.put(3, "hii");
	    hm.put(2, null);
	    hm.put(41,"hii");
	    hm.put(36, null);
	    System.out.println(hm);
	    lhm.put(3, "hii");
	    lhm.put(2, "h");
	    lhm.put(42, "hey");
	    lhm.put(41,"hello");
	    System.out.println(lhm);
	    shm.putAll(lhm);
	    shm.putAll(hm);
	    System.out.println(shm);
	    thm.put(5, "new");
	    thm.put(222, "n");
	    thm.putAll(shm);
	    System.out.println(thm);
	System.out.println(  hm.get(41));
	}

}
