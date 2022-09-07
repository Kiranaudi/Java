
public class Overloading {
   public int add(int a,int b) {
	return a+b;
	   
   }
   public int add(int a,int b,int c) {
	   return a+b+c;
   }
   static int mul(int a,int b,int c,int d) {
	   return a*b*c*d;
   }
	public static void main(String[] args) {
		Overloading o=new Overloading();
		System.out.println(+ o.add(2,3));
		System.out.println(+ o.add(2,3,4));
		System.out.println(+ mul(2,3,4,5));
	}

}
