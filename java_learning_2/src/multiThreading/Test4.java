package multiThreading;

//Can we call start() more than 1 time on same thread
//IllegalThreadStateException

class NewThread extends Thread{
//	 public void start(int a){
//	    	System.out.println("Hello");
//	    }
	public void run(){
		System.out.println("Run method executed");
	}
//	public void run(int a){
//		System.out.println("Overloaded run method");
//	}
}

public class Test4 {
 
	public static void main(String[] args) {
		NewThread t1 = new NewThread();
		//t1.start(10);
		t1.start();

	}

}