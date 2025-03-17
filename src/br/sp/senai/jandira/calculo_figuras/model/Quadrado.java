package br.sp.senai.jandira.calculo_figuras.model;

public class Quadrado {

	private double base;
	private double altura;
	private double perimetro;

	public void setBase(double base) {
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return base;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro = 2 * (base * altura);
		return perimetro;
	}

	public void exibirDados(){
	System.out.println("=========================");
	System.out.println("Quadrado:");
	System.out.printf("Area: %s\n", calcularArea());
	System.out.printf("Perimetro: %s\n", calcularPerimetro());
	System.out.println("=========================");
	}
	
}
	

