package multiThreading;

class TableData{
	public synchronized void printTable(int num){
		System.out.println(Thread.currentThread().getName()+" acquired the lock");
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName() +" "+num+" * "+i+" = "+(num*i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" released the lock");
	}
}

class Thread5 extends Thread{
	private TableData table;
	private int n;
	Thread5(TableData table,int n){
		this.table = table;
		this.n = n;
	}
	public void run(){
		table.printTable(n);
	}
}
class Thread6 extends Thread{
	private TableData table;
	private int n;
	Thread6(TableData table,int n){
		this.table = table;
		this.n = n;
	}
	public void run(){
		table.printTable(n);
	}
}



public class SynchronizedConcept {

	public static void main(String[] args) {
		TableData data = new TableData();
		Thread5 t5 = new Thread5(data,2);
		Thread6 t6 = new Thread6(data,3);
        t5.start();
        t6.start();
	}

}