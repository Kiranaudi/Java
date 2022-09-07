import java.util.*;
public class HashmapForloop {

	public static void main(String[] args) {
		String s="helllo a udi";
		HashMap<Character,Integer>mp=new HashMap<Character,Integer>();
		char[] a=s.toCharArray();
		for(Character t:a) {
			if(mp.containsKey(t)) {
				mp.put(t,mp.get(t)+1);
			}
			else {
				mp.put(t, 1);
				}
		}
		for(Map.Entry<Character,Integer>ma :mp.entrySet()) {
			if(ma.getValue()>1)
			System.out.println(ma.getKey()+":"+ma.getValue());	
		}
		mp.put(' ',6);
		mp.put('r', null);
		TreeMap<Character,Integer>tp=new TreeMap<Character,Integer>(mp);
		for(Map.Entry<Character,Integer>ma :tp.entrySet()) {
			System.out.println(ma.getKey()+":"+ma.getValue());	
		}
	
	}

}
