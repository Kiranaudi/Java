import java.util.Arrays;

public class SingleThread extends Thread {

	public void run() {
		 System.out.println("hii thread 1");
		thread();
	}

	public synchronized void thread() {
		System.out.println("staring of thread 1");
		int[] a = { 2, 33, 23, 45, 3 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		try {
			wait();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		notifyAll();
	}

	class Single extends Thread {

		public void run() {
			System.out.println("hii thread 2");
			for (int i = 0; i < 3; i++) {
				kiran();
			}
		}

		public synchronized void kiran() {
		
			System.out.println("starting of thread 2");
			
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			notifyAll();
//			int[] a = { 24545, 33868, 28673, 46755, 675673 };
//			Arrays.sort(a);
//			System.out.println(Arrays.toString(a));
//
//			for (int i = a.length - 1; i >= 0; i--) {
//				System.out.println(a[i]);
//			}

		}
	}

	public static void main(String[] args) {
		SingleThread s = new SingleThread();
		s.start();

		SingleThread.Single s1 = s.new Single();
		s1.start();

	}

}
