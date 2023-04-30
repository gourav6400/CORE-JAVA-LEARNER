package Array;

public class Array6 {
	public static void MinNumberinAraay(int [] a) {
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("Minimum Element is Array is:"+min);
	}

	public static void main(String[] args) {
		
		int arr [] = {3,2,1,56,10000,167};
		MinNumberinAraay(arr);
	}

}

