package br.com.trks.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inscricaoefetuada")
public class InscricaoEfetuada {
	
	@Id
	private Integer id;
	private String transacao;
	private String status;
	private Integer quantidade;
	private Double valor;
	private String formaPagamento;
	
	public InscricaoEfetuada() {}

	public InscricaoEfetuada(Integer id, String transacao, String status, Integer quantidade, Double valor,
			String formaPagamento) {
		super();
		this.id = id;
		this.transacao = transacao;
		this.status = status;
		this.quantidade = quantidade;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}

	public Integer getId() {
		return id;
	}

	public String getTransacao() {
		return transacao;
	}

	public void setTransacao(String transacao) {
		this.transacao = transacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}


}
