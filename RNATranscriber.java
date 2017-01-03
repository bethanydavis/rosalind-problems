/**
 * Problem 2
 * Given: t, a DNA String
 * Return: the transcribed RNA String of t (all T's replaced with U's)
 *
 */
public class RNATranscriber {
	public static void transcribe(String dna) {
		System.out.println(dna.replace('T', 'U'));
	}
}

