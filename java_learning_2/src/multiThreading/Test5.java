package multiThreading;

public class Test5 extends Thread{
    public void run(){
   	 
   	 System.out.println(Thread.currentThread().getName()+"Hello from thread");
    }
	public static void main(String[] args) {
		Test5 t1 = new Test5();
		Test5 t2 = new Test5();
        t1.start();
        t1.setName("Thread A");
        t2.start();
        t2.setName("Thread B");
	}
}
//Thread Scheduler: Preemptive or time slicing