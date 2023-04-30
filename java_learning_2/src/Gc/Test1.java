package Gc;

public class Test1 {
    String obj_name;
    Test1(String obj_name){
    	this.obj_name = obj_name;
    }
    
    public static void show(){
    	Test1 obj1 = new Test1("tmp1");
    	display();
    }
    public static void display(){
    	Test1 obj2 =new Test1("tmp2");
    }
    
    protected void finalize(){
    	System.out.println(this.obj_name+" is fit for GC");
    }
	public static void main(String[] args) {
		Test1.show();
		System.gc();

	}

}