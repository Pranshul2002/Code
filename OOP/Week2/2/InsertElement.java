import java.util.*;
class InsertElement{
	int[] insert(int[] arr,int index,int element){
		int[] m = new int[arr.length + 1]; 
		for(int i = arr.length;i>index;i--){
			m[i] = arr[i-1];
		}
		m[index] = element;
		for(int i = 0;i<index;i++){
			m[i] = arr[i];
		}
		return m;
	}
	int[] delete(int[] arr,int index){
		int[] m = new int[arr.length - 1]; 
		for(int i = arr.length-1;i>index;i--){
			m[i-1] = arr[i];
		}
		for(int i = 0;i<index;i++){
			m[i] = arr[i];
		}
		return m;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter index: ");
		int index = sc.nextInt();
		System.out.println("Enter element: ");
		int element = sc.nextInt();
		arr = new InsertElement().insert(arr,index,element);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("Enter index: ");
		int index1 = sc.nextInt();
		arr = new InsertElement().delete(arr,index1);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}