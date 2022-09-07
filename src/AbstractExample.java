
public class AbstractExample extends Abstract{
	
void mul(int x,int y) {
y=x*y;
System.out.println(+ y);
	
}
void add(int x,int y) {
	y=x+y;
	System.out.println(+ y);
}
public static void main(String[] args) {
	AbstractExample a=new AbstractExample();	
	a.mul(4,5);
	a.add(4,5);
}
}
