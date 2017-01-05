import java.util.*;

public class ProblemRunner {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String problemInput = scanner.nextLine();
		Set<String> result = RNATranslation.translateAllProteins(problemInput);
		for(String s : result) {
			System.out.println(s);
		}
		scanner.close();		
	}
}
