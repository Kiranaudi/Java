
public class Student1 extends Student {
	 int i=70;
	void Student12(int i) {
		System.out.println(super.i);
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		int i=98;
		Student1 s=new Student1();
		s.Student12(i++);
	}

}
