package com.projeto.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.locadora.domain.Cidade;

@Repository
public interface CidadeRepositorio extends JpaRepository<Cidade, Integer> {

}
