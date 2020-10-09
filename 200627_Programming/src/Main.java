import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // ���� ����
		int k = sc.nextInt(); // ���� ����

		Jewelry[] jewel = new Jewelry[n];
		int[] bag = new int[k];

		for (int i = 0; i < n; i++) {
			int weight = sc.nextInt();
			int price = sc.nextInt();
			Jewelry jewelry = new Jewelry(weight, price);
			jewel[i] = jewelry;
		}
		for (int i = 0; i < k; i++) {
			bag[i] = sc.nextInt();
		}

		Arrays.sort(jewel); // ������ �������� �������� ����
		Arrays.sort(bag);// ������ �������� �������� ����

		long sum = 0;
		int index = 0;
		PriorityQueue<Integer> price = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			while (index < n) {
				if (bag[i] >= jewel[index].weight) {
					price.add(-(jewel[index].price)); // ������ ū ���ݺ��� ������ ���� ������ �ִ´�.
					index++;
				} else {
					break;
				}
			}

			if (!price.isEmpty()) { // ������ ���Ժ��� �� ���ſ� �����鸸 ���� �� �����Ƿ�
				sum += Math.abs(price.poll()); // �켱����ť������ ���� ���ݺ��� �������Ƿ� ������ ����� ���� ū ��
			}
		}

		System.out.println(sum);
	}
}

class Jewelry implements Comparable<Jewelry> {
	int weight;
	int price;

	public Jewelry(int weight, int price) {
		this.weight = weight;
		this.price = price;
	}

	@Override
	public int compareTo(Jewelry arg0) {
		if (this.weight <= arg0.weight) {
			return -1;
		} else {
			return 1;
		}
	}

}