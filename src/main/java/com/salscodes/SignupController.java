package com.salscodes;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.salscodes.web.dao.UserDao;

public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		
		String fullName = request.getParameter("fullName");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		UserDao userdao = new UserDao();
		
		try {
			userdao.connection();
			boolean resp =  userdao.register(fullName, email, pass);
			if(resp)
				out.println("Succesfully registered!");
			else if(!resp)
				out.println("Email already exist");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
