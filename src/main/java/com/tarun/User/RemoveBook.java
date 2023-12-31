package com.tarun.User;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tarun.DAO.CartDAOImpl;
import com.tarun.DB.DBConnected;


@WebServlet("/remove_book")
public class RemoveBook  extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int bid= Integer.parseInt(req.getParameter("bid"));
		int uid= Integer.parseInt(req.getParameter("uid"));
		int cid= Integer.parseInt(req.getParameter("cid"));
		
		CartDAOImpl dao=new CartDAOImpl(DBConnected.getConn());
		boolean f = dao.removeBook(bid,uid,cid);
		HttpSession session = req.getSession();
		
		if(f)
		{
			session.setAttribute("succMsg", "Book Removed from Cart");
			resp.sendRedirect("card.jsp");
		}else
		{
			session.setAttribute("failedMsg", "Something went wrong");
			resp.sendRedirect("card.jsp");
		}
		
	}

}
