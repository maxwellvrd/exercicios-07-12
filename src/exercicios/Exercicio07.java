package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		num = scan.nextInt();
		
		if((num % 2 == 1) || (num == 2) || (num % num == 1)) {
			System.out.println("� primo");
		}
		else {
			System.out.println("N�o � primo");
		}
	}
}
