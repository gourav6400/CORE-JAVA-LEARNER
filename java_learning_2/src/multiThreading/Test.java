package multiThreading;

class MyThread extends Thread{
	public void run(){
		System.out.println("run method is called");
		display();
	}
	public void display(){
		System.out.println("Thread executes the display");
	}
}


public class Test {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		

	}

}