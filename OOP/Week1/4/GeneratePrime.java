import java.util.*;
class GeneratePrime{
	Boolean isPrime(int n){
		Boolean isprime = true;
		for(int i=2;i<n;i++){
			if(n%i == 0){
				isprime = false;
				break;
			}
		}
		return isprime;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int i = 0;
		int j = 2;
		int arr[] = new int[n];
		GeneratePrime gp = new GeneratePrime();
		while(i<n){
			if(gp.isPrime(j)){
				arr[i] = j;
				i++;
			}
			j++;
		}
		for(int m = 0;m<i;m++){
			System.out.println(arr[m]);
		}
	}
}