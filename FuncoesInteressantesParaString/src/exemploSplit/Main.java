package exemploSplit;

public class Main {

	public static void main(String[] args) {

		String originalString = "potato apple lemon";
		System.out.printf("%nString original: %s%n", originalString);

		String[] stringVector = originalString.split(" ");
		String word_1 = stringVector[0];
		String word_2 = stringVector[1];
		String word_3 = stringVector[2];

		System.out.printf("\nVetor de strings na posi��o 0: %s%n", word_1);
		System.out.printf("Vetor de strings na posi��o 1: %s%n", word_2);
		System.out.printf("Vetor de strings na posi��o 2: %s%n", word_3);
	}

}
