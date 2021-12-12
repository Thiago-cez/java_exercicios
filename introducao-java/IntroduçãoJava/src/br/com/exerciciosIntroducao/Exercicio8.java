package br.com.exerciciosIntroducao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double fabrica, distribuidor, precofinal;
		
		System.out.println("Digite o valor de fábrica: ");
		fabrica = leia.nextDouble();
		distribuidor = fabrica + (fabrica*0.45);
		precofinal = distribuidor + (distribuidor*0.28);
		System.out.println("O custo para o consumidor é: "+precofinal);
		
		leia.close();
	}

}