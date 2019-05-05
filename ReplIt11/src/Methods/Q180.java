package Methods;

import java.util.Arrays;

public class Q180 {

	public static String combineRs(String[] r1, String[] r2) {
		String A = Arrays.toString(r1).replace(", ", "").replace("[", "").replace("]", "");
		String B = Arrays.toString(r2).replace(", ", "").replace("[", "").replace("]", "");
		String C = A + B;
		return C;

	}

}