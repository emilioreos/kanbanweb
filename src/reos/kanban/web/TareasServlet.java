package reos.kanban.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TareasServlet
 */
public class TareasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TareasServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer= response.getWriter();
		writer.print("<html><head><title>agregar tarea</title></head><body><form method=\"post\"><table><tr><td>Titulo</td><td><input type=\"text\" name=\"title\"></td></tr></table></form></body></html>");
	}

}
