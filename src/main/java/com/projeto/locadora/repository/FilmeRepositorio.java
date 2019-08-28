package com.projeto.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.locadora.domain.Filme;

@Repository
public interface FilmeRepositorio extends JpaRepository<Filme, Integer> {

}
