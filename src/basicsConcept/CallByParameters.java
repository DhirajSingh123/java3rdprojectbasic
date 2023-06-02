package basicsConcept;


public class CallByParameters {
	
	static void callByVauleFun(String laptopName ) {
		
		laptopName = "Mac laptop";
		
		
		System.out.println(laptopName);		
	}
	
	public static void main(String[] args) {
		String laptopName= "Hp laptop";
		//Original value does not get effect because it took different memory
		CallByParameters.callByVauleFun(laptopName);
		
		
		System.out.println(laptopName);
		
	}

}
