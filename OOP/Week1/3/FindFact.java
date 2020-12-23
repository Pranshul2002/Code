import java.util.*;
class FindFact{
	int findFact(int n){
		int prod = 1;
		for(int i = 1;i<=n;i++){
			prod = prod * i;
		}
		
		return prod;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n ");
		int n = sc.nextInt();
		System.out.println("Enter r ");
		int r = sc.nextInt();
		FindFact ff = new FindFact();
		int nf = ff.findFact(n);
		int rf = ff.findFact(r);
		int nrf = ff.findFact(n-r);
		
		System.out.println("nCr is: " + (nf)/(rf * nrf));	
	}
}