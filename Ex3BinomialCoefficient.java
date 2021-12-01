package dataStructure;

public class Ex3BinomialCoefficient {
	// �G�����Y��
	// �ƦC�զX�� C
	// EX: C5��3 = 5! /3!*2! = 5*4*3 / 3*2*1
	private static int recursive(int n, int m) {
		if (m == 0 || m == n) {
			return 1;
		}
		return recursive(n - 1, m) + recursive(n - 1, m - 1);
	}

	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		System.out.println("recursive: " + recursive(n,m));
	}
}
