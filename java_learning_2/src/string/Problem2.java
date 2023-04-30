package string;

public class Problem2 {
    
	public static void main(String[] args) {
		String str = "java is programming Language";
		String[] words = str.split(" ");
		String str2="";
		for(String result : words){
		 str2 = str2+result.toUpperCase().charAt(0)+result.substring(1).concat(" ");
		}
		System.out.println(str2);

	}

}