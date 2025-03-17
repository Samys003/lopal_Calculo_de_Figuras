package br.sp.senai.jandira.calculo_figuras.model;

public class Circunferencia {
	
	private double raio;
	
	public void setRaio (double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return this.raio;	
	}
	
	public double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	
	public void exibirDados() {
		System.out.println("=========================");
		System.out.println("Circunferencia:");
		System.out.printf("Area: %s\n", calcularArea());
		System.out.println("=========================");
		
	}


	
}

