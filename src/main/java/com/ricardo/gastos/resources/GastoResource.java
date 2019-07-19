package com.ricardo.gastos.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.gastos.domain.Gastos;
import com.ricardo.gastos.services.GastosService;

@RestController
@RequestMapping(value="/gasto")
public class GastoResource {
	
	@Autowired
	private GastosService service;
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ParseException {
		Gastos obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
	

}
