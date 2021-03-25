package com.example.demo.controller;

import com.example.demo.model.Calculadora;

public class CaculadoraController {
	public void resolverSuma(){
		int num1=3,num2=6;
		
		Calculadora nuevaCalculadora=new Calculadora();//tipo "Calculadora"	
		nuevaCalculadora.setA(num1);
		nuevaCalculadora.setB(num2);
		nuevaCalculadora.sumarDosNumeros();
		System.out.println("La suma: "+nuevaCalculadora.sumarDosNumeros());
	}	
}
