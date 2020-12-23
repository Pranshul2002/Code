import java.util.*;
class MatrixSum{
	int[][] sum(int[][] arr1, int[][] arr2){
		int[][] arrsum = new int[arr1.length][arr1[0].length];
		for(int i = 0;i<arr1.length;i++){
			for(int j =0;j<arr1[i].length;j++){
				arrsum[i][j] = arr1[i][j]+arr2[i][j];
			}
		}	
		return arrsum;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m:");
		int m = sc.nextInt();
		System.out.println("Enter n:");
		int n = sc.nextInt();
		System.out.println("Enter array 1: ");
		int[][] arr1 = new int[m][n];
		int[][] arr2 = new int[m][n]; 
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter array 2");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr2[i][j] = sc.nextInt();
			}
		}
		int[][] arr3 = new MatrixSum().sum(arr1,arr2);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr3[i][j]+"  ");
			}
			System.out.println();
		}
	}
}