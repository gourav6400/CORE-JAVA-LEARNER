package string;

public class StringMethods {

	public static void main(String[] args) {
		//charAt():
		String str = "Java";
		char ch = str.charAt(0);
//		char ch2 =(char) ((char) ch+32);//A->65   a->97
//		System.out.println(ch2);
		System.out.println(ch);
		
		//compareTo = The comparison is based on the Unicode value of each character inthe strings.
		String str2 = "java";
		char ch2 = 'J';//74-106=-106+74=-32
		int data = ch2;
		
		System.out.println(data);
		System.out.println(str.compareTo(str2));
		
		String str3 = "Java";
      String str4 = "Jbva";
      System.out.println(str3.compareTo("Jbva"));
      
      
      //concat()
      String name1 = "Anuj";
      String name2 = "Nair";
      System.out.println(name1+name2);
      System.out.println(name1.concat(name2));
    	
      //contains();
      String text = "We are learning Java";
      System.out.println(text.contains("J"));
      
      //endsWith();
      System.out.println(text.endsWith("Java"));
      
      //equals:check content of string
      //== :checks memory location
      
      String data1 = "Hello";
      String data2 = "Hello";
      System.out.println(data1.equals(data2));
      System.out.println(data1==(data2));
      
      String data3 = new String("Hello");
      String data4 = new String("Hello");
      System.out.println(data3.equals(data4));
      System.out.println(data3==(data4));
      
      System.out.println("Hello".equals("hello"));
      System.out.println("Hello".equalsIgnoreCase("hello"));
      
      //tolowercase
      String data5 = "ENCYCLOPEDIA";
      System.out.println(data5.toLowerCase());
      
      
      //toUpperCase
      String data6 = "encyclopedia";
      System.out.println(data6.toUpperCase());
      
      
      //toCharArray()
      String data7 = "Java";
      char[] arr = data7.toCharArray();
      for(int i=0;i<arr.length;i++){
    	  System.out.println(arr[i]);
      }
      
      
      //split
      String data8 = "We are learning Java";
      String[] arr2 = data8.split(" ");
      for(int i=0;i<arr2.length;i++){
    	  System.out.println(arr2[i]);
      }
      
      //indexOf
      
	}
  
}

