package it.dstech.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		if ((!req.getParameter("username").equals("root")) || (!req.getParameter("password").equals("1234"))) {
			resp.sendRedirect("login");
		} else {
			resp.sendRedirect("alunni");
		}

	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/pages/login.jsp").forward(req, resp);
		;
	}

}
