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
		writer.print(""
				+ "<html>"
				+ "<head>"
				+ "<title>agregar tarea</title>"
				+ "</head>"
				+ "<body>"
				+ "<form method=\"post\">"
    			+ "<table>"
				+ "<tr>"
				+ "<td>Titulo</td>"
				+ "<td>"
				+ "<input type=\"text\" name=\"titulo\">"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>Estado</td>"
				+ "<td>"
				+ "<input type=\"text\" name=\"estado\">"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>Prioridad</td>"
				+ "<td>"
				+ "<input type=\"text\" name=\"prioridad\">"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>Descripcion</td>"
				+ "<td>"
				+ "<input type=\"text\" name=\"descripcion\">"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>Propietario</td>"
				+ "<td>"
				+ "<input type=\"text\" name=\"propietario\">"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>Categoria</td>"
				+ "<td>"
				+ "<input type=\"text\" name=\"categoria\">"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>Fecha de entrega</td>"
				+ "<td>"
				+ "<input type=\"date\" name=\"fechaEntrega\">"
				+ "</td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"
				+ "<input type=\"submit\" name=\"agregar\" value=\"Agregar Tarea\">"
				+ "</td>"
				+ "</tr>"
				+ "</table>"
				+ "</form>"
				+ "</body>"
				+ "</html>");
		
//
//		+"<tr>"
//		+"<td>Title:</td>"
//		+"<td>"
//		+"<input type=\"text\" name=\"title\" />"
//		+"</td>"
//		+"</tr>"
//		+"<tr>"
//		+"<td>Estado:</td>"
//		+"<td>"
//		+"<input type=\"text\" name=\"Estado\" />"
//		+"</td>"
//		+"</tr>"
//		+"<tr>"
//		+"<td>Descripcion:</td>"
//		+"<td>"
//		+"<input type=\"text\" name=\"descripcion\" />"
//		+"</td>"
//		+"</tr>"
//		+"<td>Fecha de Entrega:</td>"
//		+"<td>"
//		+"<input type=\"text\" name=\"Fecha de Entrega\" />"
//		+"</td>"
//		+"</tr>"
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer= response.getWriter();
		writer.print(""
				+ "<html>"
				+ "<head>"
				+ "<title>agregar tarea</title>"
				+ "</head>"
				+ "<body>"
				+ "hola"
				+ "</body>"
				+ "</html>");
		
	}

}
