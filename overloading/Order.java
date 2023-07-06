package overloading;

public class Order {
	public void emp(String name,String title,double sal) {
		System.out.println("Name "+ name + " " + "Title " + title + "" + "Salary " + sal);
	}
	
	public void emp(String title,double sal,String name) {
		System.out.println("Title " + title + "" + "salary " + sal+"" + "Name "+ name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Order obj = new Order();
 obj.emp("sampath","teamLeader",15000);
 obj.emp("MD",20000,"karthik");

	}


	
}
