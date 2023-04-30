package multiThreading;

class Mythreaddata2 implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread executed method");	
	}	
}
public class Test2 {
	public static void main(String[] args) {
		Mythreaddata2 t1 = new Mythreaddata2();
		Thread th = new Thread(t1);
		th.start();

	}

}