
public class Consumer extends Thread {

		Market m;
		int num;
		 public Consumer(Market m,int num) {
			this.m=m;
			this.num=num;
		}
			public void run() {
				int value;
				for(int i=0;i<10;i++) {
					value=m.get();
					System.out.println("product value"+this.num+"=" +value);
				}
			}

	}

