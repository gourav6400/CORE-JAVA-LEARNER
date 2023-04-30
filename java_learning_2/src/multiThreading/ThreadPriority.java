package multiThreading;

class Table2{
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName() +" "+num+" * "+i+" = "+(num*i));
		}
	}
}

class Thread3 extends Thread{
	private Table2 table;
	private int n;
	Thread3(Table2 table,int n){
		this.table = table;
		this.n = n;
	}
	public void run(){
		table.printTable(n);
	}
}
class Thread4 extends Thread{
	private Table2 table;
	private int n;
	Thread4(Table2 table,int n){
		this.table = table;
		this.n = n;
	}
	public void run(){
		table.printTable(n);
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		Table2 obj = new Table2();
		int n1 = 5;
		int n2 = 10;
		Thread3 t1 = new Thread3(obj,n1);
		Thread4 t2 = new Thread4(obj,n2);
		t1.start();
		t1.setName("A");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t2.setName("B");
		t2.setPriority(Thread.MIN_PRIORITY);

	}

}