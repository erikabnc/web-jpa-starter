package it.dstech.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.dao.AlunniDao;
import it.dstech.models.Alunno;

public class AlunniServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AlunniDao alunniDao = new AlunniDao();
		Alunno a = new Alunno();
		a.setNome(req.getParameter("nome"));
		a.setCognome(req.getParameter("cognome"));
		a = alunniDao.save(a);
		resp.sendRedirect("alunni");

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("WEB-INF/pages/alunni-add.jsp").forward(req, resp);
	}

}
