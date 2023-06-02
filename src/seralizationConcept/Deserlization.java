package seralizationConcept;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserlization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("file.txt");
		
		ObjectInputStream ips = new ObjectInputStream(fis);
		
		Employee emp = (Employee) ips.readObject();
		System.out.println(emp.getName());
		// ) not coming because we declare transient befroe private
		System.out.println(emp.getId());
		
	}

}
