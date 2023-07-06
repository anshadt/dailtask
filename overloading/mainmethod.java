package overloading;
//overloading main method
import java.io.*;
public class mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hi geek(from main)");
mainmethod.main("geek");
	}
	public static void main(String arg1) {
		System.out.println("hi " + arg1);
		mainmethod.main("hel geek" , "my geek");
	}
	public static void main(String arg1,String arg2) {
		System.out.println("hi " + arg1 + "," + arg2);
		
	}
}
