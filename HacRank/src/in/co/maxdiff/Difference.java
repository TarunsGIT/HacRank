package in.co.maxdiff;

public class Difference {

	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {

		this.elements = a;
	}

	public void computeDifference() {

		for (int i = 0; i < elements.length; i++) {

			maximumDifference = elements[elements.length - 1] - elements[0];
			Math.abs(maximumDifference);
		}
	}

}
