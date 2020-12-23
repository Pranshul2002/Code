import java.util.*;
class BubbleSort{
	static	int[] ascending(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length - i - 1;j++){
				if(arr[j+1] < arr[j]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	static	int[] descending(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length - i - 1;j++){
				if(arr[j+1] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter arr: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}	
		int[] asc = ascending(arr);
		System.out.println("Ascending Order:");
		for(int i=0;i<asc.length;i++){
			System.out.println(asc[i]);
		}	
		int[] des = descending(arr);
		System.out.println("Descending Order:");
		for(int i=0;i<des.length;i++){
			System.out.println(des[i]);
		}		
	}
}