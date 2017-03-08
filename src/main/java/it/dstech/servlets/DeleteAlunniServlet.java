package it.dstech.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.dao.AlunniDao;
import it.dstech.models.Alunno;

public class DeleteAlunniServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		AlunniDao adao = new AlunniDao();
		List<Alunno> list = adao.list();
		int id = Integer.parseInt(req.getParameter("id"));
		adao.delete(id);
		resp.sendRedirect("alunni");
	}

}
