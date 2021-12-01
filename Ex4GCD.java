package dataStructure;

public class Ex4GCD {

	// 取最大公因數
	// 概念近似輾轉相除法

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
