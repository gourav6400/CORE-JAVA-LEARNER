package Personal_Practise;

public class DataType {

	public static void main(String[] args) {
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40l;
		float e = 56.78f;
		double g = 45.678;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(g);
	System.out.println("=======================");	
		//TypeCasting:
		//Implicit type casting
		byte data = 20;
		int data2 = data;
		System.out.println(data2);
		
		//Explicit type-casting
		
		int data3 = 20;
		byte data4 = (byte)data3;
		System.out.println(data4);
		
//		String str = "abc";
//		int data5 = (int)str;
		
		char ch = 'a';
		int data6 = ch;
		System.out.println(data6);
	}

}
