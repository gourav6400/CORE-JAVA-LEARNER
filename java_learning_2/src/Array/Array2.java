package Array;

public class Array2 {
	public static void evennumber(int[] a) {
		
		int len = a.length;
			for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+"");
			}
			}
//			System.out.println(a[i]);
		}

	public static void main(String[] args){
		
		int arr[] = {1,2,3,4,5,6,7,8,10};
		evennumber(arr);

	}

}
