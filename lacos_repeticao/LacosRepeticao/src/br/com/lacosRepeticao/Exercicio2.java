package br.com.lacosRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int impar = 0, par = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Insira um n�mero: ");
			int num = input.nextInt();
			if(num%2 == 0) {
				par = par + 1;
			}
			else {
				impar = impar + 1;
			}     
		}
		System.out.printf("A Quantidade de n�meros pares �: %d e a quantidade de �mpares �: %d\n",par,impar);
		input.close();
	}

}