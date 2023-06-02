

//class is bluprint
public class MotarCar {
	
	public void carBrand(String brand ) {
		System.out.println(brand + " car");
	}

	public void carColor() {

		System.out.println("Red");
	}

	public void carBreak() {

		System.out.println("Disk break");
	}
	
	public void carMusicSystem() {

		System.out.println("Music System");
	}

	public static void main(String[] args) {

		MotarCar car1= new MotarCar();
		car1.carBrand("Bmw");
		MotarCar car2= new MotarCar();
		car2.carBrand("Audie");
		
		

	}

}
