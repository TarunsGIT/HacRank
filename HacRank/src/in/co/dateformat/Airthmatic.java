package in.co.dateformat;

public class Airthmatic {

	static void sum(int a, int b) {

		System.out.println("int" + (a + b));
	}

	static void sum(Integer a, Integer b) {

		System.out.println("INTEGER" + (a + b));
	}

	public static void main(String[] args) {
		short a = 10;
		short b = 10;

		Airthmatic.sum(a, b);

	}

}
