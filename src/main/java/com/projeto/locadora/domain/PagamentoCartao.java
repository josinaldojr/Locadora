package com.projeto.locadora.domain;

import com.projeto.locadora.domain.enums.EstadoPagamento;


public class PagamentoCartao extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;
	
	public PagamentoCartao() {}

	public PagamentoCartao(Integer id, EstadoPagamento estado, Locacao locacao, Integer numeroDeParcelas) {
		super(id, estado, locacao);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	
	

}
