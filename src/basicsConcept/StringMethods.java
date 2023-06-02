package basicsConcept;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Dhiraj";
		String s2 = new String("Dhiraj");
		
	
	   //it will compare adress as well value thats why its falls	
		System.out.println(s1 == s2);
	  //it will compare only value thats why its true	
		System.out.println(s1.equals(s2));
	//it will compare only value thats why its true	
		System.out.println(s1.compareTo(s2));
		
		
		
		
	}

}
