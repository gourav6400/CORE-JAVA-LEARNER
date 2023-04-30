package stringBuffer;

public class StrigBufferIntro {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer(20);
		System.out.println(sb1.capacity());
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer("J2EE");
		System.out.println(sb2);
		

	}

}