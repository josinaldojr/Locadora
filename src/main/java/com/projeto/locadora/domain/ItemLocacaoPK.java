package com.projeto.locadora.domain;

public class ItemLocacaoPK extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Locacao locacao;
	private Filme filme;
	 
	public Locacao getLocacao() {
		return locacao;
	}
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filme == null) ? 0 : filme.hashCode());
		result = prime * result + ((locacao == null) ? 0 : locacao.hashCode());
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
		ItemLocacaoPK other = (ItemLocacaoPK) obj;
		if (filme == null) {
			if (other.filme != null)
				return false;
		} else if (!filme.equals(other.filme))
			return false;
		if (locacao == null) {
			if (other.locacao != null)
				return false;
		} else if (!locacao.equals(other.locacao))
			return false;
		return true;
	}
	
	

}
