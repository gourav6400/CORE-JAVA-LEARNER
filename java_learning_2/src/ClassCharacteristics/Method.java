package ClassCharacteristics;

class A{
	 public static void m2(){
	    	System.out.println("m2() is executed");
	    }
}


public class Method {
	
	//non-static -(function definition)
    public void m1(){
    	System.out.println("m1() is executed ");
    }
    
    //static function -(function definition)
   
	public static void main(String[] args) {
		Method obj = new Method();
		obj.m1();//invoking a function or calling a function
		
		//using classname
		A.m2();
		
	}

}