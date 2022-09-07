import java.util.*;
public class Theater {
public void Moviesplaying(String s){
	HashMap<String,String[]> hm=new HashMap<String,String[]>();
	hm.put("Karthikeya 2",new String[] {"Amb","Devi 70mm","Asian","Pvr Hitech city","Cinepolis"});
	hm.put("Sita Ramam",new String[] {"Amb","Sandhya 70mm","Asian","Pvr irrum manzil","Cinepolis"});
	hm.put("Bimbisara",new String[] {"Amb","Sandhya 35mm","Asian Uppal","Pvr","Cinepolis"});
	hm.put("Liger",new String[] {"Amb","Shanti 70mm","Asian Uppal","Pvr","Cinepolis"});
	for(Map.Entry<String,String[]> entry:hm.entrySet()) {
		if(entry.getKey().matches(s)) {
		    String a=Arrays.toString(entry.getValue());
			System.out.println("Available theater list for"+"  "+entry.getKey()+" "+"moive is "+ a);	
			}
      }
	
}
	public static void main(String[] args) {
	Theater t=new Theater();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the movie name");
	String s=sc.next();
	//System.out.println(s);
	
	t.Moviesplaying(s);
	sc.close();

	}

}
