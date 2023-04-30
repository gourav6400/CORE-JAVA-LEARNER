package Array;

public class Arrayprob7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{2,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				if ((i+j)%2==1) {
					a[i][j]=0;
				
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
	}
				System.out.println();

		}
}
}
