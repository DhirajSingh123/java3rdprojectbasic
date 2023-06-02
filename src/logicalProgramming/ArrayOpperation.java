package logicalProgramming;

public class ArrayOpperation {
	
	public static void main(String[] args) {
		
//		int [] no=new int[6];
//		no[0]=6;
//		
//		no[1]=5;
//		no[4]=23;
//		
//		System.out.println(no[4]);
		
		int a[][]={{1,2,4},{3,4,5}}; 
		int b[][]={{7,4,5},{1,8,4}}; 
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= a.length; j++) {
				
				System.out.print(a[i][j] * b[i][j] + " ");
			}
			System.out.println("");
			
		}
		
		
	}

}
