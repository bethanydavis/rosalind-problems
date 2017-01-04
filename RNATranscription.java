public class RNATranscription {
	/**
	* Problem 2
	* Given: t, a DNA String
	* Return: the transcribed RNA String of t (all T's replaced with U's)
	*
	*/
	public static String transcribe(String dna) {
		String result = dna.replace('T', 'U');
		return result;
	}
}

