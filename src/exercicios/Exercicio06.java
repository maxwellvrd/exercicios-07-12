package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int valor;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		valor = scan.nextInt();
		scan.close();
		if(valor % 2 == 0) {
			System.out.println("O número " + valor + " é par!");
		} else {
			System.out.println("O número " + valor + " é impar!");
		}
	}

}


