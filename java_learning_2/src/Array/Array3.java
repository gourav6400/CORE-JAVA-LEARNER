package Array;

public class Array3 {
	public static void sumofEvenDigits(int[] a) {
		for(int i=0;i<a.length;i++) {
			int sum =0;
			if(a[i]%2==0)
				sum = sum +a[i];
			System.out.println(sum);
			
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,10};
		sumofEvenDigits(arr);

	}

}
