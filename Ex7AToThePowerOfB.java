package dataStructure;

public class Ex7AToThePowerOfB {

	private static long recursive(long m, long n) {
		if (n == 0)
			return 1;
		return recursive(m, n - 1) * m;
	}

	private static long iterative(long m, long n) {
		long s = 1;
		for (int i = 1; i <= n; i++) {
			s = m * s;
		}
		return s;
	}

	private static long foo(long m, long n) {
		int f = 0;
		if (n % 2 == 0) {
			f = 1;
		} else {
			f = (int) m;
		}
		if (n < 2)
			return f;
		return f * foo(m * m, n / 2);
	}

	private static long fooIterative(long m, long n) {
		int f = 0, s = 1;
		if (n % 2 == 0) {
			f = 1;
		} else {
			f = (int) m;
		}
		for (int i = 1; i <= n / 2; i++) {
			s = (int) (m * m * s);
		}
		return s * f;
	}

	public static void main(String[] args) {
		long M = Long.parseLong(args[0]);
		long N = Long.parseLong(args[1]);
		System.out.println("recursive: " + recursive(M, N));
		System.out.println("iterative: " + iterative(M, N));
		System.out.println("foo: " + foo(M, N));
		System.out.println("fooIterative: " + fooIterative(M, N));
	}

}
