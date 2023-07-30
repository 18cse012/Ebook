package com.tarun.User;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tarun.DAO.UserDAOImpl;
import com.tarun.DB.DBConnected;
import com.tarun.Entity.User;



@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String name = req.getParameter("fname");
			String email = req.getParameter("email");
			String phno = req.getParameter("phno");
			String password = req.getParameter("password");
			String check = req.getParameter("check");

			

			User us = new User();

			us.setName(name);
			us.setEmail(email);
			us.setPhno(phno);
			us.setPassword(password);
        
			
			HttpSession session = req.getSession();
			
			if (check != null) {
				UserDAOImpl dao = new UserDAOImpl(DBConnected.getConn());

				boolean f = dao.userRegister(us);

				if (f) {
				
					session.setAttribute("succMsg","Registration Sucessfully");
					resp.sendRedirect("Register.jsp");
				} else {

				   
					session.setAttribute("faildMsg","Something Went to Wrong");
				    resp.sendRedirect("Register.jsp");
				
				}
			}else {
				
			session.setAttribute("failedMsg","Please cheak Agree terms & Condition Box");
			resp.sendRedirect("Register.jsp");
			
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
