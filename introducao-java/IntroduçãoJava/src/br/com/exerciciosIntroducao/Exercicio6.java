package br.com.exerciciosIntroducao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		double x1,x2,y1,y2,pot1,pot2,D;
		
		System.out.println("Digite o valor de X no 1° ponto: ");
		x1 = leia.nextInt();
		System.out.println("Digite o valor de Y no 1° ponto: ");
		y1 = leia.nextInt();
		System.out.println("Digite o valor de X no 2° ponto: ");
		x2 = leia.nextInt();
		System.out.println("Digite o valor de Y no 2° ponto: ");
		y2 = leia.nextInt();
		
		pot1 = Math.pow((x2-x1), 2);
		pot2 = Math.pow((y2-y1), 2);
		D = Math.sqrt(pot1+pot2);
		System.out.println("A distância entre os pontos é: "+D);
		
		leia.close();
	}

}