package Thread_Programs;

public class p1 {
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
