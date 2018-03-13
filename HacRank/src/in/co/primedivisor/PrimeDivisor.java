package in.co.primedivisor;

import java.util.Scanner;

public class PrimeDivisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		int num, c;
		do {
			num = scan.nextInt();

			for (c = 2; c <= num - 1; c++) {

				if (num % c == 0) {
					System.out.println("Not Prime");
					break;
				}

			}
			if (c == num) {
				System.out.println("Prime");
			}

		} while (testCase > 0);
		testCase++;
		
		scan.close();
		
	}

}
