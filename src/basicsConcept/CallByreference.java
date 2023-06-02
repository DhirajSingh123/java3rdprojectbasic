package basicsConcept;

class Desktop {

	String desktopName = "HP Desktop";

}

public class CallByreference {

	static void changeDesktopName(Desktop obj) {

		obj.desktopName = "Lenovo Desktop";

	}

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		System.out.println(obj.desktopName);

		
		changeDesktopName(obj);

		System.out.println(obj.desktopName);

	}

}
