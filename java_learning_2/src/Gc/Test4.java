package Gc;

public class Test4 {
	String obj_name;
    Test4(String obj_name){
    	this.obj_name = obj_name;
    }
    
    protected void finalize(){
    	System.out.println(this.obj_name+" is fit for gc");
    }
	public static void main(String[] args) {
		new Test4("ObjD");
		new Test4("ObjE");
		System.gc();

	}

}