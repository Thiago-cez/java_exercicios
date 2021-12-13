package br.com.lacosRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	     
		Scanner input = new Scanner(System.in);
		int i = 1, num, soma = 0;
		do {
			System.out.println("Digite um número: ");
			num = input.nextInt();
			soma = soma + num;
			i = num;
		} while(i != 0);
		System.out.println("A soma dos números é: "+soma);
		input.close();
	}

}
