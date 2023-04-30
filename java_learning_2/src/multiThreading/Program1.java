package multiThreading;

class Table{
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName() +" "+num+" * "+i+" = "+(num*i));
		}
	}
}

class Thread1 extends Thread{
	private Table table;
	private int n;
	Thread1(Table table,int n){
		this.table = table;
		this.n = n;
	}
	public void run(){
		table.printTable(n);
	}
}
class Thread2 extends Thread{
	private Table table;
	private int n;
	Thread2(Table table,int n){
		this.table = table;
		this.n = n;
	}
	public void run(){
		table.printTable(n);
	}
}

public class Program1 {

	public static void main(String[] args) {
		Table obj = new Table();
		int n1 = 5;
		int n2 = 10;
		Thread1 t1 = new Thread1(obj,n1);
		Thread1 t2 = new Thread1(obj,n2);
		t1.start();
		t1.setName("A");
		t2.start();
		t2.setName("B");
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}