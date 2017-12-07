package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número: ");
		num = scan.nextInt();
		
		if((num % 2 == 1) || (num == 2) || (num % num == 1)) {
			System.out.println("É primo");
		}
		else {
			System.out.println("Não é primo");
		}
	}
}
