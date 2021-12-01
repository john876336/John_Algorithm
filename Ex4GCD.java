package dataStructure;

public class Ex4GCD {

	// ���̤j���]��
	// �����������۰��k

	private static int recursive(int n, int m) {
		if (n % m == 0) {
			return m;
		}
		return recursive(m, n % m);
	}

	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		System.out.println("recursive: " + recursive(n, m));
	}
}
