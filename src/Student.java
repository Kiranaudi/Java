
public class Student {
 int i=90;
	public Student(int i) {
		System.out.println(this.i);
	}
	public Student() {
		System.out.println("sdfsg");
	}
	
	public static void main(String[] args) {
		int i=9;
		Student s=new Student(i);
		Student s1=new Student();
	}
}
