import java.util.*;
class LinearSearch{
	int search(int[] arr,int num){
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == num){
				index = i;
				break;
			}
		}
		return index;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array: ");
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter number:");
		int num= sc.nextInt();
		LinearSearch ls = new LinearSearch();
		if(ls.search(arr,num) >0)
		System.out.println("Number found at index: "+ls.search(arr,num) );
		else
		System.out.println("Number not found");
		
	}


}