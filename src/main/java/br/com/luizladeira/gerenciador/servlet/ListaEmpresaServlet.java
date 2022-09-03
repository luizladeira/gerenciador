package br.com.luizladeira.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresaServlet
 */
@WebServlet("/lista-empresas")
public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas(); 
		
		PrintWriter out = response.getWriter();
		out.println();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<ul>");
		
		//open laço de repetição
		for (Empresa empresa : lista) {
			out.println("<li>"+empresa.getId()+" | "+empresa.getName()+"</li>");
		}
		//close laço
		
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
