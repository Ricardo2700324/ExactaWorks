package com.ricardo.gastos;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ricardo.gastos.domain.Gastos;
import com.ricardo.gastos.repositories.GastosRepository;

@SpringBootApplication
public class GastosApplication implements CommandLineRunner  {

	@Autowired
	private GastosRepository gastosRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GastosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		
		Gastos gat1 = new Gastos(null, "Ricardo", "controle de gasto", sdf.parse("10/11/2017 00:00"), 25.99, null);
		Gastos gat2 = new Gastos(null, "Tiago", "controle de gasto", sdf.parse("02/07/2019 14:02"), 25.99, null);
		
		gastosRepository.save(Arrays.asList(gat1, gat2));
		
	}
	
	

}
