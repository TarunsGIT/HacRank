package in.co.sumofdivisor;

import java.util.Scanner;

public class SumOfDivisor {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);
	}

}
