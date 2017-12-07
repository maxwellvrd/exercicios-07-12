package exercicios;

import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		
		String num1, num2, operacao;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		num1 = scan.next();
		System.out.print("Digite o segundo valor: ");
		num2 = scan.next();
		System.out.print("Informe a opera��o desejada: ");
		operacao = scan.next();
		scan.close();
		
		
		switch (operacao ) {
		case "soma":
			System.out.println("A soma dos valores �: " + (Integer.parseInt(num1) + Integer.parseInt(num2)));
			break;
		
		case "divisao":
			if (!num2.equals("0")) {
				System.out.println(
						"A divisao dos numeros �: " + (Double.parseDouble(num1) + Integer.parseInt(num2)));
			} else {
				System.out.println("Divis�o por 0");
			}
			break;

		case "subtracao":
			System.out.println("A subtra��o dos numeros �: " + (Double.parseDouble(num1) - Double.parseDouble(num2)));
			break;
		case "multiplicacao":
			System.out.println("A multiplica��o dos numeros �: " + (Double.parseDouble(num1) * Double.parseDouble(num2)));
			break;
		default:
			System.out.println("Opera��o invalida");
			break;
		}
	}
}