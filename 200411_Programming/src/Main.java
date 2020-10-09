import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		result(n);
	}

	static void result(int n) {
		int sum = 0; // ������
		int i; // �����

		for (i = 1; i <= n; i++) {
			sum += i; // ó�� ���� �����ش�

			// �� �ڸ����� ���� �迭�� �ִ´�
			String tmp = i + "";
			int[] arr = new int[tmp.length()];

			for (int j = 0; j < tmp.length(); j++) {
				arr[j] = Integer.parseInt(tmp.substring(j, j + 1));
			}

			// �� �ڸ����� ���� �����ش�
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j];
			}

			// �������� �Է°��� ������ for���� �����Ѵ�
			if (sum == n) {
				break;
			} else {
				sum = 0;
			}
		}

		// �����հ� �Է°��� ������ �������� ����ϰ� �ٸ��� 0�� ����Ѵ�
		if (sum == n) {
			System.out.println(i);
		} else {
			System.out.println("0");
		}
	}
}
