package formulamatematica;

import java.util.Scanner;

public class aritmetica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		double numero1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número");
		double numero2 = scanner.nextDouble();
		
		double media = (numero1 + numero2) / 2;
		
		System.out.println("A média dos números: " + media);
		
		scanner.close();
	}
}
