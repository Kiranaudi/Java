import java.util.*;
import java.util.Map.Entry;
public class Innerasgn {
	String s3;	
	public void adna() {
			HashMap<String,String> hm=new HashMap<String,String>();			
			hm.put("good", "kiran");
			hm.put("excellent", "kethan");
			hm.put("fail", "kumar");
			hm.put("good","balaji" );
			for (Iterator<Entry<String, String>> iterator = hm.entrySet().iterator(); iterator.hasNext();) {
				Entry<String, String> m = iterator.next();
				if(m.getKey()=="good") {
				s3=(String) m.getValue(); 
				 System.out.println(s3);
			}
			}
	}
	class Inner1{
		String s1;
		int s2;
			public void resta(){
			HashMap<String,Integer> hm=new HashMap<String,Integer>();
			HashMap<String,String> hm1=new HashMap<String,String>();
			hm.put("good", 8);
			hm.put("excellent", 7);
			hm.put("good",9);
			hm.put("fail", 8);
			hm1.put("good", "hyd");
			hm1.put("excellent", "tpt");
			hm1.put("fail", "knl");
			hm1.put("good","nlr" );
			for (Iterator<Entry<String, Integer>> iterator = hm.entrySet().iterator(); iterator.hasNext();) {
				Entry<String, Integer> m = iterator.next();
				if(m.getKey()=="good") {
				 s2=(int) m.getValue(); 
				 System.out.println(s2);
}
			}
			for (Iterator<Entry<String, String>> iterator = hm1.entrySet().iterator(); iterator.hasNext();) {
				Entry<String, String> m1 = iterator.next();
				if(m1.getKey()=="good") {
				 s1=(String) m1.getValue(); 
				 System.out.println(s1);
			}
			}
			}
		}
	public static void main(String[] args) {
		InnerExample ie=new InnerExample();
		ie.adna();
		
		InnerExample.Inner1 ii=ie.new Inner1();
        ii.resta();
	}
	
}


