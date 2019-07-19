package com.ricardo.gastos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ricardo.gastos.domain.Gastos;

@Repository
public interface GastosRepository extends JpaRepository<Gastos, Integer> {

	
}
