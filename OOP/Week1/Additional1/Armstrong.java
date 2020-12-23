import java.lang.Math;
import java.util.*;
class Armstrong{
	Boolean check(int n){
		int m = n;
		int sum = 0;
		while(n>0){
			int j = n%10;
			n /= 10;
			sum += Math.pow(j,3);
		}
		if(sum == m)
			return true;
		else
			return false;
	
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		Armstrong arm = new Armstrong();
		if(arm.check(n))
			System.out.println("The Number is armstrong number");
		else
			System.out.println("The Number is not an armstrong number");	
	
	}
	
}