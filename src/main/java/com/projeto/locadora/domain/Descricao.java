package com.projeto.locadora.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Descricao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String titulo;
	
	private String subtitulo;
	
	private List<Filme> filmes = new ArrayList<>();
	
	private Set<String> genero = new HashSet<>();
	
	private Set<String> idioma = new HashSet<>();
	
	private List<Produtora> produtoras = new ArrayList<>();
	
	public Descricao() {}

	public Descricao(Integer id, String titulo, String subtitulo) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	public Set<String> getGenero() {
		return genero;
	}

	public void setGenero(Set<String> genero) {
		this.genero = genero;
	}

	public Set<String> getIdioma() {
		return idioma;
	}

	public void setIdioma(Set<String> idioma) {
		this.idioma = idioma;
	}

	public List<Produtora> getProdutoras() {
		return produtoras;
	}

	public void setProdutoras(List<Produtora> produtoras) {
		this.produtoras = produtoras;
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
		Descricao other = (Descricao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
