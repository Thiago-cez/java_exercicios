package br.com.LacosCondicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		double num = input.nextDouble();
		if(num%2 == 0) {
			double raiz = Math.sqrt(num);
			System.out.println("O n�mero � par e sua raiz quadrada �: "+raiz);
		}
		else {
			double pot = Math.pow(num, 2);
			System.out.println("O n�mero � �mpar e sua pot�ncia quadrada �: "+pot);
		}
		input.close();
	}

}