import java.util.*;

public class Populations {
	/**
	* Calculate the number of total rabbit pairs in a population after n months,
	* with each rabbit pair producing k offspring each month.
	*/
	public static int predictNumRabbits(int numMonths, int numOffspring) {
		int[] numRabbitsByMonth = new int[numMonths];
		for(int i = 0; i < numRabbitsByMonth.length; i++) {
			numRabbitsByMonth[i] = -1;
		}

		numRabbitsByMonth[0] = 1;
		numRabbitsByMonth[1] = 1 + numOffspring;

		int[] memoizedNumRabbits = memoizeNumRabbits(numMonths - 2, numOffspring, numRabbitsByMonth);
		
		return memoizedNumRabbits[numMonths];
	}

	private static int[] memoizeNumRabbits(int numMonths, int numOffspring, int[] numRabbitsByMonth) {
		if(numRabbitsByMonth[numMonths] != -1) {
			return numRabbitsByMonth; // TODO
		} else {
			return new int[2];  // TODO
		}
	}
}