package com.tka;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	// Serialization process

	public static void main(String[] args) throws Exception {

		Employee e = new Employee(125, "Raghu", 25000);

		FileOutputStream file = new FileOutputStream("C:\\java material\\employee55.txt");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(e);

		file.close();
		os.close();

		System.out.println("file created SuccessFully ... !");

	}

}
