package br.com.trks.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "participantes")
public class Participante implements Serializable{
	
	@Id
	@GeneratedValue
	private Integer id;
	private String email;
	private String nome_cracha;
	private String instituicao;
	private String cpf;
	private String tipo_usuario;
	private String profissao;
	
	@Embedded
	private Contato contato;
	
	@Embedded
	private Endereco endereco;
	
	@OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
	private List<Artigo> artigos;

	@OneToMany(mappedBy = "inscrito", cascade = CascadeType.ALL)
	private List<Inscricao> inscricoes;	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome_cracha() {
		return nome_cracha;
	}

	public void setNome_cracha(String nome_cracha) {
		this.nome_cracha = nome_cracha;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
