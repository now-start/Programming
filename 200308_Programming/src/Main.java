import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ������ �� ���� ex)1, 5, 10, 50, 100, ... 1000000
		int k = sc.nextInt(); // N������ �������� ���� ��
		int[] arr = new int[n]; // ������ ����
		int count = 0; // ���� ������ �ּڰ�
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//������ �������� ���� ���� ���ϱ�
		for (int i = n-1; i >= 0; i--) {
			if (k / arr[i] != 0) {
				count += k / arr[i];	//���� ������ ���ٸ� ���������� ������ŭ ī��Ʈ�� �߰�
				//k -= k/arr[i]*arr[i];	//ī��Ʈ�� �߰��� ��ŭ ���� ������ ����
				k %= arr[i];
			}
		}

		System.out.println(count);
	}

}
