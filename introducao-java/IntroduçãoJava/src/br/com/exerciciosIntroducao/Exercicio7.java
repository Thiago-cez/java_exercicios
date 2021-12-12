package br.com.exerciciosIntroducao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		double a,b,c,d,e,f,x,y,div;
		
		System.out.println("Insira o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Insira o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Insira o valor de C: ");
		c = leia.nextDouble();
		System.out.println("Insira o valor de D: ");
		d = leia.nextDouble();
		System.out.println("Insira o valor de F: ");
		f = leia.nextDouble();
		System.out.println("Insira o valor de e: ");
		e = leia.nextDouble();
		
		div = (a*e)-(b*d);
		x = ((c*e)-(b*f))/div;
		y = ((a*f)-(c*d))/div;
		System.out.println("o valor de X é: "+x+" e o valor de Y é: "+y);
		
		leia.close();
	}

}
