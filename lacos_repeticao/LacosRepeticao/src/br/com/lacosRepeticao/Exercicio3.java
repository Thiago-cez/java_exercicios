package br.com.lacosRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);
		int idade = 0, menor21 = 0,maior50 = 0;
		while(idade !=-99) {
			System.out.println("Insira uma idade: ");
			idade = input.nextInt();
			if(idade < 21 && idade > 0) {
				menor21 = menor21 + 1;
			}
			if(idade > 50) {
				maior50 = maior50 + 1;
			}
		}
		System.out.println("O Total de pessoas com menos de 21 anos �: "+menor21+
				"\nO Total de pessoas com mais de 50 anos �: "+maior50);
		input.close();
	}

}
