package dataStructure;

public class Ex6Sum {

	private static int iterative(int i) {
		int s = 0;
		for (int a = 0; a <= i; a++) {
			s = s + a;
		}
		return s;
	}

	private static int recursive(int i) {
		if (i == 0)
			return 0;
		return recursive(i - 1) + i;
	}

	public static void main(String args[]) {
		int i = Integer.parseInt(args[0]);
		System.out.println("recursive: " + recursive(i));
		System.out.println("iterative: " + iterative(i));
	}

}
