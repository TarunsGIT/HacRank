package in.co.inheritance;

public class Student extends Person {

	private int[] testScores;

	Student(String firstName, String lastName, int identification, int[] scores) {
		super(firstName, lastName, identification);
		this.testScores = scores;

	}

	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	// Write your method here

	public char calculate() {
		int sum = 0;
		int average = 0;
		for (int i = 0; i <= testScores.length; i++) {
			sum = 0;
			average = 0;
			sum = sum + i;
			average = sum / testScores.length;
		}
		if (average >= 90 || average <= 100) {
			return 'O';
		} else if (average >= 80 || average <= 90) {
			return 'E';
		} else if (average >= 70 || average < 80) {
			return 'A';
		} else if (average >= 55 || average < 70) {
			return 'P';
		} else if (average >= 40 || average < 55) {
			return 'D';
		} else {
			return 'T';
		}

	}
}
