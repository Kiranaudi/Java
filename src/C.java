
public class C extends B {
    public void mul()
    {
    	System.out.println(+ a*b);
    }
    public void add()
    {
    	System.out.println(+ a+b);
    }
public static void main(String[] args)
{
	C n= new C();
	n.add();
	n.sub();
	n.mul();
}
}
