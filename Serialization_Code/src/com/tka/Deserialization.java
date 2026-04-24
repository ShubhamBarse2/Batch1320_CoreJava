package com.tka;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	// Deserialization Process 
	
	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\java material\\employee55.txt");
		ObjectInputStream os = new ObjectInputStream(file);

		Employee emp = (Employee) os.readObject();

		System.out.println(emp.empId + "   " + emp.name + "  " + emp.salary);

		os.close();
		file.close();

	}

}
