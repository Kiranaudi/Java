
public class Innerclasses {
 private static String name;
 public static void out() {
	 	 System.out.println(name);
 }
 public static class Inner1{
	 int age;
	 public void in()
	 {
		 System.out.println(age + "     " + name);
	 }
 }
	public static void main(String[] args) {
		Innerclasses.Inner1 i=new Inner1();
		name="kiran";
		out();
		i.age=22;
		i.in();
		
	}

}
