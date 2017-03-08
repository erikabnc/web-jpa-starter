package it.dstech.servlets;

import java.io.IOException;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.dao.AlunniDao;

import it.dstech.models.Alunno;

public class ListaAlunniServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AlunniDao alunniDao = new AlunniDao();
		List<Alunno> list = alunniDao.list();
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/pages/alunni-lista.jsp").forward(req, resp);
	}

}
