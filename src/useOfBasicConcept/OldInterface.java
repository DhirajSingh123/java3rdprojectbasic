package useOfBasicConcept;

interface Car{
	public static final String name = "BMW";
	void  color();
}

public class OldInterface implements Car {

	@Override
	public void color() {
		System.out.println("Red color "+name);		
	}
	
	public static void main(String[] args) {
		OldInterface oldInterface = new OldInterface();
		
		oldInterface.color();
	}

}
