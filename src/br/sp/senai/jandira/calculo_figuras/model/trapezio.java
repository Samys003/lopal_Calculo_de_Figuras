package br.sp.senai.jandira.calculo_figuras.model;

public class trapezio {
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
	
	public void setbaseMaior (double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getbaseMaior (double baseMaior) {
		return baseMaior ;
	}
	
	public void setbaseMenor (double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getbaseMenor (double baseMenor) {
		return baseMenor;
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
	
	public double calcularArea() {
		double area = (baseMaior + baseMenor) * altura / 2;
		return area;
	}
}