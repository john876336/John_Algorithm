package dataStructure;

public class Ex8TowerOfHanoi {
	private static int sum = 0;

	private static void hanoiTower(int numberOfDisks, String beginning, String auxiliary, String destination) {
		if (numberOfDisks > 1) {
			System.out.println("now we handle " + numberOfDisks + " disk(s).");
			System.out.println("and our destination is the " + destination + " pole.");
		}
		if (numberOfDisks == 1) {
//���j�����I���@�b��n����������A�N�O�����ŦX�ɡA
//�N���|�A�I�s�ۨ����o�Ӥ�k�]method�^
			sum++;
			System.out.println("Moving disk from " + beginning + " to " + destination + ".");
			System.out.println("the sum of moving are: " + sum + " time(s)");
		} else {

//�Ĥ@�B�A���� n - 1 ���L�l�q�Ĥ@�ڬW�l(beginning)�h��ĤG�ڬW�l�A
//����, �ݭn�ϥβĤT�ڬW�l�����U�C
//�ҥH�̤W���Ƕi�Ӫ� auxiliary �ѼƷ��ت��a���W�l, 
//�̤W���Ƕi�Ӫ� destination �ѼƷ����U���W�l�C

//�U���o�@����槹��A�b�Ĥ@�ڬW�l�W�A���F�̤U�����L�l�H�~���L�l�A
//���|�Q�h��ĤG�ڬW�l�W�C
			System.out.println("(n = " + numberOfDisks + ") step one:");
			hanoiTower(numberOfDisks - 1, beginning, destination, auxiliary);

//�ĤG�B�A�A��Ĥ@�ڬW�l�W�ѤU���̤U�����L�l�q�Ĥ@�ڬW�l�h��ĤT�ڬW�l�W�C
			System.out.println("(n = " + numberOfDisks + ") step two:");
			hanoiTower(1, beginning, auxiliary, destination);

//�ĤT�B�A�A��{�b�b�ĤG�ڤl�W n - 1 ���L�l�q�ĤG�ڬW�l�h��ĤT�ڬW�l�A
//����, �ݭn�ϥβĤ@�ڬW�l�����U�C
//�ҥH�̤W���Ƕi�Ӫ� auxiliary �ѼƷ��}�l���W�l, 
//�̤W���Ƕi�Ӫ� beginning �ѼƷ����U���W�l�C
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
