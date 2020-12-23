import java.util.*;
class Mixer{
	int arr[];
	void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter elements of array in ascending order without any duplicates:");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
	}
	Mixer mix(Mixer A){
		int arrnew[] = new int[arr.length+A.arr.length];
		int j = 0,k = 0;
		for(int i = 0; i< arr.length+A.arr.length;i++){
			if(k<A.arr.length && j<arr.length)
				{
					if(arr[j] > A.arr[k]){
							arrnew[i] = A.arr[k];
							k++;
						}
						else{
							arrnew[i] = arr[j];
							j++;
					}
					continue;
				}
				else if(k == A.arr.length){
						arrnew[i] = arr[j];
						j++;
						continue;
					}else if(j == arr.length){
						arrnew[i] = A.arr[k];
						k++;
						continue;
					}
		}
		Mixer mixer = new Mixer();
		mixer.arr = arrnew;
		return mixer;
	}
	void display(){
		System.out.println("Array: ");
		for(int i = 0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[]){
		Mixer m1 = new Mixer();
		m1.accept();
		m1.display();
		Mixer m2 = new Mixer();
		m2.accept();
		m2.display();
		m1 = m1.mix(m2);
		m1.display();
	}
}