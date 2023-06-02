package basicsConcept;

class Parent {

	public Parent() {
		System.out.println("I am Default Patrent Constructor");
	}
	public Parent(String Param) {
		this();
		System.out.println("I am Parent parameter Constructor"+Param);
	}
}

class Child extends Parent {

	public Child() {
		super(" Hello Its By Super Key Word");
		System.out.println("I am Child Constructor");
	}
}

public class UseOfSuperKeyWord {
	public static void main(String[] args) {
		Child obj = new Child();

	}

}
