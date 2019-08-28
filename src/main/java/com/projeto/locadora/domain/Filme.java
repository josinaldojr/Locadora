package com.projeto.locadora.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Filme implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String nome;
	
	private double preco;
	
	private List<Descricao> titulo = new ArrayList<>();
	
	private Set<ItemLocacao> itens = new HashSet<>();
	
	public Filme() {}

	public Filme(Integer id, String nome, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public List<Locacao> getLocacao(){
		List<Locacao> lista = new ArrayList<>();
		for(ItemLocacao x: itens) {
			lista.add(x.getLocacao());
		}
		return lista;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Descricao> getTitulo() {
		return titulo;
	}

	public void setTitulo(List<Descricao> titulo) {
		this.titulo = titulo;
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
		Filme other = (Filme) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
