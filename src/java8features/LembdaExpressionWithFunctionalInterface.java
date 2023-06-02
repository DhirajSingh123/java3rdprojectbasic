package java8features;

@FunctionalInterface
interface TestInterface {

	int getNo(int no);

}

public class LembdaExpressionWithFunctionalInterface {
	
	public static void main(String[] args) {
		//With Treditional Anonyms
		//This called anonyms class as well because we are not creating extra class to implements interface
		TestInterface obj = new TestInterface() {
			
			@Override
			public int getNo(int no) {
				
				System.out.println("Your passing no is::::"+no);
				
				return no;
			}
		};
		
		obj.getNo(18);
		
		//With Lembda Expression
		
		TestInterface lembdaObj = (int no)->{
			System.out.println("Through lembda expression::::"+no);
			return no;
			
		};
		lembdaObj.getNo(55);
		
	}

}
