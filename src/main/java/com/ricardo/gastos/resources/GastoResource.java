package com.ricardo.gastos.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.gastos.domain.Gastos;

@RestController
@RequestMapping(value="/gasto")
public class GastoResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Gastos> listar() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Gastos gast1 = new Gastos(1, "Ricardo", "Controle de gasto", sdf.parse("10/07/2019 00:00"), 25.99, null);
		Gastos gast2 = new Gastos(2, "Tiago", "Controle de gasto", sdf.parse("19/07/2019 00:00"), 205.99, null);
		
		List<Gastos> lista = new ArrayList<>();
		lista.add(gast1);
		lista.add(gast2);
		
		return lista;
	}
	

}
