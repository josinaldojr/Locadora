package com.projeto.locadora.domain;

import java.io.Serializable;


public class ItemLocacao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private ItemLocacaoPK id = new ItemLocacaoPK();
	
	private double desconto;
	private Integer quantidade;
	private double preco;
	
	public ItemLocacao() {}

	public ItemLocacao(Locacao locacao,Filme filme,ItemLocacaoPK id, double desconto, Integer quantidade, double preco) {
		super();
		id.setLocacao(locacao);
		id.setFilme(filme);
		this.id = id;
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public Locacao getLocacao() {
		return id.getLocacao();
	}
	
	public Filme getFilme() {
		return id.getFilme();
	}

	public ItemLocacaoPK getId() {
		return id;
	}

	public void setId(ItemLocacaoPK id) {
		this.id = id;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
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
		ItemLocacao other = (ItemLocacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
