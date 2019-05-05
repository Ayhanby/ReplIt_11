package Methods;

import java.util.ArrayList;

public class Q183 {

	public static void test(ArrayList<Double> dubs) {
		// write code here
		dubs.set(1, 0.0);
		dubs.remove(0);
		dubs.remove(new Double(0.0));
		System.out.println(dubs);

	}

}
