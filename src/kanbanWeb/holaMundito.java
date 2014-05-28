package kanbanWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import java.util.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class holaMundito
 */
@WebServlet("/holaMundito")
public class holaMundito extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter writer= response.getWriter();
		writer.print("<html><body><h1>Hola Mundo</h1>"+new Date().toString()+"</body></html>");
	}
}
