package Array;

public class MultiDimensionArray {

	public static void main(String[] args) {
		//declare and defining
		//data_type arrayName[][] ={{},{},{}}
		int arr[][] = {{1,2,3},{5,6,7},{8,9,10}};
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;i<arr.length;j++) {
        	System.out.println(arr[i][j]+" ");
        }
        }
		System.out.println();
	}


}

