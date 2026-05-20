package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentData {

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		Statement ps = c.createStatement();
		int checked = ps.executeUpdate("insert into student(id,name,city)values(131,'Sakshi','dhule')");
		if (checked > 0) {
			System.out.println("Inserted");
		} else {
			System.out.println("NOT inserted");
		}

		c.close();

	}

	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		Statement ps = c.createStatement();
		int checked = ps.executeUpdate("update student set name='Santosh',city = 'sangli' where id =125");
		if (checked > 0) {
			System.out.println("updated");
		} else {
			System.out.println("NOT updated");
		}

		c.close();

	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		Statement ps = c.createStatement();
		int checked = ps.executeUpdate("delete from student where id =130");
		if (checked > 0) {
			System.out.println("deleted");
		} else {
			System.out.println("NOT deleted");
		}

		c.close();
	}

	public void fetchAllRecord() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		Statement ps = c.createStatement();
		ResultSet rs = ps.executeQuery("select * from student");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "   " + rs.getString(3));
		}

		c.close();

	}

	public void getSingleRecord() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		Statement ps = c.createStatement();
		ResultSet rs = ps.executeQuery("select * from student where id = 123");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "   " + rs.getString(3));
		}

		c.close();
	}

}
