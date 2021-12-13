package br.com.lacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		double div = 0, mult3 = 0, totaldiv;
		int num, i;
		do {
			System.out.println("Digite um número: ");
			num = input.nextInt();
			if(num%3 == 0 && num != 0) {
				mult3 = mult3 + num;
				div = div + 1;
			}
			i = num;
		} while(i != 0);
		totaldiv = mult3/div;
		System.out.println("A média dos números múltiplos de 3: "+totaldiv);
		input.close();
	}

}
