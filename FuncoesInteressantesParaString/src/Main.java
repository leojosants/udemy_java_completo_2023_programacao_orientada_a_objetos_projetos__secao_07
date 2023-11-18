
public class Main {

	public static void main(String[] args) {

		String originalString = " abcde FGHIJ ABC abc DEFG ";
		int exampleLength = originalString.length();
		String exampleToLowerCase = originalString.toLowerCase();
		String exampleToUpperCase = originalString.toUpperCase();
		String exampleTrim = originalString.trim();
		int exampleLengthAfterTrim = exampleTrim.length();
		String exampleSubstring_1 = originalString.substring(2);
		String exampleSubstring_2 = originalString.substring(2, 9);
		String exampleReplace_1 = originalString.replace('a', 'x');
		String exampleReplace_2 = originalString.replace("abc", "xy");
		int exampleIndexOf = originalString.indexOf("bc"); // primeira ococrrencia
		int exampleLastIndexOf = originalString.lastIndexOf("bc"); // ultima ocorrencia

		System.out.println("");
		System.out.printf("Original:            %s-%n", originalString);
		System.out.printf("length():             %d caracter(s)%n", exampleLength);
		System.out.printf("toLowerCase:         %s-%n", exampleToLowerCase);
		System.out.printf("toUpperCase:         %s-%n", exampleToUpperCase);
		System.out.printf("trim:                 %s-%n", exampleTrim);
		System.out.printf("exampleTrim.length(): %d caracter(s)%n", exampleLengthAfterTrim);
		System.out.printf("substring(2):         %s-%n", exampleSubstring_1);
		System.out.printf("substring(2, 9):      %s-%n", exampleSubstring_2);
		System.out.printf("replace('a', 'x'):   %s-%n", exampleReplace_1);
		System.out.printf("replace('abc', 'xy'):%s-%n", exampleReplace_2);
		System.out.printf("indexOf('bc'):        %s%n", exampleIndexOf);
		System.out.printf("lastIndexOf('bc'):    %s%n", exampleLastIndexOf);
	}

}
