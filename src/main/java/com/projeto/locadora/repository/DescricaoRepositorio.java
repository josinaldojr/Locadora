package com.projeto.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.locadora.domain.Descricao;

@Repository
public interface DescricaoRepositorio extends JpaRepository<Descricao, Integer> {

}
