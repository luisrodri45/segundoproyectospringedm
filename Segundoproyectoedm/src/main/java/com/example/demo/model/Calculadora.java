package com.example.demo.model;

public class Calculadora {
	//atributos
	private int a,b;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	public int sumarDosNumeros() {
		int suma;
		suma=a+b;
		return suma;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int numero) {
		this.a = numero;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
	
}
