package br.com.lacosRepeticao;

public class Exercicio1 {

	public static void main(String[] args) throws InterruptedException {
	
		for(int i = 1000; i <= 1999; i++) {
			if (i%11 == 5) {
				System.out.printf("Divisão: %d/11 = %d e resta = 5 \n",i,i/11);
				Thread.sleep(500);
			}
		}
       
	}

}
