package br.com.trks.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="artigos")
public class Artigo implements Serializable{
	@Id
	private Integer id;
	private String titulo;
	private String orientador;
	private String coautores;
	private String modalidade;
	private String data_submissao;
	private String url_download;
	
	@ManyToOne
	private Participante autor;
	
	public Artigo() {
		super();
	}
	public Artigo(String titulo, String orientador, String coautores, String modalidade,
			String data_submissao, String url_download) {
		this.titulo = titulo;
		this.orientador = orientador;
		this.coautores = coautores;
		this.modalidade = modalidade;
		this.data_submissao = data_submissao;
		this.url_download = url_download;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getOrientador() {
		return orientador;
	}
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}
	public String getCoautores() {
		return coautores;
	}
	public void setCoautores(String coautores) {
		this.coautores = coautores;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public String getData_submissao() {
		return data_submissao;
	}
	public void setData_submissao(String data_submissao) {
		this.data_submissao = data_submissao;
	}
	public String getUrl_download() {
		return url_download;
	}
	public void setUrl_download(String url_download) {
		this.url_download = url_download;
	}
	
	
	
	
	

}
