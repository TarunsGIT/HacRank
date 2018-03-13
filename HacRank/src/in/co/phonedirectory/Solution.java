package in.co.phonedirectory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] argh) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			// Map<String,Integer> m=new HashMap<String,Integer>();
			m.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
				
				 
					if(m.get(s)==null){
						System.out.println("Not found");
					}
					else{
					System.out.println(s + " = " + m.get(s));
					}

				
			
		}
		in.close();
	}
}
