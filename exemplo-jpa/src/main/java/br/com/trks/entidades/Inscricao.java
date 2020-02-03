package br.com.trks.entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="inscicoes")
public class Inscricao implements Serializable{
	
	@Id
	private Integer id;
	private Date data_inscricao;
	private String status_inscricao;
	private String id_transacao;
	private Double preco;
	private String tipo_evento;
	private String tipodeparticipacao;
	
	@ManyToOne
	private Participante inscrito;

	public Inscricao() {
		super();
	}

	public Inscricao(Date data_inscricao, String status_inscricao, String id_transacao, Double preco,
			String tipo_evento, String tipodeparticipacao, Participante inscrito) {
		super();
		this.data_inscricao = data_inscricao;
		this.status_inscricao = status_inscricao;
		this.id_transacao = id_transacao;
		this.preco = preco;
		this.tipo_evento = tipo_evento;
		this.tipodeparticipacao = tipodeparticipacao;
		this.inscrito = inscrito;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData_inscricao() {
		return data_inscricao;
	}

	public void setData_inscricao(Date data_inscricao) {
		this.data_inscricao = data_inscricao;
	}

	public String getStatus_inscricao() {
		return status_inscricao;
	}

	public void setStatus_inscricao(String status_inscricao) {
		this.status_inscricao = status_inscricao;
	}

	public String getId_transacao() {
		return id_transacao;
	}

	public void setId_transacao(String id_transacao) {
		this.id_transacao = id_transacao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getTipo_evento() {
		return tipo_evento;
	}

	public void setTipo_evento(String tipo_evento) {
		this.tipo_evento = tipo_evento;
	}

	public String getTipodeparticipacao() {
		return tipodeparticipacao;
	}

	public void setTipodeparticipacao(String tipodeparticipacao) {
		this.tipodeparticipacao = tipodeparticipacao;
	}

	public Participante getInscrito() {
		return inscrito;
	}

	public void setInscrito(Participante inscrito) {
		this.inscrito = inscrito;
	}	

	
}
