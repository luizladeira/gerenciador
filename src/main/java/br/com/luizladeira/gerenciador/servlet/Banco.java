package br.com.luizladeira.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<>(); //lista de empresas
	
	static {
		Empresa empresa_one = new Empresa();
		empresa_one.setName("Agilize seu Negocio");
		
		Empresa empresa_two = new Empresa();
		empresa_two.setName("Google");
		
		listaEmpresas.add(empresa_one);
		listaEmpresas.add(empresa_two);
		
	}
	
	
	public void save_empresa(Empresa empresa) {
		Banco.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.listaEmpresas; //devolve a lista de empresas
	}

}
