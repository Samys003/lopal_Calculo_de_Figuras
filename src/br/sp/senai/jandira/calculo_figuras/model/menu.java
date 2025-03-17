package br.sp.senai.jandira.calculo_figuras.model;

import java.util.Scanner;

public class menu {
	
	public static void criarMenu () {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("-----------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("-----------------");
		System.out.println("1- QUADRADO");
		System.out.println("2- RETÂNGULO");
		System.out.println("3- TRAPÉZIO");
		System.out.println("4- TRIÂNGULO");
		System.out.println("5- CIRCUNFÊRENCIA");
		System.out.println("-----------------");
		System.out.println("ESCOLHA UMA OPÇÃO DE 1 A 5");
		System.out.println("-----------------");
		
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			CalculoDePoligonos.calcularQuadrado();
			
		}else { 
			System.out.println("A opção selecionada não foi implementada!");
			
		}
	}

}
