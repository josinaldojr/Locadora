package com.projeto.locadora.domain;

import com.projeto.locadora.domain.enums.EstadoPagamento;

public class PagamentoDinheiro extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private double valor;
	
	public PagamentoDinheiro() {}

	public PagamentoDinheiro(Integer id, EstadoPagamento estado, Locacao locacao, double valor) {
		super(id, estado, locacao);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
