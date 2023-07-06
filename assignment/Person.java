package assignment;

public class Person {
	  private String name;
	     private int age;
public int getAge() {
	return age;
}
public void setName(String n) {
	name = n; 
}
public void setAge(int a) {
	age = a;
}
public String getName( ) {
	return name;
}
}
class A{
	public static void main(String[] args) {
		Person obj = new Person();
		obj.setAge(15);
		obj.setName("anshad");
		System.out.println(obj.getName() + ":" + obj.getAge());
	}
}


