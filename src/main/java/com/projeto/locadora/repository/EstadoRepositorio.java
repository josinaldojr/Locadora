package com.projeto.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.locadora.domain.Estado;

@Repository
public interface EstadoRepositorio extends JpaRepository<Estado, Integer> {

}
