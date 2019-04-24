package Arrays_Q109_Q137;

import java.util.*;

public class Q130 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for (int i = 0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for (int j = 0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		// WRITE YOUR CODE HERE
		String A1 = Arrays.toString(inner).replace(", ", "");
		A1 = A1.substring(1, A1.length() - 1);
		String A2 = Arrays.toString(outer).replace(", ", "");
		A2 = A2.substring(1, A2.length() - 1);

		boolean A = true;
		for (int i = 0; i < A1.length(); i++)
			if (!A2.contains("" + A1.charAt(i)))
				A = false;

		System.out.println(A);

	}

}
