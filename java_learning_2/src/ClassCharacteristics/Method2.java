package ClassCharacteristics;


public class Method2 {
    //static variable : data=12;
	//static m1(){ sop(data)}
	static int data = 12;
	int data2 = 14;
	public static void m1(){
		System.out.println(data);
		//System.out.println(data2);
	}
	
	public void m2(){
	 //System.out.println(data);
	 //System.out.println(this.data2);
	 System.out.println("Value of this :"+this);
	}

	public static void main(String[] args) {
		Method2 obj = new Method2();
         obj.m2();
         System.out.println("Value of obj :"+obj);
         Method2 obj2 = new Method2();
         obj2.m2();
	}

}
