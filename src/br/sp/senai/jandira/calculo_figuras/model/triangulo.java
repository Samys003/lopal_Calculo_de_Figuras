package br.sp.senai.jandira.calculo_figuras.model;

public class triangulo {
	
	private double base;
	private double altura;
	private double area;
	
	
	public void setBase (double base) { 
	 this.base = base;
	}	
	
	public double getBase (double base) {
		return base;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double getAltura (double altura) {
		return altura;
	}
	
	public void setArea (double area) {
		this.area = area;
	}
	
	public double getArea (double area) {
		return area;
	}
	
	public double calcularArea(){
		double area = (base * altura) / 2;
		return area;
		
	}
	
	public void exibirDadods() {
		System.out.println("=========================");
		System.out.println("Triângulo:");
		System.out.printf("Area: %s\n", calcularArea());
		
	}
	
}
