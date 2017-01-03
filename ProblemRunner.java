import java.util.Scanner;

public class ProblemRunner {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String numberInput = scanner.nextLine(); // problem #
		int problemNumber = Integer.parseInt(numberInput);
		String problemInput = scanner.nextLine(); // dna string
		switch(problemNumber) {
			case 1:
				DNACounter.getCounts(problemInput);
				break;
			case 2:
				RNATranscriber.transcribe(problemInput);
				break;
			case 3:
				DNAReverseComplement.getReverseComplement(problemInput);
				break;
			case 4:
				String problemInput2 = scanner.nextLine();
				HammingDistance.getHammingDistance(problemInput, problemInput2);
				break;
			case 5:
				RNATranslation.getRNATranslation(problemInput);
				break;
			case 6:
				RNATranslation.predictRNAFromProtein(problemInput);
				break;
			default:
				break;

		}
		scanner.close();		
	}
}
