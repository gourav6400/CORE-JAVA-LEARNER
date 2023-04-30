package Enums;

//public static final
//enum.constantName
//public static final Monday = new Day()
enum Days{
	Monday,
	Tuesday,
	WednesDay,
	Thrusday,
	Friday,
	Saturday,
	Sunday
}

public class Test1 {

	public static void main(String[] args) {
		//values
		Days arr[] = Days.values();
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
      //ordinals()
		Days data = Days.Monday;
		System.out.println(data.ordinal());
	}

}