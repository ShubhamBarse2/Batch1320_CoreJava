package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into student(id,name,city)values(?,?,?)");
		ps.setInt(1, 133);
		ps.setString(2, "sayee");
		ps.setString(3, "solapur");
		int checked = ps.executeUpdate();

		if (checked > 0) {
			System.out.println("Inserted");
		} else {
			System.out.println("NOT inserted");
		}

		c.close();
	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		PreparedStatement ps = c.prepareStatement("delete from student where id =?");
		ps.setInt(1, 133);
		int checked = ps.executeUpdate();

		if (checked > 0) {
			System.out.println("deleted");
		} else {
			System.out.println("NOT deleted");
		}

		c.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		PreparedStatement ps = c.prepareStatement("update student set name = ? , city = ? where id = ?");
		ps.setString(1, "Vikii");
		ps.setString(2, "mumbai");
		ps.setInt(3, 125);
		int checked = ps.executeUpdate();

		if (checked > 0) {
			System.out.println("updated");
		} else {
			System.out.println("NOT updated");
		}

		c.close();
	}

	public void getAllData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "   " + rs.getString(3));
		}

		c.close();
	}

	public void getSingleData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from student where id = ?");
		ps.setInt(1, 125);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "   " + rs.getString(3));
		}

		c.close();
	}

}
