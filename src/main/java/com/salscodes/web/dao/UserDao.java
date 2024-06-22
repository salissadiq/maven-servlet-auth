package com.salscodes.web.dao;

import java.sql.*;

import com.sals.PasswordEncriptionUtil;
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
		String query = "SELECT * FROM users WHERE email = ?";
		PreparedStatement pst = conn.prepareStatement(query);
		pst.setString(1, email);
		ResultSet rs =  pst.executeQuery();
		if(rs.next()) {    
			boolean passwordIsValid = PasswordEncriptionUtil.checkPassword(password, rs.getString("password"));
			if(passwordIsValid) {
				user.setId(rs.getInt("id"));
				user.setFullName(rs.getString("fullName"));
				user.setEmail(rs.getString("email"));
			}
		}
		
		return user;
	}
	
	public boolean register(String fullName, String email, String password) throws SQLException {
		
		String checkUserQuery = "SELECT * FROM users WHERE email = ?";
		String insertQuery = "INSERT INTO users (fullName, email, password) VALUES (?,?,?)";
		
		PreparedStatement pst = conn.prepareStatement(checkUserQuery);
		pst.setString(1, email);
		
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()) 
			return false;
		PreparedStatement prepareInsert = conn.prepareStatement(insertQuery);
		prepareInsert.setString(1, fullName);
		prepareInsert.setString(2, email);
		prepareInsert.setString(3, password);
		
		if(prepareInsert.executeUpdate() > 0) {
			return true;
		}
		return false;
	}

}
