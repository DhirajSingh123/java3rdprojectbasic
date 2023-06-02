package oopsConsept;

class A{
	void getFullName() {
		System.out.println("I am Dhiraj Singh");
	}
}

class B extends A{
	 void getFirstname() {
		System.out.println("I am Dhiraj");
	}
}

public class InheritaceExample {
	public static void main(String[] args) {
		B obj= new B();
		
		obj.getFullName();
		obj.getFirstname();
		
		
		
		
		
	}

}
