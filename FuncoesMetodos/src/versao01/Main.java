package versao01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		solicitarDados(scanner);

		scanner.close();
		System.out.println("\n-> fim do programa");
	}

	/*
	 * functions
	 */
	private static void solicitarDados(Scanner scanner) {
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;

		System.out.println("\nInforme três números inteiros");

		for (int i = 1; i <= 3; i++) {
			if (i == 1) {
				System.out.printf("Digite o %dº número inteiro: ", i);
				firstNumber = scanner.nextInt();

			} else if (i == 2) {
				System.out.printf("Digite o %dº número inteiro: ", i);
				secondNumber = scanner.nextInt();

			} else if (i == 3) {
				System.out.printf("Digite o %dº número inteiro: ", i);
				thirdNumber = scanner.nextInt();
			}
		}

		verificaMaiorNumero(firstNumber, secondNumber, thirdNumber);
	}

	private static void verificaMaiorNumero(int firstNumber, int secondNumber, int thirdNumber) {
		int maiorNumero = 0;
		maiorNumero = Math.max(firstNumber, secondNumber);
		maiorNumero = Math.max(maiorNumero, thirdNumber);
		
		displayMiorNumero(maiorNumero);
	}

	private static void displayMiorNumero(int maiorNumero) {
		System.out.printf("\nMaior número digitado: %d%n",maiorNumero);
	}
}
