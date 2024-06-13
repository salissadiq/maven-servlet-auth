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
import com.salscodes.web.model.User;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserDao userdao = new UserDao();
		try {
			userdao.connection();
			User user = userdao.login(email, password);
			PrintWriter out = response.getWriter();
			out.println(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		
	}

}
