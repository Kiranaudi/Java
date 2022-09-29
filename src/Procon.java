
public class Procon {

	public static void main(String[] args) {
		Market m=new Market();
		Producer p=new Producer(m,2);
		Consumer c =new Consumer(m,4);
p.start();
c.start();
	}
}
