package Multithreading;

class Hi extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Hiii");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

class Hello extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
}
public class UsingThreadClass {
	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		obj2.start();
		
		
	}

}
