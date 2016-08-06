import java.util.Scanner;

/**
 * Problem 2
 * Given: t, a DNA String
 * Return: the transcribed RNA String of t (all T's replaced with U's)
 *
 */
public class RNATranscriber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dna = scanner.nextLine();
		System.out.println(dna.replace('T', 'U'));
		scanner.close();
	}
}

