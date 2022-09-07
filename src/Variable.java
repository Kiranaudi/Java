
public class Variable {
static int a=10;
static int d;
public void add() {
	int e=10;
	  d=a+e;
	
}
	public static void main(String[] args) {
		int b=2;
		int f=7;
		
		Variable v=new Variable();
		int c=a+b;
		System.out.println(c);
		a=f+b;
		v.add();
		System.out.println(d);
		System.out.println(a);
	}

}
