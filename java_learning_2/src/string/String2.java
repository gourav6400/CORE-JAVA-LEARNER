package string;

public class String2 {

	public static void main(String[] args) {
		String str = "Hello";
		String str2 = str;
		str = "world";
		str2 = str;
		System.out.println(str);
		System.out.println(str2);
	}

}