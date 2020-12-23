import java.util.*;
class Time{
	int hour,minute,second;
	Time init(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	void display(){
		System.out.println(this.hour+":"+this.minute+":"+this.second);
	}
	static Time add(Time t1,Time t2){
		Time t3 = new Time(0,0,0);
		t3.hour = t1.hour + t2.hour;
		t3.minute = t1.minute + t2.minute;
		t3.second = t1.second + t2.second;
		return t3;
	}
	static Time subtract(Time t1,Time t2){
		Time t3 = new Time(0,0,0);
		t3.hour = t1.hour - t2.hour;
		t3.minute = t1.minute - t2.minute;
		t3.second = t1.second - t2.second;
		return t3;
	}
	static void compare(Time t1,Time t2){
		if(t1.hour > t2.hour){
			System.out.println(t1.hour+":"+t1.minute+":"+t1.second + " is greater");
		}
		else if(t1.hour < t2.hour){
			System.out.println(t2.hour+":"+t2.minute+":"+t2.second + " is greater");
		}
		else{
			if(t1.minute > t2.minute){
			System.out.println(t1.hour+":"+t1.minute+":"+t1.second + " is greater");
		}
		else if(t1.minute < t2.minute){
			System.out.println(t2.hour+":"+t2.minute+":"+t2.second + " is greater");
		}else{
			if(t1.second > t2.second){
			System.out.println(t1.hour+":"+t1.minute+":"+t1.second + " is greater");
		}
		else if(t1.second < t2.second){
			System.out.println(t2.hour+":"+t2.minute+":"+t2.second + " is greater");
		}else{
			System.out.println("Both Times are same");
		}
		}
		}
	}
}

class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int h1,m1,s1,h2,m2,s2;
		System.out.println("Enter T1: ");
		h1 = sc.nextInt();
		m1= sc.nextInt();
		s1 = sc.nextInt();

		Time t1 = new Time(h1,m1,s1);
		t1.display();
		System.out.println("Enter T2: ");
		h2 = sc.nextInt();
		m2 = sc.nextInt();
		s2 = sc.nextInt();
		Time t2 = new Time(h2,m2,s2);
		t2.display();
		Time.compare(t1,t2);
	}
}