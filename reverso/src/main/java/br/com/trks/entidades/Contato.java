package br.com.trks.entidades;

import javax.persistence.Embeddable;

@Embeddable
public class Contato {
	
	private String telefone_residencial;
	private String telefone_comercial;
	private String telefone_celular;
	
	
	
	public Contato() {
	}
	public Contato(String telefone_residencial, String telefone_comercial, String telefone_celular) {
		this.telefone_residencial = telefone_residencial;
		this.telefone_comercial = telefone_comercial;
		this.telefone_celular = telefone_celular;
	}
	public String getTelefone_residencial() {
		return telefone_residencial;
	}
	public void setTelefone_residencial(String telefone_residencial) {
		this.telefone_residencial = telefone_residencial;
	}
	public String getTelefone_comercial() {
		return telefone_comercial;
	}
	public void setTelefone_comercial(String telefone_comercial) {
		this.telefone_comercial = telefone_comercial;
	}
	public String getTelefone_celular() {
		return telefone_celular;
	}
	public void setTelefone_celular(String telefone_celular) {
		this.telefone_celular = telefone_celular;
	}
	
	

}
