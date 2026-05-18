package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 2 step Register & Load Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 3 step get Connection
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1320", "root", "root");
		// 4 step we have two option(Statement(Static) & PreapredSatatemt(Dynamic))
		Statement s = c.createStatement();
		// 5 step execute query and then get result
		int checked = s.executeUpdate("insert into student(id,name,city)values(125,'om','nsk')");

		if (checked > 0) {
			System.out.println("Inserted ...!");
		} else {
			System.out.println("NOT inserted...!");
		}

	}
}
