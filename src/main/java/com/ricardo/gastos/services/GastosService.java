package com.ricardo.gastos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardo.gastos.domain.Gastos;
import com.ricardo.gastos.repositories.GastosRepository;

@Service
public class GastosService {

	@Autowired
	private GastosRepository repo;
	
	public Gastos buscar(Integer id) {
		Gastos obj = repo.findOne(id);
		return obj;		
	}
	
}
