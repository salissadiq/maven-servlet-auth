package com.salscodes.web.dao;

import java.sql.*;

import com.salscodes.web.model.User;

public class UserDao {
	Connection conn = null;
	public void connection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/auth", "root", "INcorrect@0");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
	}
	
	public User login(String email, String password) throws ClassNotFoundException, SQLException {
		User user = new User();
		String query = "SELECT * FROM users WHERE email = ? AND password = ?";
		PreparedStatement pst = conn.prepareStatement(query);
		pst.setString(1, email);
		pst.setString(2, password);
		ResultSet rs =  pst.executeQuery();
		if(rs.next()) {    
			user.setId(rs.getInt("id"));
			user.setFullName(rs.getString("fullName"));
			user.setEmail(rs.getString("email"));
		}
		
		return user;
	}

}
