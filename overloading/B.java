package overloading;

public class B {
	public int even(int x ) {
		if(x%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");

		}
		return (x);
	}
	public int even(int x , int y ) {
		int result = x + y;
		if(result%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd");

		}
		return (result);
	}
	
	public float prime(float x) {
		int flag = 0;
		for(int i=2; i<x/2;i++) {
			if(x%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("given number is prime");
		}
		else {
			System.out.println("given number is not prime");

		}
		return (x);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B s = new B();
System.out.println(s.even(10));
System.out.println(s.even(10,20));
s.prime(7);

	}

}
