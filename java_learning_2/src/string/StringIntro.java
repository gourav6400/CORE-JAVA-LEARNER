package string;

public class StringIntro {

	public static void main(String[] args) {
		//String are immutable
		String str = "Java";
		System.out.println(str);
		str.concat("language");//Java language
		System.out.println(str);
		
		str = str.concat("language");
		System.out.println(str);

	}

}