package in.co.stringtoken;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		s.trim();
		
		
		StringTokenizer st = new StringTokenizer(s, ("[_\\@!?.', ]"));
		int x = st.countTokens();
		System.out.println(x);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		scan.close();
	}

}
