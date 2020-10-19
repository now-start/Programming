import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] pn = new int[m + 1]; // 0�̸� �Ҽ� 1�̸� �Ҽ��� �ƴ�
		pn[1] = 1;

		//�����佺�׳׽��� ü�� �̿�
		for (int i = 2; i <= m; i++) {
			if (pn[i] == 0) {
				if (i >= n) {
					System.out.println(i);
				}

				for (int j = 1; i * j <= m; j++) {
					pn[i * j] = 1;
				}
			}
		}

	}
}
