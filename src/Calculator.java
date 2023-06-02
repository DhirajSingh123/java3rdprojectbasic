
public class Calculator {
	
	public static void getCalculator(String input,int num1,int num2) {
		
	if(input=="Add") {
		
		System.out.println(num1+num2);
		
		
	}
	
	else if (input=="Sub") {
		System.out.println(num1-num2);
	}
	
	else if (input=="Div") {
		
		float tem=num1/num2;
		System.out.println(tem);
	}
	
	else if (input=="Multiply") {
		System.out.println(num1*num2);
	}
		
	}
	
	public static void main(String[] args) {
		
		Calculator.getCalculator("Div", 14, 4);
		
	}

}
