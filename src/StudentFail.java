import java.util.*;
import java.util.ArrayList;
public class StudentFail {
	public void fail(String s) {
		HashMap<String,String[]> hm=new HashMap<String,String[]>();
		hm.put("kiran", new String[] {"jkgeb","djhgas","dfgd","gdfhhdr"});
		hm.put("koushik", new String[] {"jgeb","djhgs","dfggd","gfhhdr","hdsd","jdfj","hfdjh"});
		hm.put("raghu", new String[] {"jkgb","djgas","dfgrd","gdfdr","jfj","dhfh"});
		hm.put("balaji", new String[] {"kgeb","jhgas","dfgssd","ghhdr","hrjjd"});
		
	for(Map.Entry<String,String[]> entry:hm.entrySet()) {
		if(entry.getKey().matches(s)) {
			int i=entry.getValue().length;
			System.out.println("number of employee under manager"+" "+entry.getKey()+" "+"is"+"  "+i);		
		}
	}
		
	}

	public static void main(String[] args) {
		StudentFail s=new StudentFail();
		Scanner sc= new Scanner(System.in);
		String s2=sc.next();
		s.fail(s2);
		sc.close();
	}

}
