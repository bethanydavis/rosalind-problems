public class Dna {

	public static void findMotif(String dna, String substring) {
		for(int i = 0; i < dna.length(); i++) {
			if(dna.indexOf(substring, i) == -1) {
				break;
			} else {
				int humanReadableIndex = dna.indexOf(substring, i) + 1;
				System.out.print(humanReadableIndex + " ");
				i = humanReadableIndex - 1;
			}
		}
		System.out.println();
	}
	
}