package string;


//JAVA = java 
public class Program1 {
	
	public static void LowerCase(String str){
		String str1="";
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int data = ch +32;
			str1 = str1+(char)data;
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		String str = "JAVA";
		Program1.LowerCase(str);

	}

}