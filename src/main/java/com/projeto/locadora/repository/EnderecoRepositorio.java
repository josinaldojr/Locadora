package com.projeto.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.locadora.domain.Endereco;

@Repository
public interface EnderecoRepositorio extends JpaRepository<Endereco, Integer> {

}
