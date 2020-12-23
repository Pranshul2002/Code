import java.lang.Math;
import java.util.*;
class FindSum{
	int findsum(int n){
		int m = n;
		int sum = 0;
		while(n>0){
			int j = n%10;
			n /= 10;
			sum += j;
		}
		return sum;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		FindSum fs = new FindSum();
		System.out.println("Sum: " + fs.findsum(n));	
	
	}
	
}