package br.sp.senai.jandira.calculo_figuras.model;

import java.util.Scanner;

public class CalculoDePoligonos {
	
	public static void calcularQuadrado() {
		
		Quadrado quadrado = new Quadrado();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Altura do quadrado: ");
		double altura = leitor.nextDouble();
		
		System.out.println("Base do quadrado: ");
		double base = leitor.nextDouble();	
		
		quadrado.setAltura(altura);
		quadrado.setBase(base);
		quadrado.mostrarDados();
		
		leitor.close();
		
	}

}
