package multiThreading;

class Resource{
	String resource1 = "r1";
	String resource2 = "r2";
	
	Thread T1 = new Thread(new Runnable(){

		@Override
		public void run() {
			System.out.println("T1 starts..");
			synchronized(resource1){
				System.out.println("T1 acquired the lock of resource1");
				System.out.println("Waiting for resource2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}synchronized(resource2){
					System.out.println("T1 acquired the lock of resource2");
				}
				
			}
			System.out.println("T1 completed task...");
		}
		
	});
	
	Thread T2 = new Thread(new Runnable(){

		@Override
		public void run() {
			System.out.println("T2 starts..");
			synchronized(resource2){
				System.out.println("T2 acquired the lock of resource2");
				System.out.println("Waiting for resource1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}synchronized (resource1) {
					System.out.println("T2 acquired the lock of resource1");
				}
			}
			System.out.println("T2 completed task");
		}
		
	});
}

public class Deadlock {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" started the program");
		Resource obj = new Resource();
		obj.T1.start();
		obj.T2.start();
		
		
		System.out.println(Thread.currentThread().getName()+" terminates..");

	}

}