package br.com.lacosRepeticao;

import java.util.Scanner;

public class Exercicio4 {    

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = 0, idade, sexo, humor, nCalmo = 0, nMNervosa = 0, nHAgressivo = 0; 
		int nOCalmos = 0, nervosa40 = 0, calma18 = 0;
		
		while(n <3) {
			System.out.println("Digite sua idade: ");
			idade = input.nextInt();
			System.out.println("Digite o n�mero corespondente ao seu g�nero: \n1 - Feminino"
					+ "\n2 - Masculino\n3 - Outro");
			sexo = input.nextInt();
			if(sexo < 1 || sexo > 3) {
				System.out.println("N�mero inv�lido, digite o correspondente: \n1 - Feminino"
					+ "\n2 - Masculino\n3 - Outro");
				sexo = input.nextInt();
			}	
			System.out.println("\"Digite o n�mero correspondente a categoria que se encaixa: \n1 - Voc� � Calma(o)"
					+ "\n2 - Voc� � nervosa(o) \n3 - Voc� � agressiva(o)");
			humor = input.nextInt();
			if(humor<1 || humor >3) {
				System.out.println("N�mero inv�lido, digite o correspondente: \n1 - Voc� � Calma(o)"
						+ "\n2 - Voc� � nervosa(o) \n3 - Voc� � agressiva(o)");
					humor = input.nextInt();
			}
			if(humor == 1) {
				nCalmo += 1;
			}
			if(sexo == 1 && humor == 2) {
				 nMNervosa += 1;
			}
			if(sexo == 2 && humor == 3) {
				nHAgressivo += 1;
			}
			if(sexo == 3 && humor == 1) {
				nOCalmos += 1;
			}
			if(idade>40 && humor == 2) {
				nervosa40 +=1;
			}
			if(idade <18 && humor == 1) {
				calma18 += 1;
			}
			n++;
		}
		System.out.println("N�mero de pessoas calmas: "+nCalmo);
		System.out.println("N�mero de mulheres nervosas: "+nMNervosa);
		System.out.println("N�mero de homens agressivos: "+nHAgressivo);
		System.out.println("N�mero de outros g�neros calmos: "+nOCalmos);
		System.out.println("N�mero de pessoas nervosas com mais de 40 anos: "+nervosa40);
		System.out.println("N�mero de pessoas calmas com menos de 18 anos: "+calma18);
		input.close();
	}

}
