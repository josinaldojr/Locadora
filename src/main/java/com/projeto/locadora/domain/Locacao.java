package com.projeto.locadora.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Locacao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Date dataDevolucao;
	
	private Date dataAquisicao;
	
	private Pagamento pagamento;
	
	private Endereco enderecodeLocacao;
	
	private Cliente cliente;
	
	private Set<ItemLocacao> itens = new HashSet<>();
	
	public Locacao() {}

	public Locacao(Integer id, Date dataDevolucao,Date dataAquisicao, Endereco enderecodeLocacao, Cliente cliente) {
		super();
		this.id = id;
		this.dataDevolucao = dataDevolucao;
		this.dataAquisicao = dataAquisicao;
		this.enderecodeLocacao = enderecodeLocacao;
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Date getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Endereco getEnderecodeLocacao() {
		return enderecodeLocacao;
	}

	public void setEnderecodeLocacao(Endereco enderecodeLocacao) {
		this.enderecodeLocacao = enderecodeLocacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<ItemLocacao> getItens() {
		return itens;
	}

	public void setItens(Set<ItemLocacao> itens) {
		this.itens = itens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Locacao other = (Locacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
