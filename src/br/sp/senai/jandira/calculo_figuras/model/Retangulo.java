package br.sp.senai.jandira.calculo_figuras.model;

public class Retangulo {

	private double base;
	private double altura;
	private double perimetro;
	
	public void setBase(double base) {
		this.base = base;
	}
	public double getBase (double base) {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura (double altura) {
		return altura;
	}
	
	public void setPerimetro (double perimetro) {
		this.perimetro = perimetro;
	}
	
	public double getPerimetro (double perimetro) {
		return perimetro;
	}
	
	public double calcularArea () {
		double area = 2 * (base * altura);
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = 2 * (base + altura);
		return perimetro;
	}
	
	public void exibirDados(){
		System.out.println("=========================");
		System.out.println("Retangulo:");
		System.out.printf("Area: %s\n", calcularArea());
		System.out.printf("Perimetro: %s\n", calcularPerimetro());
		System.out.println("=========================");
		
	}
	
	
}