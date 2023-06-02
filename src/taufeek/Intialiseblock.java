package taufeek;

public class Intialiseblock {
	
	
	/*Its initialize block it well generate whenever create instance of class
	 *  but i static block create only once
	 */
	{
		System.out.println("Its intialaise block");
	}
	
	public static void main(String[] args) {
		
		Intialiseblock obj = new Intialiseblock();
		
		Intialiseblock obj2 = new Intialiseblock();
		
		
	}

}
