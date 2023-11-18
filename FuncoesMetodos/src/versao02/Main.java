package versao02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nInforme três números inteiros\n");

		int firstNumber = requestData(scanner, 1);
		int secondNumber = requestData(scanner, 2);
		int thirdNumber = requestData(scanner, 3);
		int higherNumber = checkHighestNumber(firstNumber, secondNumber, thirdNumber);
		
		showHigherNumber(higherNumber);

		scanner.close();
		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions
	 */
	private static int requestData(Scanner scanner, int firstSecondOrThirdNumber) {
		int number = 0;

		if (firstSecondOrThirdNumber == 1) {
			System.out.print("Digite o primeiro número inteiro: ");
			return number = scanner.nextInt();

		} else if (firstSecondOrThirdNumber == 2) {
			System.out.printf("Digite o segundo  número inteiro: ");
			return number = scanner.nextInt();

		} else if (firstSecondOrThirdNumber == 3) {
			System.out.printf("Digite o terceiro número inteiro: ");
			return number = scanner.nextInt();
		}

		return number;
	}

	private static int checkHighestNumber(int firstNumber, int secondNumber, int thirdNumber) {
		int maiorNumero = 0;
		maiorNumero = Math.max(firstNumber, secondNumber);
		maiorNumero = Math.max(maiorNumero, thirdNumber);
		return maiorNumero;
	}

	private static void showHigherNumber(int higherNumber) {
		System.out.printf("\nMaior número digitado: %d%n", higherNumber);
	}
}
