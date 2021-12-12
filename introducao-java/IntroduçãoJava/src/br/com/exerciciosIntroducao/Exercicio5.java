package br.com.exerciciosIntroducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, mp;
		System.out.println("Adicione a 1° nota: ");
		n1 = leia.nextFloat();
		System.out.println("Adicione a 2° nota: ");
		n2 = leia.nextFloat();
		System.out.println("Adicione a 3° nota: ");
		n3 = leia.nextFloat();
		mp = ((n1*2)+(n2*3)+(n3*5))/10;
		System.out.println("A média final é: "+mp);
		
		leia.close();
	}

}