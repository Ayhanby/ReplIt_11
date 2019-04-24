package Q94_Q108;

import java.util.Scanner;

public class Q96 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt();

		if (inhabitants == 0) {
			System.out.println("---- EXTINCT ----");
			System.exit(0);

		} else {
			int i = 0;
			System.out.println("Day " + i + " [" + inhabitants + "]");
			while (true) {
				inhabitants = inhabitants / 2;

				if (inhabitants == 0) {
					break;
				}

				i++;
				System.out.println("Day " + i + " [" + inhabitants + "]");
			}

			System.out.println("---- EXTINCT ----");
		}

	}

}
