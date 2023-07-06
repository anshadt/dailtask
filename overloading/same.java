package overloading;

public class same {
//method overloading same parameter but changing order of parameter
	public void student(String name , int rollno) {
		System.out.println("NAME " + name + " " +"Roll No " + rollno);
	}
	
	public void student( int rollno,String name) {
		System.out.println("Roll No " + rollno  + " " +"NAME " + name );
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
same ob = new same();
ob.student("anshad", 15);
ob.student(4 , "chand");
	}

}
