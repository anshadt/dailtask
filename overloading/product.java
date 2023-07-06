package overloading;

public class product {
	public int prod(int a, int b, int c) {
		int prod1=a*b*c;
		return prod1;
	}
	public double prod(double a, double b,double c) {
		double prod2=a*b*c;
		return prod2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
product obj = new product();
int prod1=obj.prod(1, 2, 3);
System.out.println(prod1);
double prod2=obj.prod(10, 20, 30);
System.out.println(prod2);

	}

}
