import java.util.Scanner;

/**
 * Problem 3
 * Given: A DNA String s
 * Return: The reverse complement of s
 *
 */
public class DNAReverseComplement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dna = scanner.nextLine();
		
		String reverseComplement = "";
		
		for(int i = dna.length() - 1; i >= 0; i--) {
			reverseComplement += getComplementaryNucleotide(dna.charAt(i));
		}
		
		System.out.println(reverseComplement);
		scanner.close();
	}
	
	/**
	 * Get the complementary DNA nucleotide for a single nucleotide character
	 * @param nucleotide char representing the original DNA
	 * @return a char representing the complementary nucleotide
	 */
	private static char getComplementaryNucleotide(char nucleotide) {
		switch(nucleotide) {
		case('A'):
			return 'T';
		case('T'):
			return 'A';
		case('G'):
			return 'C';
		case('C'):
			return 'G';
		}
		return ' ';
	}

}

