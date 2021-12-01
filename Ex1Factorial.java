package dataStructure;

public class Ex1Factorial {
	//¶¥­¼
	private static int recursive(int i) {
		if (i == 0) {
			return 1;
		}
		return recursive(i - 1) * i;
	}

	private static int iterative(int i) {
		int n, s = 1;
		for (n = 1; n <= i; n++) {
			s = s * n;
		}
		return s;
	}

	public static void main(String args[]) {
		int i = Integer.parseInt(args[0]);
		System.out.println("recursive: "+recursive(i));
		System.out.println("iterative: "+iterative(i));
	}

}
