import java.util.*;
public class Stringsmethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("enter the name");
		String s1=s.next();
		String s2="audi";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.contains(s2));
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.indexOf("i", 3));
		System.out.println(s1.intern());
		System.out.println(s1.lastIndexOf("i"));
		System.out.println(s1.length());
		System.out.println(s1.replace("kiran", "audi"));
		System.out.println(s1.split("a"));
		
        s.close();
	}
}
