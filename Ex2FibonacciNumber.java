package dataStructure;

public class Ex2FibonacciNumber {
	//¶O¦¡¼Æ¦C
	// n0 = 0
	// n1 = 1
	// n2 = n1 + n0 = 1
	// n3 = n2 + n1 = (n1 + n0) + n1 = 2 * n1 = 2
	// n4 = n3 + n2 = (n2 + n1) + n2 = (n1 + n0) + n1 + (n1 + n0) = 3 * n1 = 3
	// n5 = n4 + n3 = (n3 + n2) + (n2 + n1)......

	static int count = 0;

	private static int recursive(int i) {
		count++;
		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;
		}
		return recursive(i - 1) + recursive(i - 2);
	}

	private static int iterative(int i) {
		if (i <= 0)
			return 0;
		if (i == 1)
			return 1;
		int a = 0, b = 1, c = 0, n;
		for (n = 2; n <= i; n++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		System.out.println("recursive: " + recursive(i));
		System.out.println("iterative: " + iterative(i));
		System.out.println("the number of time(s) recursive method has been executed: " + count);
	}

}
