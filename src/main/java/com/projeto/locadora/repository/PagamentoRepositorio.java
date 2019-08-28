package com.projeto.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.locadora.domain.Pagamento;

@Repository
public interface PagamentoRepositorio extends JpaRepository<Pagamento, Integer> {

}
