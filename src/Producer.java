
public class Producer extends Thread {
Market m;
int num;
 public Producer(Market m,int num) {
	this.m=m;
	this.num=num;
}
	public void run() {
		for(int i=0;i<10;i++) {
			m.put(i);
			System.out.println("produce" +this.num+"=" +i);
			try {
				//sleep((int) (Math.random()*1000));
				sleep(10000);
			} catch (Exception e) {
			    e.printStackTrace();
			}
		}
	}
}
