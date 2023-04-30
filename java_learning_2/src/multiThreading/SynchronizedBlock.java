package multiThreading;

class TableInfo{
	public  void printTable(int num){
		System.out.println(Thread.currentThread().getName()+" acquired the lock");
		synchronized (this) {
			for(int i=1;i<=10;i++){
				System.out.println(Thread.currentThread().getName() +" "+num+" * "+i+" = "+(num*i));
			}
		}
		System.out.println(Thread.currentThread().getName()+" released the lock");
	}
}

class Thread7 extends Thread{
	private TableInfo table;
	private int n;
	Thread7(TableInfo table,int n){
		this.table = table;
		this.n = n;
	}
	public void run(){
		table.printTable(n);
	}
}
class Thread8 extends Thread{
	private TableInfo table;
	private int n;
	Thread8(TableInfo table,int n){
		this.table = table;
		this.n = n;
	}
	public void run(){
		table.printTable(n);
	}
}


public class SynchronizedBlock {

	public static void main(String[] args) {
		TableInfo obj = new TableInfo();
		Thread7 t7 = new Thread7(obj,6);
		Thread8 t8 = new Thread8(obj,12);
          t7.start();
          t8.start();
	}

}