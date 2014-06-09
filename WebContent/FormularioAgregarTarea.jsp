<%@page import="java.util.Date"%>
<%@page import="kanban.*"%>
<%@page import="reos.kanban.web.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Tarea</title>
</head>
<body>

<form method="post" action="TareasServlet">
    <table>
	<tr>
	<td>Titulo</td>
	<td>
	<input type="text" name="titulo">
	</td>
	</tr>
	<tr>
	<td>Categoria</td>
	<td>
	<input type="text" name="categoria">
	</td>
	</tr>
	<tr>
	<td>Prioridad</td>
	<td>
	<select name="prioridad">
	<%
		for(int i=1;i<11;i++){
			out.print("<option value=\""+i+"\">"+i+"</option>");
		}
	%>
	</select>	
	</td>
	</tr>
	<tr>
	<td>Descripcion</td>
	<td>
	<input type="text" name="descripcion">
	</td>
	</tr>
	<tr>
	<td>Propietario</td>
	<td>
	<input type="text" name="propietario">
	</td>
	</tr>
	<tr>
	<td>Estado</td>
	<td>
	<select name="Estado">
				
	<%			
				for(Estado estado: Estado.values()){
					out.print("<option value=\""+estado.name()+" \">"+estado.name()+"</option>");
				}
	%>			
				
				
	</td>
	</tr>
	<tr>
	<td>Fecha de entrega</td>
	<td>
	</select>
	<select name="dia">
	<%			
			for(int i=1;i<32;i++){
				out.print( "<option value=\""+i+"\">"+i+"</option>");
			}
		out.print("</select><select name=\"mes\"");
				
		
				for(Meses estado: Meses.values()){
					if(estado.equals(Meses.Enero)){
						out.print("<option value=\""+estado.name()+" selected \">"+estado.name()+"</option>");
					}
					out.print("<option value=\""+estado.name()+" \">"+estado.name()+"</option>");
				}
		out.print("</select><select name=\"ano\"");
				
				

				for(int i=2009;i<2020;i++){
					out.print("<option value=\""+i+"\">"+i+"</option>");
				}
		%>		
		</select>
		</td>
		</tr>
		<tr>
		<td>
		<input type="submit" name="agregar" value="Agregar Tarea">
				</td>
				</tr>
				</table>
				</form>

<%--
<%  
	String[] Values={"hola","adios"};
	String prueva=request.getParameter("test");
	out.println(prueva);
	out.print("hola mundo " + new Date().toString());
	 %>
	 <%@ include file="derechos.jsp" %>--%>
</body>
</html>