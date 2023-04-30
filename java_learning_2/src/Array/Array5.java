package Array;

public class Array5 {
	public static void MaxNumberinArray(int[] a) {
		int max = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
			
		}
	System.out.println("Maximum Element is array is:"+max);
	}

	public static void main(String[] args) {
		int arr [] = {3,2,1,56,10000,167};
		MaxNumberinArray(arr);
		

	}

}