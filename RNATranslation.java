public class RNATranslation {

	/**
	* Return the amino acid symbol produced by
	* translating the given RNA codon
	*/
	public static String getProtein(String codon) {
		switch(codon) {
			case "UUU":
			case "UUC":
				return "F";
			case "UUA":
			case "UUG":
			case "CUU":
			case "CUC":
			case "CUA":
			case "CUG":
				return "L";
			case "UCU": 
			case "UCC": 
			case "UCA": 
			case "UCG": 
			case "AGU": 
			case "AGC":
				return "S";
			case "UAU":
			case "UAC":
				return "Y";
			case "UGU": 
			case "UGC":
				return "C";
			case "UGG":
				return "W";
			case "CCU":
			case "CCC":
			case "CCA":
			case "CCG":
				return "P";
			case "CAU":
			case "CAC":
				return "H";
			case "CAA":
			case "CAG":
				return "Q";
			case "CGU":
			case "CGC":
			case "CGA":
			case "CGG":
			case "AGA":
			case "AGG":
				return "R";
			case "AUU":
			case "AUC":
			case "AUA":
				return "I";
			case "AUG":
				return "M";
			case "ACU":
			case "ACC": 
			case "ACA":
			case "ACG":
				return "T";
			case "AAU":
			case "AAC":
				return "N";
			case "AAA":
			case "AAG":
				return "K";
			case "GUU":
			case "GUC":
			case "GUA":
			case "GUG":
				return "V";
			case "GCU":
			case "GCC":
			case "GCA":
			case "GCG":
				return "A";
			case "GAU":
			case "GAC":
				return "D";
			case "GAA":
			case "GAG":
				return "E";
			case "GGU":
			case "GGC":
			case "GGA":
			case "GGG":
				return "G";
			default:
				return "BAD";
		}
	}

	/**
	* Return the protein produced by translating the given RNA strand
	*/
	public static String getRNATranslation(String rna) {
		String aminoAcidChain = "";
		for(int i = 0; i < rna.length(); i = i + 3) {
			String codon = rna.substring(i, i+3);
			if(codon.equals("UAG") || codon.equals("UAA") || codon.equals("UGA")) {
				break;
			} else {
				aminoAcidChain += getProtein(codon);
			}
		}
		return aminoAcidChain;
	}

	/**
	* Return the number of unique RNA strands that could have produced
	* the given protein, mod 1,000,000
	*/
	public static long predictRNAFromProtein(String protein) {
		long num = 3; // possible stop codons
		for(int i = 0; i < protein.length(); i++) {
			num = (num * numPossibilities(protein.substring(i, i + 1))) % 1000000;
		}
		return num;
	}

	/**
	* Return the number of unique codons that could have produced
	* the given amino acid
	*/
	private static int numPossibilities(String aminoAcid) {
		switch(aminoAcid) {
			case "F":
				return 2;
			case "L":
				return 6;
			case "S":
				return 6;
			case "Y":
				return 2;
			case "C":
				return 2;
			case "W":
				return 1;
			case "P":
				return 4;
			case "H":
				return 2;
			case "Q":
				return 2;
			case "R":
				return 6;
			case "I":
				return 3;
			case "M":
				return 1;
			case "T":
				return 4;
			case "N":
				return 2;
			case "K":
				return 2;
			case "V":
				return 4;
			case "A":
				return 4;
			case "D":
				return 2;
			case "E":
				return 2;
			case "G":
				return 4;
			default:
				return 1;
		}
	}
}
