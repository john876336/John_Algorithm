package dataStructure;

public class Ex8TowerOfHanoi {
	private static int sum = 0;

	private static void hanoiTower(int numberOfDisks, String beginning, String auxiliary, String destination) {
		if (numberOfDisks > 1) {
			System.out.println("now we handle " + numberOfDisks + " disk(s).");
			System.out.println("and our destination is the " + destination + " pole.");
		}
		if (numberOfDisks == 1) {
//遞迴的重點之一在於要有結束條件，就是當條件符合時，
//就不會再呼叫自身的這個方法（method）
			sum++;
			System.out.println("Moving disk from " + beginning + " to " + destination + ".");
			System.out.println("the sum of moving are: " + sum + " time(s)");
		} else {

//第一步，先把 n - 1 塊盤子從第一根柱子(beginning)搬到第二根柱子，
//此時, 需要使用第三根柱子當做輔助。
//所以最上面傳進來的 auxiliary 參數當成目的地的柱子, 
//最上面傳進來的 destination 參數當成輔助的柱子。

//下面這一行執行完後，在第一根柱子上，除了最下面的盤子以外的盤子，
//都會被搬到第二根柱子上。
			System.out.println("(n = " + numberOfDisks + ") step one:");
			hanoiTower(numberOfDisks - 1, beginning, destination, auxiliary);

//第二步，再把第一根柱子上剩下的最下面的盤子從第一根柱子搬到第三根柱子上。
			System.out.println("(n = " + numberOfDisks + ") step two:");
			hanoiTower(1, beginning, auxiliary, destination);

//第三步，再把現在在第二根子上 n - 1 塊盤子從第二根柱子搬到第三根柱子，
//此時, 需要使用第一根柱子當做輔助。
//所以最上面傳進來的 auxiliary 參數當成開始的柱子, 
//最上面傳進來的 beginning 參數當成輔助的柱子。
			System.out.println("(n = " + numberOfDisks + ") step three:");
			hanoiTower(numberOfDisks - 1, auxiliary, beginning, destination);
		}
	}

	public static void main(String[] args) {
		Integer n = Integer.parseInt(args[0]);
		String a = "A", b = "B", c = "C";
		hanoiTower(n, a, b, c);
	}

	private static void hanoi(int numberOfDisks, String beginning, String auxiliary, String destination) {
		System.out.println("now we handle " + numberOfDisks + " dish(es).");
		System.out.println("and our destination is the " + destination + " pole.");
		if (numberOfDisks == 1) {
			sum++;
			System.out.println("Moving disk from " + beginning + " to " + destination + ".");
			System.out.println("the sum of moving are: " + sum + " time(s)");
		} else {
			System.out.println("step one:");
			hanoi(numberOfDisks - 1, beginning, destination, auxiliary);
			System.out.println("step two:");
			hanoi(1, beginning, auxiliary, destination);
			System.out.println("step three:");
			hanoi(numberOfDisks - 1, auxiliary, beginning, destination);
		}
	}

	private static void hanoiSimple(int n, String a, String b, String c) {
		if (n == 1) {
		} else {
			hanoiSimple(n - 1, a, c, b);
			hanoiSimple(1, a, b, c);
			hanoiSimple(n - 1, b, a, c);
		}
	}
}
