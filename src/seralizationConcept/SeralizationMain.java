package seralizationConcept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SeralizationMain {

	public static void main(String[] args) throws IOException {
		Employee emp = new Employee("Dhiraj", 16768);
		try {
			
			FileOutputStream fos = new FileOutputStream("file.txt");			
			ObjectOutputStream stream= new ObjectOutputStream(fos);
			stream.writeObject(emp);
			
			System.out.println("file writing done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
