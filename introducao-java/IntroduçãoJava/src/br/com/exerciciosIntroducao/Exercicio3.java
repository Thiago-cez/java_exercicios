package br.com.exerciciosIntroducao;

import java.util.Scanner;

public class Exercicio3{

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int horas, minutos, segundos, resto,total;
		
		System.out.println("Insira a duração do evento em segundos: ");
		total = leia.nextInt();
		horas = total/3600;
		resto = total%3600;
		minutos = resto/60;
		segundos = total%60;
		System.out.println("A duração do evento é de: "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
		
		leia.close();
	}

}