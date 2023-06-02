package designpattern;

class Windows implements Os {

	@Override
	public void getOeratingSystem() {
		System.out.println("returning windows operating system");

	}

}

class Android implements Os {

	@Override
	public void getOeratingSystem() {
		System.out.println("returning Android operating system");

	}

}

class Factory {
	public Os getInstanse(String str) {

		if (str.equals("Open"))
			return new Android();
		else
			return new Windows();

	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {

		Factory obj = new Factory();
		Os obj1 = obj.getInstanse("Open");
		obj1.getOeratingSystem();

	}

}
