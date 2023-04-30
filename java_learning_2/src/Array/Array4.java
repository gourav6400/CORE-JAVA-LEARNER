package Array;

public class Array4 {
	public static void sumofDigits(int[] a) {
		int sum=0;

		for(int i=0;i<a.length;i++) {
			sum = sum +a[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,10};
		sumofDigits(arr);
		

	}

}