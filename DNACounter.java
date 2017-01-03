/**
 * Problem 1
 * Given: s, a DNA String
 * Return: 4 integers (separated by spaces) counting the respective number of
 * times that the symbols 'A', 'C', 'G', and 'T' occur in s.
 */
public class DNACounter {

	public static void getCounts(String dna) {
		int countA = 0;
		int countC = 0;
		int countG = 0;
		int countT = 0;
		
		for(int i=0; i < dna.length(); i++) {
			switch(dna.charAt(i)){
				case('A'):
					countA++;
					break;
				case('C'):
					countC++;
					break;
				case('G'):
					countG++;
					break;
				case('T'):
					countT++;
					break;
				default:
					break;		
			}
		}
		
		System.out.println(countA + " " + countC + " " + countG + " " + countT);
	}
}

