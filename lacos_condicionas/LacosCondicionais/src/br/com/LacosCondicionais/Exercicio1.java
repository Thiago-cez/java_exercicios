package br.com.LacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int maior;
		
		System.out.println("Digite o primeiro n�mero: ");
		int n1 = input.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int n2 = input.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		int n3 = input.nextInt();
		if(n1 >= n2 && n1 >= n3){
			maior = n1;
		}
		else if(n2 >= n1 && n2 >= n3){
			maior = n2;
		}
		else {
			maior = n3;
		}
		System.out.println("O maior valor �: "+maior);
		
		input.close();
	}

}
