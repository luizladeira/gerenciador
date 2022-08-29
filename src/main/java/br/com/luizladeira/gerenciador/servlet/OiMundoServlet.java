package br.com.luizladeira.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * o @WebServlet com a url patterns é uma rota mais é conhecido no java como mapeamento
 */
@WebServlet(urlPatterns = "/oi") //Anotação @ 

public class OiMundoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * method service que a atende o servlet
	 * para anotoções coloca @
	 * @throws IOException 
	 */
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Oi teste, esse é o primeiro Servlet!</p>");
		out.println("</body>");
		out.println("</html>");

		System.out.println("O servlet oiMundoServlet foi chamado perfeitamente"); //mostra no console
	}
}
