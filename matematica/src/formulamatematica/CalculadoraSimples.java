package formulamatematica;

import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double numero1 = scanner.nextDouble();

		System.out.println("Digite o segundo número: ");
		double numero2 = scanner.nextDouble();
		
		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double multpilcacao = numero1 * numero2;
		double divisao = numero1 / numero2;
		
		System.out.println("Soma: " + soma );
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multpilcacao);
		System.out.println("Divisão: " + divisao);
	}
}
