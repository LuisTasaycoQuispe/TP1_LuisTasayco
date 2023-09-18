package pe.edu.vallegrande.proyecto.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.vallegrande.proyecto.clas.Calculadora;

/**
 * Servlet implementation class Calcular
 */
@WebServlet("/Calcular")
public class Calcular extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 response.setContentType("text/html"); 
		  PrintWriter out = response.getWriter();
		  System.out.println("bien");

		 
		  int numero1 = Integer.parseInt(request.getParameter("numero1"));
		  int numero2 = Integer.parseInt(request.getParameter("numero2"));
		  String operacion = request.getParameter("operacion");
		  
		  int resultado = Calculadora.operacion(numero1, numero2, operacion);
		  
		  out.println("<h3>Numero1 : "+ numero1+"</h3>");

		  out.println("<h3>Numero2 : "+ numero2+"</h3>");

		  out.println("<h3>Operacion : "+ operacion+"</h3>");

		  out.println("<h3>Resultado : " + resultado+"</h3>");
		  
		  out.println("<a href='Calcular.html'>Calculadora</a>");
	}

}
