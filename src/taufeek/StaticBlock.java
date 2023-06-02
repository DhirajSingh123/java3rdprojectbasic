package taufeek;

public class StaticBlock {
	//static block . only once
	static
    {
        // Print statement
        System.out.print(
            "Static block can be printed without main method");
    }
		
	public static void main(String[] args) {
		StaticBlock sb1= new StaticBlock();
		StaticBlock sb2= new StaticBlock();
	}

}
