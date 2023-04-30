package multiThreading;

class Stationary{
	String pen = "Pen";
	String paper = "Paper";
}

class PenThread implements Runnable{

	@Override
	public void run() {
		System.out.println("PenThread is ready for read-write operation");
		synchronized (new Stationary().pen) {
			System.out.println("PenThread  got pen");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}synchronized (new Stationary().paper) {
				System.out.println("PenThread  got paper");
			}
		}
		System.out.println("PenThread  completed read-write operation");
	}
	
}

class PaperThread implements Runnable{

	@Override
	public void run() {
		System.out.println("PaperThread is ready for read-write operation");
		synchronized (new Stationary().paper) {
			System.out.println("PaperThread got paper");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}synchronized (new Stationary().pen) {
				System.out.println("PaperThread got pen");
			}
		}
		System.out.println("PaperThread completed read-write operation");
	}
	
}

public class Deadlock2 {

	public static void main(String[] args) {
		PenThread t1 = new PenThread();
		PaperThread t2 = new PaperThread();
		Thread th = new Thread(t1);
		Thread th2 = new Thread(t2);
		th.start();
		th2.start();

	}

}