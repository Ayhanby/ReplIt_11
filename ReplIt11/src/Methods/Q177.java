package Methods;

public class Q177 {

	public static int[] mergR(int[] a, int[] b) {
		int[] ab = new int[(a.length + b.length)];
		for (int i = 0; i < a.length; i++)
			ab[i] = a[i];

		int c = a.length;
		for (int z = 0; z < b.length; z++) {
			ab[c] = b[z];
			c++;
		}
		return ab;

	}// end mergR

	public static void main(String[] args) {

	}

}
