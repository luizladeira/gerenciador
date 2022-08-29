package br.com.luizladeira.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/nova-empresa")
 
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * doPost somente aceita requisição do tipo post
	 * doGet somente aceita requisição do tipo get
	 */

	//protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	System.out.println("Cadastrando uma nova empresa");
		
		String nomeEmpresa = request.getParameter("nome"); //Pega o parâmetro via get
		
		Empresa empresa = new Empresa();
		empresa.setName(nomeEmpresa);
			
		Banco banco = new Banco();
		banco.save_empresa(empresa);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Empresa "+ nomeEmpresa +" cadastrada com sucesso!</p>");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Nome da Empresa: "+nomeEmpresa);
	}

}
