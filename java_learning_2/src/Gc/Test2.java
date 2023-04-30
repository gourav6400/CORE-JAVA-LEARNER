package Gc;

public class Test2 {
    String obj_name;
    Test2(String obj_name){
    	this.obj_name = obj_name;
    }
    
    protected void finalize(){
    	System.out.println(this.obj_name+" is fit for gc");
    }
	public static void main(String[] args) {
		Test2 t1 = new Test2("ObjA");
		Test2 t2 = new Test2("ObjB");
		t1 = t2;
		System.gc();

	}

}