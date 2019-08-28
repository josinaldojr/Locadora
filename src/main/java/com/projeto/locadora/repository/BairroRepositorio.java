package com.projeto.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projeto.locadora.domain.Bairro;

@Repository
public interface BairroRepositorio extends JpaRepository<Bairro, Integer>{

}
