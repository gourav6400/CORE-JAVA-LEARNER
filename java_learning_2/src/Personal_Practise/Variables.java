package Personal_Practise;

public class Variables {
    int a = 10;//instance variable
    String name = "Ankit";
    static int b = 30;
    
    int c;
    static int d;
    
    
    
    
    
    //function definition:
     void show(){
    	int localVariable = 100;
    	System.out.println("Local Variable = "+localVariable);
        
//        int local2;
//        System.out.println(local2);
     
     }
    
    
    
	public static void main(String[] args) {
		//creating an object
		//classname objName = new classname();
		
		Variables instanceObj = new Variables();
       
		//Accessing instance variable
		//objName . instanceVariableName
		
		System.out.println(instanceObj.a);
		System.out.println(instanceObj.name);
		System.out.println("The value of a ="+instanceObj.a);
	    //System.out.println(instanceObj.localVariable);
	    
		//calling a function:
		//objName.functionName
		instanceObj.show();
		
		//Accessing static data:Using classname
		System.out.println("The static data = "+Variables.b);
	
		//Accessing static data:Using object
		System.out.println(instanceObj.b);
		System.out.println(b);
		
		System.out.println(instanceObj.c);
		System.out.println(d);
	}

}