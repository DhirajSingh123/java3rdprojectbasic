package oopsConsept;

class Poly1 {

	
	public void getMessage() {
		System.out.println("Poly1");

	}

	public void getMessage(int name) {
		System.out.println("Poly1 with parameter");

	}

}

class Poly2 extends Poly1 {
	
	public void getName() {
		System.out.println("Poly2");

	}

	public  void getMessage(int name) {
		System.out.println("Poly2 with parameter");

	}

}



public class Polymorphism {
	public static void main(String[] args) {
		Poly2 obj = new Poly2();
		obj.getMessage();
	}
	

}
