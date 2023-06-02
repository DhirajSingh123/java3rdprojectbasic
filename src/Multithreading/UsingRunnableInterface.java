package Multithreading;


class Bye implements Runnable{
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Byeee");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}


class GooBye implements Runnable{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Good Byeee");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
public class UsingRunnableInterface {
	public static void main(String[] args) {
		
		
		Runnable obj1 = new Bye();
		
		Runnable obj2 = new GooBye();
		
		
		Thread t1= new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();		
		t2.start();
		
	}

}
