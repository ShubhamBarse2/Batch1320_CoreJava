package com.controller;

import java.util.Scanner;

import com.pojo.Student;
import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) throws Exception {

		
		StudentService ss = new StudentService();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name ");
		String name = sc.nextLine();
		System.out.println("Enter city ");
		String city = sc.nextLine();

		Student s = new Student(id, name, city);
		ss.insertData(s);
//		ss.deleteData();
//		ss.updateData();
//		ss.getAllData();
//		ss.getSingleData();

	}
}
