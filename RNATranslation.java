public class RNATranslation {
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

	public static void getRNATranslation(String rna) {
		String aminoAcidChain = "";
		for(int i = 0; i < rna.length(); i = i + 3) {
			String codon = rna.substring(i, i+3);
			if(codon.equals("UAG") || codon.equals("UAA") || codon.equals("UGA")) {
				break;
			} else {
				aminoAcidChain += getProtein(codon);
			}
		}
		System.out.println(aminoAcidChain);
	}
}