import java.util.Scanner;
class Greatest{
	static int find(int a,int b,int c){
		return (a>b)?((a>c)?a:c):((b>c)?b:c);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter c");
		int c = sc.nextInt();
		System.out.println("Greatest number is: " + find(a, b, c));
	}
}
