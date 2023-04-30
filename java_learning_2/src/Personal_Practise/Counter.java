package Personal_Practise;

public class Counter {
	  
	//static block
     static{
    	System.out.println("Static block executed"); 
     }
     
     //instance block
     {
    	 System.out.println("Instance block is executed");
     }
    
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();

	}

}