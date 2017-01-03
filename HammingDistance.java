public class HammingDistance {
	public static void getHammingDistance(String strand1, String strand2) {
		int hammingDistance = 0;
		for(int i = 0; i < strand1.length(); i++) {
			if(strand1.charAt(i) != strand2.charAt(i)) {
				hammingDistance++;
			}
		}
		System.out.println(hammingDistance);
	}
}


