package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.CaculadoraController;

@SpringBootApplication
public class SegundoproyectoedmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundoproyectoedmApplication.class, args);
		CaculadoraController nuevoControlador=new CaculadoraController();
		nuevoControlador.resolverSuma();
	}

}
