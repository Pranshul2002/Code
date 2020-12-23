import java.util.*;
class ComplexNumber{
	int a,b;
	ComplexNumber(int a,int b){
		this.a = a;
		this.b = b;
	}
	ComplexNumber(){
		this.a = 0;
		this.b = 0;
	}
	void print(){
		System.out.println(this.a + " + " + this.b+"i");
	}
	static ComplexNumber add(ComplexNumber a, ComplexNumber b){
		ComplexNumber complex = new ComplexNumber();
		complex.a = a.a + b.a;
		complex.b = a.b + b.b;
		return complex;
	}
	static ComplexNumber subtract(ComplexNumber a, ComplexNumber b){
		ComplexNumber complex = new ComplexNumber();
		complex.a = a.a - b.a;
		complex.b = a.b - b.b;
		return complex;
	}
}
class Demo{
	public static void main(String args[]){
		int a1,b1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first complex number");
		a1 = sc.nextInt();
		b1 = sc.nextInt();
		ComplexNumber cn = new ComplexNumber(a1, b1);
		int a2,b2;
		System.out.println("Enter second complex number");
		a2 = sc.nextInt();
		b2 = sc.nextInt();
		ComplexNumber cn1 = new ComplexNumber(a2, b2);
		cn.print();
		cn1.print();
		ComplexNumber cnadd = ComplexNumber.add(cn,cn1);
		ComplexNumber cnsub = ComplexNumber.subtract(cn,cn1);
		System.out.println("Sum: ");
		cnadd.print();
		System.out.println("Subtract: ");
		cnsub.print();
	}
}