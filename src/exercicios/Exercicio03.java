package exercicios;

import java.util.Scanner;



public class Exercicio03 {

	public static void main(String[] args) {
		
		int num; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		num = scan.nextInt();
		scan.close();
		double resul = Math.abs(num);
		System.out.println( "O valor absoluto do n�mero " + num + "�: " + resul);
	}
}
