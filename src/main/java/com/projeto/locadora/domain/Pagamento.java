package com.projeto.locadora.domain;

import java.io.Serializable;

import com.projeto.locadora.domain.enums.EstadoPagamento;

public class Pagamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer estado;
	private Locacao locacao;
	
	public Pagamento() {}

	public Pagamento(Integer id, EstadoPagamento estado, Locacao locacao) {
		super();
		this.id = id;
		this.estado = estado.getCod();
		this.locacao = locacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
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
		Pagamento other = (Pagamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
