package br.com.exerciciosIntroducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int A,B,C;
		double R,S,D;
		
		System.out.println("Insira o valor de A: ");
		A = leia.nextInt();
		System.out.println("Insira o valor de B: ");
		B = leia.nextInt();
		System.out.println("Insira o valor de C: ");
		C = leia.nextInt();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = (R+S)/2;
		System.out.println("D = "+D);		
		
		leia.close();
	}

}