package stringBuffer;


public class StringBuffer2 {

	public static void main(String[] args) {
		//StringBuffer are mutable
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		sb.append("J2EE");
		System.out.println(sb);
		
		//insert()
		sb.insert(4, "EJB");
		System.out.println(sb);
		
		//reverse()
		sb.reverse();
		System.out.println(sb);
		
		String str = "We are learning StringBuffer";
		StringBuffer sb4 = new StringBuffer(str);
		sb4.reverse();
		System.out.println(sb4);
		
		//delete()
		StringBuffer sb2 = new StringBuffer("Wikipedia");
		sb2.delete(1, 4);//start - (end-1)
		System.out.println(sb2);
		
		
		

	}

}