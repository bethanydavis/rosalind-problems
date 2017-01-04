import java.util.*;
import java.io.*;

public class Dna {

  /** Given: s, a DNA String
  * Return: 4 integers counting the respective number of
  * times that the symbols 'A', 'C', 'G', and 'T' occur in s.
  */
  public static Map<Character, Integer> getNucleotideCounts(String dna) {
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

    Map<Character, Integer> nucleotideCounts = new HashMap<Character, Integer>();
    nucleotideCounts.put('A', countA);
    nucleotideCounts.put('C', countC);
    nucleotideCounts.put('G', countG);
    nucleotideCounts.put('T', countT);
    return nucleotideCounts;
  }

  /**
  * Return a list of 1-indexed starting locations of substring in dna
  */
	public static List<Integer> findMotif(String dna, String substring) {
    List<Integer> motifIndeces = new ArrayList<Integer>();
		for(int i = 0; i < dna.length(); i++) {
			if(dna.indexOf(substring, i) == -1) {
				break;
			} else {
				motifIndeces.add(dna.indexOf(substring, i) + 1);
				i = dna.indexOf(substring, i);
			}
		}
    return motifIndeces;
	}

  /**
  * Return the number of corresponding symbols that differ between strand1 and strand2
  */
  public static int getHammingDistance(String strand1, String strand2) {
    int hammingDistance = 0;
    for(int i = 0; i < strand1.length(); i++) {
      if(strand1.charAt(i) != strand2.charAt(i)) {
        hammingDistance++;
      }
    }
    return hammingDistance;
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

  /**
  * Return a reversed strand of dna such that each nucleotide
  * is replaced by its complement
  */
  public static String getReverseComplement(String dna) {
    String reverseComplement = "";
    
    for(int i = dna.length() - 1; i >= 0; i--) {
      reverseComplement += getComplementaryNucleotide(dna.charAt(i));
    }
    
    return reverseComplement;
  }

  /**
  * Return the percentage of symbols in the given DNA that are 'C' or 'G'
  */
  private static double getGCContent(String dna) {
    double gcCount = 0;
    for(int i = 0; i < dna.length(); i++) {
      if(dna.charAt(i) == 'C' || dna.charAt(i) == 'G') {
        gcCount++;
      }
    }
    return gcCount / dna.length() * 100;
  }

  /**
  * @param idToContent a mapping of FASTA ids to GC content of each DNA strand
  * @return String containing max GC content and 
  * corresponding FASTA id of DNA strand
  */
  public static String findMaxGCContent(Map<String, Double> idToContent) {
    String maxId = "";
    double maxContent = 0;

    for(String id : idToContent.keySet()) {
      double currContent = idToContent.get(id);
      if(currContent > maxContent) {
        maxContent = currContent;
        maxId = id;
      }
    }

    return maxId + " " + maxContent;
  }

  /**
  * @param filename file specifying FASTA ids and DNA content of each strand
  * @return a mapping of FASTA ids to GC content of each DNA strand
  */
  public static Map<String, Double> buildGCContentMap(String filename) {
    Map<String, Double> idToContent = new HashMap<String, Double>();
    try {
      BufferedReader reader = new BufferedReader(new FileReader(filename));

      String id = reader.readLine();
      while(id != null) {
        String dnaStrand = reader.readLine();
        String nextLine = reader.readLine();
        while(nextLine != null && nextLine.charAt(0) != '>') {
          dnaStrand += nextLine;
          nextLine = reader.readLine();
        }
        idToContent.put(id, getGCContent(dnaStrand));
        id = nextLine;        
      }

      reader.close();
    } catch(IOException e) { e.printStackTrace(); }
    return idToContent;
  }

}